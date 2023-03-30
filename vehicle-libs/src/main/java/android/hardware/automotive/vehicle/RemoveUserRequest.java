/*
 * This file is auto-generated.  DO NOT MODIFY.
 */
package android.hardware.automotive.vehicle;
public class RemoveUserRequest implements android.os.Parcelable
{
  public int requestId = 0;
  public UserInfo removedUserInfo;
  public UsersInfo usersInfo;
  public static final Creator<RemoveUserRequest> CREATOR = new Creator<RemoveUserRequest>() {
    @Override
    public RemoveUserRequest createFromParcel(android.os.Parcel _aidl_source) {
      RemoveUserRequest _aidl_out = new RemoveUserRequest();
      _aidl_out.readFromParcel(_aidl_source);
      return _aidl_out;
    }
    @Override
    public RemoveUserRequest[] newArray(int _aidl_size) {
      return new RemoveUserRequest[_aidl_size];
    }
  };
  @Override public final void writeToParcel(android.os.Parcel _aidl_parcel, int _aidl_flag)
  {
    int _aidl_start_pos = _aidl_parcel.dataPosition();
    _aidl_parcel.writeInt(0);
    _aidl_parcel.writeInt(requestId);
    _Parcel.writeTypedObject(_aidl_parcel, removedUserInfo, _aidl_flag);
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
      removedUserInfo = _Parcel.readTypedObject(_aidl_parcel, UserInfo.CREATOR);
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
    _aidl_sj.add("removedUserInfo: " + (java.util.Objects.toString(removedUserInfo)));
    _aidl_sj.add("usersInfo: " + (java.util.Objects.toString(usersInfo)));
    return "android.hardware.automotive.vehicle.RemoveUserRequest" + _aidl_sj.toString()  ;
  }
  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    if (other == null) return false;
    if (!(other instanceof RemoveUserRequest)) return false;
    RemoveUserRequest that = (RemoveUserRequest)other;
    if (!java.util.Objects.deepEquals(requestId, that.requestId)) return false;
    if (!java.util.Objects.deepEquals(removedUserInfo, that.removedUserInfo)) return false;
    if (!java.util.Objects.deepEquals(usersInfo, that.usersInfo)) return false;
    return true;
  }

  @Override
  public int hashCode() {
    return java.util.Arrays.deepHashCode(java.util.Arrays.asList(requestId, removedUserInfo, usersInfo).toArray());
  }
  @Override
  public int describeContents() {
    int _mask = 0;
    _mask |= describeContents(removedUserInfo);
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
