package android.hardware.automotive.vehicle.V2_0;


public final class VehicleTurnSignal {
    public static final int NONE = 0 /* 0x00 */;
    public static final int RIGHT = 1 /* 0x01 */;
    public static final int LEFT = 2 /* 0x02 */;
    public static final String toString(int o) {
        if (o == NONE) {
            return "NONE";
        }
        if (o == RIGHT) {
            return "RIGHT";
        }
        if (o == LEFT) {
            return "LEFT";
        }
        return "0x" + Integer.toHexString(o);
    }

    public static final String dumpBitfield(int o) {
        java.util.ArrayList<String> list = new java.util.ArrayList<>();
        int flipped = 0;
        list.add("NONE"); // NONE == 0
        if ((o & RIGHT) == RIGHT) {
            list.add("RIGHT");
            flipped |= RIGHT;
        }
        if ((o & LEFT) == LEFT) {
            list.add("LEFT");
            flipped |= LEFT;
        }
        if (o != flipped) {
            list.add("0x" + Integer.toHexString(o & (~flipped)));
        }
        return String.join(" | ", list);
    }

};

