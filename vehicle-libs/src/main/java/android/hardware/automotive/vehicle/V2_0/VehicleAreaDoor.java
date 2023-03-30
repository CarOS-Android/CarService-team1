package android.hardware.automotive.vehicle.V2_0;


public final class VehicleAreaDoor {
    public static final int ROW_1_LEFT = 1 /* 0x00000001 */;
    public static final int ROW_1_RIGHT = 4 /* 0x00000004 */;
    public static final int ROW_2_LEFT = 16 /* 0x00000010 */;
    public static final int ROW_2_RIGHT = 64 /* 0x00000040 */;
    public static final int ROW_3_LEFT = 256 /* 0x00000100 */;
    public static final int ROW_3_RIGHT = 1024 /* 0x00000400 */;
    public static final int HOOD = 268435456 /* 0x10000000 */;
    public static final int REAR = 536870912 /* 0x20000000 */;
    public static final String toString(int o) {
        if (o == ROW_1_LEFT) {
            return "ROW_1_LEFT";
        }
        if (o == ROW_1_RIGHT) {
            return "ROW_1_RIGHT";
        }
        if (o == ROW_2_LEFT) {
            return "ROW_2_LEFT";
        }
        if (o == ROW_2_RIGHT) {
            return "ROW_2_RIGHT";
        }
        if (o == ROW_3_LEFT) {
            return "ROW_3_LEFT";
        }
        if (o == ROW_3_RIGHT) {
            return "ROW_3_RIGHT";
        }
        if (o == HOOD) {
            return "HOOD";
        }
        if (o == REAR) {
            return "REAR";
        }
        return "0x" + Integer.toHexString(o);
    }

    public static final String dumpBitfield(int o) {
        java.util.ArrayList<String> list = new java.util.ArrayList<>();
        int flipped = 0;
        if ((o & ROW_1_LEFT) == ROW_1_LEFT) {
            list.add("ROW_1_LEFT");
            flipped |= ROW_1_LEFT;
        }
        if ((o & ROW_1_RIGHT) == ROW_1_RIGHT) {
            list.add("ROW_1_RIGHT");
            flipped |= ROW_1_RIGHT;
        }
        if ((o & ROW_2_LEFT) == ROW_2_LEFT) {
            list.add("ROW_2_LEFT");
            flipped |= ROW_2_LEFT;
        }
        if ((o & ROW_2_RIGHT) == ROW_2_RIGHT) {
            list.add("ROW_2_RIGHT");
            flipped |= ROW_2_RIGHT;
        }
        if ((o & ROW_3_LEFT) == ROW_3_LEFT) {
            list.add("ROW_3_LEFT");
            flipped |= ROW_3_LEFT;
        }
        if ((o & ROW_3_RIGHT) == ROW_3_RIGHT) {
            list.add("ROW_3_RIGHT");
            flipped |= ROW_3_RIGHT;
        }
        if ((o & HOOD) == HOOD) {
            list.add("HOOD");
            flipped |= HOOD;
        }
        if ((o & REAR) == REAR) {
            list.add("REAR");
            flipped |= REAR;
        }
        if (o != flipped) {
            list.add("0x" + Integer.toHexString(o & (~flipped)));
        }
        return String.join(" | ", list);
    }

};

