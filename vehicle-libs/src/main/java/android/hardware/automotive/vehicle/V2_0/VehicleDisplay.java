package android.hardware.automotive.vehicle.V2_0;


public final class VehicleDisplay {
    /**
     * The primary Android display (for example, center console)
     */
    public static final int MAIN = 0;
    public static final int INSTRUMENT_CLUSTER = 1;
    public static final String toString(int o) {
        if (o == MAIN) {
            return "MAIN";
        }
        if (o == INSTRUMENT_CLUSTER) {
            return "INSTRUMENT_CLUSTER";
        }
        return "0x" + Integer.toHexString(o);
    }

    public static final String dumpBitfield(int o) {
        java.util.ArrayList<String> list = new java.util.ArrayList<>();
        int flipped = 0;
        list.add("MAIN"); // MAIN == 0
        if ((o & INSTRUMENT_CLUSTER) == INSTRUMENT_CLUSTER) {
            list.add("INSTRUMENT_CLUSTER");
            flipped |= INSTRUMENT_CLUSTER;
        }
        if (o != flipped) {
            list.add("0x" + Integer.toHexString(o & (~flipped)));
        }
        return String.join(" | ", list);
    }

};

