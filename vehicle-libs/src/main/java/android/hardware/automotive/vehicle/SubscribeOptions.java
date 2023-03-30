/*
 * This file is auto-generated.  DO NOT MODIFY.
 */
package android.hardware.automotive.vehicle;
public class SubscribeOptions implements android.os.Parcelable
{
  public int propId = 0;
  public int[] areaIds;
  public float sampleRate = 0.000000f;
  public static final Creator<SubscribeOptions> CREATOR = new Creator<SubscribeOptions>() {
    @Override
    public SubscribeOptions createFromParcel(android.os.Parcel _aidl_source) {
      SubscribeOptions _aidl_out = new SubscribeOptions();
      _aidl_out.readFromParcel(_aidl_source);
      return _aidl_out;
    }
    @Override
    public SubscribeOptions[] newArray(int _aidl_size) {
      return new SubscribeOptions[_aidl_size];
    }
  };
  @Override public final void writeToParcel(android.os.Parcel _aidl_parcel, int _aidl_flag)
  {
    int _aidl_start_pos = _aidl_parcel.dataPosition();
    _aidl_parcel.writeInt(0);
    _aidl_parcel.writeInt(propId);
    _aidl_parcel.writeIntArray(areaIds);
    _aidl_parcel.writeFloat(sampleRate);
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
      areaIds = _aidl_parcel.createIntArray();
      if (_aidl_parcel.dataPosition() - _aidl_start_pos >= _aidl_parcelable_size) return;
      sampleRate = _aidl_parcel.readFloat();
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
    _aidl_sj.add("areaIds: " + (java.util.Arrays.toString(areaIds)));
    _aidl_sj.add("sampleRate: " + (sampleRate));
    return "android.hardware.automotive.vehicle.SubscribeOptions" + _aidl_sj.toString()  ;
  }
  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    if (other == null) return false;
    if (!(other instanceof SubscribeOptions)) return false;
    SubscribeOptions that = (SubscribeOptions)other;
    if (!java.util.Objects.deepEquals(propId, that.propId)) return false;
    if (!java.util.Objects.deepEquals(areaIds, that.areaIds)) return false;
    if (!java.util.Objects.deepEquals(sampleRate, that.sampleRate)) return false;
    return true;
  }

  @Override
  public int hashCode() {
    return java.util.Arrays.deepHashCode(java.util.Arrays.asList(propId, areaIds, sampleRate).toArray());
  }
  @Override
  public int describeContents() {
    int _mask = 0;
    return _mask;
  }
}
