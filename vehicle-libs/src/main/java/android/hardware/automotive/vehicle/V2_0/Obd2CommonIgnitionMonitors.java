package android.hardware.automotive.vehicle.V2_0;


public final class Obd2CommonIgnitionMonitors {
    public static final int COMPONENTS_AVAILABLE = 1 /* (0x1 << 0) */;
    public static final int COMPONENTS_INCOMPLETE = 2 /* (0x1 << 1) */;
    public static final int FUEL_SYSTEM_AVAILABLE = 4 /* (0x1 << 2) */;
    public static final int FUEL_SYSTEM_INCOMPLETE = 8 /* (0x1 << 3) */;
    public static final int MISFIRE_AVAILABLE = 16 /* (0x1 << 4) */;
    public static final int MISFIRE_INCOMPLETE = 32 /* (0x1 << 5) */;
    public static final String toString(int o) {
        if (o == COMPONENTS_AVAILABLE) {
            return "COMPONENTS_AVAILABLE";
        }
        if (o == COMPONENTS_INCOMPLETE) {
            return "COMPONENTS_INCOMPLETE";
        }
        if (o == FUEL_SYSTEM_AVAILABLE) {
            return "FUEL_SYSTEM_AVAILABLE";
        }
        if (o == FUEL_SYSTEM_INCOMPLETE) {
            return "FUEL_SYSTEM_INCOMPLETE";
        }
        if (o == MISFIRE_AVAILABLE) {
            return "MISFIRE_AVAILABLE";
        }
        if (o == MISFIRE_INCOMPLETE) {
            return "MISFIRE_INCOMPLETE";
        }
        return "0x" + Integer.toHexString(o);
    }

    public static final String dumpBitfield(int o) {
        java.util.ArrayList<String> list = new java.util.ArrayList<>();
        int flipped = 0;
        if ((o & COMPONENTS_AVAILABLE) == COMPONENTS_AVAILABLE) {
            list.add("COMPONENTS_AVAILABLE");
            flipped |= COMPONENTS_AVAILABLE;
        }
        if ((o & COMPONENTS_INCOMPLETE) == COMPONENTS_INCOMPLETE) {
            list.add("COMPONENTS_INCOMPLETE");
            flipped |= COMPONENTS_INCOMPLETE;
        }
        if ((o & FUEL_SYSTEM_AVAILABLE) == FUEL_SYSTEM_AVAILABLE) {
            list.add("FUEL_SYSTEM_AVAILABLE");
            flipped |= FUEL_SYSTEM_AVAILABLE;
        }
        if ((o & FUEL_SYSTEM_INCOMPLETE) == FUEL_SYSTEM_INCOMPLETE) {
            list.add("FUEL_SYSTEM_INCOMPLETE");
            flipped |= FUEL_SYSTEM_INCOMPLETE;
        }
        if ((o & MISFIRE_AVAILABLE) == MISFIRE_AVAILABLE) {
            list.add("MISFIRE_AVAILABLE");
            flipped |= MISFIRE_AVAILABLE;
        }
        if ((o & MISFIRE_INCOMPLETE) == MISFIRE_INCOMPLETE) {
            list.add("MISFIRE_INCOMPLETE");
            flipped |= MISFIRE_INCOMPLETE;
        }
        if (o != flipped) {
            list.add("0x" + Integer.toHexString(o & (~flipped)));
        }
        return String.join(" | ", list);
    }

};

