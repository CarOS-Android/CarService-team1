package android.hardware.automotive.vehicle.V2_0;


public final class VehicleAreaSeat {
    public static final int ROW_1_LEFT = 1 /* 0x0001 */;
    public static final int ROW_1_CENTER = 2 /* 0x0002 */;
    public static final int ROW_1_RIGHT = 4 /* 0x0004 */;
    public static final int ROW_2_LEFT = 16 /* 0x0010 */;
    public static final int ROW_2_CENTER = 32 /* 0x0020 */;
    public static final int ROW_2_RIGHT = 64 /* 0x0040 */;
    public static final int ROW_3_LEFT = 256 /* 0x0100 */;
    public static final int ROW_3_CENTER = 512 /* 0x0200 */;
    public static final int ROW_3_RIGHT = 1024 /* 0x0400 */;
    public static final String toString(int o) {
        if (o == ROW_1_LEFT) {
            return "ROW_1_LEFT";
        }
        if (o == ROW_1_CENTER) {
            return "ROW_1_CENTER";
        }
        if (o == ROW_1_RIGHT) {
            return "ROW_1_RIGHT";
        }
        if (o == ROW_2_LEFT) {
            return "ROW_2_LEFT";
        }
        if (o == ROW_2_CENTER) {
            return "ROW_2_CENTER";
        }
        if (o == ROW_2_RIGHT) {
            return "ROW_2_RIGHT";
        }
        if (o == ROW_3_LEFT) {
            return "ROW_3_LEFT";
        }
        if (o == ROW_3_CENTER) {
            return "ROW_3_CENTER";
        }
        if (o == ROW_3_RIGHT) {
            return "ROW_3_RIGHT";
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
        if ((o & ROW_1_CENTER) == ROW_1_CENTER) {
            list.add("ROW_1_CENTER");
            flipped |= ROW_1_CENTER;
        }
        if ((o & ROW_1_RIGHT) == ROW_1_RIGHT) {
            list.add("ROW_1_RIGHT");
            flipped |= ROW_1_RIGHT;
        }
        if ((o & ROW_2_LEFT) == ROW_2_LEFT) {
            list.add("ROW_2_LEFT");
            flipped |= ROW_2_LEFT;
        }
        if ((o & ROW_2_CENTER) == ROW_2_CENTER) {
            list.add("ROW_2_CENTER");
            flipped |= ROW_2_CENTER;
        }
        if ((o & ROW_2_RIGHT) == ROW_2_RIGHT) {
            list.add("ROW_2_RIGHT");
            flipped |= ROW_2_RIGHT;
        }
        if ((o & ROW_3_LEFT) == ROW_3_LEFT) {
            list.add("ROW_3_LEFT");
            flipped |= ROW_3_LEFT;
        }
        if ((o & ROW_3_CENTER) == ROW_3_CENTER) {
            list.add("ROW_3_CENTER");
            flipped |= ROW_3_CENTER;
        }
        if ((o & ROW_3_RIGHT) == ROW_3_RIGHT) {
            list.add("ROW_3_RIGHT");
            flipped |= ROW_3_RIGHT;
        }
        if (o != flipped) {
            list.add("0x" + Integer.toHexString(o & (~flipped)));
        }
        return String.join(" | ", list);
    }

};

