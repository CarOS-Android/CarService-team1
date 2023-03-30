package android.hardware.automotive.vehicle.V2_0;


public final class VehiclePropConfig {
    /**
     * Property identifier
     */
    public int prop;
    /**
     * Defines if the property is read or write or both.
     */
    public int access;
    /**
     * Defines the change mode of the property.
     */
    public int changeMode;
    /**
     * Contains per-area configuration.
     */
    public java.util.ArrayList<VehicleAreaConfig> areaConfigs = new java.util.ArrayList<VehicleAreaConfig>();
    /**
     * Contains additional configuration parameters
     */
    public java.util.ArrayList<Integer> configArray = new java.util.ArrayList<Integer>();
    /**
     * Some properties may require additional information passed over this
     * string. Most properties do not need to set this.
     */
    public String configString = new String();
    /**
     * Min sample rate in Hz.
     * Must be defined for VehiclePropertyChangeMode::CONTINUOUS
     */
    public float minSampleRate;
    /**
     * Must be defined for VehiclePropertyChangeMode::CONTINUOUS
     * Max sample rate in Hz.
     */
    public float maxSampleRate;

    @Override
    public final boolean equals(Object otherObject) {
        if (this == otherObject) {
            return true;
        }
        if (otherObject == null) {
            return false;
        }
        if (otherObject.getClass() != VehiclePropConfig.class) {
            return false;
        }
        VehiclePropConfig other = (VehiclePropConfig)otherObject;
        if (this.prop != other.prop) {
            return false;
        }
        if (this.access != other.access) {
            return false;
        }
        if (this.changeMode != other.changeMode) {
            return false;
        }
        if (!android.os.HidlSupport.deepEquals(this.areaConfigs, other.areaConfigs)) {
            return false;
        }
        if (!android.os.HidlSupport.deepEquals(this.configArray, other.configArray)) {
            return false;
        }
        if (!android.os.HidlSupport.deepEquals(this.configString, other.configString)) {
            return false;
        }
        if (this.minSampleRate != other.minSampleRate) {
            return false;
        }
        if (this.maxSampleRate != other.maxSampleRate) {
            return false;
        }
        return true;
    }

    @Override
    public final int hashCode() {
        return java.util.Objects.hash(
                android.os.HidlSupport.deepHashCode(this.prop),
                android.os.HidlSupport.deepHashCode(this.access),
                android.os.HidlSupport.deepHashCode(this.changeMode),
                android.os.HidlSupport.deepHashCode(this.areaConfigs),
                android.os.HidlSupport.deepHashCode(this.configArray),
                android.os.HidlSupport.deepHashCode(this.configString),
                android.os.HidlSupport.deepHashCode(this.minSampleRate),
                android.os.HidlSupport.deepHashCode(this.maxSampleRate));
    }

    @Override
    public final String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("{");
        builder.append(".prop = ");
        builder.append(this.prop);
        builder.append(", .access = ");
        builder.append(VehiclePropertyAccess.toString(this.access));
        builder.append(", .changeMode = ");
        builder.append(VehiclePropertyChangeMode.toString(this.changeMode));
        builder.append(", .areaConfigs = ");
        builder.append(this.areaConfigs);
        builder.append(", .configArray = ");
        builder.append(this.configArray);
        builder.append(", .configString = ");
        builder.append(this.configString);
        builder.append(", .minSampleRate = ");
        builder.append(this.minSampleRate);
        builder.append(", .maxSampleRate = ");
        builder.append(this.maxSampleRate);
        builder.append("}");
        return builder.toString();
    }

    public final void readFromParcel(android.os.HwParcel parcel) {
        android.os.HwBlob blob = parcel.readBuffer(72 /* size */);
        readEmbeddedFromParcel(parcel, blob, 0 /* parentOffset */);
    }

    public static final java.util.ArrayList<VehiclePropConfig> readVectorFromParcel(android.os.HwParcel parcel) {
        java.util.ArrayList<VehiclePropConfig> _hidl_vec = new java.util.ArrayList();
        android.os.HwBlob _hidl_blob = parcel.readBuffer(16 /* sizeof hidl_vec<T> */);

        {
            int _hidl_vec_size = _hidl_blob.getInt32(0 + 8 /* offsetof(hidl_vec<T>, mSize) */);
            android.os.HwBlob childBlob = parcel.readEmbeddedBuffer(
                    _hidl_vec_size * 72,_hidl_blob.handle(),
                    0 + 0 /* offsetof(hidl_vec<T>, mBuffer) */,true /* nullable */);

            _hidl_vec.clear();
            for (int _hidl_index_0 = 0; _hidl_index_0 < _hidl_vec_size; ++_hidl_index_0) {
                VehiclePropConfig _hidl_vec_element = new VehiclePropConfig();
                ((VehiclePropConfig) _hidl_vec_element).readEmbeddedFromParcel(parcel, childBlob, _hidl_index_0 * 72);
                _hidl_vec.add(_hidl_vec_element);
            }
        }

        return _hidl_vec;
    }

    public final void readEmbeddedFromParcel(
            android.os.HwParcel parcel, android.os.HwBlob _hidl_blob, long _hidl_offset) {
        prop = _hidl_blob.getInt32(_hidl_offset + 0);
        access = _hidl_blob.getInt32(_hidl_offset + 4);
        changeMode = _hidl_blob.getInt32(_hidl_offset + 8);
        {
            int _hidl_vec_size = _hidl_blob.getInt32(_hidl_offset + 16 + 8 /* offsetof(hidl_vec<T>, mSize) */);
            android.os.HwBlob childBlob = parcel.readEmbeddedBuffer(
                    _hidl_vec_size * 40,_hidl_blob.handle(),
                    _hidl_offset + 16 + 0 /* offsetof(hidl_vec<T>, mBuffer) */,true /* nullable */);

            ((java.util.ArrayList<VehicleAreaConfig>) areaConfigs).clear();
            for (int _hidl_index_0 = 0; _hidl_index_0 < _hidl_vec_size; ++_hidl_index_0) {
                VehicleAreaConfig _hidl_vec_element = new VehicleAreaConfig();
                ((VehicleAreaConfig) _hidl_vec_element).readEmbeddedFromParcel(parcel, childBlob, _hidl_index_0 * 40);
                ((java.util.ArrayList<VehicleAreaConfig>) areaConfigs).add(_hidl_vec_element);
            }
        }
        {
            int _hidl_vec_size = _hidl_blob.getInt32(_hidl_offset + 32 + 8 /* offsetof(hidl_vec<T>, mSize) */);
            android.os.HwBlob childBlob = parcel.readEmbeddedBuffer(
                    _hidl_vec_size * 4,_hidl_blob.handle(),
                    _hidl_offset + 32 + 0 /* offsetof(hidl_vec<T>, mBuffer) */,true /* nullable */);

            ((java.util.ArrayList<Integer>) configArray).clear();
            for (int _hidl_index_0 = 0; _hidl_index_0 < _hidl_vec_size; ++_hidl_index_0) {
                int _hidl_vec_element;
                _hidl_vec_element = childBlob.getInt32(_hidl_index_0 * 4);
                ((java.util.ArrayList<Integer>) configArray).add(_hidl_vec_element);
            }
        }
        configString = _hidl_blob.getString(_hidl_offset + 48);

        parcel.readEmbeddedBuffer(
                ((String) configString).getBytes().length + 1,
                _hidl_blob.handle(),
                _hidl_offset + 48 + 0 /* offsetof(hidl_string, mBuffer) */,false /* nullable */);

        minSampleRate = _hidl_blob.getFloat(_hidl_offset + 64);
        maxSampleRate = _hidl_blob.getFloat(_hidl_offset + 68);
    }

    public final void writeToParcel(android.os.HwParcel parcel) {
        android.os.HwBlob _hidl_blob = new android.os.HwBlob(72 /* size */);
        writeEmbeddedToBlob(_hidl_blob, 0 /* parentOffset */);
        parcel.writeBuffer(_hidl_blob);
    }

    public static final void writeVectorToParcel(
            android.os.HwParcel parcel, java.util.ArrayList<VehiclePropConfig> _hidl_vec) {
        android.os.HwBlob _hidl_blob = new android.os.HwBlob(16 /* sizeof(hidl_vec<T>) */);
        {
            int _hidl_vec_size = _hidl_vec.size();
            _hidl_blob.putInt32(0 + 8 /* offsetof(hidl_vec<T>, mSize) */, _hidl_vec_size);
            _hidl_blob.putBool(0 + 12 /* offsetof(hidl_vec<T>, mOwnsBuffer) */, false);
            android.os.HwBlob childBlob = new android.os.HwBlob((int)(_hidl_vec_size * 72));
            for (int _hidl_index_0 = 0; _hidl_index_0 < _hidl_vec_size; ++_hidl_index_0) {
                _hidl_vec.get(_hidl_index_0).writeEmbeddedToBlob(childBlob, _hidl_index_0 * 72);
            }
            _hidl_blob.putBlob(0 + 0 /* offsetof(hidl_vec<T>, mBuffer) */, childBlob);
        }

        parcel.writeBuffer(_hidl_blob);
    }

    public final void writeEmbeddedToBlob(
            android.os.HwBlob _hidl_blob, long _hidl_offset) {
        _hidl_blob.putInt32(_hidl_offset + 0, prop);
        _hidl_blob.putInt32(_hidl_offset + 4, access);
        _hidl_blob.putInt32(_hidl_offset + 8, changeMode);
        {
            int _hidl_vec_size = areaConfigs.size();
            _hidl_blob.putInt32(_hidl_offset + 16 + 8 /* offsetof(hidl_vec<T>, mSize) */, _hidl_vec_size);
            _hidl_blob.putBool(_hidl_offset + 16 + 12 /* offsetof(hidl_vec<T>, mOwnsBuffer) */, false);
            android.os.HwBlob childBlob = new android.os.HwBlob((int)(_hidl_vec_size * 40));
            for (int _hidl_index_0 = 0; _hidl_index_0 < _hidl_vec_size; ++_hidl_index_0) {
                areaConfigs.get(_hidl_index_0).writeEmbeddedToBlob(childBlob, _hidl_index_0 * 40);
            }
            _hidl_blob.putBlob(_hidl_offset + 16 + 0 /* offsetof(hidl_vec<T>, mBuffer) */, childBlob);
        }
        {
            int _hidl_vec_size = configArray.size();
            _hidl_blob.putInt32(_hidl_offset + 32 + 8 /* offsetof(hidl_vec<T>, mSize) */, _hidl_vec_size);
            _hidl_blob.putBool(_hidl_offset + 32 + 12 /* offsetof(hidl_vec<T>, mOwnsBuffer) */, false);
            android.os.HwBlob childBlob = new android.os.HwBlob((int)(_hidl_vec_size * 4));
            for (int _hidl_index_0 = 0; _hidl_index_0 < _hidl_vec_size; ++_hidl_index_0) {
                childBlob.putInt32(_hidl_index_0 * 4, configArray.get(_hidl_index_0));
            }
            _hidl_blob.putBlob(_hidl_offset + 32 + 0 /* offsetof(hidl_vec<T>, mBuffer) */, childBlob);
        }
        _hidl_blob.putString(_hidl_offset + 48, configString);
        _hidl_blob.putFloat(_hidl_offset + 64, minSampleRate);
        _hidl_blob.putFloat(_hidl_offset + 68, maxSampleRate);
    }
};

