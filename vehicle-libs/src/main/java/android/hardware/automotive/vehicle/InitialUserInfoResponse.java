/*
 * This file is auto-generated.  DO NOT MODIFY.
 */
package android.hardware.automotive.vehicle;
public class InitialUserInfoResponse implements android.os.Parcelable
{
  public int requestId = 0;
  public int action = InitialUserInfoResponseAction.DEFAULT;
  public UserInfo userToSwitchOrCreate;
  public String userLocales;
  public String userNameToCreate;
  public static final Creator<InitialUserInfoResponse> CREATOR = new Creator<InitialUserInfoResponse>() {
    @Override
    public InitialUserInfoResponse createFromParcel(android.os.Parcel _aidl_source) {
      InitialUserInfoResponse _aidl_out = new InitialUserInfoResponse();
      _aidl_out.readFromParcel(_aidl_source);
      return _aidl_out;
    }
    @Override
    public InitialUserInfoResponse[] newArray(int _aidl_size) {
      return new InitialUserInfoResponse[_aidl_size];
    }
  };
  @Override public final void writeToParcel(android.os.Parcel _aidl_parcel, int _aidl_flag)
  {
    int _aidl_start_pos = _aidl_parcel.dataPosition();
    _aidl_parcel.writeInt(0);
    _aidl_parcel.writeInt(requestId);
    _aidl_parcel.writeInt(action);
    _Parcel.writeTypedObject(_aidl_parcel, userToSwitchOrCreate, _aidl_flag);
    _aidl_parcel.writeString(userLocales);
    _aidl_parcel.writeString(userNameToCreate);
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
      action = _aidl_parcel.readInt();
      if (_aidl_parcel.dataPosition() - _aidl_start_pos >= _aidl_parcelable_size) return;
      userToSwitchOrCreate = _Parcel.readTypedObject(_aidl_parcel, UserInfo.CREATOR);
      if (_aidl_parcel.dataPosition() - _aidl_start_pos >= _aidl_parcelable_size) return;
      userLocales = _aidl_parcel.readString();
      if (_aidl_parcel.dataPosition() - _aidl_start_pos >= _aidl_parcelable_size) return;
      userNameToCreate = _aidl_parcel.readString();
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
    _aidl_sj.add("action: " + (action));
    _aidl_sj.add("userToSwitchOrCreate: " + (java.util.Objects.toString(userToSwitchOrCreate)));
    _aidl_sj.add("userLocales: " + (java.util.Objects.toString(userLocales)));
    _aidl_sj.add("userNameToCreate: " + (java.util.Objects.toString(userNameToCreate)));
    return "android.hardware.automotive.vehicle.InitialUserInfoResponse" + _aidl_sj.toString()  ;
  }
  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    if (other == null) return false;
    if (!(other instanceof InitialUserInfoResponse)) return false;
    InitialUserInfoResponse that = (InitialUserInfoResponse)other;
    if (!java.util.Objects.deepEquals(requestId, that.requestId)) return false;
    if (!java.util.Objects.deepEquals(action, that.action)) return false;
    if (!java.util.Objects.deepEquals(userToSwitchOrCreate, that.userToSwitchOrCreate)) return false;
    if (!java.util.Objects.deepEquals(userLocales, that.userLocales)) return false;
    if (!java.util.Objects.deepEquals(userNameToCreate, that.userNameToCreate)) return false;
    return true;
  }

  @Override
  public int hashCode() {
    return java.util.Arrays.deepHashCode(java.util.Arrays.asList(requestId, action, userToSwitchOrCreate, userLocales, userNameToCreate).toArray());
  }
  @Override
  public int describeContents() {
    int _mask = 0;
    _mask |= describeContents(userToSwitchOrCreate);
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
