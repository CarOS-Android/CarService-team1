/*
 * Copyright (C) 2021 The Android Open Source Project
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

package android.car.evs;

import static com.android.car.internal.ExcludeFromCodeCoverageGeneratedReport.BOILERPLATE_CODE;

import android.annotation.NonNull;
import android.annotation.SystemApi;
import android.car.Car;
import android.car.annotation.AddedInOrBefore;
import android.car.annotation.RequiredFeature;
import android.hardware.HardwareBuffer;
import android.os.Parcel;
import android.os.Parcelable;

import com.android.car.internal.ExcludeFromCodeCoverageGeneratedReport;

import java.util.Objects;

/**
 * Wraps around {@link HardwareBuffer} to embed additional metadata of the buffer
 * from the Extended View System service.
 *
 * @hide
 */
@SystemApi
@RequiredFeature(Car.CAR_EVS_SERVICE)
public final class CarEvsBufferDescriptor implements Parcelable {
    @AddedInOrBefore(majorVersion = 33)
    public static final @NonNull Creator<CarEvsBufferDescriptor> CREATOR =
            new Creator<CarEvsBufferDescriptor>() {
                @NonNull
                @Override
                public CarEvsBufferDescriptor createFromParcel(final Parcel in) {
                    return new CarEvsBufferDescriptor(in);
                }

                @NonNull
                @Override
                public CarEvsBufferDescriptor[] newArray(final int size) {
                    return new CarEvsBufferDescriptor[size];
                }
            };

    private final int mId;

    @NonNull
    private final HardwareBuffer mHardwareBuffer;

    /**
     * Creates a {@link CarEvsBufferDescriptor} given an unique identifier and
     * {@link HardwareBuffer}.
     *
     * @param id A 32-bit integer to uniquely identify associated hardware buffer.
     * @param buffer Hardware buffer that contains the imagery data from EVS service.
     */
    public CarEvsBufferDescriptor(int id, @NonNull final HardwareBuffer buffer) {
        Objects.requireNonNull(buffer, "HardwardBuffer cannot be null.");

        mId = id;
        mHardwareBuffer = buffer;
    }

    /** Parcelable methods */
    private CarEvsBufferDescriptor(final Parcel in) {
        mId = in.readInt();
        mHardwareBuffer = Objects.requireNonNull(HardwareBuffer.CREATOR.createFromParcel(in));
    }

    @Override
    @ExcludeFromCodeCoverageGeneratedReport(reason = BOILERPLATE_CODE)
    @AddedInOrBefore(majorVersion = 33)
    public int describeContents() {
        return 0;
    }

    @Override
    @AddedInOrBefore(majorVersion = 33)
    public void writeToParcel(@NonNull final Parcel dest, final int flags) {
        dest.writeInt(mId);
        mHardwareBuffer.writeToParcel(dest, flags);
    }

    @Override
    @AddedInOrBefore(majorVersion = 33)
    public String toString() {
        return "CarEvsBufferDescriptor: id = " + mId + ", buffer = " + mHardwareBuffer;
    }

    /**
     * Returns an unique identifier of the hardware buffer described by this object.
     *
     * @return A 32-bit signed integer unique buffer identifier.
     */
    @AddedInOrBefore(majorVersion = 33)
    public int getId() {
        return mId;
    }

    /**
     * Returns a reference to {@link HardwareBuffer} registered
     * to this descriptor.
     *
     * @return the registered {@link HardwareBuffer}.
     */
    @NonNull
    @AddedInOrBefore(majorVersion = 33)
    public HardwareBuffer getHardwareBuffer() {
        return mHardwareBuffer;
    }
}
