package android.hardware.automotive.vehicle.V2_0;


public final class VehicleApPowerStateReq {
    /**
     * This requests Android to enter its normal operating state.
     * This may be sent after the AP has reported
     * VehicleApPowerStateReport#DEEP_SLEEP_EXIT,
     * VehicleApPowerStateReport#SHUTDOWN_CANCELLED, or
     * VehicleApPowerStateReport#WAIT_FOR_VHAL.
     */
    public static final int ON = 0;
    /**
     * The power controller issues this request to shutdown the system.
     * This may be sent after the AP has reported
     * VehicleApPowerStateReport#DEEP_SLEEP_EXIT,
     * VehicleApPowerStateReport#ON,
     * VehicleApPowerStateReport#SHUTDOWN_CANCELLED,
     * VehicleApPowerStateReport#SHUTDOWN_POSTPONE,
     * VehicleApPowerStateReport#SHUTDOWN_PREPARE, or
     * VehicleApPowerStateReport#WAIT_FOR_VHAL.
     * 
     * int32Values[1] : One of VehicleApPowerStateShutdownParam.
     *                  This parameter indicates if the AP should shut
     *                  down fully or sleep. This parameter also
     *                  indicates if the shutdown should be immediate
     *                  or if it can be postponed. If the shutdown can
     *                  be postponed, AP requests postponing by sending
     *                  VehicleApPowerStateReport#SHUTDOWN_POSTPONE.
     */
    public static final int SHUTDOWN_PREPARE = 1;
    /**
     * Cancel the shutdown.
     * This may be sent after the AP has reported
     * VehicleApPowerStateReport#SHUTDOWN_POSTPONE or
     * VehicleApPowerStateReport#SHUTDOWN_PREPARE.
     * After receiving this request, the AP will report
     * VehicleApPowerStateReport#WAIT_FOR_VHAL in preparation to going ON.
     */
    public static final int CANCEL_SHUTDOWN = 2;
    /**
     * Completes the shutdown process.
     * This may be sent after the AP has reported
     * VehicleApPowerStateReport#DEEP_SLEEP_ENTRY or
     * VehicleApPowerStateReport#SHUTDOWN_START. The AP will not report new
     * state information after receiving this request.
     */
    public static final int FINISHED = 3;
    public static final String toString(int o) {
        if (o == ON) {
            return "ON";
        }
        if (o == SHUTDOWN_PREPARE) {
            return "SHUTDOWN_PREPARE";
        }
        if (o == CANCEL_SHUTDOWN) {
            return "CANCEL_SHUTDOWN";
        }
        if (o == FINISHED) {
            return "FINISHED";
        }
        return "0x" + Integer.toHexString(o);
    }

    public static final String dumpBitfield(int o) {
        java.util.ArrayList<String> list = new java.util.ArrayList<>();
        int flipped = 0;
        list.add("ON"); // ON == 0
        if ((o & SHUTDOWN_PREPARE) == SHUTDOWN_PREPARE) {
            list.add("SHUTDOWN_PREPARE");
            flipped |= SHUTDOWN_PREPARE;
        }
        if ((o & CANCEL_SHUTDOWN) == CANCEL_SHUTDOWN) {
            list.add("CANCEL_SHUTDOWN");
            flipped |= CANCEL_SHUTDOWN;
        }
        if ((o & FINISHED) == FINISHED) {
            list.add("FINISHED");
            flipped |= FINISHED;
        }
        if (o != flipped) {
            list.add("0x" + Integer.toHexString(o & (~flipped)));
        }
        return String.join(" | ", list);
    }

};

