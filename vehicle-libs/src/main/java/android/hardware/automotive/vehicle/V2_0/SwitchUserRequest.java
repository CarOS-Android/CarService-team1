package android.hardware.automotive.vehicle.V2_0;


public final class SwitchUserRequest {
    /**
     * Arbitrary id used to map the response to the request.
     */
    public int requestId;
    /**
     * Type of message.
     */
    public int messageType;
    /**
     * Information about the Android user being switched to.
     *
     * Only the user id (but not the flags) should be set when the request is made by HAL.
     */
    public UserInfo targetUser = new UserInfo();
    /**
     * Information about the current state of the Android system.
     *
     * Should not be set when the request is made by HAL.
     */
    public UsersInfo usersInfo = new UsersInfo();

    @Override
    public final boolean equals(Object otherObject) {
        if (this == otherObject) {
            return true;
        }
        if (otherObject == null) {
            return false;
        }
        if (otherObject.getClass() != SwitchUserRequest.class) {
            return false;
        }
        SwitchUserRequest other = (SwitchUserRequest)otherObject;
        if (this.requestId != other.requestId) {
            return false;
        }
        if (this.messageType != other.messageType) {
            return false;
        }
        if (!android.os.HidlSupport.deepEquals(this.targetUser, other.targetUser)) {
            return false;
        }
        if (!android.os.HidlSupport.deepEquals(this.usersInfo, other.usersInfo)) {
            return false;
        }
        return true;
    }

    @Override
    public final int hashCode() {
        return java.util.Objects.hash(
                android.os.HidlSupport.deepHashCode(this.requestId),
                android.os.HidlSupport.deepHashCode(this.messageType),
                android.os.HidlSupport.deepHashCode(this.targetUser),
                android.os.HidlSupport.deepHashCode(this.usersInfo));
    }

    @Override
    public final String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("{");
        builder.append(".requestId = ");
        builder.append(this.requestId);
        builder.append(", .messageType = ");
        builder.append(SwitchUserMessageType.toString(this.messageType));
        builder.append(", .targetUser = ");
        builder.append(this.targetUser);
        builder.append(", .usersInfo = ");
        builder.append(this.usersInfo);
        builder.append("}");
        return builder.toString();
    }

    public final void readFromParcel(android.os.HwParcel parcel) {
        android.os.HwBlob blob = parcel.readBuffer(48 /* size */);
        readEmbeddedFromParcel(parcel, blob, 0 /* parentOffset */);
    }

    public static final java.util.ArrayList<SwitchUserRequest> readVectorFromParcel(android.os.HwParcel parcel) {
        java.util.ArrayList<SwitchUserRequest> _hidl_vec = new java.util.ArrayList();
        android.os.HwBlob _hidl_blob = parcel.readBuffer(16 /* sizeof hidl_vec<T> */);

        {
            int _hidl_vec_size = _hidl_blob.getInt32(0 + 8 /* offsetof(hidl_vec<T>, mSize) */);
            android.os.HwBlob childBlob = parcel.readEmbeddedBuffer(
                    _hidl_vec_size * 48,_hidl_blob.handle(),
                    0 + 0 /* offsetof(hidl_vec<T>, mBuffer) */,true /* nullable */);

            _hidl_vec.clear();
            for (int _hidl_index_0 = 0; _hidl_index_0 < _hidl_vec_size; ++_hidl_index_0) {
                SwitchUserRequest _hidl_vec_element = new SwitchUserRequest();
                ((SwitchUserRequest) _hidl_vec_element).readEmbeddedFromParcel(parcel, childBlob, _hidl_index_0 * 48);
                _hidl_vec.add(_hidl_vec_element);
            }
        }

        return _hidl_vec;
    }

    public final void readEmbeddedFromParcel(
            android.os.HwParcel parcel, android.os.HwBlob _hidl_blob, long _hidl_offset) {
        requestId = _hidl_blob.getInt32(_hidl_offset + 0);
        messageType = _hidl_blob.getInt32(_hidl_offset + 4);
        ((UserInfo) targetUser).readEmbeddedFromParcel(parcel, _hidl_blob, _hidl_offset + 8);
        ((UsersInfo) usersInfo).readEmbeddedFromParcel(parcel, _hidl_blob, _hidl_offset + 16);
    }

    public final void writeToParcel(android.os.HwParcel parcel) {
        android.os.HwBlob _hidl_blob = new android.os.HwBlob(48 /* size */);
        writeEmbeddedToBlob(_hidl_blob, 0 /* parentOffset */);
        parcel.writeBuffer(_hidl_blob);
    }

    public static final void writeVectorToParcel(
            android.os.HwParcel parcel, java.util.ArrayList<SwitchUserRequest> _hidl_vec) {
        android.os.HwBlob _hidl_blob = new android.os.HwBlob(16 /* sizeof(hidl_vec<T>) */);
        {
            int _hidl_vec_size = _hidl_vec.size();
            _hidl_blob.putInt32(0 + 8 /* offsetof(hidl_vec<T>, mSize) */, _hidl_vec_size);
            _hidl_blob.putBool(0 + 12 /* offsetof(hidl_vec<T>, mOwnsBuffer) */, false);
            android.os.HwBlob childBlob = new android.os.HwBlob((int)(_hidl_vec_size * 48));
            for (int _hidl_index_0 = 0; _hidl_index_0 < _hidl_vec_size; ++_hidl_index_0) {
                _hidl_vec.get(_hidl_index_0).writeEmbeddedToBlob(childBlob, _hidl_index_0 * 48);
            }
            _hidl_blob.putBlob(0 + 0 /* offsetof(hidl_vec<T>, mBuffer) */, childBlob);
        }

        parcel.writeBuffer(_hidl_blob);
    }

    public final void writeEmbeddedToBlob(
            android.os.HwBlob _hidl_blob, long _hidl_offset) {
        _hidl_blob.putInt32(_hidl_offset + 0, requestId);
        _hidl_blob.putInt32(_hidl_offset + 4, messageType);
        targetUser.writeEmbeddedToBlob(_hidl_blob, _hidl_offset + 8);
        usersInfo.writeEmbeddedToBlob(_hidl_blob, _hidl_offset + 16);
    }
};

