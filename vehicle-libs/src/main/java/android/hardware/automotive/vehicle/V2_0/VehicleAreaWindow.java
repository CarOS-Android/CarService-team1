package android.hardware.automotive.vehicle.V2_0;


public final class VehicleAreaWindow {
    public static final int FRONT_WINDSHIELD = 1 /* 0x00000001 */;
    public static final int REAR_WINDSHIELD = 2 /* 0x00000002 */;
    public static final int ROW_1_LEFT = 16 /* 0x00000010 */;
    public static final int ROW_1_RIGHT = 64 /* 0x00000040 */;
    public static final int ROW_2_LEFT = 256 /* 0x00000100 */;
    public static final int ROW_2_RIGHT = 1024 /* 0x00000400 */;
    public static final int ROW_3_LEFT = 4096 /* 0x00001000 */;
    public static final int ROW_3_RIGHT = 16384 /* 0x00004000 */;
    public static final int ROOF_TOP_1 = 65536 /* 0x00010000 */;
    public static final int ROOF_TOP_2 = 131072 /* 0x00020000 */;
    public static final String toString(int o) {
        if (o == FRONT_WINDSHIELD) {
            return "FRONT_WINDSHIELD";
        }
        if (o == REAR_WINDSHIELD) {
            return "REAR_WINDSHIELD";
        }
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
        if (o == ROOF_TOP_1) {
            return "ROOF_TOP_1";
        }
        if (o == ROOF_TOP_2) {
            return "ROOF_TOP_2";
        }
        return "0x" + Integer.toHexString(o);
    }

    public static final String dumpBitfield(int o) {
        java.util.ArrayList<String> list = new java.util.ArrayList<>();
        int flipped = 0;
        if ((o & FRONT_WINDSHIELD) == FRONT_WINDSHIELD) {
            list.add("FRONT_WINDSHIELD");
            flipped |= FRONT_WINDSHIELD;
        }
        if ((o & REAR_WINDSHIELD) == REAR_WINDSHIELD) {
            list.add("REAR_WINDSHIELD");
            flipped |= REAR_WINDSHIELD;
        }
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
        if ((o & ROOF_TOP_1) == ROOF_TOP_1) {
            list.add("ROOF_TOP_1");
            flipped |= ROOF_TOP_1;
        }
        if ((o & ROOF_TOP_2) == ROOF_TOP_2) {
            list.add("ROOF_TOP_2");
            flipped |= ROOF_TOP_2;
        }
        if (o != flipped) {
            list.add("0x" + Integer.toHexString(o & (~flipped)));
        }
        return String.join(" | ", list);
    }

};

