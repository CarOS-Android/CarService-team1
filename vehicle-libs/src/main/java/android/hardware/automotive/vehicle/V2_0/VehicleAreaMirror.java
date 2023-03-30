package android.hardware.automotive.vehicle.V2_0;


public final class VehicleAreaMirror {
    public static final int DRIVER_LEFT = 1 /* 0x00000001 */;
    public static final int DRIVER_RIGHT = 2 /* 0x00000002 */;
    public static final int DRIVER_CENTER = 4 /* 0x00000004 */;
    public static final String toString(int o) {
        if (o == DRIVER_LEFT) {
            return "DRIVER_LEFT";
        }
        if (o == DRIVER_RIGHT) {
            return "DRIVER_RIGHT";
        }
        if (o == DRIVER_CENTER) {
            return "DRIVER_CENTER";
        }
        return "0x" + Integer.toHexString(o);
    }

    public static final String dumpBitfield(int o) {
        java.util.ArrayList<String> list = new java.util.ArrayList<>();
        int flipped = 0;
        if ((o & DRIVER_LEFT) == DRIVER_LEFT) {
            list.add("DRIVER_LEFT");
            flipped |= DRIVER_LEFT;
        }
        if ((o & DRIVER_RIGHT) == DRIVER_RIGHT) {
            list.add("DRIVER_RIGHT");
            flipped |= DRIVER_RIGHT;
        }
        if ((o & DRIVER_CENTER) == DRIVER_CENTER) {
            list.add("DRIVER_CENTER");
            flipped |= DRIVER_CENTER;
        }
        if (o != flipped) {
            list.add("0x" + Integer.toHexString(o & (~flipped)));
        }
        return String.join(" | ", list);
    }

};

