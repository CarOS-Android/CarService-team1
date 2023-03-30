package android.hardware.automotive.vehicle.V2_0;


public final class EvsServiceRequestIndex {
    public static final int TYPE = 0;
    public static final int STATE = 1;
    public static final String toString(int o) {
        if (o == TYPE) {
            return "TYPE";
        }
        if (o == STATE) {
            return "STATE";
        }
        return "0x" + Integer.toHexString(o);
    }

    public static final String dumpBitfield(int o) {
        java.util.ArrayList<String> list = new java.util.ArrayList<>();
        int flipped = 0;
        list.add("TYPE"); // TYPE == 0
        if ((o & STATE) == STATE) {
            list.add("STATE");
            flipped |= STATE;
        }
        if (o != flipped) {
            list.add("0x" + Integer.toHexString(o & (~flipped)));
        }
        return String.join(" | ", list);
    }

};

