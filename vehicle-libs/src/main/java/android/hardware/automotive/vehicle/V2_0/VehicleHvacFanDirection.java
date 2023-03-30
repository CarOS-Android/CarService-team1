package android.hardware.automotive.vehicle.V2_0;


public final class VehicleHvacFanDirection {
    public static final int UNKNOWN = 0 /* 0x0 */;
    public static final int FACE = 1 /* 0x1 */;
    public static final int FLOOR = 2 /* 0x2 */;
    /**
     * FACE_AND_FLOOR = FACE | FLOOR
     */
    public static final int FACE_AND_FLOOR = 3 /* 0x3 */;
    public static final int DEFROST = 4 /* 0x4 */;
    /**
     * DEFROST_AND_FLOOR = DEFROST | FLOOR
     */
    public static final int DEFROST_AND_FLOOR = 6 /* 0x06 */;
    public static final String toString(int o) {
        if (o == UNKNOWN) {
            return "UNKNOWN";
        }
        if (o == FACE) {
            return "FACE";
        }
        if (o == FLOOR) {
            return "FLOOR";
        }
        if (o == FACE_AND_FLOOR) {
            return "FACE_AND_FLOOR";
        }
        if (o == DEFROST) {
            return "DEFROST";
        }
        if (o == DEFROST_AND_FLOOR) {
            return "DEFROST_AND_FLOOR";
        }
        return "0x" + Integer.toHexString(o);
    }

    public static final String dumpBitfield(int o) {
        java.util.ArrayList<String> list = new java.util.ArrayList<>();
        int flipped = 0;
        list.add("UNKNOWN"); // UNKNOWN == 0
        if ((o & FACE) == FACE) {
            list.add("FACE");
            flipped |= FACE;
        }
        if ((o & FLOOR) == FLOOR) {
            list.add("FLOOR");
            flipped |= FLOOR;
        }
        if ((o & FACE_AND_FLOOR) == FACE_AND_FLOOR) {
            list.add("FACE_AND_FLOOR");
            flipped |= FACE_AND_FLOOR;
        }
        if ((o & DEFROST) == DEFROST) {
            list.add("DEFROST");
            flipped |= DEFROST;
        }
        if ((o & DEFROST_AND_FLOOR) == DEFROST_AND_FLOOR) {
            list.add("DEFROST_AND_FLOOR");
            flipped |= DEFROST_AND_FLOOR;
        }
        if (o != flipped) {
            list.add("0x" + Integer.toHexString(o & (~flipped)));
        }
        return String.join(" | ", list);
    }

};

