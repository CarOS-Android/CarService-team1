/*
 * This file is auto-generated.  DO NOT MODIFY.
 */
package android.hardware.automotive.vehicle;
public class UserIdentificationResponse implements android.os.Parcelable
{
  public int requestId = 0;
  public int numberAssociation = 0;
  public UserIdentificationAssociation[] associations;
  public String errorMessage;
  public static final Creator<UserIdentificationResponse> CREATOR = new Creator<UserIdentificationResponse>() {
    @Override
    public UserIdentificationResponse createFromParcel(android.os.Parcel _aidl_source) {
      UserIdentificationResponse _aidl_out = new UserIdentificationResponse();
      _aidl_out.readFromParcel(_aidl_source);
      return _aidl_out;
    }
    @Override
    public UserIdentificationResponse[] newArray(int _aidl_size) {
      return new UserIdentificationResponse[_aidl_size];
    }
  };
  @Override public final void writeToParcel(android.os.Parcel _aidl_parcel, int _aidl_flag)
  {
    int _aidl_start_pos = _aidl_parcel.dataPosition();
    _aidl_parcel.writeInt(0);
    _aidl_parcel.writeInt(requestId);
    _aidl_parcel.writeInt(numberAssociation);
    _aidl_parcel.writeTypedArray(associations, _aidl_flag);
    _aidl_parcel.writeString(errorMessage);
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
      numberAssociation = _aidl_parcel.readInt();
      if (_aidl_parcel.dataPosition() - _aidl_start_pos >= _aidl_parcelable_size) return;
      associations = _aidl_parcel.createTypedArray(UserIdentificationAssociation.CREATOR);
      if (_aidl_parcel.dataPosition() - _aidl_start_pos >= _aidl_parcelable_size) return;
      errorMessage = _aidl_parcel.readString();
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
    _aidl_sj.add("numberAssociation: " + (numberAssociation));
    _aidl_sj.add("associations: " + (java.util.Arrays.toString(associations)));
    _aidl_sj.add("errorMessage: " + (java.util.Objects.toString(errorMessage)));
    return "android.hardware.automotive.vehicle.UserIdentificationResponse" + _aidl_sj.toString()  ;
  }
  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    if (other == null) return false;
    if (!(other instanceof UserIdentificationResponse)) return false;
    UserIdentificationResponse that = (UserIdentificationResponse)other;
    if (!java.util.Objects.deepEquals(requestId, that.requestId)) return false;
    if (!java.util.Objects.deepEquals(numberAssociation, that.numberAssociation)) return false;
    if (!java.util.Objects.deepEquals(associations, that.associations)) return false;
    if (!java.util.Objects.deepEquals(errorMessage, that.errorMessage)) return false;
    return true;
  }

  @Override
  public int hashCode() {
    return java.util.Arrays.deepHashCode(java.util.Arrays.asList(requestId, numberAssociation, associations, errorMessage).toArray());
  }
  @Override
  public int describeContents() {
    int _mask = 0;
    _mask |= describeContents(associations);
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
}
