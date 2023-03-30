package android.hardware.automotive.vehicle.V2_0;


public final class VehicleApPowerStateReport {
    /**
     * The device has booted. CarService has initialized and is ready to accept commands
     * from VHAL. The user is not logged in, and vendor apps and services are expected to
     * control the display and audio.
     * After reporting this state, AP will accept VehicleApPowerStateReq#ON or
     * VehicleApPowerStateReq#SHUTDOWN_PREPARE. Other power state requests are ignored.
     */
    public static final int WAIT_FOR_VHAL = 1 /* 0x1 */;
    /**
     * AP is ready to suspend.
     * The AP will not send any more state reports after this.
     * After reporting this state, AP will accept VehicleApPowerStateReq#FINISHED.
     * Other power state requests are ignored.
     * 
     * int32Values[1]: Time to turn AP back on, in seconds. Power controller should turn on
     *                 AP after the specified time has elapsed, so AP can run tasks like
     *                 update. If this value is 0, no wake up is requested. The power
     *                 controller may not necessarily support timed wake-up.
     */
    public static final int DEEP_SLEEP_ENTRY = 2 /* 0x2 */;
    /**
     * AP is exiting from deep sleep state.
     * After reporting this state, AP will accept VehicleApPowerStateReq#ON or
     * VehicleApPowerStateReq#SHUTDOWN_PREPARE. Other power state requests are ignored.
     */
    public static final int DEEP_SLEEP_EXIT = 3 /* 0x3 */;
    /**
     * AP sends this message repeatedly while cleanup and idle tasks execute.
     * After reporting this state, AP will accept VehicleApPowerStateReq#SHUTDOWN_PREPARE
     * requesting immediate shutdown or VehicleApPowerStateReq#CANCEL_SHUTDOWN. Other
     * power state requests are ignored.
     * 
     * int32Values[1]: Time to postpone shutdown in ms. Maximum value is
     *                 5000 ms.
     *                 If AP needs more time, it will send another SHUTDOWN_POSTPONE
     *                 message before the previous one expires.
     */
    public static final int SHUTDOWN_POSTPONE = 4 /* 0x4 */;
    /**
     * AP is ready to shutdown.
     * The AP will not send any more state reports after this.
     * After reporting this state, AP will accept VehicleApPowerStateReq#FINISHED.
     * Other power state requests are ignored.
     * 
     * int32Values[1]: Time to turn AP back on, in seconds. Power controller should turn on
     *                 AP after the specified time has elapsed so AP can run tasks like
     *                 update. If this value is 0, no wake up is specified. The power
     *                 controller may not necessarily support timed wake-up.
     */
    public static final int SHUTDOWN_START = 5 /* 0x5 */;
    /**
     * AP is entering its normal operating state.
     * After reporting this state, AP will accept VehicleApPowerStateReq#SHUTDOWN_PREPARE.
     * Other power state requests are ignored.
     */
    public static final int ON = 6 /* 0x6 */;
    /**
     * AP is preparing to shut down. In this state, Garage Mode is active and idle
     * tasks are allowed to run.
     * After reporting this state, AP will accept VehicleApPowerStateReq#SHUTDOWN_PREPARE
     * requesting immediate shutdown or VehicleApPowerStateReq#CANCEL_SHUTDOWN. Other
     * power state requests are ignored.
     */
    public static final int SHUTDOWN_PREPARE = 7 /* 0x7 */;
    /**
     * AP has stopped preparing to shut down.
     * After reporting this state, AP will accept VehicleApPowerStateReq#ON or
     * VehicleApPowerStateReq#SHUTDOWN_PREPARE. Other power state requests are ignored.
     */
    public static final int SHUTDOWN_CANCELLED = 8 /* 0x8 */;
    public static final String toString(int o) {
        if (o == WAIT_FOR_VHAL) {
            return "WAIT_FOR_VHAL";
        }
        if (o == DEEP_SLEEP_ENTRY) {
            return "DEEP_SLEEP_ENTRY";
        }
        if (o == DEEP_SLEEP_EXIT) {
            return "DEEP_SLEEP_EXIT";
        }
        if (o == SHUTDOWN_POSTPONE) {
            return "SHUTDOWN_POSTPONE";
        }
        if (o == SHUTDOWN_START) {
            return "SHUTDOWN_START";
        }
        if (o == ON) {
            return "ON";
        }
        if (o == SHUTDOWN_PREPARE) {
            return "SHUTDOWN_PREPARE";
        }
        if (o == SHUTDOWN_CANCELLED) {
            return "SHUTDOWN_CANCELLED";
        }
        return "0x" + Integer.toHexString(o);
    }

    public static final String dumpBitfield(int o) {
        java.util.ArrayList<String> list = new java.util.ArrayList<>();
        int flipped = 0;
        if ((o & WAIT_FOR_VHAL) == WAIT_FOR_VHAL) {
            list.add("WAIT_FOR_VHAL");
            flipped |= WAIT_FOR_VHAL;
        }
        if ((o & DEEP_SLEEP_ENTRY) == DEEP_SLEEP_ENTRY) {
            list.add("DEEP_SLEEP_ENTRY");
            flipped |= DEEP_SLEEP_ENTRY;
        }
        if ((o & DEEP_SLEEP_EXIT) == DEEP_SLEEP_EXIT) {
            list.add("DEEP_SLEEP_EXIT");
            flipped |= DEEP_SLEEP_EXIT;
        }
        if ((o & SHUTDOWN_POSTPONE) == SHUTDOWN_POSTPONE) {
            list.add("SHUTDOWN_POSTPONE");
            flipped |= SHUTDOWN_POSTPONE;
        }
        if ((o & SHUTDOWN_START) == SHUTDOWN_START) {
            list.add("SHUTDOWN_START");
            flipped |= SHUTDOWN_START;
        }
        if ((o & ON) == ON) {
            list.add("ON");
            flipped |= ON;
        }
        if ((o & SHUTDOWN_PREPARE) == SHUTDOWN_PREPARE) {
            list.add("SHUTDOWN_PREPARE");
            flipped |= SHUTDOWN_PREPARE;
        }
        if ((o & SHUTDOWN_CANCELLED) == SHUTDOWN_CANCELLED) {
            list.add("SHUTDOWN_CANCELLED");
            flipped |= SHUTDOWN_CANCELLED;
        }
        if (o != flipped) {
            list.add("0x" + Integer.toHexString(o & (~flipped)));
        }
        return String.join(" | ", list);
    }

};

