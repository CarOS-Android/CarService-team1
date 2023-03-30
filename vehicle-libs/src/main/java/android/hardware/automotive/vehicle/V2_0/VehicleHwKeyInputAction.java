package android.hardware.automotive.vehicle.V2_0;


public final class VehicleHwKeyInputAction {
    /**
     * Key down
     */
    public static final int ACTION_DOWN = 0;
    /**
     * Key up
     */
    public static final int ACTION_UP = 1;
    public static final String toString(int o) {
        if (o == ACTION_DOWN) {
            return "ACTION_DOWN";
        }
        if (o == ACTION_UP) {
            return "ACTION_UP";
        }
        return "0x" + Integer.toHexString(o);
    }

    public static final String dumpBitfield(int o) {
        java.util.ArrayList<String> list = new java.util.ArrayList<>();
        int flipped = 0;
        list.add("ACTION_DOWN"); // ACTION_DOWN == 0
        if ((o & ACTION_UP) == ACTION_UP) {
            list.add("ACTION_UP");
            flipped |= ACTION_UP;
        }
        if (o != flipped) {
            list.add("0x" + Integer.toHexString(o & (~flipped)));
        }
        return String.join(" | ", list);
    }

};

