package android.hardware.automotive.vehicle.V2_0;


public final class Obd2CompressionIgnitionMonitors {
    public static final int COMPONENTS_AVAILABLE = 1 /* (0x1 << 0) */;
    public static final int COMPONENTS_INCOMPLETE = 2 /* (0x1 << 1) */;
    public static final int FUEL_SYSTEM_AVAILABLE = 4 /* (0x1 << 2) */;
    public static final int FUEL_SYSTEM_INCOMPLETE = 8 /* (0x1 << 3) */;
    public static final int MISFIRE_AVAILABLE = 16 /* (0x1 << 4) */;
    public static final int MISFIRE_INCOMPLETE = 32 /* (0x1 << 5) */;
    public static final int EGR_OR_VVT_AVAILABLE = 64 /* (0x1 << 6) */;
    public static final int EGR_OR_VVT_INCOMPLETE = 128 /* (0x1 << 7) */;
    public static final int PM_FILTER_AVAILABLE = 256 /* (0x1 << 8) */;
    public static final int PM_FILTER_INCOMPLETE = 512 /* (0x1 << 9) */;
    public static final int EXHAUST_GAS_SENSOR_AVAILABLE = 1024 /* (0x1 << 10) */;
    public static final int EXHAUST_GAS_SENSOR_INCOMPLETE = 2048 /* (0x1 << 11) */;
    public static final int BOOST_PRESSURE_AVAILABLE = 4096 /* (0x1 << 12) */;
    public static final int BOOST_PRESSURE_INCOMPLETE = 8192 /* (0x1 << 13) */;
    public static final int NOx_SCR_AVAILABLE = 16384 /* (0x1 << 14) */;
    public static final int NOx_SCR_INCOMPLETE = 32768 /* (0x1 << 15) */;
    public static final int NMHC_CATALYST_AVAILABLE = 65536 /* (0x1 << 16) */;
    public static final int NMHC_CATALYST_INCOMPLETE = 131072 /* (0x1 << 17) */;
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
        if (o == EGR_OR_VVT_AVAILABLE) {
            return "EGR_OR_VVT_AVAILABLE";
        }
        if (o == EGR_OR_VVT_INCOMPLETE) {
            return "EGR_OR_VVT_INCOMPLETE";
        }
        if (o == PM_FILTER_AVAILABLE) {
            return "PM_FILTER_AVAILABLE";
        }
        if (o == PM_FILTER_INCOMPLETE) {
            return "PM_FILTER_INCOMPLETE";
        }
        if (o == EXHAUST_GAS_SENSOR_AVAILABLE) {
            return "EXHAUST_GAS_SENSOR_AVAILABLE";
        }
        if (o == EXHAUST_GAS_SENSOR_INCOMPLETE) {
            return "EXHAUST_GAS_SENSOR_INCOMPLETE";
        }
        if (o == BOOST_PRESSURE_AVAILABLE) {
            return "BOOST_PRESSURE_AVAILABLE";
        }
        if (o == BOOST_PRESSURE_INCOMPLETE) {
            return "BOOST_PRESSURE_INCOMPLETE";
        }
        if (o == NOx_SCR_AVAILABLE) {
            return "NOx_SCR_AVAILABLE";
        }
        if (o == NOx_SCR_INCOMPLETE) {
            return "NOx_SCR_INCOMPLETE";
        }
        if (o == NMHC_CATALYST_AVAILABLE) {
            return "NMHC_CATALYST_AVAILABLE";
        }
        if (o == NMHC_CATALYST_INCOMPLETE) {
            return "NMHC_CATALYST_INCOMPLETE";
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
        if ((o & EGR_OR_VVT_AVAILABLE) == EGR_OR_VVT_AVAILABLE) {
            list.add("EGR_OR_VVT_AVAILABLE");
            flipped |= EGR_OR_VVT_AVAILABLE;
        }
        if ((o & EGR_OR_VVT_INCOMPLETE) == EGR_OR_VVT_INCOMPLETE) {
            list.add("EGR_OR_VVT_INCOMPLETE");
            flipped |= EGR_OR_VVT_INCOMPLETE;
        }
        if ((o & PM_FILTER_AVAILABLE) == PM_FILTER_AVAILABLE) {
            list.add("PM_FILTER_AVAILABLE");
            flipped |= PM_FILTER_AVAILABLE;
        }
        if ((o & PM_FILTER_INCOMPLETE) == PM_FILTER_INCOMPLETE) {
            list.add("PM_FILTER_INCOMPLETE");
            flipped |= PM_FILTER_INCOMPLETE;
        }
        if ((o & EXHAUST_GAS_SENSOR_AVAILABLE) == EXHAUST_GAS_SENSOR_AVAILABLE) {
            list.add("EXHAUST_GAS_SENSOR_AVAILABLE");
            flipped |= EXHAUST_GAS_SENSOR_AVAILABLE;
        }
        if ((o & EXHAUST_GAS_SENSOR_INCOMPLETE) == EXHAUST_GAS_SENSOR_INCOMPLETE) {
            list.add("EXHAUST_GAS_SENSOR_INCOMPLETE");
            flipped |= EXHAUST_GAS_SENSOR_INCOMPLETE;
        }
        if ((o & BOOST_PRESSURE_AVAILABLE) == BOOST_PRESSURE_AVAILABLE) {
            list.add("BOOST_PRESSURE_AVAILABLE");
            flipped |= BOOST_PRESSURE_AVAILABLE;
        }
        if ((o & BOOST_PRESSURE_INCOMPLETE) == BOOST_PRESSURE_INCOMPLETE) {
            list.add("BOOST_PRESSURE_INCOMPLETE");
            flipped |= BOOST_PRESSURE_INCOMPLETE;
        }
        if ((o & NOx_SCR_AVAILABLE) == NOx_SCR_AVAILABLE) {
            list.add("NOx_SCR_AVAILABLE");
            flipped |= NOx_SCR_AVAILABLE;
        }
        if ((o & NOx_SCR_INCOMPLETE) == NOx_SCR_INCOMPLETE) {
            list.add("NOx_SCR_INCOMPLETE");
            flipped |= NOx_SCR_INCOMPLETE;
        }
        if ((o & NMHC_CATALYST_AVAILABLE) == NMHC_CATALYST_AVAILABLE) {
            list.add("NMHC_CATALYST_AVAILABLE");
            flipped |= NMHC_CATALYST_AVAILABLE;
        }
        if ((o & NMHC_CATALYST_INCOMPLETE) == NMHC_CATALYST_INCOMPLETE) {
            list.add("NMHC_CATALYST_INCOMPLETE");
            flipped |= NMHC_CATALYST_INCOMPLETE;
        }
        if (o != flipped) {
            list.add("0x" + Integer.toHexString(o & (~flipped)));
        }
        return String.join(" | ", list);
    }

};

