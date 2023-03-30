package android.hardware.automotive.vehicle.V2_0;


public final class UserFlags {
    /**
     * No flags.
     */
    public static final int NONE = 0 /* 0x0 */;
    /**
     * System user.
     * On automotive, that user is always running, although never on foreground (except during
     * boot or exceptional circumstances).
     */
    public static final int SYSTEM = 1 /* 0x01 */;
    /**
     * Guest users have restrictions.
     */
    public static final int GUEST = 2 /* 0x02 */;
    /**
     * Ephemeral users have non-persistent state.
     */
    public static final int EPHEMERAL = 4 /* 0x04 */;
    /**
     * Admin users have additional privileges such as permission to create other users.
     */
    public static final int ADMIN = 8 /* 0x08 */;
    /**
     * Disabled users are marked for deletion.
     */
    public static final int DISABLED = 16 /* 0x10 */;
    /**
     * Profile user is a profile of another user.
     */
    public static final int PROFILE = 32 /* 0x20 */;
    public static final String toString(int o) {
        if (o == NONE) {
            return "NONE";
        }
        if (o == SYSTEM) {
            return "SYSTEM";
        }
        if (o == GUEST) {
            return "GUEST";
        }
        if (o == EPHEMERAL) {
            return "EPHEMERAL";
        }
        if (o == ADMIN) {
            return "ADMIN";
        }
        if (o == DISABLED) {
            return "DISABLED";
        }
        if (o == PROFILE) {
            return "PROFILE";
        }
        return "0x" + Integer.toHexString(o);
    }

    public static final String dumpBitfield(int o) {
        java.util.ArrayList<String> list = new java.util.ArrayList<>();
        int flipped = 0;
        list.add("NONE"); // NONE == 0
        if ((o & SYSTEM) == SYSTEM) {
            list.add("SYSTEM");
            flipped |= SYSTEM;
        }
        if ((o & GUEST) == GUEST) {
            list.add("GUEST");
            flipped |= GUEST;
        }
        if ((o & EPHEMERAL) == EPHEMERAL) {
            list.add("EPHEMERAL");
            flipped |= EPHEMERAL;
        }
        if ((o & ADMIN) == ADMIN) {
            list.add("ADMIN");
            flipped |= ADMIN;
        }
        if ((o & DISABLED) == DISABLED) {
            list.add("DISABLED");
            flipped |= DISABLED;
        }
        if ((o & PROFILE) == PROFILE) {
            list.add("PROFILE");
            flipped |= PROFILE;
        }
        if (o != flipped) {
            list.add("0x" + Integer.toHexString(o & (~flipped)));
        }
        return String.join(" | ", list);
    }

};

