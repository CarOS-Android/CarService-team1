/*
 * This file is auto-generated.  DO NOT MODIFY.
 */
package android.hardware.automotive.vehicle;
public class UserIdentificationSetAssociation implements android.os.Parcelable
{
  public int type = UserIdentificationAssociationType.INVALID;
  public int value = UserIdentificationAssociationSetValue.INVALID;
  public static final Creator<UserIdentificationSetAssociation> CREATOR = new Creator<UserIdentificationSetAssociation>() {
    @Override
    public UserIdentificationSetAssociation createFromParcel(android.os.Parcel _aidl_source) {
      UserIdentificationSetAssociation _aidl_out = new UserIdentificationSetAssociation();
      _aidl_out.readFromParcel(_aidl_source);
      return _aidl_out;
    }
    @Override
    public UserIdentificationSetAssociation[] newArray(int _aidl_size) {
      return new UserIdentificationSetAssociation[_aidl_size];
    }
  };
  @Override public final void writeToParcel(android.os.Parcel _aidl_parcel, int _aidl_flag)
  {
    int _aidl_start_pos = _aidl_parcel.dataPosition();
    _aidl_parcel.writeInt(0);
    _aidl_parcel.writeInt(type);
    _aidl_parcel.writeInt(value);
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
      type = _aidl_parcel.readInt();
      if (_aidl_parcel.dataPosition() - _aidl_start_pos >= _aidl_parcelable_size) return;
      value = _aidl_parcel.readInt();
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
    _aidl_sj.add("type: " + (type));
    _aidl_sj.add("value: " + (value));
    return "android.hardware.automotive.vehicle.UserIdentificationSetAssociation" + _aidl_sj.toString()  ;
  }
  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    if (other == null) return false;
    if (!(other instanceof UserIdentificationSetAssociation)) return false;
    UserIdentificationSetAssociation that = (UserIdentificationSetAssociation)other;
    if (!java.util.Objects.deepEquals(type, that.type)) return false;
    if (!java.util.Objects.deepEquals(value, that.value)) return false;
    return true;
  }

  @Override
  public int hashCode() {
    return java.util.Arrays.deepHashCode(java.util.Arrays.asList(type, value).toArray());
  }
  @Override
  public int describeContents() {
    int _mask = 0;
    return _mask;
  }
}
