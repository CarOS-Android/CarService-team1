package android.hardware.automotive.vehicle.V2_0;


public final class DiagnosticIntegerSensorIndex {
    /**
     * refer to FuelSystemStatus for a description of this value.
     */
    public static final int FUEL_SYSTEM_STATUS = 0;
    public static final int MALFUNCTION_INDICATOR_LIGHT_ON = 1;
    /**
     * refer to IgnitionMonitorKind for a description of this value.
     */
    public static final int IGNITION_MONITORS_SUPPORTED = 2;
    /**
     * The value of this sensor is a bitmask that specifies whether ignition-specific
     * tests are available and whether they are complete. The semantics of the individual
     * bits in this value are given by, respectively, SparkIgnitionMonitors and
     * CompressionIgnitionMonitors depending on the value of IGNITION_MONITORS_SUPPORTED.
     */
    public static final int IGNITION_SPECIFIC_MONITORS = 3;
    public static final int INTAKE_AIR_TEMPERATURE = 4;
    /**
     * refer to SecondaryAirStatus for a description of this value.
     */
    public static final int COMMANDED_SECONDARY_AIR_STATUS = 5;
    public static final int NUM_OXYGEN_SENSORS_PRESENT = 6;
    public static final int RUNTIME_SINCE_ENGINE_START = 7;
    public static final int DISTANCE_TRAVELED_WITH_MALFUNCTION_INDICATOR_LIGHT_ON = 8;
    public static final int WARMUPS_SINCE_CODES_CLEARED = 9;
    public static final int DISTANCE_TRAVELED_SINCE_CODES_CLEARED = 10;
    public static final int ABSOLUTE_BAROMETRIC_PRESSURE = 11;
    public static final int CONTROL_MODULE_VOLTAGE = 12;
    public static final int AMBIENT_AIR_TEMPERATURE = 13;
    public static final int TIME_WITH_MALFUNCTION_LIGHT_ON = 14;
    public static final int TIME_SINCE_TROUBLE_CODES_CLEARED = 15;
    public static final int MAX_FUEL_AIR_EQUIVALENCE_RATIO = 16;
    public static final int MAX_OXYGEN_SENSOR_VOLTAGE = 17;
    public static final int MAX_OXYGEN_SENSOR_CURRENT = 18;
    public static final int MAX_INTAKE_MANIFOLD_ABSOLUTE_PRESSURE = 19;
    public static final int MAX_AIR_FLOW_RATE_FROM_MASS_AIR_FLOW_SENSOR = 20;
    /**
     * refer to FuelType for a description of this value.
     */
    public static final int FUEL_TYPE = 21;
    public static final int FUEL_RAIL_ABSOLUTE_PRESSURE = 22;
    public static final int ENGINE_OIL_TEMPERATURE = 23;
    public static final int DRIVER_DEMAND_PERCENT_TORQUE = 24;
    public static final int ENGINE_ACTUAL_PERCENT_TORQUE = 25;
    public static final int ENGINE_REFERENCE_PERCENT_TORQUE = 26;
    public static final int ENGINE_PERCENT_TORQUE_DATA_IDLE = 27;
    public static final int ENGINE_PERCENT_TORQUE_DATA_POINT1 = 28;
    public static final int ENGINE_PERCENT_TORQUE_DATA_POINT2 = 29;
    public static final int ENGINE_PERCENT_TORQUE_DATA_POINT3 = 30;
    public static final int ENGINE_PERCENT_TORQUE_DATA_POINT4 = 31;
    public static final int LAST_SYSTEM_INDEX = 31 /* ENGINE_PERCENT_TORQUE_DATA_POINT4 */;
    public static final String toString(int o) {
        if (o == FUEL_SYSTEM_STATUS) {
            return "FUEL_SYSTEM_STATUS";
        }
        if (o == MALFUNCTION_INDICATOR_LIGHT_ON) {
            return "MALFUNCTION_INDICATOR_LIGHT_ON";
        }
        if (o == IGNITION_MONITORS_SUPPORTED) {
            return "IGNITION_MONITORS_SUPPORTED";
        }
        if (o == IGNITION_SPECIFIC_MONITORS) {
            return "IGNITION_SPECIFIC_MONITORS";
        }
        if (o == INTAKE_AIR_TEMPERATURE) {
            return "INTAKE_AIR_TEMPERATURE";
        }
        if (o == COMMANDED_SECONDARY_AIR_STATUS) {
            return "COMMANDED_SECONDARY_AIR_STATUS";
        }
        if (o == NUM_OXYGEN_SENSORS_PRESENT) {
            return "NUM_OXYGEN_SENSORS_PRESENT";
        }
        if (o == RUNTIME_SINCE_ENGINE_START) {
            return "RUNTIME_SINCE_ENGINE_START";
        }
        if (o == DISTANCE_TRAVELED_WITH_MALFUNCTION_INDICATOR_LIGHT_ON) {
            return "DISTANCE_TRAVELED_WITH_MALFUNCTION_INDICATOR_LIGHT_ON";
        }
        if (o == WARMUPS_SINCE_CODES_CLEARED) {
            return "WARMUPS_SINCE_CODES_CLEARED";
        }
        if (o == DISTANCE_TRAVELED_SINCE_CODES_CLEARED) {
            return "DISTANCE_TRAVELED_SINCE_CODES_CLEARED";
        }
        if (o == ABSOLUTE_BAROMETRIC_PRESSURE) {
            return "ABSOLUTE_BAROMETRIC_PRESSURE";
        }
        if (o == CONTROL_MODULE_VOLTAGE) {
            return "CONTROL_MODULE_VOLTAGE";
        }
        if (o == AMBIENT_AIR_TEMPERATURE) {
            return "AMBIENT_AIR_TEMPERATURE";
        }
        if (o == TIME_WITH_MALFUNCTION_LIGHT_ON) {
            return "TIME_WITH_MALFUNCTION_LIGHT_ON";
        }
        if (o == TIME_SINCE_TROUBLE_CODES_CLEARED) {
            return "TIME_SINCE_TROUBLE_CODES_CLEARED";
        }
        if (o == MAX_FUEL_AIR_EQUIVALENCE_RATIO) {
            return "MAX_FUEL_AIR_EQUIVALENCE_RATIO";
        }
        if (o == MAX_OXYGEN_SENSOR_VOLTAGE) {
            return "MAX_OXYGEN_SENSOR_VOLTAGE";
        }
        if (o == MAX_OXYGEN_SENSOR_CURRENT) {
            return "MAX_OXYGEN_SENSOR_CURRENT";
        }
        if (o == MAX_INTAKE_MANIFOLD_ABSOLUTE_PRESSURE) {
            return "MAX_INTAKE_MANIFOLD_ABSOLUTE_PRESSURE";
        }
        if (o == MAX_AIR_FLOW_RATE_FROM_MASS_AIR_FLOW_SENSOR) {
            return "MAX_AIR_FLOW_RATE_FROM_MASS_AIR_FLOW_SENSOR";
        }
        if (o == FUEL_TYPE) {
            return "FUEL_TYPE";
        }
        if (o == FUEL_RAIL_ABSOLUTE_PRESSURE) {
            return "FUEL_RAIL_ABSOLUTE_PRESSURE";
        }
        if (o == ENGINE_OIL_TEMPERATURE) {
            return "ENGINE_OIL_TEMPERATURE";
        }
        if (o == DRIVER_DEMAND_PERCENT_TORQUE) {
            return "DRIVER_DEMAND_PERCENT_TORQUE";
        }
        if (o == ENGINE_ACTUAL_PERCENT_TORQUE) {
            return "ENGINE_ACTUAL_PERCENT_TORQUE";
        }
        if (o == ENGINE_REFERENCE_PERCENT_TORQUE) {
            return "ENGINE_REFERENCE_PERCENT_TORQUE";
        }
        if (o == ENGINE_PERCENT_TORQUE_DATA_IDLE) {
            return "ENGINE_PERCENT_TORQUE_DATA_IDLE";
        }
        if (o == ENGINE_PERCENT_TORQUE_DATA_POINT1) {
            return "ENGINE_PERCENT_TORQUE_DATA_POINT1";
        }
        if (o == ENGINE_PERCENT_TORQUE_DATA_POINT2) {
            return "ENGINE_PERCENT_TORQUE_DATA_POINT2";
        }
        if (o == ENGINE_PERCENT_TORQUE_DATA_POINT3) {
            return "ENGINE_PERCENT_TORQUE_DATA_POINT3";
        }
        if (o == ENGINE_PERCENT_TORQUE_DATA_POINT4) {
            return "ENGINE_PERCENT_TORQUE_DATA_POINT4";
        }
        if (o == LAST_SYSTEM_INDEX) {
            return "LAST_SYSTEM_INDEX";
        }
        return "0x" + Integer.toHexString(o);
    }

    public static final String dumpBitfield(int o) {
        java.util.ArrayList<String> list = new java.util.ArrayList<>();
        int flipped = 0;
        list.add("FUEL_SYSTEM_STATUS"); // FUEL_SYSTEM_STATUS == 0
        if ((o & MALFUNCTION_INDICATOR_LIGHT_ON) == MALFUNCTION_INDICATOR_LIGHT_ON) {
            list.add("MALFUNCTION_INDICATOR_LIGHT_ON");
            flipped |= MALFUNCTION_INDICATOR_LIGHT_ON;
        }
        if ((o & IGNITION_MONITORS_SUPPORTED) == IGNITION_MONITORS_SUPPORTED) {
            list.add("IGNITION_MONITORS_SUPPORTED");
            flipped |= IGNITION_MONITORS_SUPPORTED;
        }
        if ((o & IGNITION_SPECIFIC_MONITORS) == IGNITION_SPECIFIC_MONITORS) {
            list.add("IGNITION_SPECIFIC_MONITORS");
            flipped |= IGNITION_SPECIFIC_MONITORS;
        }
        if ((o & INTAKE_AIR_TEMPERATURE) == INTAKE_AIR_TEMPERATURE) {
            list.add("INTAKE_AIR_TEMPERATURE");
            flipped |= INTAKE_AIR_TEMPERATURE;
        }
        if ((o & COMMANDED_SECONDARY_AIR_STATUS) == COMMANDED_SECONDARY_AIR_STATUS) {
            list.add("COMMANDED_SECONDARY_AIR_STATUS");
            flipped |= COMMANDED_SECONDARY_AIR_STATUS;
        }
        if ((o & NUM_OXYGEN_SENSORS_PRESENT) == NUM_OXYGEN_SENSORS_PRESENT) {
            list.add("NUM_OXYGEN_SENSORS_PRESENT");
            flipped |= NUM_OXYGEN_SENSORS_PRESENT;
        }
        if ((o & RUNTIME_SINCE_ENGINE_START) == RUNTIME_SINCE_ENGINE_START) {
            list.add("RUNTIME_SINCE_ENGINE_START");
            flipped |= RUNTIME_SINCE_ENGINE_START;
        }
        if ((o & DISTANCE_TRAVELED_WITH_MALFUNCTION_INDICATOR_LIGHT_ON) == DISTANCE_TRAVELED_WITH_MALFUNCTION_INDICATOR_LIGHT_ON) {
            list.add("DISTANCE_TRAVELED_WITH_MALFUNCTION_INDICATOR_LIGHT_ON");
            flipped |= DISTANCE_TRAVELED_WITH_MALFUNCTION_INDICATOR_LIGHT_ON;
        }
        if ((o & WARMUPS_SINCE_CODES_CLEARED) == WARMUPS_SINCE_CODES_CLEARED) {
            list.add("WARMUPS_SINCE_CODES_CLEARED");
            flipped |= WARMUPS_SINCE_CODES_CLEARED;
        }
        if ((o & DISTANCE_TRAVELED_SINCE_CODES_CLEARED) == DISTANCE_TRAVELED_SINCE_CODES_CLEARED) {
            list.add("DISTANCE_TRAVELED_SINCE_CODES_CLEARED");
            flipped |= DISTANCE_TRAVELED_SINCE_CODES_CLEARED;
        }
        if ((o & ABSOLUTE_BAROMETRIC_PRESSURE) == ABSOLUTE_BAROMETRIC_PRESSURE) {
            list.add("ABSOLUTE_BAROMETRIC_PRESSURE");
            flipped |= ABSOLUTE_BAROMETRIC_PRESSURE;
        }
        if ((o & CONTROL_MODULE_VOLTAGE) == CONTROL_MODULE_VOLTAGE) {
            list.add("CONTROL_MODULE_VOLTAGE");
            flipped |= CONTROL_MODULE_VOLTAGE;
        }
        if ((o & AMBIENT_AIR_TEMPERATURE) == AMBIENT_AIR_TEMPERATURE) {
            list.add("AMBIENT_AIR_TEMPERATURE");
            flipped |= AMBIENT_AIR_TEMPERATURE;
        }
        if ((o & TIME_WITH_MALFUNCTION_LIGHT_ON) == TIME_WITH_MALFUNCTION_LIGHT_ON) {
            list.add("TIME_WITH_MALFUNCTION_LIGHT_ON");
            flipped |= TIME_WITH_MALFUNCTION_LIGHT_ON;
        }
        if ((o & TIME_SINCE_TROUBLE_CODES_CLEARED) == TIME_SINCE_TROUBLE_CODES_CLEARED) {
            list.add("TIME_SINCE_TROUBLE_CODES_CLEARED");
            flipped |= TIME_SINCE_TROUBLE_CODES_CLEARED;
        }
        if ((o & MAX_FUEL_AIR_EQUIVALENCE_RATIO) == MAX_FUEL_AIR_EQUIVALENCE_RATIO) {
            list.add("MAX_FUEL_AIR_EQUIVALENCE_RATIO");
            flipped |= MAX_FUEL_AIR_EQUIVALENCE_RATIO;
        }
        if ((o & MAX_OXYGEN_SENSOR_VOLTAGE) == MAX_OXYGEN_SENSOR_VOLTAGE) {
            list.add("MAX_OXYGEN_SENSOR_VOLTAGE");
            flipped |= MAX_OXYGEN_SENSOR_VOLTAGE;
        }
        if ((o & MAX_OXYGEN_SENSOR_CURRENT) == MAX_OXYGEN_SENSOR_CURRENT) {
            list.add("MAX_OXYGEN_SENSOR_CURRENT");
            flipped |= MAX_OXYGEN_SENSOR_CURRENT;
        }
        if ((o & MAX_INTAKE_MANIFOLD_ABSOLUTE_PRESSURE) == MAX_INTAKE_MANIFOLD_ABSOLUTE_PRESSURE) {
            list.add("MAX_INTAKE_MANIFOLD_ABSOLUTE_PRESSURE");
            flipped |= MAX_INTAKE_MANIFOLD_ABSOLUTE_PRESSURE;
        }
        if ((o & MAX_AIR_FLOW_RATE_FROM_MASS_AIR_FLOW_SENSOR) == MAX_AIR_FLOW_RATE_FROM_MASS_AIR_FLOW_SENSOR) {
            list.add("MAX_AIR_FLOW_RATE_FROM_MASS_AIR_FLOW_SENSOR");
            flipped |= MAX_AIR_FLOW_RATE_FROM_MASS_AIR_FLOW_SENSOR;
        }
        if ((o & FUEL_TYPE) == FUEL_TYPE) {
            list.add("FUEL_TYPE");
            flipped |= FUEL_TYPE;
        }
        if ((o & FUEL_RAIL_ABSOLUTE_PRESSURE) == FUEL_RAIL_ABSOLUTE_PRESSURE) {
            list.add("FUEL_RAIL_ABSOLUTE_PRESSURE");
            flipped |= FUEL_RAIL_ABSOLUTE_PRESSURE;
        }
        if ((o & ENGINE_OIL_TEMPERATURE) == ENGINE_OIL_TEMPERATURE) {
            list.add("ENGINE_OIL_TEMPERATURE");
            flipped |= ENGINE_OIL_TEMPERATURE;
        }
        if ((o & DRIVER_DEMAND_PERCENT_TORQUE) == DRIVER_DEMAND_PERCENT_TORQUE) {
            list.add("DRIVER_DEMAND_PERCENT_TORQUE");
            flipped |= DRIVER_DEMAND_PERCENT_TORQUE;
        }
        if ((o & ENGINE_ACTUAL_PERCENT_TORQUE) == ENGINE_ACTUAL_PERCENT_TORQUE) {
            list.add("ENGINE_ACTUAL_PERCENT_TORQUE");
            flipped |= ENGINE_ACTUAL_PERCENT_TORQUE;
        }
        if ((o & ENGINE_REFERENCE_PERCENT_TORQUE) == ENGINE_REFERENCE_PERCENT_TORQUE) {
            list.add("ENGINE_REFERENCE_PERCENT_TORQUE");
            flipped |= ENGINE_REFERENCE_PERCENT_TORQUE;
        }
        if ((o & ENGINE_PERCENT_TORQUE_DATA_IDLE) == ENGINE_PERCENT_TORQUE_DATA_IDLE) {
            list.add("ENGINE_PERCENT_TORQUE_DATA_IDLE");
            flipped |= ENGINE_PERCENT_TORQUE_DATA_IDLE;
        }
        if ((o & ENGINE_PERCENT_TORQUE_DATA_POINT1) == ENGINE_PERCENT_TORQUE_DATA_POINT1) {
            list.add("ENGINE_PERCENT_TORQUE_DATA_POINT1");
            flipped |= ENGINE_PERCENT_TORQUE_DATA_POINT1;
        }
        if ((o & ENGINE_PERCENT_TORQUE_DATA_POINT2) == ENGINE_PERCENT_TORQUE_DATA_POINT2) {
            list.add("ENGINE_PERCENT_TORQUE_DATA_POINT2");
            flipped |= ENGINE_PERCENT_TORQUE_DATA_POINT2;
        }
        if ((o & ENGINE_PERCENT_TORQUE_DATA_POINT3) == ENGINE_PERCENT_TORQUE_DATA_POINT3) {
            list.add("ENGINE_PERCENT_TORQUE_DATA_POINT3");
            flipped |= ENGINE_PERCENT_TORQUE_DATA_POINT3;
        }
        if ((o & ENGINE_PERCENT_TORQUE_DATA_POINT4) == ENGINE_PERCENT_TORQUE_DATA_POINT4) {
            list.add("ENGINE_PERCENT_TORQUE_DATA_POINT4");
            flipped |= ENGINE_PERCENT_TORQUE_DATA_POINT4;
        }
        if ((o & LAST_SYSTEM_INDEX) == LAST_SYSTEM_INDEX) {
            list.add("LAST_SYSTEM_INDEX");
            flipped |= LAST_SYSTEM_INDEX;
        }
        if (o != flipped) {
            list.add("0x" + Integer.toHexString(o & (~flipped)));
        }
        return String.join(" | ", list);
    }

};

