package android.hardware.automotive.vehicle.V2_0;


public final class ElectronicTollCollectionCardStatus {
    public static final int UNKNOWN = 0;
    public static final int ELECTRONIC_TOLL_COLLECTION_CARD_VALID = 1;
    public static final int ELECTRONIC_TOLL_COLLECTION_CARD_INVALID = 2;
    public static final int ELECTRONIC_TOLL_COLLECTION_CARD_NOT_INSERTED = 3;
    public static final String toString(int o) {
        if (o == UNKNOWN) {
            return "UNKNOWN";
        }
        if (o == ELECTRONIC_TOLL_COLLECTION_CARD_VALID) {
            return "ELECTRONIC_TOLL_COLLECTION_CARD_VALID";
        }
        if (o == ELECTRONIC_TOLL_COLLECTION_CARD_INVALID) {
            return "ELECTRONIC_TOLL_COLLECTION_CARD_INVALID";
        }
        if (o == ELECTRONIC_TOLL_COLLECTION_CARD_NOT_INSERTED) {
            return "ELECTRONIC_TOLL_COLLECTION_CARD_NOT_INSERTED";
        }
        return "0x" + Integer.toHexString(o);
    }

    public static final String dumpBitfield(int o) {
        java.util.ArrayList<String> list = new java.util.ArrayList<>();
        int flipped = 0;
        list.add("UNKNOWN"); // UNKNOWN == 0
        if ((o & ELECTRONIC_TOLL_COLLECTION_CARD_VALID) == ELECTRONIC_TOLL_COLLECTION_CARD_VALID) {
            list.add("ELECTRONIC_TOLL_COLLECTION_CARD_VALID");
            flipped |= ELECTRONIC_TOLL_COLLECTION_CARD_VALID;
        }
        if ((o & ELECTRONIC_TOLL_COLLECTION_CARD_INVALID) == ELECTRONIC_TOLL_COLLECTION_CARD_INVALID) {
            list.add("ELECTRONIC_TOLL_COLLECTION_CARD_INVALID");
            flipped |= ELECTRONIC_TOLL_COLLECTION_CARD_INVALID;
        }
        if ((o & ELECTRONIC_TOLL_COLLECTION_CARD_NOT_INSERTED) == ELECTRONIC_TOLL_COLLECTION_CARD_NOT_INSERTED) {
            list.add("ELECTRONIC_TOLL_COLLECTION_CARD_NOT_INSERTED");
            flipped |= ELECTRONIC_TOLL_COLLECTION_CARD_NOT_INSERTED;
        }
        if (o != flipped) {
            list.add("0x" + Integer.toHexString(o & (~flipped)));
        }
        return String.join(" | ", list);
    }

};

