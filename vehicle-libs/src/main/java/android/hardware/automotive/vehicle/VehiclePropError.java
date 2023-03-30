/*
 * This file is auto-generated.  DO NOT MODIFY.
 */
package android.hardware.automotive.vehicle;
public class VehiclePropError implements android.os.Parcelable
{
  public int propId = 0;
  public int areaId = 0;
  public int errorCode = StatusCode.OK;
  public static final Creator<VehiclePropError> CREATOR = new Creator<VehiclePropError>() {
    @Override
    public VehiclePropError createFromParcel(android.os.Parcel _aidl_source) {
      VehiclePropError _aidl_out = new VehiclePropError();
      _aidl_out.readFromParcel(_aidl_source);
      return _aidl_out;
    }
    @Override
    public VehiclePropError[] newArray(int _aidl_size) {
      return new VehiclePropError[_aidl_size];
    }
  };
  @Override public final void writeToParcel(android.os.Parcel _aidl_parcel, int _aidl_flag)
  {
    int _aidl_start_pos = _aidl_parcel.dataPosition();
    _aidl_parcel.writeInt(0);
    _aidl_parcel.writeInt(propId);
    _aidl_parcel.writeInt(areaId);
    _aidl_parcel.writeInt(errorCode);
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
      propId = _aidl_parcel.readInt();
      if (_aidl_parcel.dataPosition() - _aidl_start_pos >= _aidl_parcelable_size) return;
      areaId = _aidl_parcel.readInt();
      if (_aidl_parcel.dataPosition() - _aidl_start_pos >= _aidl_parcelable_size) return;
      errorCode = _aidl_parcel.readInt();
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
    _aidl_sj.add("propId: " + (propId));
    _aidl_sj.add("areaId: " + (areaId));
    _aidl_sj.add("errorCode: " + (errorCode));
    return "android.hardware.automotive.vehicle.VehiclePropError" + _aidl_sj.toString()  ;
  }
  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    if (other == null) return false;
    if (!(other instanceof VehiclePropError)) return false;
    VehiclePropError that = (VehiclePropError)other;
    if (!java.util.Objects.deepEquals(propId, that.propId)) return false;
    if (!java.util.Objects.deepEquals(areaId, that.areaId)) return false;
    if (!java.util.Objects.deepEquals(errorCode, that.errorCode)) return false;
    return true;
  }

  @Override
  public int hashCode() {
    return java.util.Arrays.deepHashCode(java.util.Arrays.asList(propId, areaId, errorCode).toArray());
  }
  @Override
  public int describeContents() {
    int _mask = 0;
    return _mask;
  }
}
