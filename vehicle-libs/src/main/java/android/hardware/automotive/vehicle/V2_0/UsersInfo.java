package android.hardware.automotive.vehicle.V2_0;


public final class UsersInfo {
    /**
     * The current foreground user.
     */
    public UserInfo currentUser = new UserInfo();
    /**
     * Number of existing users; includes the current user, recently removed users (with DISABLED
     * flag), and profile users (with PROFILE flag).
     */
    public int numberUsers;
    /**
     * List of existing users; includes the current user, recently removed users (with DISABLED
     * flag), and profile users (with PROFILE flag).
     */
    public java.util.ArrayList<UserInfo> existingUsers = new java.util.ArrayList<UserInfo>();

    @Override
    public final boolean equals(Object otherObject) {
        if (this == otherObject) {
            return true;
        }
        if (otherObject == null) {
            return false;
        }
        if (otherObject.getClass() != UsersInfo.class) {
            return false;
        }
        UsersInfo other = (UsersInfo)otherObject;
        if (!android.os.HidlSupport.deepEquals(this.currentUser, other.currentUser)) {
            return false;
        }
        if (this.numberUsers != other.numberUsers) {
            return false;
        }
        if (!android.os.HidlSupport.deepEquals(this.existingUsers, other.existingUsers)) {
            return false;
        }
        return true;
    }

    @Override
    public final int hashCode() {
        return java.util.Objects.hash(
                android.os.HidlSupport.deepHashCode(this.currentUser),
                android.os.HidlSupport.deepHashCode(this.numberUsers),
                android.os.HidlSupport.deepHashCode(this.existingUsers));
    }

    @Override
    public final String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("{");
        builder.append(".currentUser = ");
        builder.append(this.currentUser);
        builder.append(", .numberUsers = ");
        builder.append(this.numberUsers);
        builder.append(", .existingUsers = ");
        builder.append(this.existingUsers);
        builder.append("}");
        return builder.toString();
    }

    public final void readFromParcel(android.os.HwParcel parcel) {
        android.os.HwBlob blob = parcel.readBuffer(32 /* size */);
        readEmbeddedFromParcel(parcel, blob, 0 /* parentOffset */);
    }

    public static final java.util.ArrayList<UsersInfo> readVectorFromParcel(android.os.HwParcel parcel) {
        java.util.ArrayList<UsersInfo> _hidl_vec = new java.util.ArrayList();
        android.os.HwBlob _hidl_blob = parcel.readBuffer(16 /* sizeof hidl_vec<T> */);

        {
            int _hidl_vec_size = _hidl_blob.getInt32(0 + 8 /* offsetof(hidl_vec<T>, mSize) */);
            android.os.HwBlob childBlob = parcel.readEmbeddedBuffer(
                    _hidl_vec_size * 32,_hidl_blob.handle(),
                    0 + 0 /* offsetof(hidl_vec<T>, mBuffer) */,true /* nullable */);

            _hidl_vec.clear();
            for (int _hidl_index_0 = 0; _hidl_index_0 < _hidl_vec_size; ++_hidl_index_0) {
                UsersInfo _hidl_vec_element = new UsersInfo();
                ((UsersInfo) _hidl_vec_element).readEmbeddedFromParcel(parcel, childBlob, _hidl_index_0 * 32);
                _hidl_vec.add(_hidl_vec_element);
            }
        }

        return _hidl_vec;
    }

    public final void readEmbeddedFromParcel(
            android.os.HwParcel parcel, android.os.HwBlob _hidl_blob, long _hidl_offset) {
        ((UserInfo) currentUser).readEmbeddedFromParcel(parcel, _hidl_blob, _hidl_offset + 0);
        numberUsers = _hidl_blob.getInt32(_hidl_offset + 8);
        {
            int _hidl_vec_size = _hidl_blob.getInt32(_hidl_offset + 16 + 8 /* offsetof(hidl_vec<T>, mSize) */);
            android.os.HwBlob childBlob = parcel.readEmbeddedBuffer(
                    _hidl_vec_size * 8,_hidl_blob.handle(),
                    _hidl_offset + 16 + 0 /* offsetof(hidl_vec<T>, mBuffer) */,true /* nullable */);

            ((java.util.ArrayList<UserInfo>) existingUsers).clear();
            for (int _hidl_index_0 = 0; _hidl_index_0 < _hidl_vec_size; ++_hidl_index_0) {
                UserInfo _hidl_vec_element = new UserInfo();
                ((UserInfo) _hidl_vec_element).readEmbeddedFromParcel(parcel, childBlob, _hidl_index_0 * 8);
                ((java.util.ArrayList<UserInfo>) existingUsers).add(_hidl_vec_element);
            }
        }
    }

    public final void writeToParcel(android.os.HwParcel parcel) {
        android.os.HwBlob _hidl_blob = new android.os.HwBlob(32 /* size */);
        writeEmbeddedToBlob(_hidl_blob, 0 /* parentOffset */);
        parcel.writeBuffer(_hidl_blob);
    }

    public static final void writeVectorToParcel(
            android.os.HwParcel parcel, java.util.ArrayList<UsersInfo> _hidl_vec) {
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
        currentUser.writeEmbeddedToBlob(_hidl_blob, _hidl_offset + 0);
        _hidl_blob.putInt32(_hidl_offset + 8, numberUsers);
        {
            int _hidl_vec_size = existingUsers.size();
            _hidl_blob.putInt32(_hidl_offset + 16 + 8 /* offsetof(hidl_vec<T>, mSize) */, _hidl_vec_size);
            _hidl_blob.putBool(_hidl_offset + 16 + 12 /* offsetof(hidl_vec<T>, mOwnsBuffer) */, false);
            android.os.HwBlob childBlob = new android.os.HwBlob((int)(_hidl_vec_size * 8));
            for (int _hidl_index_0 = 0; _hidl_index_0 < _hidl_vec_size; ++_hidl_index_0) {
                existingUsers.get(_hidl_index_0).writeEmbeddedToBlob(childBlob, _hidl_index_0 * 8);
            }
            _hidl_blob.putBlob(_hidl_offset + 16 + 0 /* offsetof(hidl_vec<T>, mBuffer) */, childBlob);
        }
    }
};

