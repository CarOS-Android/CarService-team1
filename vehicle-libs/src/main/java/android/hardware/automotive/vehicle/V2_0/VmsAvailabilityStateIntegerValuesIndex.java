package android.hardware.automotive.vehicle.V2_0;


public final class VmsAvailabilityStateIntegerValuesIndex {
    public static final int MESSAGE_TYPE = 0;
    public static final int SEQUENCE_NUMBER = 1;
    public static final int NUMBER_OF_ASSOCIATED_LAYERS = 2;
    public static final int LAYERS_START = 3;
    public static final String toString(int o) {
        if (o == MESSAGE_TYPE) {
            return "MESSAGE_TYPE";
        }
        if (o == SEQUENCE_NUMBER) {
            return "SEQUENCE_NUMBER";
        }
        if (o == NUMBER_OF_ASSOCIATED_LAYERS) {
            return "NUMBER_OF_ASSOCIATED_LAYERS";
        }
        if (o == LAYERS_START) {
            return "LAYERS_START";
        }
        return "0x" + Integer.toHexString(o);
    }

    public static final String dumpBitfield(int o) {
        java.util.ArrayList<String> list = new java.util.ArrayList<>();
        int flipped = 0;
        list.add("MESSAGE_TYPE"); // MESSAGE_TYPE == 0
        if ((o & SEQUENCE_NUMBER) == SEQUENCE_NUMBER) {
            list.add("SEQUENCE_NUMBER");
            flipped |= SEQUENCE_NUMBER;
        }
        if ((o & NUMBER_OF_ASSOCIATED_LAYERS) == NUMBER_OF_ASSOCIATED_LAYERS) {
            list.add("NUMBER_OF_ASSOCIATED_LAYERS");
            flipped |= NUMBER_OF_ASSOCIATED_LAYERS;
        }
        if ((o & LAYERS_START) == LAYERS_START) {
            list.add("LAYERS_START");
            flipped |= LAYERS_START;
        }
        if (o != flipped) {
            list.add("0x" + Integer.toHexString(o & (~flipped)));
        }
        return String.join(" | ", list);
    }

};

