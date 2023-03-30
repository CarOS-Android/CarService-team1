package android.hardware.automotive.vehicle.V2_0;

public interface IVehicleCallback extends android.hidl.base.V1_0.IBase {
    /**
     * Fully-qualified interface name for this interface.
     */
    public static final String kInterfaceName = "android.hardware.automotive.vehicle@2.0::IVehicleCallback";

    /**
     * Does a checked conversion from a binder to this class.
     */
    /* package private */ static IVehicleCallback asInterface(android.os.IHwBinder binder) {
        if (binder == null) {
            return null;
        }

        android.os.IHwInterface iface =
                binder.queryLocalInterface(kInterfaceName);

        if ((iface != null) && (iface instanceof IVehicleCallback)) {
            return (IVehicleCallback)iface;
        }

        IVehicleCallback proxy = new Proxy(binder);

        try {
            for (String descriptor : proxy.interfaceChain()) {
                if (descriptor.equals(kInterfaceName)) {
                    return proxy;
                }
            }
        } catch (android.os.RemoteException e) {
        }

        return null;
    }

    /**
     * Does a checked conversion from any interface to this class.
     */
    public static IVehicleCallback castFrom(android.os.IHwInterface iface) {
        return (iface == null) ? null : IVehicleCallback.asInterface(iface.asBinder());
    }

    @Override
    public android.os.IHwBinder asBinder();

    /**
     * This will invoke the equivalent of the C++ getService(std::string) if retry is
     * true or tryGetService(std::string) if retry is false. If the service is
     * available on the device and retry is true, this will wait for the service to
     * start. Otherwise, it will return immediately even if the service is null.
     */
    public static IVehicleCallback getService(String serviceName, boolean retry) throws android.os.RemoteException {
        return IVehicleCallback.asInterface(android.os.HwBinder.getService("android.hardware.automotive.vehicle@2.0::IVehicleCallback", serviceName, retry));
    }

    /**
     * Calls getService("default",retry).
     */
    public static IVehicleCallback getService(boolean retry) throws android.os.RemoteException {
        return getService("default", retry);
    }

    /**
     * Warning: this will not wait for the interface to come up if it hasn't yet
     * started. See getService(String,boolean) instead.
     */
    public static IVehicleCallback getService(String serviceName) throws android.os.RemoteException {
        return IVehicleCallback.asInterface(android.os.HwBinder.getService("android.hardware.automotive.vehicle@2.0::IVehicleCallback", serviceName));
    }

    /**
     * Warning: this will not wait for the interface to come up if it hasn't yet started. See getService(String,boolean) instead.
     */
    public static IVehicleCallback getService() throws android.os.RemoteException {
        return getService("default");
    }

    /**
     * Event callback happens whenever a variable that the API user has
     * subscribed to needs to be reported. This may be based purely on
     * threshold and frequency (a regular subscription, see subscribe call's
     * arguments) or when the IVehicle#set method was called and the actual
     * change needs to be reported.
     *
     * These callbacks are chunked.
     *
     * @param values that has been updated.
     */
    void onPropertyEvent(java.util.ArrayList<VehiclePropValue> propValues)
        throws android.os.RemoteException;
    /**
     * This method gets called if the client was subscribed to a property using
     * SubscribeFlags::EVENTS_FROM_ANDROID flag and IVehicle#set(...) method was called.
     *
     * These events must be delivered to subscriber immediately without any
     * batching.
     *
     * @param value Value that was set by a client.
     */
    void onPropertySet(VehiclePropValue propValue)
        throws android.os.RemoteException;
    /**
     * Set property value is usually asynchronous operation. Thus even if
     * client received StatusCode::OK from the IVehicle::set(...) this
     * doesn't guarantee that the value was successfully propagated to the
     * vehicle network. If such rare event occurs this method must be called.
     *
     * @param errorCode - any value from StatusCode enum.
     * @param property - a property where error has happened.
     * @param areaId - bitmask that specifies in which areas the problem has
     *                 occurred, must be 0 for global properties
     */
    void onPropertySetError(int errorCode, int propId, int areaId)
        throws android.os.RemoteException;
    java.util.ArrayList<String> interfaceChain()
        throws android.os.RemoteException;
    void debug(android.os.NativeHandle fd, java.util.ArrayList<String> options)
        throws android.os.RemoteException;
    String interfaceDescriptor()
        throws android.os.RemoteException;
    java.util.ArrayList<byte[/* 32 */]> getHashChain()
        throws android.os.RemoteException;
    void setHALInstrumentation()
        throws android.os.RemoteException;
    boolean linkToDeath(android.os.IHwBinder.DeathRecipient recipient, long cookie)
        throws android.os.RemoteException;
    void ping()
        throws android.os.RemoteException;
    android.hidl.base.V1_0.DebugInfo getDebugInfo()
        throws android.os.RemoteException;
    void notifySyspropsChanged()
        throws android.os.RemoteException;
    boolean unlinkToDeath(android.os.IHwBinder.DeathRecipient recipient)
        throws android.os.RemoteException;

    public static final class Proxy implements IVehicleCallback {
        private android.os.IHwBinder mRemote;

        public Proxy(android.os.IHwBinder remote) {
            mRemote = java.util.Objects.requireNonNull(remote);
        }

        @Override
        public android.os.IHwBinder asBinder() {
            return mRemote;
        }

        @Override
        public String toString() {
            try {
                return this.interfaceDescriptor() + "@Proxy";
            } catch (android.os.RemoteException ex) {
                /* ignored; handled below. */
            }
            return "[class or subclass of " + IVehicleCallback.kInterfaceName + "]@Proxy";
        }

        @Override
        public final boolean equals(Object other) {
            return android.os.HidlSupport.interfacesEqual(this, other);
        }

        @Override
        public final int hashCode() {
            return this.asBinder().hashCode();
        }

        // Methods from ::android::hardware::automotive::vehicle::V2_0::IVehicleCallback follow.
        @Override
        public void onPropertyEvent(java.util.ArrayList<VehiclePropValue> propValues)
                throws android.os.RemoteException {
            android.os.HwParcel _hidl_request = new android.os.HwParcel();
            _hidl_request.writeInterfaceToken(IVehicleCallback.kInterfaceName);
            VehiclePropValue.writeVectorToParcel(_hidl_request, propValues);

            android.os.HwParcel _hidl_reply = new android.os.HwParcel();
            try {
                mRemote.transact(1 /* onPropertyEvent */, _hidl_request, _hidl_reply, 1 /* oneway */);
                _hidl_request.releaseTemporaryStorage();
            } finally {
                _hidl_reply.release();
            }
        }

        @Override
        public void onPropertySet(VehiclePropValue propValue)
                throws android.os.RemoteException {
            android.os.HwParcel _hidl_request = new android.os.HwParcel();
            _hidl_request.writeInterfaceToken(IVehicleCallback.kInterfaceName);
            ((VehiclePropValue) propValue).writeToParcel(_hidl_request);

            android.os.HwParcel _hidl_reply = new android.os.HwParcel();
            try {
                mRemote.transact(2 /* onPropertySet */, _hidl_request, _hidl_reply, 1 /* oneway */);
                _hidl_request.releaseTemporaryStorage();
            } finally {
                _hidl_reply.release();
            }
        }

        @Override
        public void onPropertySetError(int errorCode, int propId, int areaId)
                throws android.os.RemoteException {
            android.os.HwParcel _hidl_request = new android.os.HwParcel();
            _hidl_request.writeInterfaceToken(IVehicleCallback.kInterfaceName);
            _hidl_request.writeInt32(errorCode);
            _hidl_request.writeInt32(propId);
            _hidl_request.writeInt32(areaId);

            android.os.HwParcel _hidl_reply = new android.os.HwParcel();
            try {
                mRemote.transact(3 /* onPropertySetError */, _hidl_request, _hidl_reply, 1 /* oneway */);
                _hidl_request.releaseTemporaryStorage();
            } finally {
                _hidl_reply.release();
            }
        }

        // Methods from ::android::hidl::base::V1_0::IBase follow.
        @Override
        public java.util.ArrayList<String> interfaceChain()
                throws android.os.RemoteException {
            android.os.HwParcel _hidl_request = new android.os.HwParcel();
            _hidl_request.writeInterfaceToken(android.hidl.base.V1_0.IBase.kInterfaceName);

            android.os.HwParcel _hidl_reply = new android.os.HwParcel();
            try {
                mRemote.transact(256067662 /* interfaceChain */, _hidl_request, _hidl_reply, 0 /* flags */);
                _hidl_reply.verifySuccess();
                _hidl_request.releaseTemporaryStorage();

                java.util.ArrayList<String> _hidl_out_descriptors = _hidl_reply.readStringVector();
                return _hidl_out_descriptors;
            } finally {
                _hidl_reply.release();
            }
        }

        @Override
        public void debug(android.os.NativeHandle fd, java.util.ArrayList<String> options)
                throws android.os.RemoteException {
            android.os.HwParcel _hidl_request = new android.os.HwParcel();
            _hidl_request.writeInterfaceToken(android.hidl.base.V1_0.IBase.kInterfaceName);
            _hidl_request.writeNativeHandle(fd);
            _hidl_request.writeStringVector(options);

            android.os.HwParcel _hidl_reply = new android.os.HwParcel();
            try {
                mRemote.transact(256131655 /* debug */, _hidl_request, _hidl_reply, 0 /* flags */);
                _hidl_reply.verifySuccess();
                _hidl_request.releaseTemporaryStorage();
            } finally {
                _hidl_reply.release();
            }
        }

        @Override
        public String interfaceDescriptor()
                throws android.os.RemoteException {
            android.os.HwParcel _hidl_request = new android.os.HwParcel();
            _hidl_request.writeInterfaceToken(android.hidl.base.V1_0.IBase.kInterfaceName);

            android.os.HwParcel _hidl_reply = new android.os.HwParcel();
            try {
                mRemote.transact(256136003 /* interfaceDescriptor */, _hidl_request, _hidl_reply, 0 /* flags */);
                _hidl_reply.verifySuccess();
                _hidl_request.releaseTemporaryStorage();

                String _hidl_out_descriptor = _hidl_reply.readString();
                return _hidl_out_descriptor;
            } finally {
                _hidl_reply.release();
            }
        }

        @Override
        public java.util.ArrayList<byte[/* 32 */]> getHashChain()
                throws android.os.RemoteException {
            android.os.HwParcel _hidl_request = new android.os.HwParcel();
            _hidl_request.writeInterfaceToken(android.hidl.base.V1_0.IBase.kInterfaceName);

            android.os.HwParcel _hidl_reply = new android.os.HwParcel();
            try {
                mRemote.transact(256398152 /* getHashChain */, _hidl_request, _hidl_reply, 0 /* flags */);
                _hidl_reply.verifySuccess();
                _hidl_request.releaseTemporaryStorage();

                java.util.ArrayList<byte[/* 32 */]> _hidl_out_hashchain =  new java.util.ArrayList<byte[/* 32 */]>();
                {
                    android.os.HwBlob _hidl_blob = _hidl_reply.readBuffer(16 /* size */);
                    {
                        int _hidl_vec_size = _hidl_blob.getInt32(0 /* offset */ + 8 /* offsetof(hidl_vec<T>, mSize) */);
                        android.os.HwBlob childBlob = _hidl_reply.readEmbeddedBuffer(
                                _hidl_vec_size * 32,_hidl_blob.handle(),
                                0 /* offset */ + 0 /* offsetof(hidl_vec<T>, mBuffer) */,true /* nullable */);

                        ((java.util.ArrayList<byte[/* 32 */]>) _hidl_out_hashchain).clear();
                        for (int _hidl_index_0 = 0; _hidl_index_0 < _hidl_vec_size; ++_hidl_index_0) {
                            byte[/* 32 */] _hidl_vec_element = new byte[32];
                            {
                                long _hidl_array_offset_1 = _hidl_index_0 * 32;
                                childBlob.copyToInt8Array(_hidl_array_offset_1, (byte[/* 32 */]) _hidl_vec_element, 32 /* size */);
                                _hidl_array_offset_1 += 32 * 1;
                            }
                            ((java.util.ArrayList<byte[/* 32 */]>) _hidl_out_hashchain).add(_hidl_vec_element);
                        }
                    }
                }
                return _hidl_out_hashchain;
            } finally {
                _hidl_reply.release();
            }
        }

        @Override
        public void setHALInstrumentation()
                throws android.os.RemoteException {
            android.os.HwParcel _hidl_request = new android.os.HwParcel();
            _hidl_request.writeInterfaceToken(android.hidl.base.V1_0.IBase.kInterfaceName);

            android.os.HwParcel _hidl_reply = new android.os.HwParcel();
            try {
                mRemote.transact(256462420 /* setHALInstrumentation */, _hidl_request, _hidl_reply, 1 /* oneway */);
                _hidl_request.releaseTemporaryStorage();
            } finally {
                _hidl_reply.release();
            }
        }

        @Override
        public boolean linkToDeath(android.os.IHwBinder.DeathRecipient recipient, long cookie)
                throws android.os.RemoteException {
            return mRemote.linkToDeath(recipient, cookie);
        }
        @Override
        public void ping()
                throws android.os.RemoteException {
            android.os.HwParcel _hidl_request = new android.os.HwParcel();
            _hidl_request.writeInterfaceToken(android.hidl.base.V1_0.IBase.kInterfaceName);

            android.os.HwParcel _hidl_reply = new android.os.HwParcel();
            try {
                mRemote.transact(256921159 /* ping */, _hidl_request, _hidl_reply, 0 /* flags */);
                _hidl_reply.verifySuccess();
                _hidl_request.releaseTemporaryStorage();
            } finally {
                _hidl_reply.release();
            }
        }

        @Override
        public android.hidl.base.V1_0.DebugInfo getDebugInfo()
                throws android.os.RemoteException {
            android.os.HwParcel _hidl_request = new android.os.HwParcel();
            _hidl_request.writeInterfaceToken(android.hidl.base.V1_0.IBase.kInterfaceName);

            android.os.HwParcel _hidl_reply = new android.os.HwParcel();
            try {
                mRemote.transact(257049926 /* getDebugInfo */, _hidl_request, _hidl_reply, 0 /* flags */);
                _hidl_reply.verifySuccess();
                _hidl_request.releaseTemporaryStorage();

                android.hidl.base.V1_0.DebugInfo _hidl_out_info = new android.hidl.base.V1_0.DebugInfo();
                ((android.hidl.base.V1_0.DebugInfo) _hidl_out_info).readFromParcel(_hidl_reply);
                return _hidl_out_info;
            } finally {
                _hidl_reply.release();
            }
        }

        @Override
        public void notifySyspropsChanged()
                throws android.os.RemoteException {
            android.os.HwParcel _hidl_request = new android.os.HwParcel();
            _hidl_request.writeInterfaceToken(android.hidl.base.V1_0.IBase.kInterfaceName);

            android.os.HwParcel _hidl_reply = new android.os.HwParcel();
            try {
                mRemote.transact(257120595 /* notifySyspropsChanged */, _hidl_request, _hidl_reply, 1 /* oneway */);
                _hidl_request.releaseTemporaryStorage();
            } finally {
                _hidl_reply.release();
            }
        }

        @Override
        public boolean unlinkToDeath(android.os.IHwBinder.DeathRecipient recipient)
                throws android.os.RemoteException {
            return mRemote.unlinkToDeath(recipient);
        }
    }

    public static abstract class Stub extends android.os.HwBinder implements IVehicleCallback {
        @Override
        public android.os.IHwBinder asBinder() {
            return this;
        }

        @Override
        public final java.util.ArrayList<String> interfaceChain() {
            return new java.util.ArrayList<String>(java.util.Arrays.asList(
                    IVehicleCallback.kInterfaceName,
                    android.hidl.base.V1_0.IBase.kInterfaceName));

        }

        @Override
        public void debug(android.os.NativeHandle fd, java.util.ArrayList<String> options) {
            return;

        }

        @Override
        public final String interfaceDescriptor() {
            return IVehicleCallback.kInterfaceName;

        }

        @Override
        public final java.util.ArrayList<byte[/* 32 */]> getHashChain() {
            return new java.util.ArrayList<byte[/* 32 */]>(java.util.Arrays.asList(
                    new byte[/* 32 */]{124,-24,114,-117,39,96,14,-124,12,-84,-16,-88,50,-10,-108,40,25,-2,83,95,-99,55,-105,-82,5,45,94,-17,80,101,-110,28} /* 7ce8728b27600e840cacf0a832f6942819fe535f9d3797ae052d5eef5065921c */,
                    new byte[/* 32 */]{-20,127,-41,-98,-48,45,-6,-123,-68,73,-108,38,-83,-82,62,-66,35,-17,5,36,-13,-51,105,87,19,-109,36,-72,59,24,-54,76} /* ec7fd79ed02dfa85bc499426adae3ebe23ef0524f3cd6957139324b83b18ca4c */));

        }

        @Override
        public final void setHALInstrumentation() {

        }

        @Override
        public final boolean linkToDeath(DeathRecipient recipient, long cookie) {
            return true;

        }

        @Override
        public final void ping() {
            return;

        }

        @Override
        public final android.hidl.base.V1_0.DebugInfo getDebugInfo() {
            android.hidl.base.V1_0.DebugInfo info = new android.hidl.base.V1_0.DebugInfo();
            info.pid = android.os.HidlSupport.getPidIfSharable();
            info.ptr = 0;
            info.arch = android.hidl.base.V1_0.DebugInfo.Architecture.UNKNOWN;
            return info;

        }

        @Override
        public final void notifySyspropsChanged() {
            android.os.HwBinder.enableInstrumentation();

        }

        @Override
        public final boolean unlinkToDeath(DeathRecipient recipient) {
            return true;

        }

        @Override
        public android.os.IHwInterface queryLocalInterface(String descriptor) {
            if (kInterfaceName.equals(descriptor)) {
                return this;
            }
            return null;
        }

        public void registerAsService(String serviceName) throws android.os.RemoteException {
            registerService(serviceName);
        }

        @Override
        public String toString() {
            return this.interfaceDescriptor() + "@Stub";
        }

        @Override
        public void onTransact(int _hidl_code, android.os.HwParcel _hidl_request, final android.os.HwParcel _hidl_reply, int _hidl_flags)
                throws android.os.RemoteException {
            switch (_hidl_code) {
                case 1 /* onPropertyEvent */:
                {
                    boolean _hidl_is_oneway = (_hidl_flags & 1 /* oneway */) != 0;
                    if (_hidl_is_oneway != true) {
                        _hidl_reply.writeStatus(-2147483648);
                        _hidl_reply.send();
                        break;
                    }_hidl_request.enforceInterface(IVehicleCallback.kInterfaceName);

                    java.util.ArrayList<VehiclePropValue> propValues = VehiclePropValue.readVectorFromParcel(_hidl_request);
                    onPropertyEvent(propValues);
                    break;
                }

                case 2 /* onPropertySet */:
                {
                    boolean _hidl_is_oneway = (_hidl_flags & 1 /* oneway */) != 0;
                    if (_hidl_is_oneway != true) {
                        _hidl_reply.writeStatus(-2147483648);
                        _hidl_reply.send();
                        break;
                    }_hidl_request.enforceInterface(IVehicleCallback.kInterfaceName);

                    VehiclePropValue propValue = new VehiclePropValue();
                    ((VehiclePropValue) propValue).readFromParcel(_hidl_request);
                    onPropertySet(propValue);
                    break;
                }

                case 3 /* onPropertySetError */:
                {
                    boolean _hidl_is_oneway = (_hidl_flags & 1 /* oneway */) != 0;
                    if (_hidl_is_oneway != true) {
                        _hidl_reply.writeStatus(-2147483648);
                        _hidl_reply.send();
                        break;
                    }_hidl_request.enforceInterface(IVehicleCallback.kInterfaceName);

                    int errorCode = _hidl_request.readInt32();
                    int propId = _hidl_request.readInt32();
                    int areaId = _hidl_request.readInt32();
                    onPropertySetError(errorCode, propId, areaId);
                    break;
                }

                case 256067662 /* interfaceChain */:
                {
                    boolean _hidl_is_oneway = (_hidl_flags & 1 /* oneway */) != 0;
                    if (_hidl_is_oneway != false) {
                        _hidl_reply.writeStatus(-2147483648);
                        _hidl_reply.send();
                        break;
                    }_hidl_request.enforceInterface(android.hidl.base.V1_0.IBase.kInterfaceName);

                    java.util.ArrayList<String> _hidl_out_descriptors = interfaceChain();
                    _hidl_reply.writeStatus(android.os.HwParcel.STATUS_SUCCESS);
                    _hidl_reply.writeStringVector(_hidl_out_descriptors);
                    _hidl_reply.send();
                    break;
                }

                case 256131655 /* debug */:
                {
                    boolean _hidl_is_oneway = (_hidl_flags & 1 /* oneway */) != 0;
                    if (_hidl_is_oneway != false) {
                        _hidl_reply.writeStatus(-2147483648);
                        _hidl_reply.send();
                        break;
                    }_hidl_request.enforceInterface(android.hidl.base.V1_0.IBase.kInterfaceName);

                    android.os.NativeHandle fd = _hidl_request.readNativeHandle();
                    java.util.ArrayList<String> options = _hidl_request.readStringVector();
                    debug(fd, options);
                    _hidl_reply.writeStatus(android.os.HwParcel.STATUS_SUCCESS);
                    _hidl_reply.send();
                    break;
                }

                case 256136003 /* interfaceDescriptor */:
                {
                    boolean _hidl_is_oneway = (_hidl_flags & 1 /* oneway */) != 0;
                    if (_hidl_is_oneway != false) {
                        _hidl_reply.writeStatus(-2147483648);
                        _hidl_reply.send();
                        break;
                    }_hidl_request.enforceInterface(android.hidl.base.V1_0.IBase.kInterfaceName);

                    String _hidl_out_descriptor = interfaceDescriptor();
                    _hidl_reply.writeStatus(android.os.HwParcel.STATUS_SUCCESS);
                    _hidl_reply.writeString(_hidl_out_descriptor);
                    _hidl_reply.send();
                    break;
                }

                case 256398152 /* getHashChain */:
                {
                    boolean _hidl_is_oneway = (_hidl_flags & 1 /* oneway */) != 0;
                    if (_hidl_is_oneway != false) {
                        _hidl_reply.writeStatus(-2147483648);
                        _hidl_reply.send();
                        break;
                    }_hidl_request.enforceInterface(android.hidl.base.V1_0.IBase.kInterfaceName);

                    java.util.ArrayList<byte[/* 32 */]> _hidl_out_hashchain = getHashChain();
                    _hidl_reply.writeStatus(android.os.HwParcel.STATUS_SUCCESS);
                    {
                        android.os.HwBlob _hidl_blob = new android.os.HwBlob(16 /* size */);
                        {
                            int _hidl_vec_size = _hidl_out_hashchain.size();
                            _hidl_blob.putInt32(0 /* offset */ + 8 /* offsetof(hidl_vec<T>, mSize) */, _hidl_vec_size);
                            _hidl_blob.putBool(0 /* offset */ + 12 /* offsetof(hidl_vec<T>, mOwnsBuffer) */, false);
                            android.os.HwBlob childBlob = new android.os.HwBlob((int)(_hidl_vec_size * 32));
                            for (int _hidl_index_0 = 0; _hidl_index_0 < _hidl_vec_size; ++_hidl_index_0) {
                                {
                                    long _hidl_array_offset_1 = _hidl_index_0 * 32;
                                    byte[] _hidl_array_item_1 = (byte[/* 32 */]) _hidl_out_hashchain.get(_hidl_index_0);

                                    if (_hidl_array_item_1 == null || _hidl_array_item_1.length != 32) {
                                        throw new IllegalArgumentException("Array element is not of the expected length");
                                    }

                                    childBlob.putInt8Array(_hidl_array_offset_1, _hidl_array_item_1);
                                    _hidl_array_offset_1 += 32 * 1;
                                }
                            }
                            _hidl_blob.putBlob(0 /* offset */ + 0 /* offsetof(hidl_vec<T>, mBuffer) */, childBlob);
                        }
                        _hidl_reply.writeBuffer(_hidl_blob);
                    }
                    _hidl_reply.send();
                    break;
                }

                case 256462420 /* setHALInstrumentation */:
                {
                    boolean _hidl_is_oneway = (_hidl_flags & 1 /* oneway */) != 0;
                    if (_hidl_is_oneway != true) {
                        _hidl_reply.writeStatus(-2147483648);
                        _hidl_reply.send();
                        break;
                    }_hidl_request.enforceInterface(android.hidl.base.V1_0.IBase.kInterfaceName);

                    setHALInstrumentation();
                    break;
                }

                case 256660548 /* linkToDeath */:
                {
                    boolean _hidl_is_oneway = (_hidl_flags & 1 /* oneway */) != 0;
                    if (_hidl_is_oneway != false) {
                        _hidl_reply.writeStatus(-2147483648);
                        _hidl_reply.send();
                        break;
                    }break;
                }

                case 256921159 /* ping */:
                {
                    boolean _hidl_is_oneway = (_hidl_flags & 1 /* oneway */) != 0;
                    if (_hidl_is_oneway != false) {
                        _hidl_reply.writeStatus(-2147483648);
                        _hidl_reply.send();
                        break;
                    }_hidl_request.enforceInterface(android.hidl.base.V1_0.IBase.kInterfaceName);

                    ping();
                    _hidl_reply.writeStatus(android.os.HwParcel.STATUS_SUCCESS);
                    _hidl_reply.send();
                    break;
                }

                case 257049926 /* getDebugInfo */:
                {
                    boolean _hidl_is_oneway = (_hidl_flags & 1 /* oneway */) != 0;
                    if (_hidl_is_oneway != false) {
                        _hidl_reply.writeStatus(-2147483648);
                        _hidl_reply.send();
                        break;
                    }_hidl_request.enforceInterface(android.hidl.base.V1_0.IBase.kInterfaceName);

                    android.hidl.base.V1_0.DebugInfo _hidl_out_info = getDebugInfo();
                    _hidl_reply.writeStatus(android.os.HwParcel.STATUS_SUCCESS);
                    ((android.hidl.base.V1_0.DebugInfo) _hidl_out_info).writeToParcel(_hidl_reply);
                    _hidl_reply.send();
                    break;
                }

                case 257120595 /* notifySyspropsChanged */:
                {
                    boolean _hidl_is_oneway = (_hidl_flags & 1 /* oneway */) != 0;
                    if (_hidl_is_oneway != true) {
                        _hidl_reply.writeStatus(-2147483648);
                        _hidl_reply.send();
                        break;
                    }_hidl_request.enforceInterface(android.hidl.base.V1_0.IBase.kInterfaceName);

                    notifySyspropsChanged();
                    break;
                }

                case 257250372 /* unlinkToDeath */:
                {
                    boolean _hidl_is_oneway = (_hidl_flags & 1 /* oneway */) != 0;
                    if (_hidl_is_oneway != false) {
                        _hidl_reply.writeStatus(-2147483648);
                        _hidl_reply.send();
                        break;
                    }break;
                }

            }
        }
    }
}
