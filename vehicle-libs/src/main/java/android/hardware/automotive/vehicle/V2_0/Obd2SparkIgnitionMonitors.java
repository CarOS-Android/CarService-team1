package android.hardware.automotive.vehicle.V2_0;


public final class Obd2SparkIgnitionMonitors {
    public static final int COMPONENTS_AVAILABLE = 1 /* (0x1 << 0) */;
    public static final int COMPONENTS_INCOMPLETE = 2 /* (0x1 << 1) */;
    public static final int FUEL_SYSTEM_AVAILABLE = 4 /* (0x1 << 2) */;
    public static final int FUEL_SYSTEM_INCOMPLETE = 8 /* (0x1 << 3) */;
    public static final int MISFIRE_AVAILABLE = 16 /* (0x1 << 4) */;
    public static final int MISFIRE_INCOMPLETE = 32 /* (0x1 << 5) */;
    public static final int EGR_AVAILABLE = 64 /* (0x1 << 6) */;
    public static final int EGR_INCOMPLETE = 128 /* (0x1 << 7) */;
    public static final int OXYGEN_SENSOR_HEATER_AVAILABLE = 256 /* (0x1 << 8) */;
    public static final int OXYGEN_SENSOR_HEATER_INCOMPLETE = 512 /* (0x1 << 9) */;
    public static final int OXYGEN_SENSOR_AVAILABLE = 1024 /* (0x1 << 10) */;
    public static final int OXYGEN_SENSOR_INCOMPLETE = 2048 /* (0x1 << 11) */;
    public static final int AC_REFRIGERANT_AVAILABLE = 4096 /* (0x1 << 12) */;
    public static final int AC_REFRIGERANT_INCOMPLETE = 8192 /* (0x1 << 13) */;
    public static final int SECONDARY_AIR_SYSTEM_AVAILABLE = 16384 /* (0x1 << 14) */;
    public static final int SECONDARY_AIR_SYSTEM_INCOMPLETE = 32768 /* (0x1 << 15) */;
    public static final int EVAPORATIVE_SYSTEM_AVAILABLE = 65536 /* (0x1 << 16) */;
    public static final int EVAPORATIVE_SYSTEM_INCOMPLETE = 131072 /* (0x1 << 17) */;
    public static final int HEATED_CATALYST_AVAILABLE = 262144 /* (0x1 << 18) */;
    public static final int HEATED_CATALYST_INCOMPLETE = 524288 /* (0x1 << 19) */;
    public static final int CATALYST_AVAILABLE = 1048576 /* (0x1 << 20) */;
    public static final int CATALYST_INCOMPLETE = 2097152 /* (0x1 << 21) */;
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
        if (o == EGR_AVAILABLE) {
            return "EGR_AVAILABLE";
        }
        if (o == EGR_INCOMPLETE) {
            return "EGR_INCOMPLETE";
        }
        if (o == OXYGEN_SENSOR_HEATER_AVAILABLE) {
            return "OXYGEN_SENSOR_HEATER_AVAILABLE";
        }
        if (o == OXYGEN_SENSOR_HEATER_INCOMPLETE) {
            return "OXYGEN_SENSOR_HEATER_INCOMPLETE";
        }
        if (o == OXYGEN_SENSOR_AVAILABLE) {
            return "OXYGEN_SENSOR_AVAILABLE";
        }
        if (o == OXYGEN_SENSOR_INCOMPLETE) {
            return "OXYGEN_SENSOR_INCOMPLETE";
        }
        if (o == AC_REFRIGERANT_AVAILABLE) {
            return "AC_REFRIGERANT_AVAILABLE";
        }
        if (o == AC_REFRIGERANT_INCOMPLETE) {
            return "AC_REFRIGERANT_INCOMPLETE";
        }
        if (o == SECONDARY_AIR_SYSTEM_AVAILABLE) {
            return "SECONDARY_AIR_SYSTEM_AVAILABLE";
        }
        if (o == SECONDARY_AIR_SYSTEM_INCOMPLETE) {
            return "SECONDARY_AIR_SYSTEM_INCOMPLETE";
        }
        if (o == EVAPORATIVE_SYSTEM_AVAILABLE) {
            return "EVAPORATIVE_SYSTEM_AVAILABLE";
        }
        if (o == EVAPORATIVE_SYSTEM_INCOMPLETE) {
            return "EVAPORATIVE_SYSTEM_INCOMPLETE";
        }
        if (o == HEATED_CATALYST_AVAILABLE) {
            return "HEATED_CATALYST_AVAILABLE";
        }
        if (o == HEATED_CATALYST_INCOMPLETE) {
            return "HEATED_CATALYST_INCOMPLETE";
        }
        if (o == CATALYST_AVAILABLE) {
            return "CATALYST_AVAILABLE";
        }
        if (o == CATALYST_INCOMPLETE) {
            return "CATALYST_INCOMPLETE";
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
        if ((o & EGR_AVAILABLE) == EGR_AVAILABLE) {
            list.add("EGR_AVAILABLE");
            flipped |= EGR_AVAILABLE;
        }
        if ((o & EGR_INCOMPLETE) == EGR_INCOMPLETE) {
            list.add("EGR_INCOMPLETE");
            flipped |= EGR_INCOMPLETE;
        }
        if ((o & OXYGEN_SENSOR_HEATER_AVAILABLE) == OXYGEN_SENSOR_HEATER_AVAILABLE) {
            list.add("OXYGEN_SENSOR_HEATER_AVAILABLE");
            flipped |= OXYGEN_SENSOR_HEATER_AVAILABLE;
        }
        if ((o & OXYGEN_SENSOR_HEATER_INCOMPLETE) == OXYGEN_SENSOR_HEATER_INCOMPLETE) {
            list.add("OXYGEN_SENSOR_HEATER_INCOMPLETE");
            flipped |= OXYGEN_SENSOR_HEATER_INCOMPLETE;
        }
        if ((o & OXYGEN_SENSOR_AVAILABLE) == OXYGEN_SENSOR_AVAILABLE) {
            list.add("OXYGEN_SENSOR_AVAILABLE");
            flipped |= OXYGEN_SENSOR_AVAILABLE;
        }
        if ((o & OXYGEN_SENSOR_INCOMPLETE) == OXYGEN_SENSOR_INCOMPLETE) {
            list.add("OXYGEN_SENSOR_INCOMPLETE");
            flipped |= OXYGEN_SENSOR_INCOMPLETE;
        }
        if ((o & AC_REFRIGERANT_AVAILABLE) == AC_REFRIGERANT_AVAILABLE) {
            list.add("AC_REFRIGERANT_AVAILABLE");
            flipped |= AC_REFRIGERANT_AVAILABLE;
        }
        if ((o & AC_REFRIGERANT_INCOMPLETE) == AC_REFRIGERANT_INCOMPLETE) {
            list.add("AC_REFRIGERANT_INCOMPLETE");
            flipped |= AC_REFRIGERANT_INCOMPLETE;
        }
        if ((o & SECONDARY_AIR_SYSTEM_AVAILABLE) == SECONDARY_AIR_SYSTEM_AVAILABLE) {
            list.add("SECONDARY_AIR_SYSTEM_AVAILABLE");
            flipped |= SECONDARY_AIR_SYSTEM_AVAILABLE;
        }
        if ((o & SECONDARY_AIR_SYSTEM_INCOMPLETE) == SECONDARY_AIR_SYSTEM_INCOMPLETE) {
            list.add("SECONDARY_AIR_SYSTEM_INCOMPLETE");
            flipped |= SECONDARY_AIR_SYSTEM_INCOMPLETE;
        }
        if ((o & EVAPORATIVE_SYSTEM_AVAILABLE) == EVAPORATIVE_SYSTEM_AVAILABLE) {
            list.add("EVAPORATIVE_SYSTEM_AVAILABLE");
            flipped |= EVAPORATIVE_SYSTEM_AVAILABLE;
        }
        if ((o & EVAPORATIVE_SYSTEM_INCOMPLETE) == EVAPORATIVE_SYSTEM_INCOMPLETE) {
            list.add("EVAPORATIVE_SYSTEM_INCOMPLETE");
            flipped |= EVAPORATIVE_SYSTEM_INCOMPLETE;
        }
        if ((o & HEATED_CATALYST_AVAILABLE) == HEATED_CATALYST_AVAILABLE) {
            list.add("HEATED_CATALYST_AVAILABLE");
            flipped |= HEATED_CATALYST_AVAILABLE;
        }
        if ((o & HEATED_CATALYST_INCOMPLETE) == HEATED_CATALYST_INCOMPLETE) {
            list.add("HEATED_CATALYST_INCOMPLETE");
            flipped |= HEATED_CATALYST_INCOMPLETE;
        }
        if ((o & CATALYST_AVAILABLE) == CATALYST_AVAILABLE) {
            list.add("CATALYST_AVAILABLE");
            flipped |= CATALYST_AVAILABLE;
        }
        if ((o & CATALYST_INCOMPLETE) == CATALYST_INCOMPLETE) {
            list.add("CATALYST_INCOMPLETE");
            flipped |= CATALYST_INCOMPLETE;
        }
        if (o != flipped) {
            list.add("0x" + Integer.toHexString(o & (~flipped)));
        }
        return String.join(" | ", list);
    }

};

