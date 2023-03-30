package android.hardware.automotive.vehicle.V2_0;


public final class VehicleUnit {
    public static final int SHOULD_NOT_USE = 0 /* 0x000 */;
    public static final int METER_PER_SEC = 1 /* 0x01 */;
    public static final int RPM = 2 /* 0x02 */;
    public static final int HERTZ = 3 /* 0x03 */;
    public static final int PERCENTILE = 16 /* 0x10 */;
    public static final int MILLIMETER = 32 /* 0x20 */;
    public static final int METER = 33 /* 0x21 */;
    public static final int KILOMETER = 35 /* 0x23 */;
    public static final int MILE = 36 /* 0x24 */;
    public static final int CELSIUS = 48 /* 0x30 */;
    public static final int FAHRENHEIT = 49 /* 0x31 */;
    public static final int KELVIN = 50 /* 0x32 */;
    public static final int MILLILITER = 64 /* 0x40 */;
    public static final int LITER = 65 /* 0x41 */;
    /**
     * deprecated. Use US_GALLON instead.
     */
    public static final int GALLON = 66 /* 0x42 */;
    public static final int US_GALLON = 66 /* 0x42 */;
    public static final int IMPERIAL_GALLON = 67 /* 0x43 */;
    public static final int NANO_SECS = 80 /* 0x50 */;
    public static final int MILLI_SECS = 81 /* 0x51 */;
    public static final int SECS = 83 /* 0x53 */;
    public static final int YEAR = 89 /* 0x59 */;
    public static final int WATT_HOUR = 96 /* 0x60 */;
    public static final int MILLIAMPERE = 97 /* 0x61 */;
    public static final int MILLIVOLT = 98 /* 0x62 */;
    public static final int MILLIWATTS = 99 /* 0x63 */;
    public static final int AMPERE_HOURS = 100 /* 0x64 */;
    public static final int KILOWATT_HOUR = 101 /* 0x65 */;
    public static final int KILOPASCAL = 112 /* 0x70 */;
    public static final int PSI = 113 /* 0x71 */;
    public static final int BAR = 114 /* 0x72 */;
    public static final int DEGREES = 128 /* 0x80 */;
    public static final int MILES_PER_HOUR = 144 /* 0x90 */;
    public static final int KILOMETERS_PER_HOUR = 145 /* 0x91 */;
    public static final String toString(int o) {
        if (o == SHOULD_NOT_USE) {
            return "SHOULD_NOT_USE";
        }
        if (o == METER_PER_SEC) {
            return "METER_PER_SEC";
        }
        if (o == RPM) {
            return "RPM";
        }
        if (o == HERTZ) {
            return "HERTZ";
        }
        if (o == PERCENTILE) {
            return "PERCENTILE";
        }
        if (o == MILLIMETER) {
            return "MILLIMETER";
        }
        if (o == METER) {
            return "METER";
        }
        if (o == KILOMETER) {
            return "KILOMETER";
        }
        if (o == MILE) {
            return "MILE";
        }
        if (o == CELSIUS) {
            return "CELSIUS";
        }
        if (o == FAHRENHEIT) {
            return "FAHRENHEIT";
        }
        if (o == KELVIN) {
            return "KELVIN";
        }
        if (o == MILLILITER) {
            return "MILLILITER";
        }
        if (o == LITER) {
            return "LITER";
        }
        if (o == GALLON) {
            return "GALLON";
        }
        if (o == US_GALLON) {
            return "US_GALLON";
        }
        if (o == IMPERIAL_GALLON) {
            return "IMPERIAL_GALLON";
        }
        if (o == NANO_SECS) {
            return "NANO_SECS";
        }
        if (o == MILLI_SECS) {
            return "MILLI_SECS";
        }
        if (o == SECS) {
            return "SECS";
        }
        if (o == YEAR) {
            return "YEAR";
        }
        if (o == WATT_HOUR) {
            return "WATT_HOUR";
        }
        if (o == MILLIAMPERE) {
            return "MILLIAMPERE";
        }
        if (o == MILLIVOLT) {
            return "MILLIVOLT";
        }
        if (o == MILLIWATTS) {
            return "MILLIWATTS";
        }
        if (o == AMPERE_HOURS) {
            return "AMPERE_HOURS";
        }
        if (o == KILOWATT_HOUR) {
            return "KILOWATT_HOUR";
        }
        if (o == KILOPASCAL) {
            return "KILOPASCAL";
        }
        if (o == PSI) {
            return "PSI";
        }
        if (o == BAR) {
            return "BAR";
        }
        if (o == DEGREES) {
            return "DEGREES";
        }
        if (o == MILES_PER_HOUR) {
            return "MILES_PER_HOUR";
        }
        if (o == KILOMETERS_PER_HOUR) {
            return "KILOMETERS_PER_HOUR";
        }
        return "0x" + Integer.toHexString(o);
    }

    public static final String dumpBitfield(int o) {
        java.util.ArrayList<String> list = new java.util.ArrayList<>();
        int flipped = 0;
        list.add("SHOULD_NOT_USE"); // SHOULD_NOT_USE == 0
        if ((o & METER_PER_SEC) == METER_PER_SEC) {
            list.add("METER_PER_SEC");
            flipped |= METER_PER_SEC;
        }
        if ((o & RPM) == RPM) {
            list.add("RPM");
            flipped |= RPM;
        }
        if ((o & HERTZ) == HERTZ) {
            list.add("HERTZ");
            flipped |= HERTZ;
        }
        if ((o & PERCENTILE) == PERCENTILE) {
            list.add("PERCENTILE");
            flipped |= PERCENTILE;
        }
        if ((o & MILLIMETER) == MILLIMETER) {
            list.add("MILLIMETER");
            flipped |= MILLIMETER;
        }
        if ((o & METER) == METER) {
            list.add("METER");
            flipped |= METER;
        }
        if ((o & KILOMETER) == KILOMETER) {
            list.add("KILOMETER");
            flipped |= KILOMETER;
        }
        if ((o & MILE) == MILE) {
            list.add("MILE");
            flipped |= MILE;
        }
        if ((o & CELSIUS) == CELSIUS) {
            list.add("CELSIUS");
            flipped |= CELSIUS;
        }
        if ((o & FAHRENHEIT) == FAHRENHEIT) {
            list.add("FAHRENHEIT");
            flipped |= FAHRENHEIT;
        }
        if ((o & KELVIN) == KELVIN) {
            list.add("KELVIN");
            flipped |= KELVIN;
        }
        if ((o & MILLILITER) == MILLILITER) {
            list.add("MILLILITER");
            flipped |= MILLILITER;
        }
        if ((o & LITER) == LITER) {
            list.add("LITER");
            flipped |= LITER;
        }
        if ((o & GALLON) == GALLON) {
            list.add("GALLON");
            flipped |= GALLON;
        }
        if ((o & US_GALLON) == US_GALLON) {
            list.add("US_GALLON");
            flipped |= US_GALLON;
        }
        if ((o & IMPERIAL_GALLON) == IMPERIAL_GALLON) {
            list.add("IMPERIAL_GALLON");
            flipped |= IMPERIAL_GALLON;
        }
        if ((o & NANO_SECS) == NANO_SECS) {
            list.add("NANO_SECS");
            flipped |= NANO_SECS;
        }
        if ((o & MILLI_SECS) == MILLI_SECS) {
            list.add("MILLI_SECS");
            flipped |= MILLI_SECS;
        }
        if ((o & SECS) == SECS) {
            list.add("SECS");
            flipped |= SECS;
        }
        if ((o & YEAR) == YEAR) {
            list.add("YEAR");
            flipped |= YEAR;
        }
        if ((o & WATT_HOUR) == WATT_HOUR) {
            list.add("WATT_HOUR");
            flipped |= WATT_HOUR;
        }
        if ((o & MILLIAMPERE) == MILLIAMPERE) {
            list.add("MILLIAMPERE");
            flipped |= MILLIAMPERE;
        }
        if ((o & MILLIVOLT) == MILLIVOLT) {
            list.add("MILLIVOLT");
            flipped |= MILLIVOLT;
        }
        if ((o & MILLIWATTS) == MILLIWATTS) {
            list.add("MILLIWATTS");
            flipped |= MILLIWATTS;
        }
        if ((o & AMPERE_HOURS) == AMPERE_HOURS) {
            list.add("AMPERE_HOURS");
            flipped |= AMPERE_HOURS;
        }
        if ((o & KILOWATT_HOUR) == KILOWATT_HOUR) {
            list.add("KILOWATT_HOUR");
            flipped |= KILOWATT_HOUR;
        }
        if ((o & KILOPASCAL) == KILOPASCAL) {
            list.add("KILOPASCAL");
            flipped |= KILOPASCAL;
        }
        if ((o & PSI) == PSI) {
            list.add("PSI");
            flipped |= PSI;
        }
        if ((o & BAR) == BAR) {
            list.add("BAR");
            flipped |= BAR;
        }
        if ((o & DEGREES) == DEGREES) {
            list.add("DEGREES");
            flipped |= DEGREES;
        }
        if ((o & MILES_PER_HOUR) == MILES_PER_HOUR) {
            list.add("MILES_PER_HOUR");
            flipped |= MILES_PER_HOUR;
        }
        if ((o & KILOMETERS_PER_HOUR) == KILOMETERS_PER_HOUR) {
            list.add("KILOMETERS_PER_HOUR");
            flipped |= KILOMETERS_PER_HOUR;
        }
        if (o != flipped) {
            list.add("0x" + Integer.toHexString(o & (~flipped)));
        }
        return String.join(" | ", list);
    }

};

