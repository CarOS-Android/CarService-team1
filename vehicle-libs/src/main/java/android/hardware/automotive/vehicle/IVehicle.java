/*
 * This file is auto-generated.  DO NOT MODIFY.
 */
package android.hardware.automotive.vehicle;
public interface IVehicle extends android.os.IInterface
{
  /** Default implementation for IVehicle. */
  public static class Default implements IVehicle
  {
    @Override public VehiclePropConfigs getAllPropConfigs() throws android.os.RemoteException
    {
      return null;
    }
    @Override public VehiclePropConfigs getPropConfigs(int[] props) throws android.os.RemoteException
    {
      return null;
    }
    @Override public void getValues(IVehicleCallback callback, GetValueRequests requests) throws android.os.RemoteException
    {
    }
    @Override public void setValues(IVehicleCallback callback, SetValueRequests requests) throws android.os.RemoteException
    {
    }
    @Override public void subscribe(IVehicleCallback callback, SubscribeOptions[] options, int maxSharedMemoryFileCount) throws android.os.RemoteException
    {
    }
    @Override public void unsubscribe(IVehicleCallback callback, int[] propIds) throws android.os.RemoteException
    {
    }
    @Override public void returnSharedMemory(IVehicleCallback callback, long sharedMemoryId) throws android.os.RemoteException
    {
    }
    @Override
    public android.os.IBinder asBinder() {
      return null;
    }
  }
  /** Local-side IPC implementation stub class. */
  public static abstract class Stub extends android.os.Binder implements IVehicle
  {
    /** Construct the stub at attach it to the interface. */
    public Stub()
    {
      this.attachInterface(this, DESCRIPTOR);
    }
    /**
     * Cast an IBinder object into an android.hardware.automotive.vehicle.IVehicle interface,
     * generating a proxy if needed.
     */
    public static IVehicle asInterface(android.os.IBinder obj)
    {
      if ((obj==null)) {
        return null;
      }
      android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
      if (((iin!=null)&&(iin instanceof IVehicle))) {
        return ((IVehicle)iin);
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
        case TRANSACTION_getAllPropConfigs:
        {
          VehiclePropConfigs _result = this.getAllPropConfigs();
          reply.writeNoException();
          _Parcel.writeTypedObject(reply, _result, android.os.Parcelable.PARCELABLE_WRITE_RETURN_VALUE);
          break;
        }
        case TRANSACTION_getPropConfigs:
        {
          int[] _arg0;
          _arg0 = data.createIntArray();
          VehiclePropConfigs _result = this.getPropConfigs(_arg0);
          reply.writeNoException();
          _Parcel.writeTypedObject(reply, _result, android.os.Parcelable.PARCELABLE_WRITE_RETURN_VALUE);
          break;
        }
        case TRANSACTION_getValues:
        {
          IVehicleCallback _arg0;
          _arg0 = IVehicleCallback.Stub.asInterface(data.readStrongBinder());
          GetValueRequests _arg1;
          _arg1 = _Parcel.readTypedObject(data, GetValueRequests.CREATOR);
          this.getValues(_arg0, _arg1);
          reply.writeNoException();
          break;
        }
        case TRANSACTION_setValues:
        {
          IVehicleCallback _arg0;
          _arg0 = IVehicleCallback.Stub.asInterface(data.readStrongBinder());
          SetValueRequests _arg1;
          _arg1 = _Parcel.readTypedObject(data, SetValueRequests.CREATOR);
          this.setValues(_arg0, _arg1);
          reply.writeNoException();
          break;
        }
        case TRANSACTION_subscribe:
        {
          IVehicleCallback _arg0;
          _arg0 = IVehicleCallback.Stub.asInterface(data.readStrongBinder());
          SubscribeOptions[] _arg1;
          _arg1 = data.createTypedArray(SubscribeOptions.CREATOR);
          int _arg2;
          _arg2 = data.readInt();
          this.subscribe(_arg0, _arg1, _arg2);
          reply.writeNoException();
          break;
        }
        case TRANSACTION_unsubscribe:
        {
          IVehicleCallback _arg0;
          _arg0 = IVehicleCallback.Stub.asInterface(data.readStrongBinder());
          int[] _arg1;
          _arg1 = data.createIntArray();
          this.unsubscribe(_arg0, _arg1);
          reply.writeNoException();
          break;
        }
        case TRANSACTION_returnSharedMemory:
        {
          IVehicleCallback _arg0;
          _arg0 = IVehicleCallback.Stub.asInterface(data.readStrongBinder());
          long _arg1;
          _arg1 = data.readLong();
          this.returnSharedMemory(_arg0, _arg1);
          reply.writeNoException();
          break;
        }
        default:
        {
          return super.onTransact(code, data, reply, flags);
        }
      }
      return true;
    }
    private static class Proxy implements IVehicle
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
      @Override public VehiclePropConfigs getAllPropConfigs() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        VehiclePropConfigs _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_getAllPropConfigs, _data, _reply, 0);
          _reply.readException();
          _result = _Parcel.readTypedObject(_reply, VehiclePropConfigs.CREATOR);
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      @Override public VehiclePropConfigs getPropConfigs(int[] props) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        VehiclePropConfigs _result;
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeIntArray(props);
          boolean _status = mRemote.transact(Stub.TRANSACTION_getPropConfigs, _data, _reply, 0);
          _reply.readException();
          _result = _Parcel.readTypedObject(_reply, VehiclePropConfigs.CREATOR);
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
        return _result;
      }
      @Override public void getValues(IVehicleCallback callback, GetValueRequests requests) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeStrongInterface(callback);
          _Parcel.writeTypedObject(_data, requests, 0);
          boolean _status = mRemote.transact(Stub.TRANSACTION_getValues, _data, _reply, 0);
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public void setValues(IVehicleCallback callback, SetValueRequests requests) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeStrongInterface(callback);
          _Parcel.writeTypedObject(_data, requests, 0);
          boolean _status = mRemote.transact(Stub.TRANSACTION_setValues, _data, _reply, 0);
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public void subscribe(IVehicleCallback callback, SubscribeOptions[] options, int maxSharedMemoryFileCount) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeStrongInterface(callback);
          _data.writeTypedArray(options, 0);
          _data.writeInt(maxSharedMemoryFileCount);
          boolean _status = mRemote.transact(Stub.TRANSACTION_subscribe, _data, _reply, 0);
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public void unsubscribe(IVehicleCallback callback, int[] propIds) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeStrongInterface(callback);
          _data.writeIntArray(propIds);
          boolean _status = mRemote.transact(Stub.TRANSACTION_unsubscribe, _data, _reply, 0);
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public void returnSharedMemory(IVehicleCallback callback, long sharedMemoryId) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeStrongInterface(callback);
          _data.writeLong(sharedMemoryId);
          boolean _status = mRemote.transact(Stub.TRANSACTION_returnSharedMemory, _data, _reply, 0);
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
    }
    static final int TRANSACTION_getAllPropConfigs = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
    static final int TRANSACTION_getPropConfigs = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
    static final int TRANSACTION_getValues = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
    static final int TRANSACTION_setValues = (android.os.IBinder.FIRST_CALL_TRANSACTION + 3);
    static final int TRANSACTION_subscribe = (android.os.IBinder.FIRST_CALL_TRANSACTION + 4);
    static final int TRANSACTION_unsubscribe = (android.os.IBinder.FIRST_CALL_TRANSACTION + 5);
    static final int TRANSACTION_returnSharedMemory = (android.os.IBinder.FIRST_CALL_TRANSACTION + 6);
  }
  public static final String DESCRIPTOR = "android.hardware.automotive.vehicle.IVehicle";
  public static final long INVALID_MEMORY_ID = 0L;
  public static final int MAX_SHARED_MEMORY_FILES_PER_CLIENT = 3;
  public VehiclePropConfigs getAllPropConfigs() throws android.os.RemoteException;
  public VehiclePropConfigs getPropConfigs(int[] props) throws android.os.RemoteException;
  public void getValues(IVehicleCallback callback, GetValueRequests requests) throws android.os.RemoteException;
  public void setValues(IVehicleCallback callback, SetValueRequests requests) throws android.os.RemoteException;
  public void subscribe(IVehicleCallback callback, SubscribeOptions[] options, int maxSharedMemoryFileCount) throws android.os.RemoteException;
  public void unsubscribe(IVehicleCallback callback, int[] propIds) throws android.os.RemoteException;
  public void returnSharedMemory(IVehicleCallback callback, long sharedMemoryId) throws android.os.RemoteException;
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
