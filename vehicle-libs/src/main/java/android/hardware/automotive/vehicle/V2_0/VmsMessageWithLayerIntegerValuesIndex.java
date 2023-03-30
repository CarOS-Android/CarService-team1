package android.hardware.automotive.vehicle.V2_0;


public final class VmsMessageWithLayerIntegerValuesIndex {
    public static final int MESSAGE_TYPE = 0;
    public static final int LAYER_TYPE = 1;
    public static final int LAYER_SUBTYPE = 2;
    public static final int LAYER_VERSION = 3;
    public static final String toString(int o) {
        if (o == MESSAGE_TYPE) {
            return "MESSAGE_TYPE";
        }
        if (o == LAYER_TYPE) {
            return "LAYER_TYPE";
        }
        if (o == LAYER_SUBTYPE) {
            return "LAYER_SUBTYPE";
        }
        if (o == LAYER_VERSION) {
            return "LAYER_VERSION";
        }
        return "0x" + Integer.toHexString(o);
    }

    public static final String dumpBitfield(int o) {
        java.util.ArrayList<String> list = new java.util.ArrayList<>();
        int flipped = 0;
        list.add("MESSAGE_TYPE"); // MESSAGE_TYPE == 0
        if ((o & LAYER_TYPE) == LAYER_TYPE) {
            list.add("LAYER_TYPE");
            flipped |= LAYER_TYPE;
        }
        if ((o & LAYER_SUBTYPE) == LAYER_SUBTYPE) {
            list.add("LAYER_SUBTYPE");
            flipped |= LAYER_SUBTYPE;
        }
        if ((o & LAYER_VERSION) == LAYER_VERSION) {
            list.add("LAYER_VERSION");
            flipped |= LAYER_VERSION;
        }
        if (o != flipped) {
            list.add("0x" + Integer.toHexString(o & (~flipped)));
        }
        return String.join(" | ", list);
    }

};

