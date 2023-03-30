/*
 * This file is auto-generated.  DO NOT MODIFY.
 */
package android.hardware.automotive.vehicle;
public class VehicleAreaConfig implements android.os.Parcelable
{
  public int areaId = 0;
  public int minInt32Value = 0;
  public int maxInt32Value = 0;
  public long minInt64Value = 0L;
  public long maxInt64Value = 0L;
  public float minFloatValue = 0.000000f;
  public float maxFloatValue = 0.000000f;
  public static final Creator<VehicleAreaConfig> CREATOR = new Creator<VehicleAreaConfig>() {
    @Override
    public VehicleAreaConfig createFromParcel(android.os.Parcel _aidl_source) {
      VehicleAreaConfig _aidl_out = new VehicleAreaConfig();
      _aidl_out.readFromParcel(_aidl_source);
      return _aidl_out;
    }
    @Override
    public VehicleAreaConfig[] newArray(int _aidl_size) {
      return new VehicleAreaConfig[_aidl_size];
    }
  };
  @Override public final void writeToParcel(android.os.Parcel _aidl_parcel, int _aidl_flag)
  {
    int _aidl_start_pos = _aidl_parcel.dataPosition();
    _aidl_parcel.writeInt(0);
    _aidl_parcel.writeInt(areaId);
    _aidl_parcel.writeInt(minInt32Value);
    _aidl_parcel.writeInt(maxInt32Value);
    _aidl_parcel.writeLong(minInt64Value);
    _aidl_parcel.writeLong(maxInt64Value);
    _aidl_parcel.writeFloat(minFloatValue);
    _aidl_parcel.writeFloat(maxFloatValue);
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
      areaId = _aidl_parcel.readInt();
      if (_aidl_parcel.dataPosition() - _aidl_start_pos >= _aidl_parcelable_size) return;
      minInt32Value = _aidl_parcel.readInt();
      if (_aidl_parcel.dataPosition() - _aidl_start_pos >= _aidl_parcelable_size) return;
      maxInt32Value = _aidl_parcel.readInt();
      if (_aidl_parcel.dataPosition() - _aidl_start_pos >= _aidl_parcelable_size) return;
      minInt64Value = _aidl_parcel.readLong();
      if (_aidl_parcel.dataPosition() - _aidl_start_pos >= _aidl_parcelable_size) return;
      maxInt64Value = _aidl_parcel.readLong();
      if (_aidl_parcel.dataPosition() - _aidl_start_pos >= _aidl_parcelable_size) return;
      minFloatValue = _aidl_parcel.readFloat();
      if (_aidl_parcel.dataPosition() - _aidl_start_pos >= _aidl_parcelable_size) return;
      maxFloatValue = _aidl_parcel.readFloat();
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
    _aidl_sj.add("areaId: " + (areaId));
    _aidl_sj.add("minInt32Value: " + (minInt32Value));
    _aidl_sj.add("maxInt32Value: " + (maxInt32Value));
    _aidl_sj.add("minInt64Value: " + (minInt64Value));
    _aidl_sj.add("maxInt64Value: " + (maxInt64Value));
    _aidl_sj.add("minFloatValue: " + (minFloatValue));
    _aidl_sj.add("maxFloatValue: " + (maxFloatValue));
    return "android.hardware.automotive.vehicle.VehicleAreaConfig" + _aidl_sj.toString()  ;
  }
  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    if (other == null) return false;
    if (!(other instanceof VehicleAreaConfig)) return false;
    VehicleAreaConfig that = (VehicleAreaConfig)other;
    if (!java.util.Objects.deepEquals(areaId, that.areaId)) return false;
    if (!java.util.Objects.deepEquals(minInt32Value, that.minInt32Value)) return false;
    if (!java.util.Objects.deepEquals(maxInt32Value, that.maxInt32Value)) return false;
    if (!java.util.Objects.deepEquals(minInt64Value, that.minInt64Value)) return false;
    if (!java.util.Objects.deepEquals(maxInt64Value, that.maxInt64Value)) return false;
    if (!java.util.Objects.deepEquals(minFloatValue, that.minFloatValue)) return false;
    if (!java.util.Objects.deepEquals(maxFloatValue, that.maxFloatValue)) return false;
    return true;
  }

  @Override
  public int hashCode() {
    return java.util.Arrays.deepHashCode(java.util.Arrays.asList(areaId, minInt32Value, maxInt32Value, minInt64Value, maxInt64Value, minFloatValue, maxFloatValue).toArray());
  }
  @Override
  public int describeContents() {
    int _mask = 0;
    return _mask;
  }
}
