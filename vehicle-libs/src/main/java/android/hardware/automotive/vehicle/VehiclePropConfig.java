/*
 * This file is auto-generated.  DO NOT MODIFY.
 */
package android.hardware.automotive.vehicle;
public class VehiclePropConfig implements android.os.Parcelable
{
  public int prop = 0;
  public int access = VehiclePropertyAccess.NONE;
  public int changeMode = VehiclePropertyChangeMode.STATIC;
  public VehicleAreaConfig[] areaConfigs;
  public int[] configArray;
  public String configString;
  public float minSampleRate = 0.000000f;
  public float maxSampleRate = 0.000000f;
  public static final Creator<VehiclePropConfig> CREATOR = new Creator<VehiclePropConfig>() {
    @Override
    public VehiclePropConfig createFromParcel(android.os.Parcel _aidl_source) {
      VehiclePropConfig _aidl_out = new VehiclePropConfig();
      _aidl_out.readFromParcel(_aidl_source);
      return _aidl_out;
    }
    @Override
    public VehiclePropConfig[] newArray(int _aidl_size) {
      return new VehiclePropConfig[_aidl_size];
    }
  };
  @Override public final void writeToParcel(android.os.Parcel _aidl_parcel, int _aidl_flag)
  {
    int _aidl_start_pos = _aidl_parcel.dataPosition();
    _aidl_parcel.writeInt(0);
    _aidl_parcel.writeInt(prop);
    _aidl_parcel.writeInt(access);
    _aidl_parcel.writeInt(changeMode);
    _aidl_parcel.writeTypedArray(areaConfigs, _aidl_flag);
    _aidl_parcel.writeIntArray(configArray);
    _aidl_parcel.writeString(configString);
    _aidl_parcel.writeFloat(minSampleRate);
    _aidl_parcel.writeFloat(maxSampleRate);
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
      prop = _aidl_parcel.readInt();
      if (_aidl_parcel.dataPosition() - _aidl_start_pos >= _aidl_parcelable_size) return;
      access = _aidl_parcel.readInt();
      if (_aidl_parcel.dataPosition() - _aidl_start_pos >= _aidl_parcelable_size) return;
      changeMode = _aidl_parcel.readInt();
      if (_aidl_parcel.dataPosition() - _aidl_start_pos >= _aidl_parcelable_size) return;
      areaConfigs = _aidl_parcel.createTypedArray(VehicleAreaConfig.CREATOR);
      if (_aidl_parcel.dataPosition() - _aidl_start_pos >= _aidl_parcelable_size) return;
      configArray = _aidl_parcel.createIntArray();
      if (_aidl_parcel.dataPosition() - _aidl_start_pos >= _aidl_parcelable_size) return;
      configString = _aidl_parcel.readString();
      if (_aidl_parcel.dataPosition() - _aidl_start_pos >= _aidl_parcelable_size) return;
      minSampleRate = _aidl_parcel.readFloat();
      if (_aidl_parcel.dataPosition() - _aidl_start_pos >= _aidl_parcelable_size) return;
      maxSampleRate = _aidl_parcel.readFloat();
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
    _aidl_sj.add("prop: " + (prop));
    _aidl_sj.add("access: " + (access));
    _aidl_sj.add("changeMode: " + (changeMode));
    _aidl_sj.add("areaConfigs: " + (java.util.Arrays.toString(areaConfigs)));
    _aidl_sj.add("configArray: " + (java.util.Arrays.toString(configArray)));
    _aidl_sj.add("configString: " + (java.util.Objects.toString(configString)));
    _aidl_sj.add("minSampleRate: " + (minSampleRate));
    _aidl_sj.add("maxSampleRate: " + (maxSampleRate));
    return "android.hardware.automotive.vehicle.VehiclePropConfig" + _aidl_sj.toString()  ;
  }
  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    if (other == null) return false;
    if (!(other instanceof VehiclePropConfig)) return false;
    VehiclePropConfig that = (VehiclePropConfig)other;
    if (!java.util.Objects.deepEquals(prop, that.prop)) return false;
    if (!java.util.Objects.deepEquals(access, that.access)) return false;
    if (!java.util.Objects.deepEquals(changeMode, that.changeMode)) return false;
    if (!java.util.Objects.deepEquals(areaConfigs, that.areaConfigs)) return false;
    if (!java.util.Objects.deepEquals(configArray, that.configArray)) return false;
    if (!java.util.Objects.deepEquals(configString, that.configString)) return false;
    if (!java.util.Objects.deepEquals(minSampleRate, that.minSampleRate)) return false;
    if (!java.util.Objects.deepEquals(maxSampleRate, that.maxSampleRate)) return false;
    return true;
  }

  @Override
  public int hashCode() {
    return java.util.Arrays.deepHashCode(java.util.Arrays.asList(prop, access, changeMode, areaConfigs, configArray, configString, minSampleRate, maxSampleRate).toArray());
  }
  @Override
  public int describeContents() {
    int _mask = 0;
    _mask |= describeContents(areaConfigs);
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
