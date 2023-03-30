/*
 * This file is auto-generated.  DO NOT MODIFY.
 */
package android.hardware.automotive.vehicle;
public interface IVehicleCallback extends android.os.IInterface
{
  /** Default implementation for IVehicleCallback. */
  public static class Default implements IVehicleCallback
  {
    @Override public void onGetValues(GetValueResults responses) throws android.os.RemoteException
    {
    }
    @Override public void onSetValues(SetValueResults responses) throws android.os.RemoteException
    {
    }
    @Override public void onPropertyEvent(VehiclePropValues propValues, int sharedMemoryFileCount) throws android.os.RemoteException
    {
    }
    @Override public void onPropertySetError(VehiclePropErrors errors) throws android.os.RemoteException
    {
    }
    @Override
    public android.os.IBinder asBinder() {
      return null;
    }
  }
  /** Local-side IPC implementation stub class. */
  public static abstract class Stub extends android.os.Binder implements IVehicleCallback
  {
    /** Construct the stub at attach it to the interface. */
    public Stub()
    {
      this.attachInterface(this, DESCRIPTOR);
    }
    /**
     * Cast an IBinder object into an android.hardware.automotive.vehicle.IVehicleCallback interface,
     * generating a proxy if needed.
     */
    public static IVehicleCallback asInterface(android.os.IBinder obj)
    {
      if ((obj==null)) {
        return null;
      }
      android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
      if (((iin!=null)&&(iin instanceof IVehicleCallback))) {
        return ((IVehicleCallback)iin);
      }
      return new Proxy(obj);
    }
    @Override public android.os.IBinder asBinder()
    {
      return this;
    }
    @Override public boolean onTransact(int code, android.os.Parcel data, android.os.Parcel reply, int flags) throws android.os.RemoteException
    {
      String descriptor = DESCRIPTOR;
      if (code >= android.os.IBinder.FIRST_CALL_TRANSACTION && code <= android.os.IBinder.LAST_CALL_TRANSACTION) {
        data.enforceInterface(descriptor);
      }
      switch (code)
      {
        case INTERFACE_TRANSACTION:
        {
          reply.writeString(descriptor);
          return true;
        }
      }
      switch (code)
      {
        case TRANSACTION_onGetValues:
        {
          GetValueResults _arg0;
          _arg0 = _Parcel.readTypedObject(data, GetValueResults.CREATOR);
          this.onGetValues(_arg0);
          break;
        }
        case TRANSACTION_onSetValues:
        {
          SetValueResults _arg0;
          _arg0 = _Parcel.readTypedObject(data, SetValueResults.CREATOR);
          this.onSetValues(_arg0);
          break;
        }
        case TRANSACTION_onPropertyEvent:
        {
          VehiclePropValues _arg0;
          _arg0 = _Parcel.readTypedObject(data, VehiclePropValues.CREATOR);
          int _arg1;
          _arg1 = data.readInt();
          this.onPropertyEvent(_arg0, _arg1);
          break;
        }
        case TRANSACTION_onPropertySetError:
        {
          VehiclePropErrors _arg0;
          _arg0 = _Parcel.readTypedObject(data, VehiclePropErrors.CREATOR);
          this.onPropertySetError(_arg0);
          break;
        }
        default:
        {
          return super.onTransact(code, data, reply, flags);
        }
      }
      return true;
    }
    private static class Proxy implements IVehicleCallback
    {
      private android.os.IBinder mRemote;
      Proxy(android.os.IBinder remote)
      {
        mRemote = remote;
      }
      @Override public android.os.IBinder asBinder()
      {
        return mRemote;
      }
      public String getInterfaceDescriptor()
      {
        return DESCRIPTOR;
      }
      @Override public void onGetValues(GetValueResults responses) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _Parcel.writeTypedObject(_data, responses, 0);
          boolean _status = mRemote.transact(Stub.TRANSACTION_onGetValues, _data, null, android.os.IBinder.FLAG_ONEWAY);
        }
        finally {
          _data.recycle();
        }
      }
      @Override public void onSetValues(SetValueResults responses) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _Parcel.writeTypedObject(_data, responses, 0);
          boolean _status = mRemote.transact(Stub.TRANSACTION_onSetValues, _data, null, android.os.IBinder.FLAG_ONEWAY);
        }
        finally {
          _data.recycle();
        }
      }
      @Override public void onPropertyEvent(VehiclePropValues propValues, int sharedMemoryFileCount) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _Parcel.writeTypedObject(_data, propValues, 0);
          _data.writeInt(sharedMemoryFileCount);
          boolean _status = mRemote.transact(Stub.TRANSACTION_onPropertyEvent, _data, null, android.os.IBinder.FLAG_ONEWAY);
        }
        finally {
          _data.recycle();
        }
      }
      @Override public void onPropertySetError(VehiclePropErrors errors) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _Parcel.writeTypedObject(_data, errors, 0);
          boolean _status = mRemote.transact(Stub.TRANSACTION_onPropertySetError, _data, null, android.os.IBinder.FLAG_ONEWAY);
        }
        finally {
          _data.recycle();
        }
      }
    }
    static final int TRANSACTION_onGetValues = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
    static final int TRANSACTION_onSetValues = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
    static final int TRANSACTION_onPropertyEvent = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
    static final int TRANSACTION_onPropertySetError = (android.os.IBinder.FIRST_CALL_TRANSACTION + 3);
  }
  public static final String DESCRIPTOR = "android.hardware.automotive.vehicle.IVehicleCallback";
  public void onGetValues(GetValueResults responses) throws android.os.RemoteException;
  public void onSetValues(SetValueResults responses) throws android.os.RemoteException;
  public void onPropertyEvent(VehiclePropValues propValues, int sharedMemoryFileCount) throws android.os.RemoteException;
  public void onPropertySetError(VehiclePropErrors errors) throws android.os.RemoteException;
  /** @hide */
  static class _Parcel {
    static private <T> T readTypedObject(
        android.os.Parcel parcel,
        android.os.Parcelable.Creator<T> c) {
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
