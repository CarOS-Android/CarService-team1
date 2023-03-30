package android.hardware.automotive.vehicle.V2_0;


public final class VehiclePropertyGroup {
    /**
     * Properties declared in AOSP must use this flag.
     */
    public static final int SYSTEM = 268435456 /* 0x10000000 */;
    /**
     * Properties declared by vendors must use this flag.
     */
    public static final int VENDOR = 536870912 /* 0x20000000 */;
    public static final int MASK = -268435456 /* 0xf0000000 */;
    public static final String toString(int o) {
        if (o == SYSTEM) {
            return "SYSTEM";
        }
        if (o == VENDOR) {
            return "VENDOR";
        }
        if (o == MASK) {
            return "MASK";
        }
        return "0x" + Integer.toHexString(o);
    }

    public static final String dumpBitfield(int o) {
        java.util.ArrayList<String> list = new java.util.ArrayList<>();
        int flipped = 0;
        if ((o & SYSTEM) == SYSTEM) {
            list.add("SYSTEM");
            flipped |= SYSTEM;
        }
        if ((o & VENDOR) == VENDOR) {
            list.add("VENDOR");
            flipped |= VENDOR;
        }
        if ((o & MASK) == MASK) {
            list.add("MASK");
            flipped |= MASK;
        }
        if (o != flipped) {
            list.add("0x" + Integer.toHexString(o & (~flipped)));
        }
        return String.join(" | ", list);
    }

};

