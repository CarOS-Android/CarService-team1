package android.hardware.automotive.vehicle.V2_0;


public final class ProcessTerminationReason {
    /**
     * A process doesn't respond to car watchdog within the timeout.
     */
    public static final int NOT_RESPONDING = 1;
    /**
     * A process uses more IO operations than what is allowed.
     */
    public static final int IO_OVERUSE = 2;
    /**
     * A process uses more memory space than what is allowed.
     */
    public static final int MEMORY_OVERUSE = 3;
    public static final String toString(int o) {
        if (o == NOT_RESPONDING) {
            return "NOT_RESPONDING";
        }
        if (o == IO_OVERUSE) {
            return "IO_OVERUSE";
        }
        if (o == MEMORY_OVERUSE) {
            return "MEMORY_OVERUSE";
        }
        return "0x" + Integer.toHexString(o);
    }

    public static final String dumpBitfield(int o) {
        java.util.ArrayList<String> list = new java.util.ArrayList<>();
        int flipped = 0;
        if ((o & NOT_RESPONDING) == NOT_RESPONDING) {
            list.add("NOT_RESPONDING");
            flipped |= NOT_RESPONDING;
        }
        if ((o & IO_OVERUSE) == IO_OVERUSE) {
            list.add("IO_OVERUSE");
            flipped |= IO_OVERUSE;
        }
        if ((o & MEMORY_OVERUSE) == MEMORY_OVERUSE) {
            list.add("MEMORY_OVERUSE");
            flipped |= MEMORY_OVERUSE;
        }
        if (o != flipped) {
            list.add("0x" + Integer.toHexString(o & (~flipped)));
        }
        return String.join(" | ", list);
    }

};

