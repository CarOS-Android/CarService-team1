package android.hardware.automotive.vehicle.V2_0;


public final class UserIdentificationResponse {
    /**
     * Id of the request being responded.
     */
    public int requestId;
    /**
     * Number of associations being returned.
     */
    public int numberAssociation;
    /**
     * Values associated with the user.
     */
    public java.util.ArrayList<UserIdentificationAssociation> associations = new java.util.ArrayList<UserIdentificationAssociation>();
    /**
     * HAL-specific error message.
     *
     * This argument is optional, and when defined, it's passed "as-is" to the caller. It could be
     * used to show custom error messages to the end user.
     */
    public String errorMessage = new String();

    @Override
    public final boolean equals(Object otherObject) {
        if (this == otherObject) {
            return true;
        }
        if (otherObject == null) {
            return false;
        }
        if (otherObject.getClass() != UserIdentificationResponse.class) {
            return false;
        }
        UserIdentificationResponse other = (UserIdentificationResponse)otherObject;
        if (this.requestId != other.requestId) {
            return false;
        }
        if (this.numberAssociation != other.numberAssociation) {
            return false;
        }
        if (!android.os.HidlSupport.deepEquals(this.associations, other.associations)) {
            return false;
        }
        if (!android.os.HidlSupport.deepEquals(this.errorMessage, other.errorMessage)) {
            return false;
        }
        return true;
    }

    @Override
    public final int hashCode() {
        return java.util.Objects.hash(
                android.os.HidlSupport.deepHashCode(this.requestId),
                android.os.HidlSupport.deepHashCode(this.numberAssociation),
                android.os.HidlSupport.deepHashCode(this.associations),
                android.os.HidlSupport.deepHashCode(this.errorMessage));
    }

    @Override
    public final String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("{");
        builder.append(".requestId = ");
        builder.append(this.requestId);
        builder.append(", .numberAssociation = ");
        builder.append(this.numberAssociation);
        builder.append(", .associations = ");
        builder.append(this.associations);
        builder.append(", .errorMessage = ");
        builder.append(this.errorMessage);
        builder.append("}");
        return builder.toString();
    }

    public final void readFromParcel(android.os.HwParcel parcel) {
        android.os.HwBlob blob = parcel.readBuffer(40 /* size */);
        readEmbeddedFromParcel(parcel, blob, 0 /* parentOffset */);
    }

    public static final java.util.ArrayList<UserIdentificationResponse> readVectorFromParcel(android.os.HwParcel parcel) {
        java.util.ArrayList<UserIdentificationResponse> _hidl_vec = new java.util.ArrayList();
        android.os.HwBlob _hidl_blob = parcel.readBuffer(16 /* sizeof hidl_vec<T> */);

        {
            int _hidl_vec_size = _hidl_blob.getInt32(0 + 8 /* offsetof(hidl_vec<T>, mSize) */);
            android.os.HwBlob childBlob = parcel.readEmbeddedBuffer(
                    _hidl_vec_size * 40,_hidl_blob.handle(),
                    0 + 0 /* offsetof(hidl_vec<T>, mBuffer) */,true /* nullable */);

            _hidl_vec.clear();
            for (int _hidl_index_0 = 0; _hidl_index_0 < _hidl_vec_size; ++_hidl_index_0) {
                UserIdentificationResponse _hidl_vec_element = new UserIdentificationResponse();
                ((UserIdentificationResponse) _hidl_vec_element).readEmbeddedFromParcel(parcel, childBlob, _hidl_index_0 * 40);
                _hidl_vec.add(_hidl_vec_element);
            }
        }

        return _hidl_vec;
    }

    public final void readEmbeddedFromParcel(
            android.os.HwParcel parcel, android.os.HwBlob _hidl_blob, long _hidl_offset) {
        requestId = _hidl_blob.getInt32(_hidl_offset + 0);
        numberAssociation = _hidl_blob.getInt32(_hidl_offset + 4);
        {
            int _hidl_vec_size = _hidl_blob.getInt32(_hidl_offset + 8 + 8 /* offsetof(hidl_vec<T>, mSize) */);
            android.os.HwBlob childBlob = parcel.readEmbeddedBuffer(
                    _hidl_vec_size * 8,_hidl_blob.handle(),
                    _hidl_offset + 8 + 0 /* offsetof(hidl_vec<T>, mBuffer) */,true /* nullable */);

            ((java.util.ArrayList<UserIdentificationAssociation>) associations).clear();
            for (int _hidl_index_0 = 0; _hidl_index_0 < _hidl_vec_size; ++_hidl_index_0) {
                UserIdentificationAssociation _hidl_vec_element = new UserIdentificationAssociation();
                ((UserIdentificationAssociation) _hidl_vec_element).readEmbeddedFromParcel(parcel, childBlob, _hidl_index_0 * 8);
                ((java.util.ArrayList<UserIdentificationAssociation>) associations).add(_hidl_vec_element);
            }
        }
        errorMessage = _hidl_blob.getString(_hidl_offset + 24);

        parcel.readEmbeddedBuffer(
                ((String) errorMessage).getBytes().length + 1,
                _hidl_blob.handle(),
                _hidl_offset + 24 + 0 /* offsetof(hidl_string, mBuffer) */,false /* nullable */);

    }

    public final void writeToParcel(android.os.HwParcel parcel) {
        android.os.HwBlob _hidl_blob = new android.os.HwBlob(40 /* size */);
        writeEmbeddedToBlob(_hidl_blob, 0 /* parentOffset */);
        parcel.writeBuffer(_hidl_blob);
    }

    public static final void writeVectorToParcel(
            android.os.HwParcel parcel, java.util.ArrayList<UserIdentificationResponse> _hidl_vec) {
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
        _hidl_blob.putInt32(_hidl_offset + 0, requestId);
        _hidl_blob.putInt32(_hidl_offset + 4, numberAssociation);
        {
            int _hidl_vec_size = associations.size();
            _hidl_blob.putInt32(_hidl_offset + 8 + 8 /* offsetof(hidl_vec<T>, mSize) */, _hidl_vec_size);
            _hidl_blob.putBool(_hidl_offset + 8 + 12 /* offsetof(hidl_vec<T>, mOwnsBuffer) */, false);
            android.os.HwBlob childBlob = new android.os.HwBlob((int)(_hidl_vec_size * 8));
            for (int _hidl_index_0 = 0; _hidl_index_0 < _hidl_vec_size; ++_hidl_index_0) {
                associations.get(_hidl_index_0).writeEmbeddedToBlob(childBlob, _hidl_index_0 * 8);
            }
            _hidl_blob.putBlob(_hidl_offset + 8 + 0 /* offsetof(hidl_vec<T>, mBuffer) */, childBlob);
        }
        _hidl_blob.putString(_hidl_offset + 24, errorMessage);
    }
};

