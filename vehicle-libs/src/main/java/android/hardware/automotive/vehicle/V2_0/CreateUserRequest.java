package android.hardware.automotive.vehicle.V2_0;


public final class CreateUserRequest {
    /**
     * Arbitrary id used to map the response to the request.
     */
    public int requestId;
    /**
     * Basic information about Android user that was created.
     */
    public UserInfo newUserInfo = new UserInfo();
    /**
     * Name of the new Android user.
     */
    public String newUserName = new String();
    /**
     * Information about the current state of the Android system.
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
        if (otherObject.getClass() != CreateUserRequest.class) {
            return false;
        }
        CreateUserRequest other = (CreateUserRequest)otherObject;
        if (this.requestId != other.requestId) {
            return false;
        }
        if (!android.os.HidlSupport.deepEquals(this.newUserInfo, other.newUserInfo)) {
            return false;
        }
        if (!android.os.HidlSupport.deepEquals(this.newUserName, other.newUserName)) {
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
                android.os.HidlSupport.deepHashCode(this.newUserInfo),
                android.os.HidlSupport.deepHashCode(this.newUserName),
                android.os.HidlSupport.deepHashCode(this.usersInfo));
    }

    @Override
    public final String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("{");
        builder.append(".requestId = ");
        builder.append(this.requestId);
        builder.append(", .newUserInfo = ");
        builder.append(this.newUserInfo);
        builder.append(", .newUserName = ");
        builder.append(this.newUserName);
        builder.append(", .usersInfo = ");
        builder.append(this.usersInfo);
        builder.append("}");
        return builder.toString();
    }

    public final void readFromParcel(android.os.HwParcel parcel) {
        android.os.HwBlob blob = parcel.readBuffer(64 /* size */);
        readEmbeddedFromParcel(parcel, blob, 0 /* parentOffset */);
    }

    public static final java.util.ArrayList<CreateUserRequest> readVectorFromParcel(android.os.HwParcel parcel) {
        java.util.ArrayList<CreateUserRequest> _hidl_vec = new java.util.ArrayList();
        android.os.HwBlob _hidl_blob = parcel.readBuffer(16 /* sizeof hidl_vec<T> */);

        {
            int _hidl_vec_size = _hidl_blob.getInt32(0 + 8 /* offsetof(hidl_vec<T>, mSize) */);
            android.os.HwBlob childBlob = parcel.readEmbeddedBuffer(
                    _hidl_vec_size * 64,_hidl_blob.handle(),
                    0 + 0 /* offsetof(hidl_vec<T>, mBuffer) */,true /* nullable */);

            _hidl_vec.clear();
            for (int _hidl_index_0 = 0; _hidl_index_0 < _hidl_vec_size; ++_hidl_index_0) {
                CreateUserRequest _hidl_vec_element = new CreateUserRequest();
                ((CreateUserRequest) _hidl_vec_element).readEmbeddedFromParcel(parcel, childBlob, _hidl_index_0 * 64);
                _hidl_vec.add(_hidl_vec_element);
            }
        }

        return _hidl_vec;
    }

    public final void readEmbeddedFromParcel(
            android.os.HwParcel parcel, android.os.HwBlob _hidl_blob, long _hidl_offset) {
        requestId = _hidl_blob.getInt32(_hidl_offset + 0);
        ((UserInfo) newUserInfo).readEmbeddedFromParcel(parcel, _hidl_blob, _hidl_offset + 4);
        newUserName = _hidl_blob.getString(_hidl_offset + 16);

        parcel.readEmbeddedBuffer(
                ((String) newUserName).getBytes().length + 1,
                _hidl_blob.handle(),
                _hidl_offset + 16 + 0 /* offsetof(hidl_string, mBuffer) */,false /* nullable */);

        ((UsersInfo) usersInfo).readEmbeddedFromParcel(parcel, _hidl_blob, _hidl_offset + 32);
    }

    public final void writeToParcel(android.os.HwParcel parcel) {
        android.os.HwBlob _hidl_blob = new android.os.HwBlob(64 /* size */);
        writeEmbeddedToBlob(_hidl_blob, 0 /* parentOffset */);
        parcel.writeBuffer(_hidl_blob);
    }

    public static final void writeVectorToParcel(
            android.os.HwParcel parcel, java.util.ArrayList<CreateUserRequest> _hidl_vec) {
        android.os.HwBlob _hidl_blob = new android.os.HwBlob(16 /* sizeof(hidl_vec<T>) */);
        {
            int _hidl_vec_size = _hidl_vec.size();
            _hidl_blob.putInt32(0 + 8 /* offsetof(hidl_vec<T>, mSize) */, _hidl_vec_size);
            _hidl_blob.putBool(0 + 12 /* offsetof(hidl_vec<T>, mOwnsBuffer) */, false);
            android.os.HwBlob childBlob = new android.os.HwBlob((int)(_hidl_vec_size * 64));
            for (int _hidl_index_0 = 0; _hidl_index_0 < _hidl_vec_size; ++_hidl_index_0) {
                _hidl_vec.get(_hidl_index_0).writeEmbeddedToBlob(childBlob, _hidl_index_0 * 64);
            }
            _hidl_blob.putBlob(0 + 0 /* offsetof(hidl_vec<T>, mBuffer) */, childBlob);
        }

        parcel.writeBuffer(_hidl_blob);
    }

    public final void writeEmbeddedToBlob(
            android.os.HwBlob _hidl_blob, long _hidl_offset) {
        _hidl_blob.putInt32(_hidl_offset + 0, requestId);
        newUserInfo.writeEmbeddedToBlob(_hidl_blob, _hidl_offset + 4);
        _hidl_blob.putString(_hidl_offset + 16, newUserName);
        usersInfo.writeEmbeddedToBlob(_hidl_blob, _hidl_offset + 32);
    }
};

