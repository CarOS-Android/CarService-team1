/*
 * This file is auto-generated.  DO NOT MODIFY.
 */
package android.hardware.automotive.vehicle;
public class UsersInfo implements android.os.Parcelable
{
  public UserInfo currentUser;
  public int numberUsers = 0;
  public UserInfo[] existingUsers;
  public static final Creator<UsersInfo> CREATOR = new Creator<UsersInfo>() {
    @Override
    public UsersInfo createFromParcel(android.os.Parcel _aidl_source) {
      UsersInfo _aidl_out = new UsersInfo();
      _aidl_out.readFromParcel(_aidl_source);
      return _aidl_out;
    }
    @Override
    public UsersInfo[] newArray(int _aidl_size) {
      return new UsersInfo[_aidl_size];
    }
  };
  @Override public final void writeToParcel(android.os.Parcel _aidl_parcel, int _aidl_flag)
  {
    int _aidl_start_pos = _aidl_parcel.dataPosition();
    _aidl_parcel.writeInt(0);
    _Parcel.writeTypedObject(_aidl_parcel, currentUser, _aidl_flag);
    _aidl_parcel.writeInt(numberUsers);
    _aidl_parcel.writeTypedArray(existingUsers, _aidl_flag);
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
      currentUser = _Parcel.readTypedObject(_aidl_parcel, UserInfo.CREATOR);
      if (_aidl_parcel.dataPosition() - _aidl_start_pos >= _aidl_parcelable_size) return;
      numberUsers = _aidl_parcel.readInt();
      if (_aidl_parcel.dataPosition() - _aidl_start_pos >= _aidl_parcelable_size) return;
      existingUsers = _aidl_parcel.createTypedArray(UserInfo.CREATOR);
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
    _aidl_sj.add("currentUser: " + (java.util.Objects.toString(currentUser)));
    _aidl_sj.add("numberUsers: " + (numberUsers));
    _aidl_sj.add("existingUsers: " + (java.util.Arrays.toString(existingUsers)));
    return "android.hardware.automotive.vehicle.UsersInfo" + _aidl_sj.toString()  ;
  }
  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    if (other == null) return false;
    if (!(other instanceof UsersInfo)) return false;
    UsersInfo that = (UsersInfo)other;
    if (!java.util.Objects.deepEquals(currentUser, that.currentUser)) return false;
    if (!java.util.Objects.deepEquals(numberUsers, that.numberUsers)) return false;
    if (!java.util.Objects.deepEquals(existingUsers, that.existingUsers)) return false;
    return true;
  }

  @Override
  public int hashCode() {
    return java.util.Arrays.deepHashCode(java.util.Arrays.asList(currentUser, numberUsers, existingUsers).toArray());
  }
  @Override
  public int describeContents() {
    int _mask = 0;
    _mask |= describeContents(currentUser);
    _mask |= describeContents(existingUsers);
    return _mask;
  }
  private int describeContents(Object _v) {
    if (_v == null) return 0;
    if (_v instanceof Object[]) {
      int _mask = 0;
      for (Object o : (Object[]) _v) {
        _mask |= describeContents(o);
      }
      return _mask;
    }
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
