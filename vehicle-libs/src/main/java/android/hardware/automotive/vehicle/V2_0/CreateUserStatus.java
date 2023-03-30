package android.hardware.automotive.vehicle.V2_0;


public final class CreateUserStatus {
    /**
     * The request succeeded (for example, HAL created a new internal user, or associated the
     * Android user to an existing internal user).
     */
    public static final int SUCCESS = 1;
    /**
     * The request failed (and Android will remove the Android user).
     */
    public static final int FAILURE = 2;
    public static final String toString(int o) {
        if (o == SUCCESS) {
            return "SUCCESS";
        }
        if (o == FAILURE) {
            return "FAILURE";
        }
        return "0x" + Integer.toHexString(o);
    }

    public static final String dumpBitfield(int o) {
        java.util.ArrayList<String> list = new java.util.ArrayList<>();
        int flipped = 0;
        if ((o & SUCCESS) == SUCCESS) {
            list.add("SUCCESS");
            flipped |= SUCCESS;
        }
        if ((o & FAILURE) == FAILURE) {
            list.add("FAILURE");
            flipped |= FAILURE;
        }
        if (o != flipped) {
            list.add("0x" + Integer.toHexString(o & (~flipped)));
        }
        return String.join(" | ", list);
    }

};

