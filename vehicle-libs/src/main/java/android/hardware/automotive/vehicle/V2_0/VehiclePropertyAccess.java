package android.hardware.automotive.vehicle.V2_0;


public final class VehiclePropertyAccess {
    public static final int NONE = 0 /* 0x00 */;
    public static final int READ = 1 /* 0x01 */;
    public static final int WRITE = 2 /* 0x02 */;
    public static final int READ_WRITE = 3 /* 0x03 */;
    public static final String toString(int o) {
        if (o == NONE) {
            return "NONE";
        }
        if (o == READ) {
            return "READ";
        }
        if (o == WRITE) {
            return "WRITE";
        }
        if (o == READ_WRITE) {
            return "READ_WRITE";
        }
        return "0x" + Integer.toHexString(o);
    }

    public static final String dumpBitfield(int o) {
        java.util.ArrayList<String> list = new java.util.ArrayList<>();
        int flipped = 0;
        list.add("NONE"); // NONE == 0
        if ((o & READ) == READ) {
            list.add("READ");
            flipped |= READ;
        }
        if ((o & WRITE) == WRITE) {
            list.add("WRITE");
            flipped |= WRITE;
        }
        if ((o & READ_WRITE) == READ_WRITE) {
            list.add("READ_WRITE");
            flipped |= READ_WRITE;
        }
        if (o != flipped) {
            list.add("0x" + Integer.toHexString(o & (~flipped)));
        }
        return String.join(" | ", list);
    }

};

