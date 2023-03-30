package android.hardware.automotive.vehicle.V2_0;


public final class VehiclePropertyChangeMode {
    /**
     * Property of this type must never be changed. Subscription is not supported
     * for these properties.
     */
    public static final int STATIC = 0 /* 0x00 */;
    /**
     * Properties of this type must report when there is a change.
     * IVehicle#get call must return the current value.
     * Set operation for this property is assumed to be asynchronous. When the
     * property is read (using IVehicle#get) after IVehicle#set, it may still
     * return old value until underlying H/W backing this property has actually
     * changed the state. Once state is changed, the property must dispatch
     * changed value as event.
     */
    public static final int ON_CHANGE = 1 /* 0x01 */;
    /**
     * Properties of this type change continuously and require a fixed rate of
     * sampling to retrieve the data.  Implementers may choose to send extra
     * notifications on significant value changes.
     */
    public static final int CONTINUOUS = 2 /* 0x02 */;
    public static final String toString(int o) {
        if (o == STATIC) {
            return "STATIC";
        }
        if (o == ON_CHANGE) {
            return "ON_CHANGE";
        }
        if (o == CONTINUOUS) {
            return "CONTINUOUS";
        }
        return "0x" + Integer.toHexString(o);
    }

    public static final String dumpBitfield(int o) {
        java.util.ArrayList<String> list = new java.util.ArrayList<>();
        int flipped = 0;
        list.add("STATIC"); // STATIC == 0
        if ((o & ON_CHANGE) == ON_CHANGE) {
            list.add("ON_CHANGE");
            flipped |= ON_CHANGE;
        }
        if ((o & CONTINUOUS) == CONTINUOUS) {
            list.add("CONTINUOUS");
            flipped |= CONTINUOUS;
        }
        if (o != flipped) {
            list.add("0x" + Integer.toHexString(o & (~flipped)));
        }
        return String.join(" | ", list);
    }

};

