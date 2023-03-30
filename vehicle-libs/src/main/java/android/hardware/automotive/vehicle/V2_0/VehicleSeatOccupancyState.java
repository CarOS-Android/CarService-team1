package android.hardware.automotive.vehicle.V2_0;


public final class VehicleSeatOccupancyState {
    public static final int UNKNOWN = 0;
    public static final int VACANT = 1;
    public static final int OCCUPIED = 2;
    public static final String toString(int o) {
        if (o == UNKNOWN) {
            return "UNKNOWN";
        }
        if (o == VACANT) {
            return "VACANT";
        }
        if (o == OCCUPIED) {
            return "OCCUPIED";
        }
        return "0x" + Integer.toHexString(o);
    }

    public static final String dumpBitfield(int o) {
        java.util.ArrayList<String> list = new java.util.ArrayList<>();
        int flipped = 0;
        list.add("UNKNOWN"); // UNKNOWN == 0
        if ((o & VACANT) == VACANT) {
            list.add("VACANT");
            flipped |= VACANT;
        }
        if ((o & OCCUPIED) == OCCUPIED) {
            list.add("OCCUPIED");
            flipped |= OCCUPIED;
        }
        if (o != flipped) {
            list.add("0x" + Integer.toHexString(o & (~flipped)));
        }
        return String.join(" | ", list);
    }

};

