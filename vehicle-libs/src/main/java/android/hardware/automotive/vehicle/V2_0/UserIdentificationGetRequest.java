package android.hardware.automotive.vehicle.V2_0;


public final class UserIdentificationGetRequest {
    /**
     * Id of the request being responded.
     */
    public int requestId;
    /**
     * Information about the current foreground Android user.
     */
    public UserInfo userInfo = new UserInfo();
    /**
     * Number of association being queried.
     */
    public int numberAssociationTypes;
    /**
     * Types of association being queried.
     */
    public java.util.ArrayList<Integer> associationTypes = new java.util.ArrayList<Integer>();

    @Override
    public final boolean equals(Object otherObject) {
        if (this == otherObject) {
            return true;
        }
        if (otherObject == null) {
            return false;
        }
        if (otherObject.getClass() != UserIdentificationGetRequest.class) {
            return false;
        }
        UserIdentificationGetRequest other = (UserIdentificationGetRequest)otherObject;
        if (this.requestId != other.requestId) {
            return false;
        }
        if (!android.os.HidlSupport.deepEquals(this.userInfo, other.userInfo)) {
            return false;
        }
        if (this.numberAssociationTypes != other.numberAssociationTypes) {
            return false;
        }
        if (!android.os.HidlSupport.deepEquals(this.associationTypes, other.associationTypes)) {
            return false;
        }
        return true;
    }

    @Override
    public final int hashCode() {
        return java.util.Objects.hash(
                android.os.HidlSupport.deepHashCode(this.requestId),
                android.os.HidlSupport.deepHashCode(this.userInfo),
                android.os.HidlSupport.deepHashCode(this.numberAssociationTypes),
                android.os.HidlSupport.deepHashCode(this.associationTypes));
    }

    @Override
    public final String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("{");
        builder.append(".requestId = ");
        builder.append(this.requestId);
        builder.append(", .userInfo = ");
        builder.append(this.userInfo);
        builder.append(", .numberAssociationTypes = ");
        builder.append(this.numberAssociationTypes);
        builder.append(", .associationTypes = ");
        builder.append(this.associationTypes);
        builder.append("}");
        return builder.toString();
    }

    public final void readFromParcel(android.os.HwParcel parcel) {
        android.os.HwBlob blob = parcel.readBuffer(32 /* size */);
        readEmbeddedFromParcel(parcel, blob, 0 /* parentOffset */);
    }

    public static final java.util.ArrayList<UserIdentificationGetRequest> readVectorFromParcel(android.os.HwParcel parcel) {
        java.util.ArrayList<UserIdentificationGetRequest> _hidl_vec = new java.util.ArrayList();
        android.os.HwBlob _hidl_blob = parcel.readBuffer(16 /* sizeof hidl_vec<T> */);

        {
            int _hidl_vec_size = _hidl_blob.getInt32(0 + 8 /* offsetof(hidl_vec<T>, mSize) */);
            android.os.HwBlob childBlob = parcel.readEmbeddedBuffer(
                    _hidl_vec_size * 32,_hidl_blob.handle(),
                    0 + 0 /* offsetof(hidl_vec<T>, mBuffer) */,true /* nullable */);

            _hidl_vec.clear();
            for (int _hidl_index_0 = 0; _hidl_index_0 < _hidl_vec_size; ++_hidl_index_0) {
                UserIdentificationGetRequest _hidl_vec_element = new UserIdentificationGetRequest();
                ((UserIdentificationGetRequest) _hidl_vec_element).readEmbeddedFromParcel(parcel, childBlob, _hidl_index_0 * 32);
                _hidl_vec.add(_hidl_vec_element);
            }
        }

        return _hidl_vec;
    }

    public final void readEmbeddedFromParcel(
            android.os.HwParcel parcel, android.os.HwBlob _hidl_blob, long _hidl_offset) {
        requestId = _hidl_blob.getInt32(_hidl_offset + 0);
        ((UserInfo) userInfo).readEmbeddedFromParcel(parcel, _hidl_blob, _hidl_offset + 4);
        numberAssociationTypes = _hidl_blob.getInt32(_hidl_offset + 12);
        {
            int _hidl_vec_size = _hidl_blob.getInt32(_hidl_offset + 16 + 8 /* offsetof(hidl_vec<T>, mSize) */);
            android.os.HwBlob childBlob = parcel.readEmbeddedBuffer(
                    _hidl_vec_size * 4,_hidl_blob.handle(),
                    _hidl_offset + 16 + 0 /* offsetof(hidl_vec<T>, mBuffer) */,true /* nullable */);

            ((java.util.ArrayList<Integer>) associationTypes).clear();
            for (int _hidl_index_0 = 0; _hidl_index_0 < _hidl_vec_size; ++_hidl_index_0) {
                int _hidl_vec_element;
                _hidl_vec_element = childBlob.getInt32(_hidl_index_0 * 4);
                ((java.util.ArrayList<Integer>) associationTypes).add(_hidl_vec_element);
            }
        }
    }

    public final void writeToParcel(android.os.HwParcel parcel) {
        android.os.HwBlob _hidl_blob = new android.os.HwBlob(32 /* size */);
        writeEmbeddedToBlob(_hidl_blob, 0 /* parentOffset */);
        parcel.writeBuffer(_hidl_blob);
    }

    public static final void writeVectorToParcel(
            android.os.HwParcel parcel, java.util.ArrayList<UserIdentificationGetRequest> _hidl_vec) {
        android.os.HwBlob _hidl_blob = new android.os.HwBlob(16 /* sizeof(hidl_vec<T>) */);
        {
            int _hidl_vec_size = _hidl_vec.size();
            _hidl_blob.putInt32(0 + 8 /* offsetof(hidl_vec<T>, mSize) */, _hidl_vec_size);
            _hidl_blob.putBool(0 + 12 /* offsetof(hidl_vec<T>, mOwnsBuffer) */, false);
            android.os.HwBlob childBlob = new android.os.HwBlob((int)(_hidl_vec_size * 32));
            for (int _hidl_index_0 = 0; _hidl_index_0 < _hidl_vec_size; ++_hidl_index_0) {
                _hidl_vec.get(_hidl_index_0).writeEmbeddedToBlob(childBlob, _hidl_index_0 * 32);
            }
            _hidl_blob.putBlob(0 + 0 /* offsetof(hidl_vec<T>, mBuffer) */, childBlob);
        }

        parcel.writeBuffer(_hidl_blob);
    }

    public final void writeEmbeddedToBlob(
            android.os.HwBlob _hidl_blob, long _hidl_offset) {
        _hidl_blob.putInt32(_hidl_offset + 0, requestId);
        userInfo.writeEmbeddedToBlob(_hidl_blob, _hidl_offset + 4);
        _hidl_blob.putInt32(_hidl_offset + 12, numberAssociationTypes);
        {
            int _hidl_vec_size = associationTypes.size();
            _hidl_blob.putInt32(_hidl_offset + 16 + 8 /* offsetof(hidl_vec<T>, mSize) */, _hidl_vec_size);
            _hidl_blob.putBool(_hidl_offset + 16 + 12 /* offsetof(hidl_vec<T>, mOwnsBuffer) */, false);
            android.os.HwBlob childBlob = new android.os.HwBlob((int)(_hidl_vec_size * 4));
            for (int _hidl_index_0 = 0; _hidl_index_0 < _hidl_vec_size; ++_hidl_index_0) {
                childBlob.putInt32(_hidl_index_0 * 4, associationTypes.get(_hidl_index_0));
            }
            _hidl_blob.putBlob(_hidl_offset + 16 + 0 /* offsetof(hidl_vec<T>, mBuffer) */, childBlob);
        }
    }
};

