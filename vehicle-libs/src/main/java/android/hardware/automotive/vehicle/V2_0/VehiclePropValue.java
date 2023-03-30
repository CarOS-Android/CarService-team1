package android.hardware.automotive.vehicle.V2_0;


public final class VehiclePropValue {
    public final static class RawValue {
        /**
         * This is used for properties of types VehiclePropertyType#INT
         * and VehiclePropertyType#INT_VEC
         */
        public java.util.ArrayList<Integer> int32Values = new java.util.ArrayList<Integer>();
        /**
         * This is used for properties of types VehiclePropertyType#FLOAT
         * and VehiclePropertyType#FLOAT_VEC
         */
        public java.util.ArrayList<Float> floatValues = new java.util.ArrayList<Float>();
        /**
         * This is used for properties of type VehiclePropertyType#INT64
         */
        public java.util.ArrayList<Long> int64Values = new java.util.ArrayList<Long>();
        /**
         * This is used for properties of type VehiclePropertyType#BYTES
         */
        public java.util.ArrayList<Byte> bytes = new java.util.ArrayList<Byte>();
        /**
         * This is used for properties of type VehiclePropertyType#STRING
         */
        public String stringValue = new String();

        @Override
        public final boolean equals(Object otherObject) {
            if (this == otherObject) {
                return true;
            }
            if (otherObject == null) {
                return false;
            }
            if (otherObject.getClass() != RawValue.class) {
                return false;
            }
            RawValue other = (RawValue)otherObject;
            if (!android.os.HidlSupport.deepEquals(this.int32Values, other.int32Values)) {
                return false;
            }
            if (!android.os.HidlSupport.deepEquals(this.floatValues, other.floatValues)) {
                return false;
            }
            if (!android.os.HidlSupport.deepEquals(this.int64Values, other.int64Values)) {
                return false;
            }
            if (!android.os.HidlSupport.deepEquals(this.bytes, other.bytes)) {
                return false;
            }
            if (!android.os.HidlSupport.deepEquals(this.stringValue, other.stringValue)) {
                return false;
            }
            return true;
        }

        @Override
        public final int hashCode() {
            return java.util.Objects.hash(
                    android.os.HidlSupport.deepHashCode(this.int32Values),
                    android.os.HidlSupport.deepHashCode(this.floatValues),
                    android.os.HidlSupport.deepHashCode(this.int64Values),
                    android.os.HidlSupport.deepHashCode(this.bytes),
                    android.os.HidlSupport.deepHashCode(this.stringValue));
        }

        @Override
        public final String toString() {
            StringBuilder builder = new StringBuilder();
            builder.append("{");
            builder.append(".int32Values = ");
            builder.append(this.int32Values);
            builder.append(", .floatValues = ");
            builder.append(this.floatValues);
            builder.append(", .int64Values = ");
            builder.append(this.int64Values);
            builder.append(", .bytes = ");
            builder.append(this.bytes);
            builder.append(", .stringValue = ");
            builder.append(this.stringValue);
            builder.append("}");
            return builder.toString();
        }

        public final void readFromParcel(android.os.HwParcel parcel) {
            android.os.HwBlob blob = parcel.readBuffer(80 /* size */);
            readEmbeddedFromParcel(parcel, blob, 0 /* parentOffset */);
        }

        public static final java.util.ArrayList<RawValue> readVectorFromParcel(android.os.HwParcel parcel) {
            java.util.ArrayList<RawValue> _hidl_vec = new java.util.ArrayList();
            android.os.HwBlob _hidl_blob = parcel.readBuffer(16 /* sizeof hidl_vec<T> */);

            {
                int _hidl_vec_size = _hidl_blob.getInt32(0 + 8 /* offsetof(hidl_vec<T>, mSize) */);
                android.os.HwBlob childBlob = parcel.readEmbeddedBuffer(
                        _hidl_vec_size * 80,_hidl_blob.handle(),
                        0 + 0 /* offsetof(hidl_vec<T>, mBuffer) */,true /* nullable */);

                _hidl_vec.clear();
                for (int _hidl_index_0 = 0; _hidl_index_0 < _hidl_vec_size; ++_hidl_index_0) {
                    RawValue _hidl_vec_element = new RawValue();
                    ((RawValue) _hidl_vec_element).readEmbeddedFromParcel(parcel, childBlob, _hidl_index_0 * 80);
                    _hidl_vec.add(_hidl_vec_element);
                }
            }

            return _hidl_vec;
        }

        public final void readEmbeddedFromParcel(
                android.os.HwParcel parcel, android.os.HwBlob _hidl_blob, long _hidl_offset) {
            {
                int _hidl_vec_size = _hidl_blob.getInt32(_hidl_offset + 0 + 8 /* offsetof(hidl_vec<T>, mSize) */);
                android.os.HwBlob childBlob = parcel.readEmbeddedBuffer(
                        _hidl_vec_size * 4,_hidl_blob.handle(),
                        _hidl_offset + 0 + 0 /* offsetof(hidl_vec<T>, mBuffer) */,true /* nullable */);

                ((java.util.ArrayList<Integer>) int32Values).clear();
                for (int _hidl_index_0 = 0; _hidl_index_0 < _hidl_vec_size; ++_hidl_index_0) {
                    int _hidl_vec_element;
                    _hidl_vec_element = childBlob.getInt32(_hidl_index_0 * 4);
                    ((java.util.ArrayList<Integer>) int32Values).add(_hidl_vec_element);
                }
            }
            {
                int _hidl_vec_size = _hidl_blob.getInt32(_hidl_offset + 16 + 8 /* offsetof(hidl_vec<T>, mSize) */);
                android.os.HwBlob childBlob = parcel.readEmbeddedBuffer(
                        _hidl_vec_size * 4,_hidl_blob.handle(),
                        _hidl_offset + 16 + 0 /* offsetof(hidl_vec<T>, mBuffer) */,true /* nullable */);

                ((java.util.ArrayList<Float>) floatValues).clear();
                for (int _hidl_index_0 = 0; _hidl_index_0 < _hidl_vec_size; ++_hidl_index_0) {
                    float _hidl_vec_element;
                    _hidl_vec_element = childBlob.getFloat(_hidl_index_0 * 4);
                    ((java.util.ArrayList<Float>) floatValues).add(_hidl_vec_element);
                }
            }
            {
                int _hidl_vec_size = _hidl_blob.getInt32(_hidl_offset + 32 + 8 /* offsetof(hidl_vec<T>, mSize) */);
                android.os.HwBlob childBlob = parcel.readEmbeddedBuffer(
                        _hidl_vec_size * 8,_hidl_blob.handle(),
                        _hidl_offset + 32 + 0 /* offsetof(hidl_vec<T>, mBuffer) */,true /* nullable */);

                ((java.util.ArrayList<Long>) int64Values).clear();
                for (int _hidl_index_0 = 0; _hidl_index_0 < _hidl_vec_size; ++_hidl_index_0) {
                    long _hidl_vec_element;
                    _hidl_vec_element = childBlob.getInt64(_hidl_index_0 * 8);
                    ((java.util.ArrayList<Long>) int64Values).add(_hidl_vec_element);
                }
            }
            {
                int _hidl_vec_size = _hidl_blob.getInt32(_hidl_offset + 48 + 8 /* offsetof(hidl_vec<T>, mSize) */);
                android.os.HwBlob childBlob = parcel.readEmbeddedBuffer(
                        _hidl_vec_size * 1,_hidl_blob.handle(),
                        _hidl_offset + 48 + 0 /* offsetof(hidl_vec<T>, mBuffer) */,true /* nullable */);

                ((java.util.ArrayList<Byte>) bytes).clear();
                for (int _hidl_index_0 = 0; _hidl_index_0 < _hidl_vec_size; ++_hidl_index_0) {
                    byte _hidl_vec_element;
                    _hidl_vec_element = childBlob.getInt8(_hidl_index_0 * 1);
                    ((java.util.ArrayList<Byte>) bytes).add(_hidl_vec_element);
                }
            }
            stringValue = _hidl_blob.getString(_hidl_offset + 64);

            parcel.readEmbeddedBuffer(
                    ((String) stringValue).getBytes().length + 1,
                    _hidl_blob.handle(),
                    _hidl_offset + 64 + 0 /* offsetof(hidl_string, mBuffer) */,false /* nullable */);

        }

        public final void writeToParcel(android.os.HwParcel parcel) {
            android.os.HwBlob _hidl_blob = new android.os.HwBlob(80 /* size */);
            writeEmbeddedToBlob(_hidl_blob, 0 /* parentOffset */);
            parcel.writeBuffer(_hidl_blob);
        }

        public static final void writeVectorToParcel(
                android.os.HwParcel parcel, java.util.ArrayList<RawValue> _hidl_vec) {
            android.os.HwBlob _hidl_blob = new android.os.HwBlob(16 /* sizeof(hidl_vec<T>) */);
            {
                int _hidl_vec_size = _hidl_vec.size();
                _hidl_blob.putInt32(0 + 8 /* offsetof(hidl_vec<T>, mSize) */, _hidl_vec_size);
                _hidl_blob.putBool(0 + 12 /* offsetof(hidl_vec<T>, mOwnsBuffer) */, false);
                android.os.HwBlob childBlob = new android.os.HwBlob((int)(_hidl_vec_size * 80));
                for (int _hidl_index_0 = 0; _hidl_index_0 < _hidl_vec_size; ++_hidl_index_0) {
                    _hidl_vec.get(_hidl_index_0).writeEmbeddedToBlob(childBlob, _hidl_index_0 * 80);
                }
                _hidl_blob.putBlob(0 + 0 /* offsetof(hidl_vec<T>, mBuffer) */, childBlob);
            }

            parcel.writeBuffer(_hidl_blob);
        }

        public final void writeEmbeddedToBlob(
                android.os.HwBlob _hidl_blob, long _hidl_offset) {
            {
                int _hidl_vec_size = int32Values.size();
                _hidl_blob.putInt32(_hidl_offset + 0 + 8 /* offsetof(hidl_vec<T>, mSize) */, _hidl_vec_size);
                _hidl_blob.putBool(_hidl_offset + 0 + 12 /* offsetof(hidl_vec<T>, mOwnsBuffer) */, false);
                android.os.HwBlob childBlob = new android.os.HwBlob((int)(_hidl_vec_size * 4));
                for (int _hidl_index_0 = 0; _hidl_index_0 < _hidl_vec_size; ++_hidl_index_0) {
                    childBlob.putInt32(_hidl_index_0 * 4, int32Values.get(_hidl_index_0));
                }
                _hidl_blob.putBlob(_hidl_offset + 0 + 0 /* offsetof(hidl_vec<T>, mBuffer) */, childBlob);
            }
            {
                int _hidl_vec_size = floatValues.size();
                _hidl_blob.putInt32(_hidl_offset + 16 + 8 /* offsetof(hidl_vec<T>, mSize) */, _hidl_vec_size);
                _hidl_blob.putBool(_hidl_offset + 16 + 12 /* offsetof(hidl_vec<T>, mOwnsBuffer) */, false);
                android.os.HwBlob childBlob = new android.os.HwBlob((int)(_hidl_vec_size * 4));
                for (int _hidl_index_0 = 0; _hidl_index_0 < _hidl_vec_size; ++_hidl_index_0) {
                    childBlob.putFloat(_hidl_index_0 * 4, floatValues.get(_hidl_index_0));
                }
                _hidl_blob.putBlob(_hidl_offset + 16 + 0 /* offsetof(hidl_vec<T>, mBuffer) */, childBlob);
            }
            {
                int _hidl_vec_size = int64Values.size();
                _hidl_blob.putInt32(_hidl_offset + 32 + 8 /* offsetof(hidl_vec<T>, mSize) */, _hidl_vec_size);
                _hidl_blob.putBool(_hidl_offset + 32 + 12 /* offsetof(hidl_vec<T>, mOwnsBuffer) */, false);
                android.os.HwBlob childBlob = new android.os.HwBlob((int)(_hidl_vec_size * 8));
                for (int _hidl_index_0 = 0; _hidl_index_0 < _hidl_vec_size; ++_hidl_index_0) {
                    childBlob.putInt64(_hidl_index_0 * 8, int64Values.get(_hidl_index_0));
                }
                _hidl_blob.putBlob(_hidl_offset + 32 + 0 /* offsetof(hidl_vec<T>, mBuffer) */, childBlob);
            }
            {
                int _hidl_vec_size = bytes.size();
                _hidl_blob.putInt32(_hidl_offset + 48 + 8 /* offsetof(hidl_vec<T>, mSize) */, _hidl_vec_size);
                _hidl_blob.putBool(_hidl_offset + 48 + 12 /* offsetof(hidl_vec<T>, mOwnsBuffer) */, false);
                android.os.HwBlob childBlob = new android.os.HwBlob((int)(_hidl_vec_size * 1));
                for (int _hidl_index_0 = 0; _hidl_index_0 < _hidl_vec_size; ++_hidl_index_0) {
                    childBlob.putInt8(_hidl_index_0 * 1, bytes.get(_hidl_index_0));
                }
                _hidl_blob.putBlob(_hidl_offset + 48 + 0 /* offsetof(hidl_vec<T>, mBuffer) */, childBlob);
            }
            _hidl_blob.putString(_hidl_offset + 64, stringValue);
        }
    };

    /**
     * Time is elapsed nanoseconds since boot. It's equivalent to
     * {@code SystemClock.elapsedRealtimeNano()}.
     */
    public long timestamp;
    /**
     * Area type(s) for non-global property it must be one of the value from
     * VehicleArea* enums or 0 for global properties.
     */
    public int areaId;
    /**
     * Property identifier
     */
    public int prop;
    /**
     * Status of the property
     */
    public int status;
    public RawValue value = new RawValue();

    @Override
    public final boolean equals(Object otherObject) {
        if (this == otherObject) {
            return true;
        }
        if (otherObject == null) {
            return false;
        }
        if (otherObject.getClass() != VehiclePropValue.class) {
            return false;
        }
        VehiclePropValue other = (VehiclePropValue)otherObject;
        if (this.timestamp != other.timestamp) {
            return false;
        }
        if (this.areaId != other.areaId) {
            return false;
        }
        if (this.prop != other.prop) {
            return false;
        }
        if (this.status != other.status) {
            return false;
        }
        if (!android.os.HidlSupport.deepEquals(this.value, other.value)) {
            return false;
        }
        return true;
    }

    @Override
    public final int hashCode() {
        return java.util.Objects.hash(
                android.os.HidlSupport.deepHashCode(this.timestamp),
                android.os.HidlSupport.deepHashCode(this.areaId),
                android.os.HidlSupport.deepHashCode(this.prop),
                android.os.HidlSupport.deepHashCode(this.status),
                android.os.HidlSupport.deepHashCode(this.value));
    }

    @Override
    public final String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("{");
        builder.append(".timestamp = ");
        builder.append(this.timestamp);
        builder.append(", .areaId = ");
        builder.append(this.areaId);
        builder.append(", .prop = ");
        builder.append(this.prop);
        builder.append(", .status = ");
        builder.append(VehiclePropertyStatus.toString(this.status));
        builder.append(", .value = ");
        builder.append(this.value);
        builder.append("}");
        return builder.toString();
    }

    public final void readFromParcel(android.os.HwParcel parcel) {
        android.os.HwBlob blob = parcel.readBuffer(104 /* size */);
        readEmbeddedFromParcel(parcel, blob, 0 /* parentOffset */);
    }

    public static final java.util.ArrayList<VehiclePropValue> readVectorFromParcel(android.os.HwParcel parcel) {
        java.util.ArrayList<VehiclePropValue> _hidl_vec = new java.util.ArrayList();
        android.os.HwBlob _hidl_blob = parcel.readBuffer(16 /* sizeof hidl_vec<T> */);

        {
            int _hidl_vec_size = _hidl_blob.getInt32(0 + 8 /* offsetof(hidl_vec<T>, mSize) */);
            android.os.HwBlob childBlob = parcel.readEmbeddedBuffer(
                    _hidl_vec_size * 104,_hidl_blob.handle(),
                    0 + 0 /* offsetof(hidl_vec<T>, mBuffer) */,true /* nullable */);

            _hidl_vec.clear();
            for (int _hidl_index_0 = 0; _hidl_index_0 < _hidl_vec_size; ++_hidl_index_0) {
                VehiclePropValue _hidl_vec_element = new VehiclePropValue();
                ((VehiclePropValue) _hidl_vec_element).readEmbeddedFromParcel(parcel, childBlob, _hidl_index_0 * 104);
                _hidl_vec.add(_hidl_vec_element);
            }
        }

        return _hidl_vec;
    }

    public final void readEmbeddedFromParcel(
            android.os.HwParcel parcel, android.os.HwBlob _hidl_blob, long _hidl_offset) {
        timestamp = _hidl_blob.getInt64(_hidl_offset + 0);
        areaId = _hidl_blob.getInt32(_hidl_offset + 8);
        prop = _hidl_blob.getInt32(_hidl_offset + 12);
        status = _hidl_blob.getInt32(_hidl_offset + 16);
        ((RawValue) value).readEmbeddedFromParcel(parcel, _hidl_blob, _hidl_offset + 24);
    }

    public final void writeToParcel(android.os.HwParcel parcel) {
        android.os.HwBlob _hidl_blob = new android.os.HwBlob(104 /* size */);
        writeEmbeddedToBlob(_hidl_blob, 0 /* parentOffset */);
        parcel.writeBuffer(_hidl_blob);
    }

    public static final void writeVectorToParcel(
            android.os.HwParcel parcel, java.util.ArrayList<VehiclePropValue> _hidl_vec) {
        android.os.HwBlob _hidl_blob = new android.os.HwBlob(16 /* sizeof(hidl_vec<T>) */);
        {
            int _hidl_vec_size = _hidl_vec.size();
            _hidl_blob.putInt32(0 + 8 /* offsetof(hidl_vec<T>, mSize) */, _hidl_vec_size);
            _hidl_blob.putBool(0 + 12 /* offsetof(hidl_vec<T>, mOwnsBuffer) */, false);
            android.os.HwBlob childBlob = new android.os.HwBlob((int)(_hidl_vec_size * 104));
            for (int _hidl_index_0 = 0; _hidl_index_0 < _hidl_vec_size; ++_hidl_index_0) {
                _hidl_vec.get(_hidl_index_0).writeEmbeddedToBlob(childBlob, _hidl_index_0 * 104);
            }
            _hidl_blob.putBlob(0 + 0 /* offsetof(hidl_vec<T>, mBuffer) */, childBlob);
        }

        parcel.writeBuffer(_hidl_blob);
    }

    public final void writeEmbeddedToBlob(
            android.os.HwBlob _hidl_blob, long _hidl_offset) {
        _hidl_blob.putInt64(_hidl_offset + 0, timestamp);
        _hidl_blob.putInt32(_hidl_offset + 8, areaId);
        _hidl_blob.putInt32(_hidl_offset + 12, prop);
        _hidl_blob.putInt32(_hidl_offset + 16, status);
        value.writeEmbeddedToBlob(_hidl_blob, _hidl_offset + 24);
    }
};

