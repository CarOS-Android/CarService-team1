package android.hardware.automotive.vehicle.V2_0;


public final class VmsPublisherInformationIntegerValuesIndex {
    public static final int MESSAGE_TYPE = 0;
    public static final int PUBLISHER_ID = 1;
    public static final String toString(int o) {
        if (o == MESSAGE_TYPE) {
            return "MESSAGE_TYPE";
        }
        if (o == PUBLISHER_ID) {
            return "PUBLISHER_ID";
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
        if (o != flipped) {
            list.add("0x" + Integer.toHexString(o & (~flipped)));
        }
        return String.join(" | ", list);
    }

};

