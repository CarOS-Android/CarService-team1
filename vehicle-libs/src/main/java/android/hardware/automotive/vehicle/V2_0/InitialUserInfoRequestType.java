package android.hardware.automotive.vehicle.V2_0;


public final class InitialUserInfoRequestType {
    /**
     * At the first time Android was booted (or after a factory reset).
     */
    public static final int FIRST_BOOT = 1;
    /**
     * At the first time Android was booted after the system was updated.
     */
    public static final int FIRST_BOOT_AFTER_OTA = 2;
    /**
     * When Android was booted "from scratch".
     */
    public static final int COLD_BOOT = 3;
    /**
     * When Android was resumed after the system was suspended to memory.
     */
    public static final int RESUME = 4;
    public static final String toString(int o) {
        if (o == FIRST_BOOT) {
            return "FIRST_BOOT";
        }
        if (o == FIRST_BOOT_AFTER_OTA) {
            return "FIRST_BOOT_AFTER_OTA";
        }
        if (o == COLD_BOOT) {
            return "COLD_BOOT";
        }
        if (o == RESUME) {
            return "RESUME";
        }
        return "0x" + Integer.toHexString(o);
    }

    public static final String dumpBitfield(int o) {
        java.util.ArrayList<String> list = new java.util.ArrayList<>();
        int flipped = 0;
        if ((o & FIRST_BOOT) == FIRST_BOOT) {
            list.add("FIRST_BOOT");
            flipped |= FIRST_BOOT;
        }
        if ((o & FIRST_BOOT_AFTER_OTA) == FIRST_BOOT_AFTER_OTA) {
            list.add("FIRST_BOOT_AFTER_OTA");
            flipped |= FIRST_BOOT_AFTER_OTA;
        }
        if ((o & COLD_BOOT) == COLD_BOOT) {
            list.add("COLD_BOOT");
            flipped |= COLD_BOOT;
        }
        if ((o & RESUME) == RESUME) {
            list.add("RESUME");
            flipped |= RESUME;
        }
        if (o != flipped) {
            list.add("0x" + Integer.toHexString(o & (~flipped)));
        }
        return String.join(" | ", list);
    }

};

