package android.hardware.automotive.vehicle.V2_0;


public final class UserIdentificationAssociationValue {
    /**
     * Used when the status of an association could not be determined.
     * 
     * For example, in a set() request, it would indicate a failure to set the given type.
     */
    public static final int UNKNOWN = 1;
    /**
     * The identification type is associated with the current foreground Android user.
     */
    public static final int ASSOCIATED_CURRENT_USER = 2;
    /**
     * The identification type is associated with another Android user.
     */
    public static final int ASSOCIATED_ANOTHER_USER = 3;
    /**
     * The identification type is not associated with any Android user.
     */
    public static final int NOT_ASSOCIATED_ANY_USER = 4;
    public static final String toString(int o) {
        if (o == UNKNOWN) {
            return "UNKNOWN";
        }
        if (o == ASSOCIATED_CURRENT_USER) {
            return "ASSOCIATED_CURRENT_USER";
        }
        if (o == ASSOCIATED_ANOTHER_USER) {
            return "ASSOCIATED_ANOTHER_USER";
        }
        if (o == NOT_ASSOCIATED_ANY_USER) {
            return "NOT_ASSOCIATED_ANY_USER";
        }
        return "0x" + Integer.toHexString(o);
    }

    public static final String dumpBitfield(int o) {
        java.util.ArrayList<String> list = new java.util.ArrayList<>();
        int flipped = 0;
        if ((o & UNKNOWN) == UNKNOWN) {
            list.add("UNKNOWN");
            flipped |= UNKNOWN;
        }
        if ((o & ASSOCIATED_CURRENT_USER) == ASSOCIATED_CURRENT_USER) {
            list.add("ASSOCIATED_CURRENT_USER");
            flipped |= ASSOCIATED_CURRENT_USER;
        }
        if ((o & ASSOCIATED_ANOTHER_USER) == ASSOCIATED_ANOTHER_USER) {
            list.add("ASSOCIATED_ANOTHER_USER");
            flipped |= ASSOCIATED_ANOTHER_USER;
        }
        if ((o & NOT_ASSOCIATED_ANY_USER) == NOT_ASSOCIATED_ANY_USER) {
            list.add("NOT_ASSOCIATED_ANY_USER");
            flipped |= NOT_ASSOCIATED_ANY_USER;
        }
        if (o != flipped) {
            list.add("0x" + Integer.toHexString(o & (~flipped)));
        }
        return String.join(" | ", list);
    }

};

