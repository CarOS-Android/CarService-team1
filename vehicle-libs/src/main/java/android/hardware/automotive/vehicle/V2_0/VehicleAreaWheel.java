package android.hardware.automotive.vehicle.V2_0;


public final class VehicleAreaWheel {
    public static final int UNKNOWN = 0 /* 0x0 */;
    public static final int LEFT_FRONT = 1 /* 0x1 */;
    public static final int RIGHT_FRONT = 2 /* 0x2 */;
    public static final int LEFT_REAR = 4 /* 0x4 */;
    public static final int RIGHT_REAR = 8 /* 0x8 */;
    public static final String toString(int o) {
        if (o == UNKNOWN) {
            return "UNKNOWN";
        }
        if (o == LEFT_FRONT) {
            return "LEFT_FRONT";
        }
        if (o == RIGHT_FRONT) {
            return "RIGHT_FRONT";
        }
        if (o == LEFT_REAR) {
            return "LEFT_REAR";
        }
        if (o == RIGHT_REAR) {
            return "RIGHT_REAR";
        }
        return "0x" + Integer.toHexString(o);
    }

    public static final String dumpBitfield(int o) {
        java.util.ArrayList<String> list = new java.util.ArrayList<>();
        int flipped = 0;
        list.add("UNKNOWN"); // UNKNOWN == 0
        if ((o & LEFT_FRONT) == LEFT_FRONT) {
            list.add("LEFT_FRONT");
            flipped |= LEFT_FRONT;
        }
        if ((o & RIGHT_FRONT) == RIGHT_FRONT) {
            list.add("RIGHT_FRONT");
            flipped |= RIGHT_FRONT;
        }
        if ((o & LEFT_REAR) == LEFT_REAR) {
            list.add("LEFT_REAR");
            flipped |= LEFT_REAR;
        }
        if ((o & RIGHT_REAR) == RIGHT_REAR) {
            list.add("RIGHT_REAR");
            flipped |= RIGHT_REAR;
        }
        if (o != flipped) {
            list.add("0x" + Integer.toHexString(o & (~flipped)));
        }
        return String.join(" | ", list);
    }

};

