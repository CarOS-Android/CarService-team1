package android.hardware.automotive.vehicle.V2_0;


public final class VehicleGear {
    public static final int GEAR_UNKNOWN = 0 /* 0x0000 */;
    public static final int GEAR_NEUTRAL = 1 /* 0x0001 */;
    public static final int GEAR_REVERSE = 2 /* 0x0002 */;
    public static final int GEAR_PARK = 4 /* 0x0004 */;
    public static final int GEAR_DRIVE = 8 /* 0x0008 */;
    public static final int GEAR_1 = 16 /* 0x0010 */;
    public static final int GEAR_2 = 32 /* 0x0020 */;
    public static final int GEAR_3 = 64 /* 0x0040 */;
    public static final int GEAR_4 = 128 /* 0x0080 */;
    public static final int GEAR_5 = 256 /* 0x0100 */;
    public static final int GEAR_6 = 512 /* 0x0200 */;
    public static final int GEAR_7 = 1024 /* 0x0400 */;
    public static final int GEAR_8 = 2048 /* 0x0800 */;
    public static final int GEAR_9 = 4096 /* 0x1000 */;
    public static final String toString(int o) {
        if (o == GEAR_UNKNOWN) {
            return "GEAR_UNKNOWN";
        }
        if (o == GEAR_NEUTRAL) {
            return "GEAR_NEUTRAL";
        }
        if (o == GEAR_REVERSE) {
            return "GEAR_REVERSE";
        }
        if (o == GEAR_PARK) {
            return "GEAR_PARK";
        }
        if (o == GEAR_DRIVE) {
            return "GEAR_DRIVE";
        }
        if (o == GEAR_1) {
            return "GEAR_1";
        }
        if (o == GEAR_2) {
            return "GEAR_2";
        }
        if (o == GEAR_3) {
            return "GEAR_3";
        }
        if (o == GEAR_4) {
            return "GEAR_4";
        }
        if (o == GEAR_5) {
            return "GEAR_5";
        }
        if (o == GEAR_6) {
            return "GEAR_6";
        }
        if (o == GEAR_7) {
            return "GEAR_7";
        }
        if (o == GEAR_8) {
            return "GEAR_8";
        }
        if (o == GEAR_9) {
            return "GEAR_9";
        }
        return "0x" + Integer.toHexString(o);
    }

    public static final String dumpBitfield(int o) {
        java.util.ArrayList<String> list = new java.util.ArrayList<>();
        int flipped = 0;
        list.add("GEAR_UNKNOWN"); // GEAR_UNKNOWN == 0
        if ((o & GEAR_NEUTRAL) == GEAR_NEUTRAL) {
            list.add("GEAR_NEUTRAL");
            flipped |= GEAR_NEUTRAL;
        }
        if ((o & GEAR_REVERSE) == GEAR_REVERSE) {
            list.add("GEAR_REVERSE");
            flipped |= GEAR_REVERSE;
        }
        if ((o & GEAR_PARK) == GEAR_PARK) {
            list.add("GEAR_PARK");
            flipped |= GEAR_PARK;
        }
        if ((o & GEAR_DRIVE) == GEAR_DRIVE) {
            list.add("GEAR_DRIVE");
            flipped |= GEAR_DRIVE;
        }
        if ((o & GEAR_1) == GEAR_1) {
            list.add("GEAR_1");
            flipped |= GEAR_1;
        }
        if ((o & GEAR_2) == GEAR_2) {
            list.add("GEAR_2");
            flipped |= GEAR_2;
        }
        if ((o & GEAR_3) == GEAR_3) {
            list.add("GEAR_3");
            flipped |= GEAR_3;
        }
        if ((o & GEAR_4) == GEAR_4) {
            list.add("GEAR_4");
            flipped |= GEAR_4;
        }
        if ((o & GEAR_5) == GEAR_5) {
            list.add("GEAR_5");
            flipped |= GEAR_5;
        }
        if ((o & GEAR_6) == GEAR_6) {
            list.add("GEAR_6");
            flipped |= GEAR_6;
        }
        if ((o & GEAR_7) == GEAR_7) {
            list.add("GEAR_7");
            flipped |= GEAR_7;
        }
        if ((o & GEAR_8) == GEAR_8) {
            list.add("GEAR_8");
            flipped |= GEAR_8;
        }
        if ((o & GEAR_9) == GEAR_9) {
            list.add("GEAR_9");
            flipped |= GEAR_9;
        }
        if (o != flipped) {
            list.add("0x" + Integer.toHexString(o & (~flipped)));
        }
        return String.join(" | ", list);
    }

};

