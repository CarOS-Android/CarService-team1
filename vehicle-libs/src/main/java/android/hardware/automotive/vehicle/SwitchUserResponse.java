/*
 * This file is auto-generated.  DO NOT MODIFY.
 */
package android.hardware.automotive.vehicle;
public class SwitchUserResponse implements android.os.Parcelable
{
  public int requestId = 0;
  public int messageType = SwitchUserMessageType.UNKNOWN;
  public int status = SwitchUserStatus.SUCCESS;
  public String errorMessage;
  public static final Creator<SwitchUserResponse> CREATOR = new Creator<SwitchUserResponse>() {
    @Override
    public SwitchUserResponse createFromParcel(android.os.Parcel _aidl_source) {
      SwitchUserResponse _aidl_out = new SwitchUserResponse();
      _aidl_out.readFromParcel(_aidl_source);
      return _aidl_out;
    }
    @Override
    public SwitchUserResponse[] newArray(int _aidl_size) {
      return new SwitchUserResponse[_aidl_size];
    }
  };
  @Override public final void writeToParcel(android.os.Parcel _aidl_parcel, int _aidl_flag)
  {
    int _aidl_start_pos = _aidl_parcel.dataPosition();
    _aidl_parcel.writeInt(0);
    _aidl_parcel.writeInt(requestId);
    _aidl_parcel.writeInt(messageType);
    _aidl_parcel.writeInt(status);
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
      messageType = _aidl_parcel.readInt();
      if (_aidl_parcel.dataPosition() - _aidl_start_pos >= _aidl_parcelable_size) return;
      status = _aidl_parcel.readInt();
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
    _aidl_sj.add("messageType: " + (messageType));
    _aidl_sj.add("status: " + (status));
    _aidl_sj.add("errorMessage: " + (java.util.Objects.toString(errorMessage)));
    return "android.hardware.automotive.vehicle.SwitchUserResponse" + _aidl_sj.toString()  ;
  }
  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    if (other == null) return false;
    if (!(other instanceof SwitchUserResponse)) return false;
    SwitchUserResponse that = (SwitchUserResponse)other;
    if (!java.util.Objects.deepEquals(requestId, that.requestId)) return false;
    if (!java.util.Objects.deepEquals(messageType, that.messageType)) return false;
    if (!java.util.Objects.deepEquals(status, that.status)) return false;
    if (!java.util.Objects.deepEquals(errorMessage, that.errorMessage)) return false;
    return true;
  }

  @Override
  public int hashCode() {
    return java.util.Arrays.deepHashCode(java.util.Arrays.asList(requestId, messageType, status, errorMessage).toArray());
  }
  @Override
  public int describeContents() {
    int _mask = 0;
    return _mask;
  }
}
