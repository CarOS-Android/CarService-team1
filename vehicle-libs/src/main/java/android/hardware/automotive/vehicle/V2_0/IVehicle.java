package android.hardware.automotive.vehicle.V2_0;

public interface IVehicle extends android.hidl.base.V1_0.IBase {
    /**
     * Fully-qualified interface name for this interface.
     */
    public static final String kInterfaceName = "android.hardware.automotive.vehicle@2.0::IVehicle";

    /**
     * Does a checked conversion from a binder to this class.
     */
    /* package private */ static IVehicle asInterface(android.os.IHwBinder binder) {
        if (binder == null) {
            return null;
        }

        android.os.IHwInterface iface =
                binder.queryLocalInterface(kInterfaceName);

        if ((iface != null) && (iface instanceof IVehicle)) {
            return (IVehicle)iface;
        }

        IVehicle proxy = new Proxy(binder);

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
    public static IVehicle castFrom(android.os.IHwInterface iface) {
        return (iface == null) ? null : IVehicle.asInterface(iface.asBinder());
    }

    @Override
    public android.os.IHwBinder asBinder();

    /**
     * This will invoke the equivalent of the C++ getService(std::string) if retry is
     * true or tryGetService(std::string) if retry is false. If the service is
     * available on the device and retry is true, this will wait for the service to
     * start. Otherwise, it will return immediately even if the service is null.
     */
    public static IVehicle getService(String serviceName, boolean retry) throws android.os.RemoteException {
        return IVehicle.asInterface(android.os.HwBinder.getService("android.hardware.automotive.vehicle@2.0::IVehicle", serviceName, retry));
    }

    /**
     * Calls getService("default",retry).
     */
    public static IVehicle getService(boolean retry) throws android.os.RemoteException {
        return getService("default", retry);
    }

    /**
     * Warning: this will not wait for the interface to come up if it hasn't yet
     * started. See getService(String,boolean) instead.
     */
    public static IVehicle getService(String serviceName) throws android.os.RemoteException {
        return IVehicle.asInterface(android.os.HwBinder.getService("android.hardware.automotive.vehicle@2.0::IVehicle", serviceName));
    }

    /**
     * Warning: this will not wait for the interface to come up if it hasn't yet started. See getService(String,boolean) instead.
     */
    public static IVehicle getService() throws android.os.RemoteException {
        return getService("default");
    }

    /**
     * Returns a list of all property configurations supported by this vehicle
     * HAL.
     */
    java.util.ArrayList<VehiclePropConfig> getAllPropConfigs()
        throws android.os.RemoteException;

    @FunctionalInterface
    public interface getPropConfigsCallback {
        public void onValues(int status, java.util.ArrayList<VehiclePropConfig> propConfigs);
    }

    /**
     * Returns a list of property configurations for given properties.
     *
     * If requested VehicleProperty wasn't found it must return
     * StatusCode::INVALID_ARG, otherwise a list of vehicle property
     * configurations with StatusCode::OK
     */
    void getPropConfigs(java.util.ArrayList<Integer> props, getPropConfigsCallback _hidl_cb)
        throws android.os.RemoteException;

    @FunctionalInterface
    public interface getCallback {
        public void onValues(int status, VehiclePropValue propValue);
    }

    /**
     * Get a vehicle property value.
     *
     * For VehiclePropertyChangeMode::STATIC properties, this method must always
     * return the same value always.
     * For VehiclePropertyChangeMode::ON_CHANGE properties, it must return the
     * latest available value.
     *
     * Some properties like RADIO_PRESET requires to pass additional data in
     * GET request in VehiclePropValue object.
     *
     * If there is no data available yet, which can happen during initial stage,
     * this call must return immediately with an error code of
     * StatusCode::TRY_AGAIN.
     */
    void get(VehiclePropValue requestedPropValue, getCallback _hidl_cb)
        throws android.os.RemoteException;
    /**
     * Set a vehicle property value.
     *
     * Timestamp of data must be ignored for set operation.
     *
     * Setting some properties require having initial state available. If initial
     * data is not available yet this call must return StatusCode::TRY_AGAIN.
     * For a property with separate power control this call must return
     * StatusCode::NOT_AVAILABLE error if property is not powered on.
     */
    int set(VehiclePropValue propValue)
        throws android.os.RemoteException;
    /**
     * Subscribes to property events.
     *
     * Clients must be able to subscribe to multiple properties at a time
     * depending on data provided in options argument.
     *
     * @param listener This client must be called on appropriate event.
     * @param options List of options to subscribe. SubscribeOption contains
     *                information such as property Id, area Id, sample rate, etc.
     */
    int subscribe(IVehicleCallback callback, java.util.ArrayList<SubscribeOptions> options)
        throws android.os.RemoteException;
    /**
     * Unsubscribes from property events.
     *
     * If this client wasn't subscribed to the given property, this method
     * must return StatusCode::INVALID_ARG.
     */
    int unsubscribe(IVehicleCallback callback, int propId)
        throws android.os.RemoteException;
    /**
     * Print out debugging state for the vehicle hal.
     *
     * The text must be in ASCII encoding only.
     *
     * Performance requirements:
     *
     * The HAL must return from this call in less than 10ms. This call must avoid
     * deadlocks, as it may be called at any point of operation. Any synchronization
     * primitives used (such as mutex locks or semaphores) must be acquired
     * with a timeout.
     *
     */
    String debugDump()
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

    public static final class Proxy implements IVehicle {
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
            return "[class or subclass of " + IVehicle.kInterfaceName + "]@Proxy";
        }

        @Override
        public final boolean equals(Object other) {
            return android.os.HidlSupport.interfacesEqual(this, other);
        }

        @Override
        public final int hashCode() {
            return this.asBinder().hashCode();
        }

        // Methods from ::android::hardware::automotive::vehicle::V2_0::IVehicle follow.
        @Override
        public java.util.ArrayList<VehiclePropConfig> getAllPropConfigs()
                throws android.os.RemoteException {
            android.os.HwParcel _hidl_request = new android.os.HwParcel();
            _hidl_request.writeInterfaceToken(IVehicle.kInterfaceName);

            android.os.HwParcel _hidl_reply = new android.os.HwParcel();
            try {
                mRemote.transact(1 /* getAllPropConfigs */, _hidl_request, _hidl_reply, 0 /* flags */);
                _hidl_reply.verifySuccess();
                _hidl_request.releaseTemporaryStorage();

                java.util.ArrayList<VehiclePropConfig> _hidl_out_propConfigs = VehiclePropConfig.readVectorFromParcel(_hidl_reply);
                return _hidl_out_propConfigs;
            } finally {
                _hidl_reply.release();
            }
        }

        @Override
        public void getPropConfigs(java.util.ArrayList<Integer> props, getPropConfigsCallback _hidl_cb)
                throws android.os.RemoteException {
            android.os.HwParcel _hidl_request = new android.os.HwParcel();
            _hidl_request.writeInterfaceToken(IVehicle.kInterfaceName);
            _hidl_request.writeInt32Vector(props);

            android.os.HwParcel _hidl_reply = new android.os.HwParcel();
            try {
                mRemote.transact(2 /* getPropConfigs */, _hidl_request, _hidl_reply, 0 /* flags */);
                _hidl_reply.verifySuccess();
                _hidl_request.releaseTemporaryStorage();

                int _hidl_out_status = _hidl_reply.readInt32();
                java.util.ArrayList<VehiclePropConfig> _hidl_out_propConfigs = VehiclePropConfig.readVectorFromParcel(_hidl_reply);
                _hidl_cb.onValues(_hidl_out_status, _hidl_out_propConfigs);
            } finally {
                _hidl_reply.release();
            }
        }

        @Override
        public void get(VehiclePropValue requestedPropValue, getCallback _hidl_cb)
                throws android.os.RemoteException {
            android.os.HwParcel _hidl_request = new android.os.HwParcel();
            _hidl_request.writeInterfaceToken(IVehicle.kInterfaceName);
            ((VehiclePropValue) requestedPropValue).writeToParcel(_hidl_request);

            android.os.HwParcel _hidl_reply = new android.os.HwParcel();
            try {
                mRemote.transact(3 /* get */, _hidl_request, _hidl_reply, 0 /* flags */);
                _hidl_reply.verifySuccess();
                _hidl_request.releaseTemporaryStorage();

                int _hidl_out_status = _hidl_reply.readInt32();
                VehiclePropValue _hidl_out_propValue = new VehiclePropValue();
                ((VehiclePropValue) _hidl_out_propValue).readFromParcel(_hidl_reply);
                _hidl_cb.onValues(_hidl_out_status, _hidl_out_propValue);
            } finally {
                _hidl_reply.release();
            }
        }

        @Override
        public int set(VehiclePropValue propValue)
                throws android.os.RemoteException {
            android.os.HwParcel _hidl_request = new android.os.HwParcel();
            _hidl_request.writeInterfaceToken(IVehicle.kInterfaceName);
            ((VehiclePropValue) propValue).writeToParcel(_hidl_request);

            android.os.HwParcel _hidl_reply = new android.os.HwParcel();
            try {
                mRemote.transact(4 /* set */, _hidl_request, _hidl_reply, 0 /* flags */);
                _hidl_reply.verifySuccess();
                _hidl_request.releaseTemporaryStorage();

                int _hidl_out_status = _hidl_reply.readInt32();
                return _hidl_out_status;
            } finally {
                _hidl_reply.release();
            }
        }

        @Override
        public int subscribe(IVehicleCallback callback, java.util.ArrayList<SubscribeOptions> options)
                throws android.os.RemoteException {
            android.os.HwParcel _hidl_request = new android.os.HwParcel();
            _hidl_request.writeInterfaceToken(IVehicle.kInterfaceName);
            _hidl_request.writeStrongBinder(callback == null ? null : callback.asBinder());
            SubscribeOptions.writeVectorToParcel(_hidl_request, options);

            android.os.HwParcel _hidl_reply = new android.os.HwParcel();
            try {
                mRemote.transact(5 /* subscribe */, _hidl_request, _hidl_reply, 0 /* flags */);
                _hidl_reply.verifySuccess();
                _hidl_request.releaseTemporaryStorage();

                int _hidl_out_status = _hidl_reply.readInt32();
                return _hidl_out_status;
            } finally {
                _hidl_reply.release();
            }
        }

        @Override
        public int unsubscribe(IVehicleCallback callback, int propId)
                throws android.os.RemoteException {
            android.os.HwParcel _hidl_request = new android.os.HwParcel();
            _hidl_request.writeInterfaceToken(IVehicle.kInterfaceName);
            _hidl_request.writeStrongBinder(callback == null ? null : callback.asBinder());
            _hidl_request.writeInt32(propId);

            android.os.HwParcel _hidl_reply = new android.os.HwParcel();
            try {
                mRemote.transact(6 /* unsubscribe */, _hidl_request, _hidl_reply, 0 /* flags */);
                _hidl_reply.verifySuccess();
                _hidl_request.releaseTemporaryStorage();

                int _hidl_out_status = _hidl_reply.readInt32();
                return _hidl_out_status;
            } finally {
                _hidl_reply.release();
            }
        }

        @Override
        public String debugDump()
                throws android.os.RemoteException {
            android.os.HwParcel _hidl_request = new android.os.HwParcel();
            _hidl_request.writeInterfaceToken(IVehicle.kInterfaceName);

            android.os.HwParcel _hidl_reply = new android.os.HwParcel();
            try {
                mRemote.transact(7 /* debugDump */, _hidl_request, _hidl_reply, 0 /* flags */);
                _hidl_reply.verifySuccess();
                _hidl_request.releaseTemporaryStorage();

                String _hidl_out_s = _hidl_reply.readString();
                return _hidl_out_s;
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

    public static abstract class Stub extends android.os.HwBinder implements IVehicle {
        @Override
        public android.os.IHwBinder asBinder() {
            return this;
        }

        @Override
        public final java.util.ArrayList<String> interfaceChain() {
            return new java.util.ArrayList<String>(java.util.Arrays.asList(
                    IVehicle.kInterfaceName,
                    android.hidl.base.V1_0.IBase.kInterfaceName));

        }

        @Override
        public void debug(android.os.NativeHandle fd, java.util.ArrayList<String> options) {
            return;

        }

        @Override
        public final String interfaceDescriptor() {
            return IVehicle.kInterfaceName;

        }

        @Override
        public final java.util.ArrayList<byte[/* 32 */]> getHashChain() {
            return new java.util.ArrayList<byte[/* 32 */]>(java.util.Arrays.asList(
                    new byte[/* 32 */]{-77,-54,-11,36,-60,106,71,-42,126,100,83,-93,68,25,-31,-120,25,66,-48,89,-31,70,-51,-89,64,80,38,112,-23,-89,82,-61} /* b3caf524c46a47d67e6453a34419e1881942d059e146cda740502670e9a752c3 */,
                    new byte[/* 32 */]{-20,127,-41,-98,-48,45,-6,-123,-68,73,-108,38,-83,-82,62,-66,35,-17,5,36,-13,-51,105,87,19,-109,36,-72,59,24,-54,76} /* ec7fd79ed02dfa85bc499426adae3ebe23ef0524f3cd6957139324b83b18ca4c */));

        }

        @Override
        public final void setHALInstrumentation() {

        }

        @Override
        public final boolean linkToDeath(android.os.IHwBinder.DeathRecipient recipient, long cookie) {
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
        public final boolean unlinkToDeath(android.os.IHwBinder.DeathRecipient recipient) {
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
                case 1 /* getAllPropConfigs */:
                {
                    boolean _hidl_is_oneway = (_hidl_flags & 1 /* oneway */) != 0;
                    if (_hidl_is_oneway != false) {
                        _hidl_reply.writeStatus(-2147483648);
                        _hidl_reply.send();
                        break;
                    }_hidl_request.enforceInterface(IVehicle.kInterfaceName);

                    java.util.ArrayList<VehiclePropConfig> _hidl_out_propConfigs = getAllPropConfigs();
                    _hidl_reply.writeStatus(android.os.HwParcel.STATUS_SUCCESS);
                    VehiclePropConfig.writeVectorToParcel(_hidl_reply, _hidl_out_propConfigs);
                    _hidl_reply.send();
                    break;
                }

                case 2 /* getPropConfigs */:
                {
                    boolean _hidl_is_oneway = (_hidl_flags & 1 /* oneway */) != 0;
                    if (_hidl_is_oneway != false) {
                        _hidl_reply.writeStatus(-2147483648);
                        _hidl_reply.send();
                        break;
                    }_hidl_request.enforceInterface(IVehicle.kInterfaceName);

                    java.util.ArrayList<Integer> props = _hidl_request.readInt32Vector();
                    getPropConfigs(props, new getPropConfigsCallback() {
                        @Override
                        public void onValues(int status, java.util.ArrayList<VehiclePropConfig> propConfigs) {
                            _hidl_reply.writeStatus(android.os.HwParcel.STATUS_SUCCESS);
                            _hidl_reply.writeInt32(status);
                            VehiclePropConfig.writeVectorToParcel(_hidl_reply, propConfigs);
                            _hidl_reply.send();
                            }});
                    break;
                }

                case 3 /* get */:
                {
                    boolean _hidl_is_oneway = (_hidl_flags & 1 /* oneway */) != 0;
                    if (_hidl_is_oneway != false) {
                        _hidl_reply.writeStatus(-2147483648);
                        _hidl_reply.send();
                        break;
                    }_hidl_request.enforceInterface(IVehicle.kInterfaceName);

                    VehiclePropValue requestedPropValue = new VehiclePropValue();
                    ((VehiclePropValue) requestedPropValue).readFromParcel(_hidl_request);
                    get(requestedPropValue, new getCallback() {
                        @Override
                        public void onValues(int status, VehiclePropValue propValue) {
                            _hidl_reply.writeStatus(android.os.HwParcel.STATUS_SUCCESS);
                            _hidl_reply.writeInt32(status);
                            ((VehiclePropValue) propValue).writeToParcel(_hidl_reply);
                            _hidl_reply.send();
                            }});
                    break;
                }

                case 4 /* set */:
                {
                    boolean _hidl_is_oneway = (_hidl_flags & 1 /* oneway */) != 0;
                    if (_hidl_is_oneway != false) {
                        _hidl_reply.writeStatus(-2147483648);
                        _hidl_reply.send();
                        break;
                    }_hidl_request.enforceInterface(IVehicle.kInterfaceName);

                    VehiclePropValue propValue = new VehiclePropValue();
                    ((VehiclePropValue) propValue).readFromParcel(_hidl_request);
                    int _hidl_out_status = set(propValue);
                    _hidl_reply.writeStatus(android.os.HwParcel.STATUS_SUCCESS);
                    _hidl_reply.writeInt32(_hidl_out_status);
                    _hidl_reply.send();
                    break;
                }

                case 5 /* subscribe */:
                {
                    boolean _hidl_is_oneway = (_hidl_flags & 1 /* oneway */) != 0;
                    if (_hidl_is_oneway != false) {
                        _hidl_reply.writeStatus(-2147483648);
                        _hidl_reply.send();
                        break;
                    }_hidl_request.enforceInterface(IVehicle.kInterfaceName);

                    IVehicleCallback callback = IVehicleCallback.asInterface(_hidl_request.readStrongBinder());
                    java.util.ArrayList<SubscribeOptions> options = SubscribeOptions.readVectorFromParcel(_hidl_request);
                    int _hidl_out_status = subscribe(callback, options);
                    _hidl_reply.writeStatus(android.os.HwParcel.STATUS_SUCCESS);
                    _hidl_reply.writeInt32(_hidl_out_status);
                    _hidl_reply.send();
                    break;
                }

                case 6 /* unsubscribe */:
                {
                    boolean _hidl_is_oneway = (_hidl_flags & 1 /* oneway */) != 0;
                    if (_hidl_is_oneway != false) {
                        _hidl_reply.writeStatus(-2147483648);
                        _hidl_reply.send();
                        break;
                    }_hidl_request.enforceInterface(IVehicle.kInterfaceName);

                    IVehicleCallback callback = IVehicleCallback.asInterface(_hidl_request.readStrongBinder());
                    int propId = _hidl_request.readInt32();
                    int _hidl_out_status = unsubscribe(callback, propId);
                    _hidl_reply.writeStatus(android.os.HwParcel.STATUS_SUCCESS);
                    _hidl_reply.writeInt32(_hidl_out_status);
                    _hidl_reply.send();
                    break;
                }

                case 7 /* debugDump */:
                {
                    boolean _hidl_is_oneway = (_hidl_flags & 1 /* oneway */) != 0;
                    if (_hidl_is_oneway != false) {
                        _hidl_reply.writeStatus(-2147483648);
                        _hidl_reply.send();
                        break;
                    }_hidl_request.enforceInterface(IVehicle.kInterfaceName);

                    String _hidl_out_s = debugDump();
                    _hidl_reply.writeStatus(android.os.HwParcel.STATUS_SUCCESS);
                    _hidl_reply.writeString(_hidl_out_s);
                    _hidl_reply.send();
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
