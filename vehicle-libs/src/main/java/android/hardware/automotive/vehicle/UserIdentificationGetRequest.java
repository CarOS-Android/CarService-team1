/*
 * This file is auto-generated.  DO NOT MODIFY.
 */
package android.hardware.automotive.vehicle;
public class UserIdentificationGetRequest implements android.os.Parcelable
{
  public int requestId = 0;
  public UserInfo userInfo;
  public int numberAssociationTypes = 0;
  public int[] associationTypes;
  public static final Creator<UserIdentificationGetRequest> CREATOR = new Creator<UserIdentificationGetRequest>() {
    @Override
    public UserIdentificationGetRequest createFromParcel(android.os.Parcel _aidl_source) {
      UserIdentificationGetRequest _aidl_out = new UserIdentificationGetRequest();
      _aidl_out.readFromParcel(_aidl_source);
      return _aidl_out;
    }
    @Override
    public UserIdentificationGetRequest[] newArray(int _aidl_size) {
      return new UserIdentificationGetRequest[_aidl_size];
    }
  };
  @Override public final void writeToParcel(android.os.Parcel _aidl_parcel, int _aidl_flag)
  {
    int _aidl_start_pos = _aidl_parcel.dataPosition();
    _aidl_parcel.writeInt(0);
    _aidl_parcel.writeInt(requestId);
    _Parcel.writeTypedObject(_aidl_parcel, userInfo, _aidl_flag);
    _aidl_parcel.writeInt(numberAssociationTypes);
    _aidl_parcel.writeIntArray(associationTypes);
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
      userInfo = _Parcel.readTypedObject(_aidl_parcel, UserInfo.CREATOR);
      if (_aidl_parcel.dataPosition() - _aidl_start_pos >= _aidl_parcelable_size) return;
      numberAssociationTypes = _aidl_parcel.readInt();
      if (_aidl_parcel.dataPosition() - _aidl_start_pos >= _aidl_parcelable_size) return;
      associationTypes = _aidl_parcel.createIntArray();
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
    _aidl_sj.add("userInfo: " + (java.util.Objects.toString(userInfo)));
    _aidl_sj.add("numberAssociationTypes: " + (numberAssociationTypes));
    _aidl_sj.add("associationTypes: " + (java.util.Arrays.toString(associationTypes)));
    return "android.hardware.automotive.vehicle.UserIdentificationGetRequest" + _aidl_sj.toString()  ;
  }
  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    if (other == null) return false;
    if (!(other instanceof UserIdentificationGetRequest)) return false;
    UserIdentificationGetRequest that = (UserIdentificationGetRequest)other;
    if (!java.util.Objects.deepEquals(requestId, that.requestId)) return false;
    if (!java.util.Objects.deepEquals(userInfo, that.userInfo)) return false;
    if (!java.util.Objects.deepEquals(numberAssociationTypes, that.numberAssociationTypes)) return false;
    if (!java.util.Objects.deepEquals(associationTypes, that.associationTypes)) return false;
    return true;
  }

  @Override
  public int hashCode() {
    return java.util.Arrays.deepHashCode(java.util.Arrays.asList(requestId, userInfo, numberAssociationTypes, associationTypes).toArray());
  }
  @Override
  public int describeContents() {
    int _mask = 0;
    _mask |= describeContents(userInfo);
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
