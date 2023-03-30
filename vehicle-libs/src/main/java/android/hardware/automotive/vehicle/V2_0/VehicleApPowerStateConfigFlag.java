package android.hardware.automotive.vehicle.V2_0;


public final class VehicleApPowerStateConfigFlag {
    /**
     * AP can enter deep sleep state. If not set, AP will always shutdown from
     * VehicleApPowerState#SHUTDOWN_PREPARE power state.
     */
    public static final int ENABLE_DEEP_SLEEP_FLAG = 1 /* 0x1 */;
    /**
     * The power controller can power on AP from off state after timeout
     * specified in VehicleApPowerSet VEHICLE_AP_POWER_SET_SHUTDOWN_READY message.
     */
    public static final int CONFIG_SUPPORT_TIMER_POWER_ON_FLAG = 2 /* 0x2 */;
    public static final String toString(int o) {
        if (o == ENABLE_DEEP_SLEEP_FLAG) {
            return "ENABLE_DEEP_SLEEP_FLAG";
        }
        if (o == CONFIG_SUPPORT_TIMER_POWER_ON_FLAG) {
            return "CONFIG_SUPPORT_TIMER_POWER_ON_FLAG";
        }
        return "0x" + Integer.toHexString(o);
    }

    public static final String dumpBitfield(int o) {
        java.util.ArrayList<String> list = new java.util.ArrayList<>();
        int flipped = 0;
        if ((o & ENABLE_DEEP_SLEEP_FLAG) == ENABLE_DEEP_SLEEP_FLAG) {
            list.add("ENABLE_DEEP_SLEEP_FLAG");
            flipped |= ENABLE_DEEP_SLEEP_FLAG;
        }
        if ((o & CONFIG_SUPPORT_TIMER_POWER_ON_FLAG) == CONFIG_SUPPORT_TIMER_POWER_ON_FLAG) {
            list.add("CONFIG_SUPPORT_TIMER_POWER_ON_FLAG");
            flipped |= CONFIG_SUPPORT_TIMER_POWER_ON_FLAG;
        }
        if (o != flipped) {
            list.add("0x" + Integer.toHexString(o & (~flipped)));
        }
        return String.join(" | ", list);
    }

};

