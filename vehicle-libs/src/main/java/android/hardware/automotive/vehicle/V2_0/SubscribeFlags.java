package android.hardware.automotive.vehicle.V2_0;


public final class SubscribeFlags {
    public static final int UNDEFINED = 0 /* 0x0 */;
    /**
     * Subscribe to event that was originated in vehicle HAL
     * (most likely this event came from the vehicle itself).
     */
    public static final int EVENTS_FROM_CAR = 1 /* 0x1 */;
    /**
     * Use this flag to subscribe on events when IVehicle#set(...) was called by
     * vehicle HAL's client (e.g. Car Service).
     */
    public static final int EVENTS_FROM_ANDROID = 2 /* 0x2 */;
    public static final String toString(int o) {
        if (o == UNDEFINED) {
            return "UNDEFINED";
        }
        if (o == EVENTS_FROM_CAR) {
            return "EVENTS_FROM_CAR";
        }
        if (o == EVENTS_FROM_ANDROID) {
            return "EVENTS_FROM_ANDROID";
        }
        return "0x" + Integer.toHexString(o);
    }

    public static final String dumpBitfield(int o) {
        java.util.ArrayList<String> list = new java.util.ArrayList<>();
        int flipped = 0;
        list.add("UNDEFINED"); // UNDEFINED == 0
        if ((o & EVENTS_FROM_CAR) == EVENTS_FROM_CAR) {
            list.add("EVENTS_FROM_CAR");
            flipped |= EVENTS_FROM_CAR;
        }
        if ((o & EVENTS_FROM_ANDROID) == EVENTS_FROM_ANDROID) {
            list.add("EVENTS_FROM_ANDROID");
            flipped |= EVENTS_FROM_ANDROID;
        }
        if (o != flipped) {
            list.add("0x" + Integer.toHexString(o & (~flipped)));
        }
        return String.join(" | ", list);
    }

};

