/*
 * This file is auto-generated.  DO NOT MODIFY.
 */
package android.hardware.automotive.vehicle;
public class RawPropValues implements android.os.Parcelable
{
  public int[] int32Values = {};
  public float[] floatValues;
  public long[] int64Values;
  public byte[] byteValues;
  public String stringValue;
  public static final Creator<RawPropValues> CREATOR = new Creator<RawPropValues>() {
    @Override
    public RawPropValues createFromParcel(android.os.Parcel _aidl_source) {
      RawPropValues _aidl_out = new RawPropValues();
      _aidl_out.readFromParcel(_aidl_source);
      return _aidl_out;
    }
    @Override
    public RawPropValues[] newArray(int _aidl_size) {
      return new RawPropValues[_aidl_size];
    }
  };
  @Override public final void writeToParcel(android.os.Parcel _aidl_parcel, int _aidl_flag)
  {
    int _aidl_start_pos = _aidl_parcel.dataPosition();
    _aidl_parcel.writeInt(0);
    _aidl_parcel.writeIntArray(int32Values);
    _aidl_parcel.writeFloatArray(floatValues);
    _aidl_parcel.writeLongArray(int64Values);
    _aidl_parcel.writeByteArray(byteValues);
    _aidl_parcel.writeString(stringValue);
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
      int32Values = _aidl_parcel.createIntArray();
      if (_aidl_parcel.dataPosition() - _aidl_start_pos >= _aidl_parcelable_size) return;
      floatValues = _aidl_parcel.createFloatArray();
      if (_aidl_parcel.dataPosition() - _aidl_start_pos >= _aidl_parcelable_size) return;
      int64Values = _aidl_parcel.createLongArray();
      if (_aidl_parcel.dataPosition() - _aidl_start_pos >= _aidl_parcelable_size) return;
      byteValues = _aidl_parcel.createByteArray();
      if (_aidl_parcel.dataPosition() - _aidl_start_pos >= _aidl_parcelable_size) return;
      stringValue = _aidl_parcel.readString();
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
    _aidl_sj.add("int32Values: " + (java.util.Arrays.toString(int32Values)));
    _aidl_sj.add("floatValues: " + (java.util.Arrays.toString(floatValues)));
    _aidl_sj.add("int64Values: " + (java.util.Arrays.toString(int64Values)));
    _aidl_sj.add("byteValues: " + (java.util.Arrays.toString(byteValues)));
    _aidl_sj.add("stringValue: " + (java.util.Objects.toString(stringValue)));
    return "android.hardware.automotive.vehicle.RawPropValues" + _aidl_sj.toString()  ;
  }
  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    if (other == null) return false;
    if (!(other instanceof RawPropValues)) return false;
    RawPropValues that = (RawPropValues)other;
    if (!java.util.Objects.deepEquals(int32Values, that.int32Values)) return false;
    if (!java.util.Objects.deepEquals(floatValues, that.floatValues)) return false;
    if (!java.util.Objects.deepEquals(int64Values, that.int64Values)) return false;
    if (!java.util.Objects.deepEquals(byteValues, that.byteValues)) return false;
    if (!java.util.Objects.deepEquals(stringValue, that.stringValue)) return false;
    return true;
  }

  @Override
  public int hashCode() {
    return java.util.Arrays.deepHashCode(java.util.Arrays.asList(int32Values, floatValues, int64Values, byteValues, stringValue).toArray());
  }
  @Override
  public int describeContents() {
    int _mask = 0;
    return _mask;
  }
}
