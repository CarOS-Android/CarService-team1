package android.hardware.automotive.vehicle.V2_0;


public final class VehicleIgnitionState {
    public static final int UNDEFINED = 0;
    /**
     * Steering wheel is locked
     */
    public static final int LOCK = 1;
    /**
     * Steering wheel is not locked, engine and all accessories are OFF. If
     * car can be in LOCK and OFF state at the same time than HAL must report
     * LOCK state.
     */
    public static final int OFF = 2 /* (::android::hardware::automotive::vehicle::V2_0::VehicleIgnitionState.LOCK implicitly + 1) */;
    /**
     * Typically in this state accessories become available (e.g. radio).
     * Instrument cluster and engine are turned off
     */
    public static final int ACC = 3 /* (::android::hardware::automotive::vehicle::V2_0::VehicleIgnitionState.OFF implicitly + 1) */;
    /**
     * Ignition is in state ON. Accessories and instrument cluster available,
     * engine might be running or ready to be started.
     */
    public static final int ON = 4 /* (::android::hardware::automotive::vehicle::V2_0::VehicleIgnitionState.ACC implicitly + 1) */;
    /**
     * Typically in this state engine is starting (cranking).
     */
    public static final int START = 5 /* (::android::hardware::automotive::vehicle::V2_0::VehicleIgnitionState.ON implicitly + 1) */;
    public static final String toString(int o) {
        if (o == UNDEFINED) {
            return "UNDEFINED";
        }
        if (o == LOCK) {
            return "LOCK";
        }
        if (o == OFF) {
            return "OFF";
        }
        if (o == ACC) {
            return "ACC";
        }
        if (o == ON) {
            return "ON";
        }
        if (o == START) {
            return "START";
        }
        return "0x" + Integer.toHexString(o);
    }

    public static final String dumpBitfield(int o) {
        java.util.ArrayList<String> list = new java.util.ArrayList<>();
        int flipped = 0;
        list.add("UNDEFINED"); // UNDEFINED == 0
        if ((o & LOCK) == LOCK) {
            list.add("LOCK");
            flipped |= LOCK;
        }
        if ((o & OFF) == OFF) {
            list.add("OFF");
            flipped |= OFF;
        }
        if ((o & ACC) == ACC) {
            list.add("ACC");
            flipped |= ACC;
        }
        if ((o & ON) == ON) {
            list.add("ON");
            flipped |= ON;
        }
        if ((o & START) == START) {
            list.add("START");
            flipped |= START;
        }
        if (o != flipped) {
            list.add("0x" + Integer.toHexString(o & (~flipped)));
        }
        return String.join(" | ", list);
    }

};

