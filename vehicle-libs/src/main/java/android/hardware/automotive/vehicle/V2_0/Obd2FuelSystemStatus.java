package android.hardware.automotive.vehicle.V2_0;


public final class Obd2FuelSystemStatus {
    public static final int OPEN_INSUFFICIENT_ENGINE_TEMPERATURE = 1;
    public static final int CLOSED_LOOP = 2;
    public static final int OPEN_ENGINE_LOAD_OR_DECELERATION = 4;
    public static final int OPEN_SYSTEM_FAILURE = 8;
    public static final int CLOSED_LOOP_BUT_FEEDBACK_FAULT = 16;
    public static final String toString(int o) {
        if (o == OPEN_INSUFFICIENT_ENGINE_TEMPERATURE) {
            return "OPEN_INSUFFICIENT_ENGINE_TEMPERATURE";
        }
        if (o == CLOSED_LOOP) {
            return "CLOSED_LOOP";
        }
        if (o == OPEN_ENGINE_LOAD_OR_DECELERATION) {
            return "OPEN_ENGINE_LOAD_OR_DECELERATION";
        }
        if (o == OPEN_SYSTEM_FAILURE) {
            return "OPEN_SYSTEM_FAILURE";
        }
        if (o == CLOSED_LOOP_BUT_FEEDBACK_FAULT) {
            return "CLOSED_LOOP_BUT_FEEDBACK_FAULT";
        }
        return "0x" + Integer.toHexString(o);
    }

    public static final String dumpBitfield(int o) {
        java.util.ArrayList<String> list = new java.util.ArrayList<>();
        int flipped = 0;
        if ((o & OPEN_INSUFFICIENT_ENGINE_TEMPERATURE) == OPEN_INSUFFICIENT_ENGINE_TEMPERATURE) {
            list.add("OPEN_INSUFFICIENT_ENGINE_TEMPERATURE");
            flipped |= OPEN_INSUFFICIENT_ENGINE_TEMPERATURE;
        }
        if ((o & CLOSED_LOOP) == CLOSED_LOOP) {
            list.add("CLOSED_LOOP");
            flipped |= CLOSED_LOOP;
        }
        if ((o & OPEN_ENGINE_LOAD_OR_DECELERATION) == OPEN_ENGINE_LOAD_OR_DECELERATION) {
            list.add("OPEN_ENGINE_LOAD_OR_DECELERATION");
            flipped |= OPEN_ENGINE_LOAD_OR_DECELERATION;
        }
        if ((o & OPEN_SYSTEM_FAILURE) == OPEN_SYSTEM_FAILURE) {
            list.add("OPEN_SYSTEM_FAILURE");
            flipped |= OPEN_SYSTEM_FAILURE;
        }
        if ((o & CLOSED_LOOP_BUT_FEEDBACK_FAULT) == CLOSED_LOOP_BUT_FEEDBACK_FAULT) {
            list.add("CLOSED_LOOP_BUT_FEEDBACK_FAULT");
            flipped |= CLOSED_LOOP_BUT_FEEDBACK_FAULT;
        }
        if (o != flipped) {
            list.add("0x" + Integer.toHexString(o & (~flipped)));
        }
        return String.join(" | ", list);
    }

};

