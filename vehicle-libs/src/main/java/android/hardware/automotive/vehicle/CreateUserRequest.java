/*
 * This file is auto-generated.  DO NOT MODIFY.
 */
package android.hardware.automotive.vehicle;
public class CreateUserRequest implements android.os.Parcelable
{
  public int requestId = 0;
  public UserInfo newUserInfo;
  public String newUserName;
  public UsersInfo usersInfo;
  public static final Creator<CreateUserRequest> CREATOR = new Creator<CreateUserRequest>() {
    @Override
    public CreateUserRequest createFromParcel(android.os.Parcel _aidl_source) {
      CreateUserRequest _aidl_out = new CreateUserRequest();
      _aidl_out.readFromParcel(_aidl_source);
      return _aidl_out;
    }
    @Override
    public CreateUserRequest[] newArray(int _aidl_size) {
      return new CreateUserRequest[_aidl_size];
    }
  };
  @Override public final void writeToParcel(android.os.Parcel _aidl_parcel, int _aidl_flag)
  {
    int _aidl_start_pos = _aidl_parcel.dataPosition();
    _aidl_parcel.writeInt(0);
    _aidl_parcel.writeInt(requestId);
    _Parcel.writeTypedObject(_aidl_parcel, newUserInfo, _aidl_flag);
    _aidl_parcel.writeString(newUserName);
    _Parcel.writeTypedObject(_aidl_parcel, usersInfo, _aidl_flag);
    int _aidl_end_pos = _aidl_parcel.dataPosition();
    _aidl_parcel.setDataPosition(_aidl_start_pos);
    _aidl_parcel.writeInt(_aidl_end_pos - _aidl_start_pos);
    _aidl_parcel.setDataPosition(_aidl_end_pos);
  }
  public final void readFromParcel(android.os.Parcel _aidl_parcel)
  {
    int _aidl_start_pos = _aidl_parcel.dataPosition();
    int _aidl_parcelable_size = _aidl_parcel.readInt();
    try {
      if (_aidl_parcelable_size < 4) throw new android.os.BadParcelableException("Parcelable too small");;
      if (_aidl_parcel.dataPosition() - _aidl_start_pos >= _aidl_parcelable_size) return;
      requestId = _aidl_parcel.readInt();
      if (_aidl_parcel.dataPosition() - _aidl_start_pos >= _aidl_parcelable_size) return;
      newUserInfo = _Parcel.readTypedObject(_aidl_parcel, UserInfo.CREATOR);
      if (_aidl_parcel.dataPosition() - _aidl_start_pos >= _aidl_parcelable_size) return;
      newUserName = _aidl_parcel.readString();
      if (_aidl_parcel.dataPosition() - _aidl_start_pos >= _aidl_parcelable_size) return;
      usersInfo = _Parcel.readTypedObject(_aidl_parcel, UsersInfo.CREATOR);
    } finally {
      if (_aidl_start_pos > (Integer.MAX_VALUE - _aidl_parcelable_size)) {
        throw new android.os.BadParcelableException("Overflow in the size of parcelable");
      }
      _aidl_parcel.setDataPosition(_aidl_start_pos + _aidl_parcelable_size);
    }
  }
  @Override
  public String toString() {
    java.util.StringJoiner _aidl_sj = new java.util.StringJoiner(", ", "{", "}");
    _aidl_sj.add("requestId: " + (requestId));
    _aidl_sj.add("newUserInfo: " + (java.util.Objects.toString(newUserInfo)));
    _aidl_sj.add("newUserName: " + (java.util.Objects.toString(newUserName)));
    _aidl_sj.add("usersInfo: " + (java.util.Objects.toString(usersInfo)));
    return "android.hardware.automotive.vehicle.CreateUserRequest" + _aidl_sj.toString()  ;
  }
  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    if (other == null) return false;
    if (!(other instanceof CreateUserRequest)) return false;
    CreateUserRequest that = (CreateUserRequest)other;
    if (!java.util.Objects.deepEquals(requestId, that.requestId)) return false;
    if (!java.util.Objects.deepEquals(newUserInfo, that.newUserInfo)) return false;
    if (!java.util.Objects.deepEquals(newUserName, that.newUserName)) return false;
    if (!java.util.Objects.deepEquals(usersInfo, that.usersInfo)) return false;
    return true;
  }

  @Override
  public int hashCode() {
    return java.util.Arrays.deepHashCode(java.util.Arrays.asList(requestId, newUserInfo, newUserName, usersInfo).toArray());
  }
  @Override
  public int describeContents() {
    int _mask = 0;
    _mask |= describeContents(newUserInfo);
    _mask |= describeContents(usersInfo);
    return _mask;
  }
  private int describeContents(Object _v) {
    if (_v == null) return 0;
    if (_v instanceof android.os.Parcelable) {
      return ((android.os.Parcelable) _v).describeContents();
    }
    return 0;
  }
  /** @hide */
  static class _Parcel {
    static private <T> T readTypedObject(
        android.os.Parcel parcel,
        Creator<T> c) {
      if (parcel.readInt() != 0) {
          return c.createFromParcel(parcel);
      } else {
          return null;
      }
    }
    static private <T extends android.os.Parcelable> void writeTypedObject(
        android.os.Parcel parcel, T value, int parcelableFlags) {
      if (value != null) {
        parcel.writeInt(1);
        value.writeToParcel(parcel, parcelableFlags);
      } else {
        parcel.writeInt(0);
      }
    }
  }
}
