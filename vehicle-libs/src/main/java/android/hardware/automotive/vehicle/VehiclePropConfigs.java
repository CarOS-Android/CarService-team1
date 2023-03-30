/*
 * This file is auto-generated.  DO NOT MODIFY.
 */
package android.hardware.automotive.vehicle;
public class VehiclePropConfigs implements android.os.Parcelable
{
  public VehiclePropConfig[] payloads;
  public android.os.ParcelFileDescriptor sharedMemoryFd;
  public static final Creator<VehiclePropConfigs> CREATOR = new Creator<VehiclePropConfigs>() {
    @Override
    public VehiclePropConfigs createFromParcel(android.os.Parcel _aidl_source) {
      VehiclePropConfigs _aidl_out = new VehiclePropConfigs();
      _aidl_out.readFromParcel(_aidl_source);
      return _aidl_out;
    }
    @Override
    public VehiclePropConfigs[] newArray(int _aidl_size) {
      return new VehiclePropConfigs[_aidl_size];
    }
  };
  @Override public final void writeToParcel(android.os.Parcel _aidl_parcel, int _aidl_flag)
  {
    int _aidl_start_pos = _aidl_parcel.dataPosition();
    _aidl_parcel.writeInt(0);
    _aidl_parcel.writeTypedArray(payloads, _aidl_flag);
    _Parcel.writeTypedObject(_aidl_parcel, sharedMemoryFd, _aidl_flag);
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
      payloads = _aidl_parcel.createTypedArray(VehiclePropConfig.CREATOR);
      if (_aidl_parcel.dataPosition() - _aidl_start_pos >= _aidl_parcelable_size) return;
      sharedMemoryFd = _Parcel.readTypedObject(_aidl_parcel, android.os.ParcelFileDescriptor.CREATOR);
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
    _aidl_sj.add("payloads: " + (java.util.Arrays.toString(payloads)));
    _aidl_sj.add("sharedMemoryFd: " + (java.util.Objects.toString(sharedMemoryFd)));
    return "android.hardware.automotive.vehicle.VehiclePropConfigs" + _aidl_sj.toString()  ;
  }
  @Override
  public boolean equals(Object other) {
    if (this == other) return true;
    if (other == null) return false;
    if (!(other instanceof VehiclePropConfigs)) return false;
    VehiclePropConfigs that = (VehiclePropConfigs)other;
    if (!java.util.Objects.deepEquals(payloads, that.payloads)) return false;
    if (!java.util.Objects.deepEquals(sharedMemoryFd, that.sharedMemoryFd)) return false;
    return true;
  }

  @Override
  public int hashCode() {
    return java.util.Arrays.deepHashCode(java.util.Arrays.asList(payloads, sharedMemoryFd).toArray());
  }
  @Override
  public int describeContents() {
    int _mask = 0;
    _mask |= describeContents(payloads);
    _mask |= describeContents(sharedMemoryFd);
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
