package android.hardware.automotive.vehicle.V2_0;


public final class VehicleLightState {
    public static final int OFF = 0;
    public static final int ON = 1;
    public static final int DAYTIME_RUNNING = 2;
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
        if (o != flipped) {
            list.add("0x" + Integer.toHexString(o & (~flipped)));
        }
        return String.join(" | ", list);
    }

};

