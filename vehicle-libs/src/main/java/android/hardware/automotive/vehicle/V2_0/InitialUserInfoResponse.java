package android.hardware.automotive.vehicle.V2_0;


public final class InitialUserInfoResponse {
    /**
     * Id of the request being responded.
     */
    public int requestId;
    /**
     * which action the Android system should take.
     */
    public int action;
    /**
     * Information about the user that should be switched to or created.
     */
    public UserInfo userToSwitchOrCreate = new UserInfo();
    /**
     * System locales of the initial user (value will be passed as-is to
     * android.provider.Settings.System.SYSTEM_LOCALES)
     */
    public String userLocales = new String();
    /**
     * Name of the user that should be created.
     */
    public String userNameToCreate = new String();

    @Override
    public final boolean equals(Object otherObject) {
        if (this == otherObject) {
            return true;
        }
        if (otherObject == null) {
            return false;
        }
        if (otherObject.getClass() != InitialUserInfoResponse.class) {
            return false;
        }
        InitialUserInfoResponse other = (InitialUserInfoResponse)otherObject;
        if (this.requestId != other.requestId) {
            return false;
        }
        if (this.action != other.action) {
            return false;
        }
        if (!android.os.HidlSupport.deepEquals(this.userToSwitchOrCreate, other.userToSwitchOrCreate)) {
            return false;
        }
        if (!android.os.HidlSupport.deepEquals(this.userLocales, other.userLocales)) {
            return false;
        }
        if (!android.os.HidlSupport.deepEquals(this.userNameToCreate, other.userNameToCreate)) {
            return false;
        }
        return true;
    }

    @Override
    public final int hashCode() {
        return java.util.Objects.hash(
                android.os.HidlSupport.deepHashCode(this.requestId),
                android.os.HidlSupport.deepHashCode(this.action),
                android.os.HidlSupport.deepHashCode(this.userToSwitchOrCreate),
                android.os.HidlSupport.deepHashCode(this.userLocales),
                android.os.HidlSupport.deepHashCode(this.userNameToCreate));
    }

    @Override
    public final String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("{");
        builder.append(".requestId = ");
        builder.append(this.requestId);
        builder.append(", .action = ");
        builder.append(InitialUserInfoResponseAction.toString(this.action));
        builder.append(", .userToSwitchOrCreate = ");
        builder.append(this.userToSwitchOrCreate);
        builder.append(", .userLocales = ");
        builder.append(this.userLocales);
        builder.append(", .userNameToCreate = ");
        builder.append(this.userNameToCreate);
        builder.append("}");
        return builder.toString();
    }

    public final void readFromParcel(android.os.HwParcel parcel) {
        android.os.HwBlob blob = parcel.readBuffer(48 /* size */);
        readEmbeddedFromParcel(parcel, blob, 0 /* parentOffset */);
    }

    public static final java.util.ArrayList<InitialUserInfoResponse> readVectorFromParcel(android.os.HwParcel parcel) {
        java.util.ArrayList<InitialUserInfoResponse> _hidl_vec = new java.util.ArrayList();
        android.os.HwBlob _hidl_blob = parcel.readBuffer(16 /* sizeof hidl_vec<T> */);

        {
            int _hidl_vec_size = _hidl_blob.getInt32(0 + 8 /* offsetof(hidl_vec<T>, mSize) */);
            android.os.HwBlob childBlob = parcel.readEmbeddedBuffer(
                    _hidl_vec_size * 48,_hidl_blob.handle(),
                    0 + 0 /* offsetof(hidl_vec<T>, mBuffer) */,true /* nullable */);

            _hidl_vec.clear();
            for (int _hidl_index_0 = 0; _hidl_index_0 < _hidl_vec_size; ++_hidl_index_0) {
                InitialUserInfoResponse _hidl_vec_element = new InitialUserInfoResponse();
                ((InitialUserInfoResponse) _hidl_vec_element).readEmbeddedFromParcel(parcel, childBlob, _hidl_index_0 * 48);
                _hidl_vec.add(_hidl_vec_element);
            }
        }

        return _hidl_vec;
    }

    public final void readEmbeddedFromParcel(
            android.os.HwParcel parcel, android.os.HwBlob _hidl_blob, long _hidl_offset) {
        requestId = _hidl_blob.getInt32(_hidl_offset + 0);
        action = _hidl_blob.getInt32(_hidl_offset + 4);
        ((UserInfo) userToSwitchOrCreate).readEmbeddedFromParcel(parcel, _hidl_blob, _hidl_offset + 8);
        userLocales = _hidl_blob.getString(_hidl_offset + 16);

        parcel.readEmbeddedBuffer(
                ((String) userLocales).getBytes().length + 1,
                _hidl_blob.handle(),
                _hidl_offset + 16 + 0 /* offsetof(hidl_string, mBuffer) */,false /* nullable */);

        userNameToCreate = _hidl_blob.getString(_hidl_offset + 32);

        parcel.readEmbeddedBuffer(
                ((String) userNameToCreate).getBytes().length + 1,
                _hidl_blob.handle(),
                _hidl_offset + 32 + 0 /* offsetof(hidl_string, mBuffer) */,false /* nullable */);

    }

    public final void writeToParcel(android.os.HwParcel parcel) {
        android.os.HwBlob _hidl_blob = new android.os.HwBlob(48 /* size */);
        writeEmbeddedToBlob(_hidl_blob, 0 /* parentOffset */);
        parcel.writeBuffer(_hidl_blob);
    }

    public static final void writeVectorToParcel(
            android.os.HwParcel parcel, java.util.ArrayList<InitialUserInfoResponse> _hidl_vec) {
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
        _hidl_blob.putInt32(_hidl_offset + 4, action);
        userToSwitchOrCreate.writeEmbeddedToBlob(_hidl_blob, _hidl_offset + 8);
        _hidl_blob.putString(_hidl_offset + 16, userLocales);
        _hidl_blob.putString(_hidl_offset + 32, userNameToCreate);
    }
};

