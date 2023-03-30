package android.hardware.automotive.vehicle.V2_0;


public final class SubscribeOptions {
    /**
     * Property to subscribe
     */
    public int propId;
    /**
     * Sample rate in Hz.
     *
     * Must be provided for properties with
     * VehiclePropertyChangeMode::CONTINUOUS. The value must be within
     * VehiclePropConfig#minSamplingRate .. VehiclePropConfig#maxSamplingRate
     * for a given property.
     * This value indicates how many updates per second client wants to receive.
     */
    public float sampleRate;
    /**
     * Flags that indicate to which event sources to listen.
     */
    public int flags;

    @Override
    public final boolean equals(Object otherObject) {
        if (this == otherObject) {
            return true;
        }
        if (otherObject == null) {
            return false;
        }
        if (otherObject.getClass() != SubscribeOptions.class) {
            return false;
        }
        SubscribeOptions other = (SubscribeOptions)otherObject;
        if (this.propId != other.propId) {
            return false;
        }
        if (this.sampleRate != other.sampleRate) {
            return false;
        }
        if (this.flags != other.flags) {
            return false;
        }
        return true;
    }

    @Override
    public final int hashCode() {
        return java.util.Objects.hash(
                android.os.HidlSupport.deepHashCode(this.propId),
                android.os.HidlSupport.deepHashCode(this.sampleRate),
                android.os.HidlSupport.deepHashCode(this.flags));
    }

    @Override
    public final String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("{");
        builder.append(".propId = ");
        builder.append(this.propId);
        builder.append(", .sampleRate = ");
        builder.append(this.sampleRate);
        builder.append(", .flags = ");
        builder.append(SubscribeFlags.toString(this.flags));
        builder.append("}");
        return builder.toString();
    }

    public final void readFromParcel(android.os.HwParcel parcel) {
        android.os.HwBlob blob = parcel.readBuffer(12 /* size */);
        readEmbeddedFromParcel(parcel, blob, 0 /* parentOffset */);
    }

    public static final java.util.ArrayList<SubscribeOptions> readVectorFromParcel(android.os.HwParcel parcel) {
        java.util.ArrayList<SubscribeOptions> _hidl_vec = new java.util.ArrayList();
        android.os.HwBlob _hidl_blob = parcel.readBuffer(16 /* sizeof hidl_vec<T> */);

        {
            int _hidl_vec_size = _hidl_blob.getInt32(0 + 8 /* offsetof(hidl_vec<T>, mSize) */);
            android.os.HwBlob childBlob = parcel.readEmbeddedBuffer(
                    _hidl_vec_size * 12,_hidl_blob.handle(),
                    0 + 0 /* offsetof(hidl_vec<T>, mBuffer) */,true /* nullable */);

            _hidl_vec.clear();
            for (int _hidl_index_0 = 0; _hidl_index_0 < _hidl_vec_size; ++_hidl_index_0) {
                SubscribeOptions _hidl_vec_element = new SubscribeOptions();
                ((SubscribeOptions) _hidl_vec_element).readEmbeddedFromParcel(parcel, childBlob, _hidl_index_0 * 12);
                _hidl_vec.add(_hidl_vec_element);
            }
        }

        return _hidl_vec;
    }

    public final void readEmbeddedFromParcel(
            android.os.HwParcel parcel, android.os.HwBlob _hidl_blob, long _hidl_offset) {
        propId = _hidl_blob.getInt32(_hidl_offset + 0);
        sampleRate = _hidl_blob.getFloat(_hidl_offset + 4);
        flags = _hidl_blob.getInt32(_hidl_offset + 8);
    }

    public final void writeToParcel(android.os.HwParcel parcel) {
        android.os.HwBlob _hidl_blob = new android.os.HwBlob(12 /* size */);
        writeEmbeddedToBlob(_hidl_blob, 0 /* parentOffset */);
        parcel.writeBuffer(_hidl_blob);
    }

    public static final void writeVectorToParcel(
            android.os.HwParcel parcel, java.util.ArrayList<SubscribeOptions> _hidl_vec) {
        android.os.HwBlob _hidl_blob = new android.os.HwBlob(16 /* sizeof(hidl_vec<T>) */);
        {
            int _hidl_vec_size = _hidl_vec.size();
            _hidl_blob.putInt32(0 + 8 /* offsetof(hidl_vec<T>, mSize) */, _hidl_vec_size);
            _hidl_blob.putBool(0 + 12 /* offsetof(hidl_vec<T>, mOwnsBuffer) */, false);
            android.os.HwBlob childBlob = new android.os.HwBlob((int)(_hidl_vec_size * 12));
            for (int _hidl_index_0 = 0; _hidl_index_0 < _hidl_vec_size; ++_hidl_index_0) {
                _hidl_vec.get(_hidl_index_0).writeEmbeddedToBlob(childBlob, _hidl_index_0 * 12);
            }
            _hidl_blob.putBlob(0 + 0 /* offsetof(hidl_vec<T>, mBuffer) */, childBlob);
        }

        parcel.writeBuffer(_hidl_blob);
    }

    public final void writeEmbeddedToBlob(
            android.os.HwBlob _hidl_blob, long _hidl_offset) {
        _hidl_blob.putInt32(_hidl_offset + 0, propId);
        _hidl_blob.putFloat(_hidl_offset + 4, sampleRate);
        _hidl_blob.putInt32(_hidl_offset + 8, flags);
    }
};

