package android.hardware.automotive.vehicle.V2_0;


public final class UserIdentificationAssociationSetValue {
    /**
     * Associate the identification type with the current foreground Android user.
     */
    public static final int ASSOCIATE_CURRENT_USER = 1;
    /**
     * Disassociate the identification type from the current foreground Android user.
     */
    public static final int DISASSOCIATE_CURRENT_USER = 2;
    /**
     * Disassociate the identification type from all Android users.
     */
    public static final int DISASSOCIATE_ALL_USERS = 3;
    public static final String toString(int o) {
        if (o == ASSOCIATE_CURRENT_USER) {
            return "ASSOCIATE_CURRENT_USER";
        }
        if (o == DISASSOCIATE_CURRENT_USER) {
            return "DISASSOCIATE_CURRENT_USER";
        }
        if (o == DISASSOCIATE_ALL_USERS) {
            return "DISASSOCIATE_ALL_USERS";
        }
        return "0x" + Integer.toHexString(o);
    }

    public static final String dumpBitfield(int o) {
        java.util.ArrayList<String> list = new java.util.ArrayList<>();
        int flipped = 0;
        if ((o & ASSOCIATE_CURRENT_USER) == ASSOCIATE_CURRENT_USER) {
            list.add("ASSOCIATE_CURRENT_USER");
            flipped |= ASSOCIATE_CURRENT_USER;
        }
        if ((o & DISASSOCIATE_CURRENT_USER) == DISASSOCIATE_CURRENT_USER) {
            list.add("DISASSOCIATE_CURRENT_USER");
            flipped |= DISASSOCIATE_CURRENT_USER;
        }
        if ((o & DISASSOCIATE_ALL_USERS) == DISASSOCIATE_ALL_USERS) {
            list.add("DISASSOCIATE_ALL_USERS");
            flipped |= DISASSOCIATE_ALL_USERS;
        }
        if (o != flipped) {
            list.add("0x" + Integer.toHexString(o & (~flipped)));
        }
        return String.join(" | ", list);
    }

};

