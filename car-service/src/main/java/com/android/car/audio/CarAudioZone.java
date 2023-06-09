/*
 * Copyright (C) 2018 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.android.car.audio;

import static com.android.car.internal.ExcludeFromCodeCoverageGeneratedReport.DUMP_INFO;

import android.annotation.NonNull;
import android.car.builtin.util.Slogf;
import android.car.media.CarAudioManager;
import android.media.AudioDeviceAttributes;
import android.media.AudioDeviceInfo;
import android.media.AudioPlaybackConfiguration;

import com.android.car.CarLog;
import com.android.car.internal.ExcludeFromCodeCoverageGeneratedReport;
import com.android.car.internal.util.IndentingPrintWriter;
import com.android.internal.util.Preconditions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;

/**
 * A class encapsulates an audio zone in car.
 *
 * An audio zone can contain multiple {@link CarVolumeGroup}s, and each zone has its own
 * {@link CarAudioFocus} instance. Additionally, there may be dedicated hardware volume keys
 * attached to each zone.
 *
 * See also the unified car_audio_configuration.xml
 */
/* package */ class CarAudioZone {

    private final int mId;
    private final String mName;
    private final List<CarVolumeGroup> mVolumeGroups;
    private final Set<String> mDeviceAddresses;
    private List<AudioDeviceAttributes> mInputAudioDevice;

    CarAudioZone(int id, String name) {
        mId = id;
        mName = name;
        mVolumeGroups = new ArrayList<>();
        mInputAudioDevice = new ArrayList<>();
        mDeviceAddresses = new HashSet<>();
    }

    int getId() {
        return mId;
    }

    String getName() {
        return mName;
    }

    boolean isPrimaryZone() {
        return mId == CarAudioManager.PRIMARY_AUDIO_ZONE;
    }

    void addVolumeGroup(CarVolumeGroup volumeGroup) {
        mVolumeGroups.add(volumeGroup);
        mDeviceAddresses.addAll(volumeGroup.getAddresses());
    }

    CarVolumeGroup getVolumeGroup(int groupId) {
        Preconditions.checkArgumentInRange(groupId, 0, mVolumeGroups.size() - 1,
                "groupId(" + groupId + ") is out of range");
        return mVolumeGroups.get(groupId);
    }

    /**
     * @return Snapshot of available {@link AudioDeviceInfo}s in List.
     */
    List<AudioDeviceInfo> getAudioDeviceInfos() {
        final List<AudioDeviceInfo> devices = new ArrayList<>();
        for (CarVolumeGroup group : mVolumeGroups) {
            for (String address : group.getAddresses()) {
                devices.add(group.getCarAudioDeviceInfoForAddress(address).getAudioDeviceInfo());
            }
        }
        return devices;
    }

    int getVolumeGroupCount() {
        return mVolumeGroups.size();
    }

    /**
     * @return Snapshot of available {@link CarVolumeGroup}s in array.
     */
    CarVolumeGroup[] getVolumeGroups() {
        return mVolumeGroups.toArray(new CarVolumeGroup[0]);
    }

    /**
     * Constraints applied here:
     *
     * - One context should not appear in two groups
     * - All contexts are assigned
     * - One device should not appear in two groups
     * - All gain controllers in the same group have same step value
     *
     * Note that it is fine that there are devices which do not appear in any group. Those devices
     * may be reserved for other purposes.
     * Step value validation is done in
     * {@link CarVolumeGroup.Builder#setDeviceInfoForContext(int, CarAudioDeviceInfo)}
     */
    boolean validateVolumeGroups() {
        Set<Integer> contexts = new HashSet<>();
        Set<String> addresses = new HashSet<>();
        for (int index = 0; index <  mVolumeGroups.size(); index++) {
            CarVolumeGroup group = mVolumeGroups.get(index);
            // One context should not appear in two groups
            for (int context : group.getContexts()) {
                if (!contexts.add(context)) {
                    Slogf.e(CarLog.TAG_AUDIO, "Context appears in two groups: " + context);
                    return false;
                }
            }

            // One address should not appear in two groups
            for (String address : group.getAddresses()) {
                if (!addresses.add(address)) {
                    Slogf.e(CarLog.TAG_AUDIO, "Address appears in two groups: " + address);
                    return false;
                }
            }
        }

        // All contexts are assigned
        if (contexts.size() != CarAudioContext.CONTEXTS.length) {
            Slogf.e(CarLog.TAG_AUDIO, "Some contexts are not assigned to group");
            Slogf.e(CarLog.TAG_AUDIO, "Assigned contexts " + contexts);
            Slogf.e(CarLog.TAG_AUDIO, "All contexts " + Arrays.toString(CarAudioContext.CONTEXTS));
            return false;
        }
        return true;
    }

    void synchronizeCurrentGainIndex() {
        for (CarVolumeGroup group : mVolumeGroups) {
            group.setCurrentGainIndex(group.getCurrentGainIndex());
        }
    }

    @ExcludeFromCodeCoverageGeneratedReport(reason = DUMP_INFO)
    void dump(IndentingPrintWriter writer) {
        writer.printf("CarAudioZone(%s:%d) isPrimary? %b\n", mName, mId, isPrimaryZone());
        writer.increaseIndent();
        for (CarVolumeGroup group : mVolumeGroups) {
            group.dump(writer);
        }

        writer.printf("Input Audio Device Addresses\n");
        writer.increaseIndent();
        for (AudioDeviceAttributes audioDevice : mInputAudioDevice) {
            writer.printf("Device Address(%s)\n", audioDevice.getAddress());
        }
        writer.decreaseIndent();
        writer.println();
        writer.decreaseIndent();
    }

    String getAddressForContext(int audioContext) {
        CarAudioContext.preconditionCheckAudioContext(audioContext);
        String deviceAddress = null;
        for (CarVolumeGroup volumeGroup : getVolumeGroups()) {
            deviceAddress = volumeGroup.getAddressForContext(audioContext);
            if (deviceAddress != null) {
                return deviceAddress;
            }
        }
        // This should not happen unless something went wrong.
        // Device address are unique per zone and all contexts are assigned in a zone.
        throw new IllegalStateException("Could not find output device in zone " + mId
                + " for audio context " + audioContext);
    }

    public AudioDeviceInfo getAudioDeviceForContext(int audioContext) {
        CarAudioContext.preconditionCheckAudioContext(audioContext);
        for (CarVolumeGroup volumeGroup : getVolumeGroups()) {
            AudioDeviceInfo deviceInfo = volumeGroup.getAudioDeviceForContext(audioContext);
            if (deviceInfo != null) {
                return deviceInfo;
            }
        }
        // This should not happen unless something went wrong.
        // Device address are unique per zone and all contexts are assigned in a zone.
        throw new IllegalStateException("Could not find output device in zone " + mId
                + " for audio context " + audioContext);
    }

    /**
     * Update the volume groups for the new user
     * @param userId user id to update to
     */
    public void updateVolumeGroupsSettingsForUser(int userId) {
        for (CarVolumeGroup group : mVolumeGroups) {
            group.loadVolumesSettingsForUser(userId);
        }
    }

    void addInputAudioDevice(AudioDeviceAttributes device) {
        mInputAudioDevice.add(device);
    }

    List<AudioDeviceAttributes> getInputAudioDevices() {
        return mInputAudioDevice;
    }

    public @NonNull List<Integer> findActiveContextsFromPlaybackConfigurations(
            @NonNull List<AudioPlaybackConfiguration> configurations) {
        Objects.requireNonNull(configurations);
        List<Integer> activeContexts = new ArrayList<>();
        for (int index = 0; index < configurations.size(); index++) {
            AudioPlaybackConfiguration configuration = configurations.get(index);
            if (configuration.isActive()) {
                if (isAudioDeviceInfoValidForZone(configuration.getAudioDeviceInfo())) {
                    // Note that address's context and the context actually supplied could be
                    // different
                    activeContexts.add(CarAudioContext.getContextForUsage(
                            configuration.getAudioAttributes().getSystemUsage()));
                }
            }
        }
        return activeContexts;
    }

    boolean isAudioDeviceInfoValidForZone(AudioDeviceInfo info) {
        return info != null
                && info.getAddress() != null
                && !info.getAddress().isEmpty()
                && containsDeviceAddress(info.getAddress());
    }

    private boolean containsDeviceAddress(String deviceAddress) {
        return mDeviceAddresses.contains(deviceAddress);
    }
}
