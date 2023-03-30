package android.hardware.automotive.vehicle.V2_0;


public final class InitialUserInfoResponseAction {
    /**
     * Let the Android System decide what to do.
     * 
     * For example, it might create a new user on first boot, and switch to the last
     * active user afterwards.
     */
    public static final int DEFAULT = 0;
    /**
     * Switch to an existing Android user.
     */
    public static final int SWITCH = 1;
    /**
     * Create a new Android user (and switch to it).
     */
    public static final int CREATE = 2;
    public static final String toString(int o) {
        if (o == DEFAULT) {
            return "DEFAULT";
        }
        if (o == SWITCH) {
            return "SWITCH";
        }
        if (o == CREATE) {
            return "CREATE";
        }
        return "0x" + Integer.toHexString(o);
    }

    public static final String dumpBitfield(int o) {
        java.util.ArrayList<String> list = new java.util.ArrayList<>();
        int flipped = 0;
        list.add("DEFAULT"); // DEFAULT == 0
        if ((o & SWITCH) == SWITCH) {
            list.add("SWITCH");
            flipped |= SWITCH;
        }
        if ((o & CREATE) == CREATE) {
            list.add("CREATE");
            flipped |= CREATE;
        }
        if (o != flipped) {
            list.add("0x" + Integer.toHexString(o & (~flipped)));
        }
        return String.join(" | ", list);
    }

};

