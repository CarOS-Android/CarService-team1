package android.hardware.automotive.vehicle.V2_0;


public final class PortLocationType {
    /**
     * Default type if the vehicle does not know or report the Fuel door
     * and ev port location.
     */
    public static final int UNKNOWN = 0;
    public static final int FRONT_LEFT = 1;
    public static final int FRONT_RIGHT = 2;
    public static final int REAR_RIGHT = 3;
    public static final int REAR_LEFT = 4;
    public static final int FRONT = 5;
    public static final int REAR = 6;
    public static final String toString(int o) {
        if (o == UNKNOWN) {
            return "UNKNOWN";
        }
        if (o == FRONT_LEFT) {
            return "FRONT_LEFT";
        }
        if (o == FRONT_RIGHT) {
            return "FRONT_RIGHT";
        }
        if (o == REAR_RIGHT) {
            return "REAR_RIGHT";
        }
        if (o == REAR_LEFT) {
            return "REAR_LEFT";
        }
        if (o == FRONT) {
            return "FRONT";
        }
        if (o == REAR) {
            return "REAR";
        }
        return "0x" + Integer.toHexString(o);
    }

    public static final String dumpBitfield(int o) {
        java.util.ArrayList<String> list = new java.util.ArrayList<>();
        int flipped = 0;
        list.add("UNKNOWN"); // UNKNOWN == 0
        if ((o & FRONT_LEFT) == FRONT_LEFT) {
            list.add("FRONT_LEFT");
            flipped |= FRONT_LEFT;
        }
        if ((o & FRONT_RIGHT) == FRONT_RIGHT) {
            list.add("FRONT_RIGHT");
            flipped |= FRONT_RIGHT;
        }
        if ((o & REAR_RIGHT) == REAR_RIGHT) {
            list.add("REAR_RIGHT");
            flipped |= REAR_RIGHT;
        }
        if ((o & REAR_LEFT) == REAR_LEFT) {
            list.add("REAR_LEFT");
            flipped |= REAR_LEFT;
        }
        if ((o & FRONT) == FRONT) {
            list.add("FRONT");
            flipped |= FRONT;
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

