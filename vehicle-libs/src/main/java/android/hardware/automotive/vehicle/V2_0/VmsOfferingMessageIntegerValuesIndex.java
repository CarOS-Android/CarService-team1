package android.hardware.automotive.vehicle.V2_0;


public final class VmsOfferingMessageIntegerValuesIndex {
    public static final int MESSAGE_TYPE = 0;
    public static final int PUBLISHER_ID = 1;
    public static final int NUMBER_OF_OFFERS = 2;
    public static final int OFFERING_START = 3;
    public static final String toString(int o) {
        if (o == MESSAGE_TYPE) {
            return "MESSAGE_TYPE";
        }
        if (o == PUBLISHER_ID) {
            return "PUBLISHER_ID";
        }
        if (o == NUMBER_OF_OFFERS) {
            return "NUMBER_OF_OFFERS";
        }
        if (o == OFFERING_START) {
            return "OFFERING_START";
        }
        return "0x" + Integer.toHexString(o);
    }

    public static final String dumpBitfield(int o) {
        java.util.ArrayList<String> list = new java.util.ArrayList<>();
        int flipped = 0;
        list.add("MESSAGE_TYPE"); // MESSAGE_TYPE == 0
        if ((o & PUBLISHER_ID) == PUBLISHER_ID) {
            list.add("PUBLISHER_ID");
            flipped |= PUBLISHER_ID;
        }
        if ((o & NUMBER_OF_OFFERS) == NUMBER_OF_OFFERS) {
            list.add("NUMBER_OF_OFFERS");
            flipped |= NUMBER_OF_OFFERS;
        }
        if ((o & OFFERING_START) == OFFERING_START) {
            list.add("OFFERING_START");
            flipped |= OFFERING_START;
        }
        if (o != flipped) {
            list.add("0x" + Integer.toHexString(o & (~flipped)));
        }
        return String.join(" | ", list);
    }

};

