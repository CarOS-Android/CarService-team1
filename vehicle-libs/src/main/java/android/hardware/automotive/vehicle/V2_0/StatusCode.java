package android.hardware.automotive.vehicle.V2_0;


public final class StatusCode {
    public static final int OK = 0;
    /**
     * Try again.
     */
    public static final int TRY_AGAIN = 1;
    /**
     * Invalid argument provided.
     */
    public static final int INVALID_ARG = 2;
    /**
     * This code must be returned when device that associated with the vehicle
     * property is not available. For example, when client tries to set HVAC
     * temperature when the whole HVAC unit is turned OFF.
     */
    public static final int NOT_AVAILABLE = 3;
    /**
     * Access denied
     */
    public static final int ACCESS_DENIED = 4;
    /**
     * Something unexpected has happened in Vehicle HAL
     */
    public static final int INTERNAL_ERROR = 5;
    public static final String toString(int o) {
        if (o == OK) {
            return "OK";
        }
        if (o == TRY_AGAIN) {
            return "TRY_AGAIN";
        }
        if (o == INVALID_ARG) {
            return "INVALID_ARG";
        }
        if (o == NOT_AVAILABLE) {
            return "NOT_AVAILABLE";
        }
        if (o == ACCESS_DENIED) {
            return "ACCESS_DENIED";
        }
        if (o == INTERNAL_ERROR) {
            return "INTERNAL_ERROR";
        }
        return "0x" + Integer.toHexString(o);
    }

    public static final String dumpBitfield(int o) {
        java.util.ArrayList<String> list = new java.util.ArrayList<>();
        int flipped = 0;
        list.add("OK"); // OK == 0
        if ((o & TRY_AGAIN) == TRY_AGAIN) {
            list.add("TRY_AGAIN");
            flipped |= TRY_AGAIN;
        }
        if ((o & INVALID_ARG) == INVALID_ARG) {
            list.add("INVALID_ARG");
            flipped |= INVALID_ARG;
        }
        if ((o & NOT_AVAILABLE) == NOT_AVAILABLE) {
            list.add("NOT_AVAILABLE");
            flipped |= NOT_AVAILABLE;
        }
        if ((o & ACCESS_DENIED) == ACCESS_DENIED) {
            list.add("ACCESS_DENIED");
            flipped |= ACCESS_DENIED;
        }
        if ((o & INTERNAL_ERROR) == INTERNAL_ERROR) {
            list.add("INTERNAL_ERROR");
            flipped |= INTERNAL_ERROR;
        }
        if (o != flipped) {
            list.add("0x" + Integer.toHexString(o & (~flipped)));
        }
        return String.join(" | ", list);
    }

};

