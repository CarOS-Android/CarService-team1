package android.hardware.automotive.vehicle.V2_0;


public final class ElectronicTollCollectionCardType {
    public static final int UNKNOWN = 0;
    public static final int JP_ELECTRONIC_TOLL_COLLECTION_CARD = 1;
    public static final int JP_ELECTRONIC_TOLL_COLLECTION_CARD_V2 = 2;
    public static final String toString(int o) {
        if (o == UNKNOWN) {
            return "UNKNOWN";
        }
        if (o == JP_ELECTRONIC_TOLL_COLLECTION_CARD) {
            return "JP_ELECTRONIC_TOLL_COLLECTION_CARD";
        }
        if (o == JP_ELECTRONIC_TOLL_COLLECTION_CARD_V2) {
            return "JP_ELECTRONIC_TOLL_COLLECTION_CARD_V2";
        }
        return "0x" + Integer.toHexString(o);
    }

    public static final String dumpBitfield(int o) {
        java.util.ArrayList<String> list = new java.util.ArrayList<>();
        int flipped = 0;
        list.add("UNKNOWN"); // UNKNOWN == 0
        if ((o & JP_ELECTRONIC_TOLL_COLLECTION_CARD) == JP_ELECTRONIC_TOLL_COLLECTION_CARD) {
            list.add("JP_ELECTRONIC_TOLL_COLLECTION_CARD");
            flipped |= JP_ELECTRONIC_TOLL_COLLECTION_CARD;
        }
        if ((o & JP_ELECTRONIC_TOLL_COLLECTION_CARD_V2) == JP_ELECTRONIC_TOLL_COLLECTION_CARD_V2) {
            list.add("JP_ELECTRONIC_TOLL_COLLECTION_CARD_V2");
            flipped |= JP_ELECTRONIC_TOLL_COLLECTION_CARD_V2;
        }
        if (o != flipped) {
            list.add("0x" + Integer.toHexString(o & (~flipped)));
        }
        return String.join(" | ", list);
    }

};

