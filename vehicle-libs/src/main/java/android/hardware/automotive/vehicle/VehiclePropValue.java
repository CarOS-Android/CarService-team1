/*
 * This file is auto-generated.  DO NOT MODIFY.
 */
package android.hardware.automotive.vehicle;
public class VehiclePropValue implements android.os.Parcelable
{
  public long timestamp = 0L;
  public int areaId = 0;
  public int prop = 0;
  public int status = VehiclePropertyStatus.AVAILABLE;
  public RawPropValues value;
  public static final Creator<VehiclePropValue> CREATOR = new Creator<VehiclePropValue>() {
    @Override
    public VehiclePropValue createFromParcel(android.os.Parcel _aidl_source) {
      VehiclePropValue _aidl_out = new VehiclePropValue();
      _aidl_out.readFromParcel(_aidl_source);
      return _aidl_out;
    }
    @Override
    public VehiclePropValue[] newArray(int _aidl_size) {
      return new VehiclePropValue[_aidl_size];
    }
  };
  @Override public final void writeToParcel(android.os.Parcel _aidl_parcel, int _aidl_flag)
  {
    int _aidl_start_pos = _aidl_parcel.dataPosition();
    _aidl_parcel.writeInt(0);
    _aidl_parcel.writeLong(timestamp);
    _aidl_parcel.writeInt(areaId);
    _aidl_parcel.writeInt(prop);
    _aidl_parcel.writeInt(status);
    _Parcel.writeTypedObject(_aidl_parcel, value, _aidl_flag);
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
      timestamp = _aidl_parcel.readLong();
      if (_aidl_parcel.dataPosition() - _aidl_start_pos >= _aidl_parcelable_size) return;
      areaId = _aidl_parcel.readInt();
      if (_aidl_parcel.dataPosition() - _aidl_start_pos >= _aidl_parcelable_size) return;
      prop = _aidl_parcel.readInt();
      if (_aidl_parcel.dataPosition() - _aidl_start_pos >= _aidl_parcelable_size) return;
      status = _aidl_parcel.readInt();
      if (_aidl_parcel.dataPosition() - _aidl_start_pos >= _aidl_parcelable_size) return;
      value = _Parcel.readTypedObject(_aidl_parcel, RawPropValues.CREATOR);
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
    _aidl_sj.add("timestamp: " + (timestamp));
    _aidl_sj.add("areaId: " + (areaId));
    _aidl_sj.add("prop: " + (prop));
    _aidl_sj.add("status: " + (status));
    _aidl_sj.add("value: " + (java.util.Objects.toString(value)));
    return "android.hardware.automotive.vehicle.VehiclePropValue" + _aidl_sj.toString()  ;
  }
  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    if (other == null) return false;
    if (!(other instanceof VehiclePropValue)) return false;
    VehiclePropValue that = (VehiclePropValue)other;
    if (!java.util.Objects.deepEquals(timestamp, that.timestamp)) return false;
    if (!java.util.Objects.deepEquals(areaId, that.areaId)) return false;
    if (!java.util.Objects.deepEquals(prop, that.prop)) return false;
    if (!java.util.Objects.deepEquals(status, that.status)) return false;
    if (!java.util.Objects.deepEquals(value, that.value)) return false;
    return true;
  }

  @Override
  public int hashCode() {
    return java.util.Arrays.deepHashCode(java.util.Arrays.asList(timestamp, areaId, prop, status, value).toArray());
  }
  @Override
  public int describeContents() {
    int _mask = 0;
    _mask |= describeContents(value);
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
