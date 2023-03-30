package android.hardware.automotive.vehicle.V2_0;


public final class VehicleApPowerStateReqIndex {
    public static final int STATE = 0;
    public static final int ADDITIONAL = 1;
    public static final String toString(int o) {
        if (o == STATE) {
            return "STATE";
        }
        if (o == ADDITIONAL) {
            return "ADDITIONAL";
        }
        return "0x" + Integer.toHexString(o);
    }

    public static final String dumpBitfield(int o) {
        java.util.ArrayList<String> list = new java.util.ArrayList<>();
        int flipped = 0;
        list.add("STATE"); // STATE == 0
        if ((o & ADDITIONAL) == ADDITIONAL) {
            list.add("ADDITIONAL");
            flipped |= ADDITIONAL;
        }
        if (o != flipped) {
            list.add("0x" + Integer.toHexString(o & (~flipped)));
        }
        return String.join(" | ", list);
    }

};

