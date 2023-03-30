package android.hardware.automotive.vehicle.V2_0;


public final class VehicleAreaConfig {
    /**
     * Area id is ignored for VehiclePropertyGroup:GLOBAL properties.
     */
    public int areaId;
    /**
     * If the property has @data_enum, leave the range to zero.
     *
     * Range will be ignored in the following cases:
     *    - The VehiclePropertyType is not INT32, INT64 or FLOAT.
     *    - Both of min value and max value are zero.
     */
    public int minInt32Value;
    public int maxInt32Value;
    public long minInt64Value;
    public long maxInt64Value;
    public float minFloatValue;
    public float maxFloatValue;

    @Override
    public final boolean equals(Object otherObject) {
        if (this == otherObject) {
            return true;
        }
        if (otherObject == null) {
            return false;
        }
        if (otherObject.getClass() != VehicleAreaConfig.class) {
            return false;
        }
        VehicleAreaConfig other = (VehicleAreaConfig)otherObject;
        if (this.areaId != other.areaId) {
            return false;
        }
        if (this.minInt32Value != other.minInt32Value) {
            return false;
        }
        if (this.maxInt32Value != other.maxInt32Value) {
            return false;
        }
        if (this.minInt64Value != other.minInt64Value) {
            return false;
        }
        if (this.maxInt64Value != other.maxInt64Value) {
            return false;
        }
        if (this.minFloatValue != other.minFloatValue) {
            return false;
        }
        if (this.maxFloatValue != other.maxFloatValue) {
            return false;
        }
        return true;
    }

    @Override
    public final int hashCode() {
        return java.util.Objects.hash(
                android.os.HidlSupport.deepHashCode(this.areaId),
                android.os.HidlSupport.deepHashCode(this.minInt32Value),
                android.os.HidlSupport.deepHashCode(this.maxInt32Value),
                android.os.HidlSupport.deepHashCode(this.minInt64Value),
                android.os.HidlSupport.deepHashCode(this.maxInt64Value),
                android.os.HidlSupport.deepHashCode(this.minFloatValue),
                android.os.HidlSupport.deepHashCode(this.maxFloatValue));
    }

    @Override
    public final String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("{");
        builder.append(".areaId = ");
        builder.append(this.areaId);
        builder.append(", .minInt32Value = ");
        builder.append(this.minInt32Value);
        builder.append(", .maxInt32Value = ");
        builder.append(this.maxInt32Value);
        builder.append(", .minInt64Value = ");
        builder.append(this.minInt64Value);
        builder.append(", .maxInt64Value = ");
        builder.append(this.maxInt64Value);
        builder.append(", .minFloatValue = ");
        builder.append(this.minFloatValue);
        builder.append(", .maxFloatValue = ");
        builder.append(this.maxFloatValue);
        builder.append("}");
        return builder.toString();
    }

    public final void readFromParcel(android.os.HwParcel parcel) {
        android.os.HwBlob blob = parcel.readBuffer(40 /* size */);
        readEmbeddedFromParcel(parcel, blob, 0 /* parentOffset */);
    }

    public static final java.util.ArrayList<VehicleAreaConfig> readVectorFromParcel(android.os.HwParcel parcel) {
        java.util.ArrayList<VehicleAreaConfig> _hidl_vec = new java.util.ArrayList();
        android.os.HwBlob _hidl_blob = parcel.readBuffer(16 /* sizeof hidl_vec<T> */);

        {
            int _hidl_vec_size = _hidl_blob.getInt32(0 + 8 /* offsetof(hidl_vec<T>, mSize) */);
            android.os.HwBlob childBlob = parcel.readEmbeddedBuffer(
                    _hidl_vec_size * 40,_hidl_blob.handle(),
                    0 + 0 /* offsetof(hidl_vec<T>, mBuffer) */,true /* nullable */);

            _hidl_vec.clear();
            for (int _hidl_index_0 = 0; _hidl_index_0 < _hidl_vec_size; ++_hidl_index_0) {
                VehicleAreaConfig _hidl_vec_element = new VehicleAreaConfig();
                ((VehicleAreaConfig) _hidl_vec_element).readEmbeddedFromParcel(parcel, childBlob, _hidl_index_0 * 40);
                _hidl_vec.add(_hidl_vec_element);
            }
        }

        return _hidl_vec;
    }

    public final void readEmbeddedFromParcel(
            android.os.HwParcel parcel, android.os.HwBlob _hidl_blob, long _hidl_offset) {
        areaId = _hidl_blob.getInt32(_hidl_offset + 0);
        minInt32Value = _hidl_blob.getInt32(_hidl_offset + 4);
        maxInt32Value = _hidl_blob.getInt32(_hidl_offset + 8);
        minInt64Value = _hidl_blob.getInt64(_hidl_offset + 16);
        maxInt64Value = _hidl_blob.getInt64(_hidl_offset + 24);
        minFloatValue = _hidl_blob.getFloat(_hidl_offset + 32);
        maxFloatValue = _hidl_blob.getFloat(_hidl_offset + 36);
    }

    public final void writeToParcel(android.os.HwParcel parcel) {
        android.os.HwBlob _hidl_blob = new android.os.HwBlob(40 /* size */);
        writeEmbeddedToBlob(_hidl_blob, 0 /* parentOffset */);
        parcel.writeBuffer(_hidl_blob);
    }

    public static final void writeVectorToParcel(
            android.os.HwParcel parcel, java.util.ArrayList<VehicleAreaConfig> _hidl_vec) {
        android.os.HwBlob _hidl_blob = new android.os.HwBlob(16 /* sizeof(hidl_vec<T>) */);
        {
            int _hidl_vec_size = _hidl_vec.size();
            _hidl_blob.putInt32(0 + 8 /* offsetof(hidl_vec<T>, mSize) */, _hidl_vec_size);
            _hidl_blob.putBool(0 + 12 /* offsetof(hidl_vec<T>, mOwnsBuffer) */, false);
            android.os.HwBlob childBlob = new android.os.HwBlob((int)(_hidl_vec_size * 40));
            for (int _hidl_index_0 = 0; _hidl_index_0 < _hidl_vec_size; ++_hidl_index_0) {
                _hidl_vec.get(_hidl_index_0).writeEmbeddedToBlob(childBlob, _hidl_index_0 * 40);
            }
            _hidl_blob.putBlob(0 + 0 /* offsetof(hidl_vec<T>, mBuffer) */, childBlob);
        }

        parcel.writeBuffer(_hidl_blob);
    }

    public final void writeEmbeddedToBlob(
            android.os.HwBlob _hidl_blob, long _hidl_offset) {
        _hidl_blob.putInt32(_hidl_offset + 0, areaId);
        _hidl_blob.putInt32(_hidl_offset + 4, minInt32Value);
        _hidl_blob.putInt32(_hidl_offset + 8, maxInt32Value);
        _hidl_blob.putInt64(_hidl_offset + 16, minInt64Value);
        _hidl_blob.putInt64(_hidl_offset + 24, maxInt64Value);
        _hidl_blob.putFloat(_hidl_offset + 32, minFloatValue);
        _hidl_blob.putFloat(_hidl_offset + 36, maxFloatValue);
    }
};

