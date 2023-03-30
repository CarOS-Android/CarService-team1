package android.hardware.automotive.vehicle.V2_0;


public final class VehicleOilLevel {
    /**
     * Oil level values
     */
    public static final int CRITICALLY_LOW = 0;
    public static final int LOW = 1;
    public static final int NORMAL = 2;
    public static final int HIGH = 3;
    public static final int ERROR = 4;
    public static final String toString(int o) {
        if (o == CRITICALLY_LOW) {
            return "CRITICALLY_LOW";
        }
        if (o == LOW) {
            return "LOW";
        }
        if (o == NORMAL) {
            return "NORMAL";
        }
        if (o == HIGH) {
            return "HIGH";
        }
        if (o == ERROR) {
            return "ERROR";
        }
        return "0x" + Integer.toHexString(o);
    }

    public static final String dumpBitfield(int o) {
        java.util.ArrayList<String> list = new java.util.ArrayList<>();
        int flipped = 0;
        list.add("CRITICALLY_LOW"); // CRITICALLY_LOW == 0
        if ((o & LOW) == LOW) {
            list.add("LOW");
            flipped |= LOW;
        }
        if ((o & NORMAL) == NORMAL) {
            list.add("NORMAL");
            flipped |= NORMAL;
        }
        if ((o & HIGH) == HIGH) {
            list.add("HIGH");
            flipped |= HIGH;
        }
        if ((o & ERROR) == ERROR) {
            list.add("ERROR");
            flipped |= ERROR;
        }
        if (o != flipped) {
            list.add("0x" + Integer.toHexString(o & (~flipped)));
        }
        return String.join(" | ", list);
    }

};

