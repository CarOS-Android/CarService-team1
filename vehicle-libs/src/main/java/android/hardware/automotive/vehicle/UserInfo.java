/*
 * This file is auto-generated.  DO NOT MODIFY.
 */
package android.hardware.automotive.vehicle;
public class UserInfo implements android.os.Parcelable
{
  public int userId = 0;
  public int flags = 0;
  public static final Creator<UserInfo> CREATOR = new Creator<UserInfo>() {
    @Override
    public UserInfo createFromParcel(android.os.Parcel _aidl_source) {
      UserInfo _aidl_out = new UserInfo();
      _aidl_out.readFromParcel(_aidl_source);
      return _aidl_out;
    }
    @Override
    public UserInfo[] newArray(int _aidl_size) {
      return new UserInfo[_aidl_size];
    }
  };
  @Override public final void writeToParcel(android.os.Parcel _aidl_parcel, int _aidl_flag)
  {
    int _aidl_start_pos = _aidl_parcel.dataPosition();
    _aidl_parcel.writeInt(0);
    _aidl_parcel.writeInt(userId);
    _aidl_parcel.writeInt(flags);
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
      userId = _aidl_parcel.readInt();
      if (_aidl_parcel.dataPosition() - _aidl_start_pos >= _aidl_parcelable_size) return;
      flags = _aidl_parcel.readInt();
    } finally {
      if (_aidl_start_pos > (Integer.MAX_VALUE - _aidl_parcelable_size)) {
        throw new android.os.BadParcelableException("Overflow in the size of parcelable");
      }
      _aidl_parcel.setDataPosition(_aidl_start_pos + _aidl_parcelable_size);
    }
  }
  public static final int USER_FLAG_SYSTEM = 1;
  public static final int USER_FLAG_GUEST = 2;
  public static final int USER_FLAG_EPHEMERAL = 4;
  public static final int USER_FLAG_ADMIN = 8;
  public static final int USER_FLAG_DISABLED = 16;
  public static final int USER_FLAG_PROFILE = 32;
  @Override
  public String toString() {
    java.util.StringJoiner _aidl_sj = new java.util.StringJoiner(", ", "{", "}");
    _aidl_sj.add("userId: " + (userId));
    _aidl_sj.add("flags: " + (flags));
    return "android.hardware.automotive.vehicle.UserInfo" + _aidl_sj.toString()  ;
  }
  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    if (other == null) return false;
    if (!(other instanceof UserInfo)) return false;
    UserInfo that = (UserInfo)other;
    if (!java.util.Objects.deepEquals(userId, that.userId)) return false;
    if (!java.util.Objects.deepEquals(flags, that.flags)) return false;
    return true;
  }

  @Override
  public int hashCode() {
    return java.util.Arrays.deepHashCode(java.util.Arrays.asList(userId, flags).toArray());
  }
  @Override
  public int describeContents() {
    int _mask = 0;
    return _mask;
  }
}
