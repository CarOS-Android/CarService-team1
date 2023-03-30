package android.hardware.automotive.vehicle.V2_0;


public final class SwitchUserMessageType {
    public static final int LEGACY_ANDROID_SWITCH = 1;
    public static final int ANDROID_SWITCH = 2;
    public static final int VEHICLE_RESPONSE = 3;
    public static final int VEHICLE_REQUEST = 4;
    public static final int ANDROID_POST_SWITCH = 5;
    public static final String toString(int o) {
        if (o == LEGACY_ANDROID_SWITCH) {
            return "LEGACY_ANDROID_SWITCH";
        }
        if (o == ANDROID_SWITCH) {
            return "ANDROID_SWITCH";
        }
        if (o == VEHICLE_RESPONSE) {
            return "VEHICLE_RESPONSE";
        }
        if (o == VEHICLE_REQUEST) {
            return "VEHICLE_REQUEST";
        }
        if (o == ANDROID_POST_SWITCH) {
            return "ANDROID_POST_SWITCH";
        }
        return "0x" + Integer.toHexString(o);
    }

    public static final String dumpBitfield(int o) {
        java.util.ArrayList<String> list = new java.util.ArrayList<>();
        int flipped = 0;
        if ((o & LEGACY_ANDROID_SWITCH) == LEGACY_ANDROID_SWITCH) {
            list.add("LEGACY_ANDROID_SWITCH");
            flipped |= LEGACY_ANDROID_SWITCH;
        }
        if ((o & ANDROID_SWITCH) == ANDROID_SWITCH) {
            list.add("ANDROID_SWITCH");
            flipped |= ANDROID_SWITCH;
        }
        if ((o & VEHICLE_RESPONSE) == VEHICLE_RESPONSE) {
            list.add("VEHICLE_RESPONSE");
            flipped |= VEHICLE_RESPONSE;
        }
        if ((o & VEHICLE_REQUEST) == VEHICLE_REQUEST) {
            list.add("VEHICLE_REQUEST");
            flipped |= VEHICLE_REQUEST;
        }
        if ((o & ANDROID_POST_SWITCH) == ANDROID_POST_SWITCH) {
            list.add("ANDROID_POST_SWITCH");
            flipped |= ANDROID_POST_SWITCH;
        }
        if (o != flipped) {
            list.add("0x" + Integer.toHexString(o & (~flipped)));
        }
        return String.join(" | ", list);
    }

};

