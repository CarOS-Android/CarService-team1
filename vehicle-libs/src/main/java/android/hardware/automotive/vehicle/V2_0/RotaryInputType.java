package android.hardware.automotive.vehicle.V2_0;


public final class RotaryInputType {
    /**
     * Main rotary control, typically in the center console, used to navigate the user interface.
     */
    public static final int ROTARY_INPUT_TYPE_SYSTEM_NAVIGATION = 0;
    /**
     * Volume control for adjusting audio volume.
     */
    public static final int ROTARY_INPUT_TYPE_AUDIO_VOLUME = 1;
    public static final String toString(int o) {
        if (o == ROTARY_INPUT_TYPE_SYSTEM_NAVIGATION) {
            return "ROTARY_INPUT_TYPE_SYSTEM_NAVIGATION";
        }
        if (o == ROTARY_INPUT_TYPE_AUDIO_VOLUME) {
            return "ROTARY_INPUT_TYPE_AUDIO_VOLUME";
        }
        return "0x" + Integer.toHexString(o);
    }

    public static final String dumpBitfield(int o) {
        java.util.ArrayList<String> list = new java.util.ArrayList<>();
        int flipped = 0;
        list.add("ROTARY_INPUT_TYPE_SYSTEM_NAVIGATION"); // ROTARY_INPUT_TYPE_SYSTEM_NAVIGATION == 0
        if ((o & ROTARY_INPUT_TYPE_AUDIO_VOLUME) == ROTARY_INPUT_TYPE_AUDIO_VOLUME) {
            list.add("ROTARY_INPUT_TYPE_AUDIO_VOLUME");
            flipped |= ROTARY_INPUT_TYPE_AUDIO_VOLUME;
        }
        if (o != flipped) {
            list.add("0x" + Integer.toHexString(o & (~flipped)));
        }
        return String.join(" | ", list);
    }

};

