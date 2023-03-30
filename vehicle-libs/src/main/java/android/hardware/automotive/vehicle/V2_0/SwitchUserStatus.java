package android.hardware.automotive.vehicle.V2_0;


public final class SwitchUserStatus {
    /**
     * The request succeeded and the HAL user was switched.
     */
    public static final int SUCCESS = 1;
    /**
     * The request failed and the HAL user remained the same.
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

