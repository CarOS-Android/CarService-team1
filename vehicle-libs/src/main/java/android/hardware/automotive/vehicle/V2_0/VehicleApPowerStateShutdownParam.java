package android.hardware.automotive.vehicle.V2_0;


public final class VehicleApPowerStateShutdownParam {
    /**
     * AP must shutdown immediately. Postponing is not allowed.
     */
    public static final int SHUTDOWN_IMMEDIATELY = 1;
    /**
     * AP can enter deep sleep instead of shutting down completely.
     */
    public static final int CAN_SLEEP = 2;
    /**
     * AP can only shutdown with postponing allowed.
     */
    public static final int SHUTDOWN_ONLY = 3;
    /**
     * AP may enter deep sleep, but must either sleep or shut down immediately.
     * Postponing is not allowed.
     */
    public static final int SLEEP_IMMEDIATELY = 4;
    public static final String toString(int o) {
        if (o == SHUTDOWN_IMMEDIATELY) {
            return "SHUTDOWN_IMMEDIATELY";
        }
        if (o == CAN_SLEEP) {
            return "CAN_SLEEP";
        }
        if (o == SHUTDOWN_ONLY) {
            return "SHUTDOWN_ONLY";
        }
        if (o == SLEEP_IMMEDIATELY) {
            return "SLEEP_IMMEDIATELY";
        }
        return "0x" + Integer.toHexString(o);
    }

    public static final String dumpBitfield(int o) {
        java.util.ArrayList<String> list = new java.util.ArrayList<>();
        int flipped = 0;
        if ((o & SHUTDOWN_IMMEDIATELY) == SHUTDOWN_IMMEDIATELY) {
            list.add("SHUTDOWN_IMMEDIATELY");
            flipped |= SHUTDOWN_IMMEDIATELY;
        }
        if ((o & CAN_SLEEP) == CAN_SLEEP) {
            list.add("CAN_SLEEP");
            flipped |= CAN_SLEEP;
        }
        if ((o & SHUTDOWN_ONLY) == SHUTDOWN_ONLY) {
            list.add("SHUTDOWN_ONLY");
            flipped |= SHUTDOWN_ONLY;
        }
        if ((o & SLEEP_IMMEDIATELY) == SLEEP_IMMEDIATELY) {
            list.add("SLEEP_IMMEDIATELY");
            flipped |= SLEEP_IMMEDIATELY;
        }
        if (o != flipped) {
            list.add("0x" + Integer.toHexString(o & (~flipped)));
        }
        return String.join(" | ", list);
    }

};

