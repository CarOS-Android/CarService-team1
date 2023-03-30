package android.hardware.automotive.vehicle.V2_0;


public final class VehicleLightSwitch {
    public static final int OFF = 0;
    public static final int ON = 1;
    /**
     * Daytime running lights mode.  Most cars automatically use DRL but some
     * cars allow the user to activate them manually.
     */
    public static final int DAYTIME_RUNNING = 2;
    /**
     * Allows the vehicle ECU to set the lights automatically
     */
    public static final int AUTOMATIC = 256 /* 0x100 */;
    public static final String toString(int o) {
        if (o == OFF) {
            return "OFF";
        }
        if (o == ON) {
            return "ON";
        }
        if (o == DAYTIME_RUNNING) {
            return "DAYTIME_RUNNING";
        }
        if (o == AUTOMATIC) {
            return "AUTOMATIC";
        }
        return "0x" + Integer.toHexString(o);
    }

    public static final String dumpBitfield(int o) {
        java.util.ArrayList<String> list = new java.util.ArrayList<>();
        int flipped = 0;
        list.add("OFF"); // OFF == 0
        if ((o & ON) == ON) {
            list.add("ON");
            flipped |= ON;
        }
        if ((o & DAYTIME_RUNNING) == DAYTIME_RUNNING) {
            list.add("DAYTIME_RUNNING");
            flipped |= DAYTIME_RUNNING;
        }
        if ((o & AUTOMATIC) == AUTOMATIC) {
            list.add("AUTOMATIC");
            flipped |= AUTOMATIC;
        }
        if (o != flipped) {
            list.add("0x" + Integer.toHexString(o & (~flipped)));
        }
        return String.join(" | ", list);
    }

};

