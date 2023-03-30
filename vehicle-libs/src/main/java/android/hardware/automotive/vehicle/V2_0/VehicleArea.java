package android.hardware.automotive.vehicle.V2_0;


public final class VehicleArea {
    public static final int GLOBAL = 16777216 /* 0x01000000 */;
    /**
     * WINDOW maps to enum VehicleAreaWindow
     */
    public static final int WINDOW = 50331648 /* 0x03000000 */;
    /**
     * MIRROR maps to enum VehicleAreaMirror
     */
    public static final int MIRROR = 67108864 /* 0x04000000 */;
    /**
     * SEAT maps to enum VehicleAreaSeat
     */
    public static final int SEAT = 83886080 /* 0x05000000 */;
    /**
     * DOOR maps to enum VehicleAreaDoor
     */
    public static final int DOOR = 100663296 /* 0x06000000 */;
    /**
     * WHEEL maps to enum VehicleAreaWheel
     */
    public static final int WHEEL = 117440512 /* 0x07000000 */;
    public static final int MASK = 251658240 /* 0x0f000000 */;
    public static final String toString(int o) {
        if (o == GLOBAL) {
            return "GLOBAL";
        }
        if (o == WINDOW) {
            return "WINDOW";
        }
        if (o == MIRROR) {
            return "MIRROR";
        }
        if (o == SEAT) {
            return "SEAT";
        }
        if (o == DOOR) {
            return "DOOR";
        }
        if (o == WHEEL) {
            return "WHEEL";
        }
        if (o == MASK) {
            return "MASK";
        }
        return "0x" + Integer.toHexString(o);
    }

    public static final String dumpBitfield(int o) {
        java.util.ArrayList<String> list = new java.util.ArrayList<>();
        int flipped = 0;
        if ((o & GLOBAL) == GLOBAL) {
            list.add("GLOBAL");
            flipped |= GLOBAL;
        }
        if ((o & WINDOW) == WINDOW) {
            list.add("WINDOW");
            flipped |= WINDOW;
        }
        if ((o & MIRROR) == MIRROR) {
            list.add("MIRROR");
            flipped |= MIRROR;
        }
        if ((o & SEAT) == SEAT) {
            list.add("SEAT");
            flipped |= SEAT;
        }
        if ((o & DOOR) == DOOR) {
            list.add("DOOR");
            flipped |= DOOR;
        }
        if ((o & WHEEL) == WHEEL) {
            list.add("WHEEL");
            flipped |= WHEEL;
        }
        if ((o & MASK) == MASK) {
            list.add("MASK");
            flipped |= MASK;
        }
        if (o != flipped) {
            list.add("0x" + Integer.toHexString(o & (~flipped)));
        }
        return String.join(" | ", list);
    }

};

