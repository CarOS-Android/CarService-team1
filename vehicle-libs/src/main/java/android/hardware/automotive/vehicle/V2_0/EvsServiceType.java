package android.hardware.automotive.vehicle.V2_0;


public final class EvsServiceType {
    public static final int REARVIEW = 0;
    public static final int SURROUNDVIEW = 1;
    public static final String toString(int o) {
        if (o == REARVIEW) {
            return "REARVIEW";
        }
        if (o == SURROUNDVIEW) {
            return "SURROUNDVIEW";
        }
        return "0x" + Integer.toHexString(o);
    }

    public static final String dumpBitfield(int o) {
        java.util.ArrayList<String> list = new java.util.ArrayList<>();
        int flipped = 0;
        list.add("REARVIEW"); // REARVIEW == 0
        if ((o & SURROUNDVIEW) == SURROUNDVIEW) {
            list.add("SURROUNDVIEW");
            flipped |= SURROUNDVIEW;
        }
        if (o != flipped) {
            list.add("0x" + Integer.toHexString(o & (~flipped)));
        }
        return String.join(" | ", list);
    }

};

