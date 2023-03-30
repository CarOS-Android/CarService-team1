package android.hardware.automotive.vehicle.V2_0;


public final class VehiclePropertyStatus {
    /**
     * Property is available and behaving normally
     */
    public static final int AVAILABLE = 0 /* 0x00 */;
    /**
     * A property in this state is not available for reading and writing.  This
     * is a transient state that depends on the availability of the underlying
     * implementation (e.g. hardware or driver). It MUST NOT be used to
     * represent features that this vehicle is always incapable of.  A get() of
     * a property in this state MAY return an undefined value, but MUST
     * correctly describe its status as UNAVAILABLE A set() of a property in
     * this state MAY return NOT_AVAILABLE. The HAL implementation MUST ignore
     * the value of the status field when writing a property value coming from
     * Android.
     */
    public static final int UNAVAILABLE = 1 /* 0x01 */;
    /**
     * There is an error with this property.
     */
    public static final int ERROR = 2 /* 0x02 */;
    public static final String toString(int o) {
        if (o == AVAILABLE) {
            return "AVAILABLE";
        }
        if (o == UNAVAILABLE) {
            return "UNAVAILABLE";
        }
        if (o == ERROR) {
            return "ERROR";
        }
        return "0x" + Integer.toHexString(o);
    }

    public static final String dumpBitfield(int o) {
        java.util.ArrayList<String> list = new java.util.ArrayList<>();
        int flipped = 0;
        list.add("AVAILABLE"); // AVAILABLE == 0
        if ((o & UNAVAILABLE) == UNAVAILABLE) {
            list.add("UNAVAILABLE");
            flipped |= UNAVAILABLE;
        }
        if ((o & ERROR) == ERROR) {
            list.add("ERROR");
            flipped |= ERROR;
        }
        if (o != flipped) {
            list.add("0x" + Integer.toHexString(o & (~flipped)));
        }
        return String.join(" | ", list);
    }

};

