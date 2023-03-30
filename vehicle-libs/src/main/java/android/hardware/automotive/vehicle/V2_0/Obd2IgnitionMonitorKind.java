package android.hardware.automotive.vehicle.V2_0;


public final class Obd2IgnitionMonitorKind {
    public static final int SPARK = 0;
    public static final int COMPRESSION = 1;
    public static final String toString(int o) {
        if (o == SPARK) {
            return "SPARK";
        }
        if (o == COMPRESSION) {
            return "COMPRESSION";
        }
        return "0x" + Integer.toHexString(o);
    }

    public static final String dumpBitfield(int o) {
        java.util.ArrayList<String> list = new java.util.ArrayList<>();
        int flipped = 0;
        list.add("SPARK"); // SPARK == 0
        if ((o & COMPRESSION) == COMPRESSION) {
            list.add("COMPRESSION");
            flipped |= COMPRESSION;
        }
        if (o != flipped) {
            list.add("0x" + Integer.toHexString(o & (~flipped)));
        }
        return String.join(" | ", list);
    }

};

