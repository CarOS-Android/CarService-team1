/*
 * Copyright (C) 2017 The Android Open Source Project
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

package android.car.vms;

import static com.android.car.internal.ExcludeFromCodeCoverageGeneratedReport.BOILERPLATE_CODE;

import android.annotation.SystemApi;
import android.car.annotation.AddedInOrBefore;
import android.os.Parcel;
import android.os.Parcelable;

import com.android.car.internal.ExcludeFromCodeCoverageGeneratedReport;
import com.android.car.internal.util.DataClass;

/**
 * A Vehicle Map Service layer, which can be offered or subscribed to by clients.
 *
 * The full layer definition is used when routing packets, with each layer having the following
 * properties:
 *
 * <ul>
 * <li>Type: Type of data being published.</li>
 * <li>Subtype: Type of packet being published.</li>
 * <li>Version: Major version of the packet format. Different versions are not guaranteed to be
 * compatible.</li>
 * </ul>
 *
 * See the Vehicle Maps Service partner documentation for the set of valid types and subtypes.
 *
 * @hide
 */
@SystemApi
@DataClass(genAidl = true, genEqualsHashCode = true, genToString = true)
public final class VmsLayer implements Parcelable {
    /**
     * Type of data published on the layer
     **/
    private int mType;

    /**
     * Type of packet published on the layer
     */
    private int mChannel;

    /**
     * Major version of layer packet format
     */
    private int mVersion;

    /**
     * Type of packet published on the layer
     *
     * @deprecated Use {@link #getChannel()} instead
     */
    @Deprecated
    @AddedInOrBefore(majorVersion = 33)
    public int getSubtype() {
        return mChannel;
    }



    // Code below generated by codegen v1.0.14.
    //
    // DO NOT MODIFY!
    // CHECKSTYLE:OFF Generated code
    //
    // To regenerate run:
    // $ codegen $ANDROID_BUILD_TOP/packages/services/Car/car-lib/src/android/car/vms/VmsLayer.java
    //
    // To exclude the generated code from IntelliJ auto-formatting enable (one-time):
    //   Settings > Editor > Code Style > Formatter Control
    //@formatter:off


    /**
     * Creates a new VmsLayer.
     *
     * @param type
     *   Type of data published on the layer
     * @param channel
     *   Type of packet published on the layer
     * @param version
     *   Major version of layer packet format
     */
    @DataClass.Generated.Member
    public VmsLayer(
            int type,
            int channel,
            int version) {
        this.mType = type;
        this.mChannel = channel;
        this.mVersion = version;

        // onConstructed(); // You can define this method to get a callback
    }

    /**
     * Type of data published on the layer
     */
    @DataClass.Generated.Member
    @AddedInOrBefore(majorVersion = 33)
    public int getType() {
        return mType;
    }

    /**
     * Type of packet published on the layer
     */
    @DataClass.Generated.Member
    @AddedInOrBefore(majorVersion = 33)
    public int getChannel() {
        return mChannel;
    }

    /**
     * Major version of layer packet format
     */
    @DataClass.Generated.Member
    @AddedInOrBefore(majorVersion = 33)
    public int getVersion() {
        return mVersion;
    }

    @Override
    @DataClass.Generated.Member
    @AddedInOrBefore(majorVersion = 33)
    public String toString() {
        // You can override field toString logic by defining methods like:
        // String fieldNameToString() { ... }

        return "VmsLayer { " +
                "type = " + mType + ", " +
                "channel = " + mChannel + ", " +
                "version = " + mVersion +
        " }";
    }

    @Override
    @DataClass.Generated.Member
    @AddedInOrBefore(majorVersion = 33)
    public boolean equals(@android.annotation.Nullable Object o) {
        // You can override field equality logic by defining either of the methods like:
        // boolean fieldNameEquals(VmsLayer other) { ... }
        // boolean fieldNameEquals(FieldType otherValue) { ... }

        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        @SuppressWarnings("unchecked")
        VmsLayer that = (VmsLayer) o;
        //noinspection PointlessBooleanExpression
        return true
                && mType == that.mType
                && mChannel == that.mChannel
                && mVersion == that.mVersion;
    }

    @Override
    @DataClass.Generated.Member
    @AddedInOrBefore(majorVersion = 33)
    public int hashCode() {
        // You can override field hashCode logic by defining methods like:
        // int fieldNameHashCode() { ... }

        int _hash = 1;
        _hash = 31 * _hash + mType;
        _hash = 31 * _hash + mChannel;
        _hash = 31 * _hash + mVersion;
        return _hash;
    }

    @Override
    @DataClass.Generated.Member
    @AddedInOrBefore(majorVersion = 33)
    public void writeToParcel(@android.annotation.NonNull Parcel dest, int flags) {
        // You can override field parcelling by defining methods like:
        // void parcelFieldName(Parcel dest, int flags) { ... }

        dest.writeInt(mType);
        dest.writeInt(mChannel);
        dest.writeInt(mVersion);
    }

    @Override
    @DataClass.Generated.Member
    @ExcludeFromCodeCoverageGeneratedReport(reason = BOILERPLATE_CODE)
    @AddedInOrBefore(majorVersion = 33)
    public int describeContents() { return 0; }

    /** @hide */
    @SuppressWarnings({"unchecked", "RedundantCast"})
    @DataClass.Generated.Member
    /* package-private */ VmsLayer(@android.annotation.NonNull Parcel in) {
        // You can override field unparcelling by defining methods like:
        // static FieldType unparcelFieldName(Parcel in) { ... }

        int type = in.readInt();
        int channel = in.readInt();
        int version = in.readInt();

        this.mType = type;
        this.mChannel = channel;
        this.mVersion = version;

        // onConstructed(); // You can define this method to get a callback
    }

    @DataClass.Generated.Member
    @AddedInOrBefore(majorVersion = 33)
    public static final @android.annotation.NonNull Parcelable.Creator<VmsLayer> CREATOR
            = new Creator<VmsLayer>() {
        @Override
        public VmsLayer[] newArray(int size) {
            return new VmsLayer[size];
        }

        @Override
        public VmsLayer createFromParcel(@android.annotation.NonNull Parcel in) {
            return new VmsLayer(in);
        }
    };

    @DataClass.Generated(
            time = 1582065881190L,
            codegenVersion = "1.0.14",
            sourceFile = "packages/services/Car/car-lib/src/android/car/vms/VmsLayer.java",
            inputSignatures = "private  int mType\nprivate  int mChannel\nprivate  int mVersion\npublic @java.lang.Deprecated int getSubtype()\nclass VmsLayer extends java.lang.Object implements [android.os.Parcelable]\n@com.android.car.internal.util.DataClass(genAidl=true, genEqualsHashCode=true, genToString=true)")
    @Deprecated
    private void __metadata() {}


    //@formatter:on
    // End of generated code

}
