package android.hardware.automotive.vehicle.V2_0;


public final class CustomInputType {
    /**
     * Ten functions representing the custom input code to be defined and implemented by OEM
     * partners.
     * 
     * OEMs need to formally contact Android team if more than 10 functions are required.
     */
    public static final int CUSTOM_EVENT_F1 = 1001;
    public static final int CUSTOM_EVENT_F2 = 1002;
    public static final int CUSTOM_EVENT_F3 = 1003;
    public static final int CUSTOM_EVENT_F4 = 1004;
    public static final int CUSTOM_EVENT_F5 = 1005;
    public static final int CUSTOM_EVENT_F6 = 1006;
    public static final int CUSTOM_EVENT_F7 = 1007;
    public static final int CUSTOM_EVENT_F8 = 1008;
    public static final int CUSTOM_EVENT_F9 = 1009;
    public static final int CUSTOM_EVENT_F10 = 1010;
    public static final String toString(int o) {
        if (o == CUSTOM_EVENT_F1) {
            return "CUSTOM_EVENT_F1";
        }
        if (o == CUSTOM_EVENT_F2) {
            return "CUSTOM_EVENT_F2";
        }
        if (o == CUSTOM_EVENT_F3) {
            return "CUSTOM_EVENT_F3";
        }
        if (o == CUSTOM_EVENT_F4) {
            return "CUSTOM_EVENT_F4";
        }
        if (o == CUSTOM_EVENT_F5) {
            return "CUSTOM_EVENT_F5";
        }
        if (o == CUSTOM_EVENT_F6) {
            return "CUSTOM_EVENT_F6";
        }
        if (o == CUSTOM_EVENT_F7) {
            return "CUSTOM_EVENT_F7";
        }
        if (o == CUSTOM_EVENT_F8) {
            return "CUSTOM_EVENT_F8";
        }
        if (o == CUSTOM_EVENT_F9) {
            return "CUSTOM_EVENT_F9";
        }
        if (o == CUSTOM_EVENT_F10) {
            return "CUSTOM_EVENT_F10";
        }
        return "0x" + Integer.toHexString(o);
    }

    public static final String dumpBitfield(int o) {
        java.util.ArrayList<String> list = new java.util.ArrayList<>();
        int flipped = 0;
        if ((o & CUSTOM_EVENT_F1) == CUSTOM_EVENT_F1) {
            list.add("CUSTOM_EVENT_F1");
            flipped |= CUSTOM_EVENT_F1;
        }
        if ((o & CUSTOM_EVENT_F2) == CUSTOM_EVENT_F2) {
            list.add("CUSTOM_EVENT_F2");
            flipped |= CUSTOM_EVENT_F2;
        }
        if ((o & CUSTOM_EVENT_F3) == CUSTOM_EVENT_F3) {
            list.add("CUSTOM_EVENT_F3");
            flipped |= CUSTOM_EVENT_F3;
        }
        if ((o & CUSTOM_EVENT_F4) == CUSTOM_EVENT_F4) {
            list.add("CUSTOM_EVENT_F4");
            flipped |= CUSTOM_EVENT_F4;
        }
        if ((o & CUSTOM_EVENT_F5) == CUSTOM_EVENT_F5) {
            list.add("CUSTOM_EVENT_F5");
            flipped |= CUSTOM_EVENT_F5;
        }
        if ((o & CUSTOM_EVENT_F6) == CUSTOM_EVENT_F6) {
            list.add("CUSTOM_EVENT_F6");
            flipped |= CUSTOM_EVENT_F6;
        }
        if ((o & CUSTOM_EVENT_F7) == CUSTOM_EVENT_F7) {
            list.add("CUSTOM_EVENT_F7");
            flipped |= CUSTOM_EVENT_F7;
        }
        if ((o & CUSTOM_EVENT_F8) == CUSTOM_EVENT_F8) {
            list.add("CUSTOM_EVENT_F8");
            flipped |= CUSTOM_EVENT_F8;
        }
        if ((o & CUSTOM_EVENT_F9) == CUSTOM_EVENT_F9) {
            list.add("CUSTOM_EVENT_F9");
            flipped |= CUSTOM_EVENT_F9;
        }
        if ((o & CUSTOM_EVENT_F10) == CUSTOM_EVENT_F10) {
            list.add("CUSTOM_EVENT_F10");
            flipped |= CUSTOM_EVENT_F10;
        }
        if (o != flipped) {
            list.add("0x" + Integer.toHexString(o & (~flipped)));
        }
        return String.join(" | ", list);
    }

};

