package android.hardware.automotive.vehicle.V2_0;


public final class VehicleVendorPermission {
    public static final int PERMISSION_DEFAULT = 0 /* 0x00000000 */;
    public static final int PERMISSION_SET_VENDOR_CATEGORY_WINDOW = 1 /* 0X00000001 */;
    public static final int PERMISSION_GET_VENDOR_CATEGORY_WINDOW = 2 /* 0x00000002 */;
    public static final int PERMISSION_SET_VENDOR_CATEGORY_DOOR = 3 /* 0x00000003 */;
    public static final int PERMISSION_GET_VENDOR_CATEGORY_DOOR = 4 /* 0x00000004 */;
    public static final int PERMISSION_SET_VENDOR_CATEGORY_SEAT = 5 /* 0x00000005 */;
    public static final int PERMISSION_GET_VENDOR_CATEGORY_SEAT = 6 /* 0x00000006 */;
    public static final int PERMISSION_SET_VENDOR_CATEGORY_MIRROR = 7 /* 0x00000007 */;
    public static final int PERMISSION_GET_VENDOR_CATEGORY_MIRROR = 8 /* 0x00000008 */;
    public static final int PERMISSION_SET_VENDOR_CATEGORY_INFO = 9 /* 0x00000009 */;
    public static final int PERMISSION_GET_VENDOR_CATEGORY_INFO = 10 /* 0x0000000A */;
    public static final int PERMISSION_SET_VENDOR_CATEGORY_ENGINE = 11 /* 0x0000000B */;
    public static final int PERMISSION_GET_VENDOR_CATEGORY_ENGINE = 12 /* 0x0000000C */;
    public static final int PERMISSION_SET_VENDOR_CATEGORY_HVAC = 13 /* 0x0000000D */;
    public static final int PERMISSION_GET_VENDOR_CATEGORY_HVAC = 14 /* 0x0000000E */;
    public static final int PERMISSION_SET_VENDOR_CATEGORY_LIGHT = 15 /* 0x0000000F */;
    public static final int PERMISSION_GET_VENDOR_CATEGORY_LIGHT = 16 /* 0x00000010 */;
    public static final int PERMISSION_SET_VENDOR_CATEGORY_1 = 65536 /* 0x00010000 */;
    public static final int PERMISSION_GET_VENDOR_CATEGORY_1 = 69632 /* 0x00011000 */;
    public static final int PERMISSION_SET_VENDOR_CATEGORY_2 = 131072 /* 0x00020000 */;
    public static final int PERMISSION_GET_VENDOR_CATEGORY_2 = 135168 /* 0x00021000 */;
    public static final int PERMISSION_SET_VENDOR_CATEGORY_3 = 196608 /* 0x00030000 */;
    public static final int PERMISSION_GET_VENDOR_CATEGORY_3 = 200704 /* 0x00031000 */;
    public static final int PERMISSION_SET_VENDOR_CATEGORY_4 = 262144 /* 0x00040000 */;
    public static final int PERMISSION_GET_VENDOR_CATEGORY_4 = 266240 /* 0x00041000 */;
    public static final int PERMISSION_SET_VENDOR_CATEGORY_5 = 327680 /* 0x00050000 */;
    public static final int PERMISSION_GET_VENDOR_CATEGORY_5 = 331776 /* 0x00051000 */;
    public static final int PERMISSION_SET_VENDOR_CATEGORY_6 = 393216 /* 0x00060000 */;
    public static final int PERMISSION_GET_VENDOR_CATEGORY_6 = 397312 /* 0x00061000 */;
    public static final int PERMISSION_SET_VENDOR_CATEGORY_7 = 458752 /* 0x00070000 */;
    public static final int PERMISSION_GET_VENDOR_CATEGORY_7 = 462848 /* 0x00071000 */;
    public static final int PERMISSION_SET_VENDOR_CATEGORY_8 = 524288 /* 0x00080000 */;
    public static final int PERMISSION_GET_VENDOR_CATEGORY_8 = 528384 /* 0x00081000 */;
    public static final int PERMISSION_SET_VENDOR_CATEGORY_9 = 589824 /* 0x00090000 */;
    public static final int PERMISSION_GET_VENDOR_CATEGORY_9 = 593920 /* 0x00091000 */;
    public static final int PERMISSION_SET_VENDOR_CATEGORY_10 = 655360 /* 0x000A0000 */;
    public static final int PERMISSION_GET_VENDOR_CATEGORY_10 = 659456 /* 0x000A1000 */;
    public static final int PERMISSION_NOT_ACCESSIBLE = -268435456 /* 0xF0000000 */;
    public static final String toString(int o) {
        if (o == PERMISSION_DEFAULT) {
            return "PERMISSION_DEFAULT";
        }
        if (o == PERMISSION_SET_VENDOR_CATEGORY_WINDOW) {
            return "PERMISSION_SET_VENDOR_CATEGORY_WINDOW";
        }
        if (o == PERMISSION_GET_VENDOR_CATEGORY_WINDOW) {
            return "PERMISSION_GET_VENDOR_CATEGORY_WINDOW";
        }
        if (o == PERMISSION_SET_VENDOR_CATEGORY_DOOR) {
            return "PERMISSION_SET_VENDOR_CATEGORY_DOOR";
        }
        if (o == PERMISSION_GET_VENDOR_CATEGORY_DOOR) {
            return "PERMISSION_GET_VENDOR_CATEGORY_DOOR";
        }
        if (o == PERMISSION_SET_VENDOR_CATEGORY_SEAT) {
            return "PERMISSION_SET_VENDOR_CATEGORY_SEAT";
        }
        if (o == PERMISSION_GET_VENDOR_CATEGORY_SEAT) {
            return "PERMISSION_GET_VENDOR_CATEGORY_SEAT";
        }
        if (o == PERMISSION_SET_VENDOR_CATEGORY_MIRROR) {
            return "PERMISSION_SET_VENDOR_CATEGORY_MIRROR";
        }
        if (o == PERMISSION_GET_VENDOR_CATEGORY_MIRROR) {
            return "PERMISSION_GET_VENDOR_CATEGORY_MIRROR";
        }
        if (o == PERMISSION_SET_VENDOR_CATEGORY_INFO) {
            return "PERMISSION_SET_VENDOR_CATEGORY_INFO";
        }
        if (o == PERMISSION_GET_VENDOR_CATEGORY_INFO) {
            return "PERMISSION_GET_VENDOR_CATEGORY_INFO";
        }
        if (o == PERMISSION_SET_VENDOR_CATEGORY_ENGINE) {
            return "PERMISSION_SET_VENDOR_CATEGORY_ENGINE";
        }
        if (o == PERMISSION_GET_VENDOR_CATEGORY_ENGINE) {
            return "PERMISSION_GET_VENDOR_CATEGORY_ENGINE";
        }
        if (o == PERMISSION_SET_VENDOR_CATEGORY_HVAC) {
            return "PERMISSION_SET_VENDOR_CATEGORY_HVAC";
        }
        if (o == PERMISSION_GET_VENDOR_CATEGORY_HVAC) {
            return "PERMISSION_GET_VENDOR_CATEGORY_HVAC";
        }
        if (o == PERMISSION_SET_VENDOR_CATEGORY_LIGHT) {
            return "PERMISSION_SET_VENDOR_CATEGORY_LIGHT";
        }
        if (o == PERMISSION_GET_VENDOR_CATEGORY_LIGHT) {
            return "PERMISSION_GET_VENDOR_CATEGORY_LIGHT";
        }
        if (o == PERMISSION_SET_VENDOR_CATEGORY_1) {
            return "PERMISSION_SET_VENDOR_CATEGORY_1";
        }
        if (o == PERMISSION_GET_VENDOR_CATEGORY_1) {
            return "PERMISSION_GET_VENDOR_CATEGORY_1";
        }
        if (o == PERMISSION_SET_VENDOR_CATEGORY_2) {
            return "PERMISSION_SET_VENDOR_CATEGORY_2";
        }
        if (o == PERMISSION_GET_VENDOR_CATEGORY_2) {
            return "PERMISSION_GET_VENDOR_CATEGORY_2";
        }
        if (o == PERMISSION_SET_VENDOR_CATEGORY_3) {
            return "PERMISSION_SET_VENDOR_CATEGORY_3";
        }
        if (o == PERMISSION_GET_VENDOR_CATEGORY_3) {
            return "PERMISSION_GET_VENDOR_CATEGORY_3";
        }
        if (o == PERMISSION_SET_VENDOR_CATEGORY_4) {
            return "PERMISSION_SET_VENDOR_CATEGORY_4";
        }
        if (o == PERMISSION_GET_VENDOR_CATEGORY_4) {
            return "PERMISSION_GET_VENDOR_CATEGORY_4";
        }
        if (o == PERMISSION_SET_VENDOR_CATEGORY_5) {
            return "PERMISSION_SET_VENDOR_CATEGORY_5";
        }
        if (o == PERMISSION_GET_VENDOR_CATEGORY_5) {
            return "PERMISSION_GET_VENDOR_CATEGORY_5";
        }
        if (o == PERMISSION_SET_VENDOR_CATEGORY_6) {
            return "PERMISSION_SET_VENDOR_CATEGORY_6";
        }
        if (o == PERMISSION_GET_VENDOR_CATEGORY_6) {
            return "PERMISSION_GET_VENDOR_CATEGORY_6";
        }
        if (o == PERMISSION_SET_VENDOR_CATEGORY_7) {
            return "PERMISSION_SET_VENDOR_CATEGORY_7";
        }
        if (o == PERMISSION_GET_VENDOR_CATEGORY_7) {
            return "PERMISSION_GET_VENDOR_CATEGORY_7";
        }
        if (o == PERMISSION_SET_VENDOR_CATEGORY_8) {
            return "PERMISSION_SET_VENDOR_CATEGORY_8";
        }
        if (o == PERMISSION_GET_VENDOR_CATEGORY_8) {
            return "PERMISSION_GET_VENDOR_CATEGORY_8";
        }
        if (o == PERMISSION_SET_VENDOR_CATEGORY_9) {
            return "PERMISSION_SET_VENDOR_CATEGORY_9";
        }
        if (o == PERMISSION_GET_VENDOR_CATEGORY_9) {
            return "PERMISSION_GET_VENDOR_CATEGORY_9";
        }
        if (o == PERMISSION_SET_VENDOR_CATEGORY_10) {
            return "PERMISSION_SET_VENDOR_CATEGORY_10";
        }
        if (o == PERMISSION_GET_VENDOR_CATEGORY_10) {
            return "PERMISSION_GET_VENDOR_CATEGORY_10";
        }
        if (o == PERMISSION_NOT_ACCESSIBLE) {
            return "PERMISSION_NOT_ACCESSIBLE";
        }
        return "0x" + Integer.toHexString(o);
    }

    public static final String dumpBitfield(int o) {
        java.util.ArrayList<String> list = new java.util.ArrayList<>();
        int flipped = 0;
        list.add("PERMISSION_DEFAULT"); // PERMISSION_DEFAULT == 0
        if ((o & PERMISSION_SET_VENDOR_CATEGORY_WINDOW) == PERMISSION_SET_VENDOR_CATEGORY_WINDOW) {
            list.add("PERMISSION_SET_VENDOR_CATEGORY_WINDOW");
            flipped |= PERMISSION_SET_VENDOR_CATEGORY_WINDOW;
        }
        if ((o & PERMISSION_GET_VENDOR_CATEGORY_WINDOW) == PERMISSION_GET_VENDOR_CATEGORY_WINDOW) {
            list.add("PERMISSION_GET_VENDOR_CATEGORY_WINDOW");
            flipped |= PERMISSION_GET_VENDOR_CATEGORY_WINDOW;
        }
        if ((o & PERMISSION_SET_VENDOR_CATEGORY_DOOR) == PERMISSION_SET_VENDOR_CATEGORY_DOOR) {
            list.add("PERMISSION_SET_VENDOR_CATEGORY_DOOR");
            flipped |= PERMISSION_SET_VENDOR_CATEGORY_DOOR;
        }
        if ((o & PERMISSION_GET_VENDOR_CATEGORY_DOOR) == PERMISSION_GET_VENDOR_CATEGORY_DOOR) {
            list.add("PERMISSION_GET_VENDOR_CATEGORY_DOOR");
            flipped |= PERMISSION_GET_VENDOR_CATEGORY_DOOR;
        }
        if ((o & PERMISSION_SET_VENDOR_CATEGORY_SEAT) == PERMISSION_SET_VENDOR_CATEGORY_SEAT) {
            list.add("PERMISSION_SET_VENDOR_CATEGORY_SEAT");
            flipped |= PERMISSION_SET_VENDOR_CATEGORY_SEAT;
        }
        if ((o & PERMISSION_GET_VENDOR_CATEGORY_SEAT) == PERMISSION_GET_VENDOR_CATEGORY_SEAT) {
            list.add("PERMISSION_GET_VENDOR_CATEGORY_SEAT");
            flipped |= PERMISSION_GET_VENDOR_CATEGORY_SEAT;
        }
        if ((o & PERMISSION_SET_VENDOR_CATEGORY_MIRROR) == PERMISSION_SET_VENDOR_CATEGORY_MIRROR) {
            list.add("PERMISSION_SET_VENDOR_CATEGORY_MIRROR");
            flipped |= PERMISSION_SET_VENDOR_CATEGORY_MIRROR;
        }
        if ((o & PERMISSION_GET_VENDOR_CATEGORY_MIRROR) == PERMISSION_GET_VENDOR_CATEGORY_MIRROR) {
            list.add("PERMISSION_GET_VENDOR_CATEGORY_MIRROR");
            flipped |= PERMISSION_GET_VENDOR_CATEGORY_MIRROR;
        }
        if ((o & PERMISSION_SET_VENDOR_CATEGORY_INFO) == PERMISSION_SET_VENDOR_CATEGORY_INFO) {
            list.add("PERMISSION_SET_VENDOR_CATEGORY_INFO");
            flipped |= PERMISSION_SET_VENDOR_CATEGORY_INFO;
        }
        if ((o & PERMISSION_GET_VENDOR_CATEGORY_INFO) == PERMISSION_GET_VENDOR_CATEGORY_INFO) {
            list.add("PERMISSION_GET_VENDOR_CATEGORY_INFO");
            flipped |= PERMISSION_GET_VENDOR_CATEGORY_INFO;
        }
        if ((o & PERMISSION_SET_VENDOR_CATEGORY_ENGINE) == PERMISSION_SET_VENDOR_CATEGORY_ENGINE) {
            list.add("PERMISSION_SET_VENDOR_CATEGORY_ENGINE");
            flipped |= PERMISSION_SET_VENDOR_CATEGORY_ENGINE;
        }
        if ((o & PERMISSION_GET_VENDOR_CATEGORY_ENGINE) == PERMISSION_GET_VENDOR_CATEGORY_ENGINE) {
            list.add("PERMISSION_GET_VENDOR_CATEGORY_ENGINE");
            flipped |= PERMISSION_GET_VENDOR_CATEGORY_ENGINE;
        }
        if ((o & PERMISSION_SET_VENDOR_CATEGORY_HVAC) == PERMISSION_SET_VENDOR_CATEGORY_HVAC) {
            list.add("PERMISSION_SET_VENDOR_CATEGORY_HVAC");
            flipped |= PERMISSION_SET_VENDOR_CATEGORY_HVAC;
        }
        if ((o & PERMISSION_GET_VENDOR_CATEGORY_HVAC) == PERMISSION_GET_VENDOR_CATEGORY_HVAC) {
            list.add("PERMISSION_GET_VENDOR_CATEGORY_HVAC");
            flipped |= PERMISSION_GET_VENDOR_CATEGORY_HVAC;
        }
        if ((o & PERMISSION_SET_VENDOR_CATEGORY_LIGHT) == PERMISSION_SET_VENDOR_CATEGORY_LIGHT) {
            list.add("PERMISSION_SET_VENDOR_CATEGORY_LIGHT");
            flipped |= PERMISSION_SET_VENDOR_CATEGORY_LIGHT;
        }
        if ((o & PERMISSION_GET_VENDOR_CATEGORY_LIGHT) == PERMISSION_GET_VENDOR_CATEGORY_LIGHT) {
            list.add("PERMISSION_GET_VENDOR_CATEGORY_LIGHT");
            flipped |= PERMISSION_GET_VENDOR_CATEGORY_LIGHT;
        }
        if ((o & PERMISSION_SET_VENDOR_CATEGORY_1) == PERMISSION_SET_VENDOR_CATEGORY_1) {
            list.add("PERMISSION_SET_VENDOR_CATEGORY_1");
            flipped |= PERMISSION_SET_VENDOR_CATEGORY_1;
        }
        if ((o & PERMISSION_GET_VENDOR_CATEGORY_1) == PERMISSION_GET_VENDOR_CATEGORY_1) {
            list.add("PERMISSION_GET_VENDOR_CATEGORY_1");
            flipped |= PERMISSION_GET_VENDOR_CATEGORY_1;
        }
        if ((o & PERMISSION_SET_VENDOR_CATEGORY_2) == PERMISSION_SET_VENDOR_CATEGORY_2) {
            list.add("PERMISSION_SET_VENDOR_CATEGORY_2");
            flipped |= PERMISSION_SET_VENDOR_CATEGORY_2;
        }
        if ((o & PERMISSION_GET_VENDOR_CATEGORY_2) == PERMISSION_GET_VENDOR_CATEGORY_2) {
            list.add("PERMISSION_GET_VENDOR_CATEGORY_2");
            flipped |= PERMISSION_GET_VENDOR_CATEGORY_2;
        }
        if ((o & PERMISSION_SET_VENDOR_CATEGORY_3) == PERMISSION_SET_VENDOR_CATEGORY_3) {
            list.add("PERMISSION_SET_VENDOR_CATEGORY_3");
            flipped |= PERMISSION_SET_VENDOR_CATEGORY_3;
        }
        if ((o & PERMISSION_GET_VENDOR_CATEGORY_3) == PERMISSION_GET_VENDOR_CATEGORY_3) {
            list.add("PERMISSION_GET_VENDOR_CATEGORY_3");
            flipped |= PERMISSION_GET_VENDOR_CATEGORY_3;
        }
        if ((o & PERMISSION_SET_VENDOR_CATEGORY_4) == PERMISSION_SET_VENDOR_CATEGORY_4) {
            list.add("PERMISSION_SET_VENDOR_CATEGORY_4");
            flipped |= PERMISSION_SET_VENDOR_CATEGORY_4;
        }
        if ((o & PERMISSION_GET_VENDOR_CATEGORY_4) == PERMISSION_GET_VENDOR_CATEGORY_4) {
            list.add("PERMISSION_GET_VENDOR_CATEGORY_4");
            flipped |= PERMISSION_GET_VENDOR_CATEGORY_4;
        }
        if ((o & PERMISSION_SET_VENDOR_CATEGORY_5) == PERMISSION_SET_VENDOR_CATEGORY_5) {
            list.add("PERMISSION_SET_VENDOR_CATEGORY_5");
            flipped |= PERMISSION_SET_VENDOR_CATEGORY_5;
        }
        if ((o & PERMISSION_GET_VENDOR_CATEGORY_5) == PERMISSION_GET_VENDOR_CATEGORY_5) {
            list.add("PERMISSION_GET_VENDOR_CATEGORY_5");
            flipped |= PERMISSION_GET_VENDOR_CATEGORY_5;
        }
        if ((o & PERMISSION_SET_VENDOR_CATEGORY_6) == PERMISSION_SET_VENDOR_CATEGORY_6) {
            list.add("PERMISSION_SET_VENDOR_CATEGORY_6");
            flipped |= PERMISSION_SET_VENDOR_CATEGORY_6;
        }
        if ((o & PERMISSION_GET_VENDOR_CATEGORY_6) == PERMISSION_GET_VENDOR_CATEGORY_6) {
            list.add("PERMISSION_GET_VENDOR_CATEGORY_6");
            flipped |= PERMISSION_GET_VENDOR_CATEGORY_6;
        }
        if ((o & PERMISSION_SET_VENDOR_CATEGORY_7) == PERMISSION_SET_VENDOR_CATEGORY_7) {
            list.add("PERMISSION_SET_VENDOR_CATEGORY_7");
            flipped |= PERMISSION_SET_VENDOR_CATEGORY_7;
        }
        if ((o & PERMISSION_GET_VENDOR_CATEGORY_7) == PERMISSION_GET_VENDOR_CATEGORY_7) {
            list.add("PERMISSION_GET_VENDOR_CATEGORY_7");
            flipped |= PERMISSION_GET_VENDOR_CATEGORY_7;
        }
        if ((o & PERMISSION_SET_VENDOR_CATEGORY_8) == PERMISSION_SET_VENDOR_CATEGORY_8) {
            list.add("PERMISSION_SET_VENDOR_CATEGORY_8");
            flipped |= PERMISSION_SET_VENDOR_CATEGORY_8;
        }
        if ((o & PERMISSION_GET_VENDOR_CATEGORY_8) == PERMISSION_GET_VENDOR_CATEGORY_8) {
            list.add("PERMISSION_GET_VENDOR_CATEGORY_8");
            flipped |= PERMISSION_GET_VENDOR_CATEGORY_8;
        }
        if ((o & PERMISSION_SET_VENDOR_CATEGORY_9) == PERMISSION_SET_VENDOR_CATEGORY_9) {
            list.add("PERMISSION_SET_VENDOR_CATEGORY_9");
            flipped |= PERMISSION_SET_VENDOR_CATEGORY_9;
        }
        if ((o & PERMISSION_GET_VENDOR_CATEGORY_9) == PERMISSION_GET_VENDOR_CATEGORY_9) {
            list.add("PERMISSION_GET_VENDOR_CATEGORY_9");
            flipped |= PERMISSION_GET_VENDOR_CATEGORY_9;
        }
        if ((o & PERMISSION_SET_VENDOR_CATEGORY_10) == PERMISSION_SET_VENDOR_CATEGORY_10) {
            list.add("PERMISSION_SET_VENDOR_CATEGORY_10");
            flipped |= PERMISSION_SET_VENDOR_CATEGORY_10;
        }
        if ((o & PERMISSION_GET_VENDOR_CATEGORY_10) == PERMISSION_GET_VENDOR_CATEGORY_10) {
            list.add("PERMISSION_GET_VENDOR_CATEGORY_10");
            flipped |= PERMISSION_GET_VENDOR_CATEGORY_10;
        }
        if ((o & PERMISSION_NOT_ACCESSIBLE) == PERMISSION_NOT_ACCESSIBLE) {
            list.add("PERMISSION_NOT_ACCESSIBLE");
            flipped |= PERMISSION_NOT_ACCESSIBLE;
        }
        if (o != flipped) {
            list.add("0x" + Integer.toHexString(o & (~flipped)));
        }
        return String.join(" | ", list);
    }

};

