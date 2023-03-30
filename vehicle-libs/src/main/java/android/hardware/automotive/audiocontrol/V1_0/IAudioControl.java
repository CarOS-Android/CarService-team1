package android.hardware.automotive.audiocontrol.V1_0;

/**
 * Interacts with the car's audio subsystem to manage audio sources and volumes
 */
public interface IAudioControl extends android.hidl.base.V1_0.IBase {
    /**
     * Fully-qualified interface name for this interface.
     */
    public static final String kInterfaceName = "android.hardware.automotive.audiocontrol@1.0::IAudioControl";

    /**
     * Does a checked conversion from a binder to this class.
     */
    /* package private */ static IAudioControl asInterface(android.os.IHwBinder binder) {
        if (binder == null) {
            return null;
        }

        android.os.IHwInterface iface =
                binder.queryLocalInterface(kInterfaceName);

        if ((iface != null) && (iface instanceof IAudioControl)) {
            return (IAudioControl)iface;
        }

        IAudioControl proxy = new Proxy(binder);

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
    public static IAudioControl castFrom(android.os.IHwInterface iface) {
        return (iface == null) ? null : IAudioControl.asInterface(iface.asBinder());
    }

    @Override
    public android.os.IHwBinder asBinder();

    /**
     * This will invoke the equivalent of the C++ getService(std::string) if retry is
     * true or tryGetService(std::string) if retry is false. If the service is
     * available on the device and retry is true, this will wait for the service to
     * start. Otherwise, it will return immediately even if the service is null.
     */
    public static IAudioControl getService(String serviceName, boolean retry) throws android.os.RemoteException {
        return IAudioControl.asInterface(android.os.HwBinder.getService("android.hardware.automotive.audiocontrol@1.0::IAudioControl", serviceName, retry));
    }

    /**
     * Calls getService("default",retry).
     */
    public static IAudioControl getService(boolean retry) throws android.os.RemoteException {
        return getService("default", retry);
    }

    /**
     * Warning: this will not wait for the interface to come up if it hasn't yet
     * started. See getService(String,boolean) instead.
     */
    public static IAudioControl getService(String serviceName) throws android.os.RemoteException {
        return IAudioControl.asInterface(android.os.HwBinder.getService("android.hardware.automotive.audiocontrol@1.0::IAudioControl", serviceName));
    }

    /**
     * Warning: this will not wait for the interface to come up if it hasn't yet started. See getService(String,boolean) instead.
     */
    public static IAudioControl getService() throws android.os.RemoteException {
        return getService("default");
    }

    /**
     * Called at startup once per context to get the mapping from ContextNumber to
     * busAddress. This lets the car tell the framework to which physical output stream
     * each context should be routed.
     *
     * For every context, a valid bus number (0 - num busses-1) must be returned. If an
     * unrecognized contextNumber is encountered, then -1 shall be returned.
     *
     * Deprecated: usage of this API and car_volume_groups.xml has been replaced with
     * car_audio_configuration.xml. If using car_audio_configuration.xml, then the framework
     * will not call this method. If it doesn't, then it will load car_volume_groups.xml and
     * call this method.
     */
    int getBusForContext(int contextNumber)
        throws android.os.RemoteException;
    /**
     * Control the right/left balance setting of the car speakers.
     *
     * This is intended to shift the speaker volume toward the right (+) or left (-) side of
     * the car. 0.0 means "centered". +1.0 means fully right. -1.0 means fully left.
     *
     * A value outside the range -1 to 1 must be clamped by the implementation to the -1 to 1
     * range.
     */
    void setBalanceTowardRight(float value)
        throws android.os.RemoteException;
    /**
     * Control the fore/aft fade setting of the car speakers.
     *
     * This is intended to shift the speaker volume toward the front (+) or back (-) of the car.
     * 0.0 means "centered". +1.0 means fully forward. -1.0 means fully rearward.
     *
     * A value outside the range -1 to 1 must be clamped by the implementation to the -1 to 1
     * range.
     */
    void setFadeTowardFront(float value)
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

    public static final class Proxy implements IAudioControl {
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
            return "[class or subclass of " + IAudioControl.kInterfaceName + "]@Proxy";
        }

        @Override
        public final boolean equals(Object other) {
            return android.os.HidlSupport.interfacesEqual(this, other);
        }

        @Override
        public final int hashCode() {
            return this.asBinder().hashCode();
        }

        // Methods from ::android::hardware::automotive::audiocontrol::V1_0::IAudioControl follow.
        @Override
        public int getBusForContext(int contextNumber)
                throws android.os.RemoteException {
            android.os.HwParcel _hidl_request = new android.os.HwParcel();
            _hidl_request.writeInterfaceToken(IAudioControl.kInterfaceName);
            _hidl_request.writeInt32(contextNumber);

            android.os.HwParcel _hidl_reply = new android.os.HwParcel();
            try {
                mRemote.transact(1 /* getBusForContext */, _hidl_request, _hidl_reply, 0 /* flags */);
                _hidl_reply.verifySuccess();
                _hidl_request.releaseTemporaryStorage();

                int _hidl_out_busNumber = _hidl_reply.readInt32();
                return _hidl_out_busNumber;
            } finally {
                _hidl_reply.release();
            }
        }

        @Override
        public void setBalanceTowardRight(float value)
                throws android.os.RemoteException {
            android.os.HwParcel _hidl_request = new android.os.HwParcel();
            _hidl_request.writeInterfaceToken(IAudioControl.kInterfaceName);
            _hidl_request.writeFloat(value);

            android.os.HwParcel _hidl_reply = new android.os.HwParcel();
            try {
                mRemote.transact(2 /* setBalanceTowardRight */, _hidl_request, _hidl_reply, 1 /* oneway */);
                _hidl_request.releaseTemporaryStorage();
            } finally {
                _hidl_reply.release();
            }
        }

        @Override
        public void setFadeTowardFront(float value)
                throws android.os.RemoteException {
            android.os.HwParcel _hidl_request = new android.os.HwParcel();
            _hidl_request.writeInterfaceToken(IAudioControl.kInterfaceName);
            _hidl_request.writeFloat(value);

            android.os.HwParcel _hidl_reply = new android.os.HwParcel();
            try {
                mRemote.transact(3 /* setFadeTowardFront */, _hidl_request, _hidl_reply, 1 /* oneway */);
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

    public static abstract class Stub extends android.os.HwBinder implements IAudioControl {
        @Override
        public android.os.IHwBinder asBinder() {
            return this;
        }

        @Override
        public final java.util.ArrayList<String> interfaceChain() {
            return new java.util.ArrayList<String>(java.util.Arrays.asList(
                    IAudioControl.kInterfaceName,
                    android.hidl.base.V1_0.IBase.kInterfaceName));

        }

        @Override
        public void debug(android.os.NativeHandle fd, java.util.ArrayList<String> options) {
            return;

        }

        @Override
        public final String interfaceDescriptor() {
            return IAudioControl.kInterfaceName;

        }

        @Override
        public final java.util.ArrayList<byte[/* 32 */]> getHashChain() {
            return new java.util.ArrayList<byte[/* 32 */]>(java.util.Arrays.asList(
                    new byte[/* 32 */]{-61,-20,24,44,-29,37,-122,43,125,121,-27,38,-13,-31,112,-64,44,-2,-31,73,126,-45,9,-41,-58,13,13,-28,-54,99,107,11} /* c3ec182ce325862b7d79e526f3e170c02cfee1497ed309d7c60d0de4ca636b0b */,
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
                case 1 /* getBusForContext */:
                {
                    boolean _hidl_is_oneway = (_hidl_flags & 1 /* oneway */) != 0;
                    if (_hidl_is_oneway != false) {
                        _hidl_reply.writeStatus(-2147483648);
                        _hidl_reply.send();
                        break;
                    }_hidl_request.enforceInterface(IAudioControl.kInterfaceName);

                    int contextNumber = _hidl_request.readInt32();
                    int _hidl_out_busNumber = getBusForContext(contextNumber);
                    _hidl_reply.writeStatus(android.os.HwParcel.STATUS_SUCCESS);
                    _hidl_reply.writeInt32(_hidl_out_busNumber);
                    _hidl_reply.send();
                    break;
                }

                case 2 /* setBalanceTowardRight */:
                {
                    boolean _hidl_is_oneway = (_hidl_flags & 1 /* oneway */) != 0;
                    if (_hidl_is_oneway != true) {
                        _hidl_reply.writeStatus(-2147483648);
                        _hidl_reply.send();
                        break;
                    }_hidl_request.enforceInterface(IAudioControl.kInterfaceName);

                    float value = _hidl_request.readFloat();
                    setBalanceTowardRight(value);
                    break;
                }

                case 3 /* setFadeTowardFront */:
                {
                    boolean _hidl_is_oneway = (_hidl_flags & 1 /* oneway */) != 0;
                    if (_hidl_is_oneway != true) {
                        _hidl_reply.writeStatus(-2147483648);
                        _hidl_reply.send();
                        break;
                    }_hidl_request.enforceInterface(IAudioControl.kInterfaceName);

                    float value = _hidl_request.readFloat();
                    setFadeTowardFront(value);
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
