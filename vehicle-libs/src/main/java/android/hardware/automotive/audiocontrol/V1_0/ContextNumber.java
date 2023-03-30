package android.hardware.automotive.audiocontrol.V1_0;


public final class ContextNumber {
    public static final int INVALID = 0;
    public static final int MUSIC = 1 /* (::android::hardware::automotive::audiocontrol::V1_0::ContextNumber.INVALID implicitly + 1) */;
    public static final int NAVIGATION = 2 /* (::android::hardware::automotive::audiocontrol::V1_0::ContextNumber.MUSIC implicitly + 1) */;
    public static final int VOICE_COMMAND = 3 /* (::android::hardware::automotive::audiocontrol::V1_0::ContextNumber.NAVIGATION implicitly + 1) */;
    public static final int CALL_RING = 4 /* (::android::hardware::automotive::audiocontrol::V1_0::ContextNumber.VOICE_COMMAND implicitly + 1) */;
    public static final int CALL = 5 /* (::android::hardware::automotive::audiocontrol::V1_0::ContextNumber.CALL_RING implicitly + 1) */;
    public static final int ALARM = 6 /* (::android::hardware::automotive::audiocontrol::V1_0::ContextNumber.CALL implicitly + 1) */;
    public static final int NOTIFICATION = 7 /* (::android::hardware::automotive::audiocontrol::V1_0::ContextNumber.ALARM implicitly + 1) */;
    public static final int SYSTEM_SOUND = 8 /* (::android::hardware::automotive::audiocontrol::V1_0::ContextNumber.NOTIFICATION implicitly + 1) */;
    public static final String toString(int o) {
        if (o == INVALID) {
            return "INVALID";
        }
        if (o == MUSIC) {
            return "MUSIC";
        }
        if (o == NAVIGATION) {
            return "NAVIGATION";
        }
        if (o == VOICE_COMMAND) {
            return "VOICE_COMMAND";
        }
        if (o == CALL_RING) {
            return "CALL_RING";
        }
        if (o == CALL) {
            return "CALL";
        }
        if (o == ALARM) {
            return "ALARM";
        }
        if (o == NOTIFICATION) {
            return "NOTIFICATION";
        }
        if (o == SYSTEM_SOUND) {
            return "SYSTEM_SOUND";
        }
        return "0x" + Integer.toHexString(o);
    }

    public static final String dumpBitfield(int o) {
        java.util.ArrayList<String> list = new java.util.ArrayList<>();
        int flipped = 0;
        list.add("INVALID"); // INVALID == 0
        if ((o & MUSIC) == MUSIC) {
            list.add("MUSIC");
            flipped |= MUSIC;
        }
        if ((o & NAVIGATION) == NAVIGATION) {
            list.add("NAVIGATION");
            flipped |= NAVIGATION;
        }
        if ((o & VOICE_COMMAND) == VOICE_COMMAND) {
            list.add("VOICE_COMMAND");
            flipped |= VOICE_COMMAND;
        }
        if ((o & CALL_RING) == CALL_RING) {
            list.add("CALL_RING");
            flipped |= CALL_RING;
        }
        if ((o & CALL) == CALL) {
            list.add("CALL");
            flipped |= CALL;
        }
        if ((o & ALARM) == ALARM) {
            list.add("ALARM");
            flipped |= ALARM;
        }
        if ((o & NOTIFICATION) == NOTIFICATION) {
            list.add("NOTIFICATION");
            flipped |= NOTIFICATION;
        }
        if ((o & SYSTEM_SOUND) == SYSTEM_SOUND) {
            list.add("SYSTEM_SOUND");
            flipped |= SYSTEM_SOUND;
        }
        if (o != flipped) {
            list.add("0x" + Integer.toHexString(o & (~flipped)));
        }
        return String.join(" | ", list);
    }

};

