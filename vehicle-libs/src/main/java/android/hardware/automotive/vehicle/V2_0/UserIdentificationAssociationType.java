package android.hardware.automotive.vehicle.V2_0;


public final class UserIdentificationAssociationType {
    /**
     * Key used to unlock the car.
     */
    public static final int KEY_FOB = 1;
    /**
     * Custom mechanism defined by the OEM.
     */
    public static final int CUSTOM_1 = 101;
    /**
     * Custom mechanism defined by the OEM.
     */
    public static final int CUSTOM_2 = 102;
    /**
     * Custom mechanism defined by the OEM.
     */
    public static final int CUSTOM_3 = 103;
    /**
     * Custom mechanism defined by the OEM.
     */
    public static final int CUSTOM_4 = 104;
    public static final String toString(int o) {
        if (o == KEY_FOB) {
            return "KEY_FOB";
        }
        if (o == CUSTOM_1) {
            return "CUSTOM_1";
        }
        if (o == CUSTOM_2) {
            return "CUSTOM_2";
        }
        if (o == CUSTOM_3) {
            return "CUSTOM_3";
        }
        if (o == CUSTOM_4) {
            return "CUSTOM_4";
        }
        return "0x" + Integer.toHexString(o);
    }

    public static final String dumpBitfield(int o) {
        java.util.ArrayList<String> list = new java.util.ArrayList<>();
        int flipped = 0;
        if ((o & KEY_FOB) == KEY_FOB) {
            list.add("KEY_FOB");
            flipped |= KEY_FOB;
        }
        if ((o & CUSTOM_1) == CUSTOM_1) {
            list.add("CUSTOM_1");
            flipped |= CUSTOM_1;
        }
        if ((o & CUSTOM_2) == CUSTOM_2) {
            list.add("CUSTOM_2");
            flipped |= CUSTOM_2;
        }
        if ((o & CUSTOM_3) == CUSTOM_3) {
            list.add("CUSTOM_3");
            flipped |= CUSTOM_3;
        }
        if ((o & CUSTOM_4) == CUSTOM_4) {
            list.add("CUSTOM_4");
            flipped |= CUSTOM_4;
        }
        if (o != flipped) {
            list.add("0x" + Integer.toHexString(o & (~flipped)));
        }
        return String.join(" | ", list);
    }

};

