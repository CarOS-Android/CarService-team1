package android.hardware.automotive.vehicle.V2_0;


public final class FuelType {
    /**
     * Fuel type to use if the HU does not know on which types of fuel the vehicle
     * runs. The use of this value is generally discouraged outside of aftermarket units.
     */
    public static final int FUEL_TYPE_UNKNOWN = 0;
    /**
     * Unleaded gasoline
     */
    public static final int FUEL_TYPE_UNLEADED = 1;
    /**
     * Leaded gasoline
     */
    public static final int FUEL_TYPE_LEADED = 2;
    /**
     * Diesel #1
     */
    public static final int FUEL_TYPE_DIESEL_1 = 3;
    /**
     * Diesel #2
     */
    public static final int FUEL_TYPE_DIESEL_2 = 4;
    /**
     * Biodiesel
     */
    public static final int FUEL_TYPE_BIODIESEL = 5;
    /**
     * 85% ethanol/gasoline blend
     */
    public static final int FUEL_TYPE_E85 = 6;
    /**
     * Liquified petroleum gas
     */
    public static final int FUEL_TYPE_LPG = 7;
    /**
     * Compressed natural gas
     */
    public static final int FUEL_TYPE_CNG = 8;
    /**
     * Liquified natural gas
     */
    public static final int FUEL_TYPE_LNG = 9;
    /**
     * Electric
     */
    public static final int FUEL_TYPE_ELECTRIC = 10;
    /**
     * Hydrogen fuel cell
     */
    public static final int FUEL_TYPE_HYDROGEN = 11;
    /**
     * Fuel type to use when no other types apply. Before using this value, work with
     * Google to see if the FuelType enum can be extended with an appropriate value.
     */
    public static final int FUEL_TYPE_OTHER = 12;
    public static final String toString(int o) {
        if (o == FUEL_TYPE_UNKNOWN) {
            return "FUEL_TYPE_UNKNOWN";
        }
        if (o == FUEL_TYPE_UNLEADED) {
            return "FUEL_TYPE_UNLEADED";
        }
        if (o == FUEL_TYPE_LEADED) {
            return "FUEL_TYPE_LEADED";
        }
        if (o == FUEL_TYPE_DIESEL_1) {
            return "FUEL_TYPE_DIESEL_1";
        }
        if (o == FUEL_TYPE_DIESEL_2) {
            return "FUEL_TYPE_DIESEL_2";
        }
        if (o == FUEL_TYPE_BIODIESEL) {
            return "FUEL_TYPE_BIODIESEL";
        }
        if (o == FUEL_TYPE_E85) {
            return "FUEL_TYPE_E85";
        }
        if (o == FUEL_TYPE_LPG) {
            return "FUEL_TYPE_LPG";
        }
        if (o == FUEL_TYPE_CNG) {
            return "FUEL_TYPE_CNG";
        }
        if (o == FUEL_TYPE_LNG) {
            return "FUEL_TYPE_LNG";
        }
        if (o == FUEL_TYPE_ELECTRIC) {
            return "FUEL_TYPE_ELECTRIC";
        }
        if (o == FUEL_TYPE_HYDROGEN) {
            return "FUEL_TYPE_HYDROGEN";
        }
        if (o == FUEL_TYPE_OTHER) {
            return "FUEL_TYPE_OTHER";
        }
        return "0x" + Integer.toHexString(o);
    }

    public static final String dumpBitfield(int o) {
        java.util.ArrayList<String> list = new java.util.ArrayList<>();
        int flipped = 0;
        list.add("FUEL_TYPE_UNKNOWN"); // FUEL_TYPE_UNKNOWN == 0
        if ((o & FUEL_TYPE_UNLEADED) == FUEL_TYPE_UNLEADED) {
            list.add("FUEL_TYPE_UNLEADED");
            flipped |= FUEL_TYPE_UNLEADED;
        }
        if ((o & FUEL_TYPE_LEADED) == FUEL_TYPE_LEADED) {
            list.add("FUEL_TYPE_LEADED");
            flipped |= FUEL_TYPE_LEADED;
        }
        if ((o & FUEL_TYPE_DIESEL_1) == FUEL_TYPE_DIESEL_1) {
            list.add("FUEL_TYPE_DIESEL_1");
            flipped |= FUEL_TYPE_DIESEL_1;
        }
        if ((o & FUEL_TYPE_DIESEL_2) == FUEL_TYPE_DIESEL_2) {
            list.add("FUEL_TYPE_DIESEL_2");
            flipped |= FUEL_TYPE_DIESEL_2;
        }
        if ((o & FUEL_TYPE_BIODIESEL) == FUEL_TYPE_BIODIESEL) {
            list.add("FUEL_TYPE_BIODIESEL");
            flipped |= FUEL_TYPE_BIODIESEL;
        }
        if ((o & FUEL_TYPE_E85) == FUEL_TYPE_E85) {
            list.add("FUEL_TYPE_E85");
            flipped |= FUEL_TYPE_E85;
        }
        if ((o & FUEL_TYPE_LPG) == FUEL_TYPE_LPG) {
            list.add("FUEL_TYPE_LPG");
            flipped |= FUEL_TYPE_LPG;
        }
        if ((o & FUEL_TYPE_CNG) == FUEL_TYPE_CNG) {
            list.add("FUEL_TYPE_CNG");
            flipped |= FUEL_TYPE_CNG;
        }
        if ((o & FUEL_TYPE_LNG) == FUEL_TYPE_LNG) {
            list.add("FUEL_TYPE_LNG");
            flipped |= FUEL_TYPE_LNG;
        }
        if ((o & FUEL_TYPE_ELECTRIC) == FUEL_TYPE_ELECTRIC) {
            list.add("FUEL_TYPE_ELECTRIC");
            flipped |= FUEL_TYPE_ELECTRIC;
        }
        if ((o & FUEL_TYPE_HYDROGEN) == FUEL_TYPE_HYDROGEN) {
            list.add("FUEL_TYPE_HYDROGEN");
            flipped |= FUEL_TYPE_HYDROGEN;
        }
        if ((o & FUEL_TYPE_OTHER) == FUEL_TYPE_OTHER) {
            list.add("FUEL_TYPE_OTHER");
            flipped |= FUEL_TYPE_OTHER;
        }
        if (o != flipped) {
            list.add("0x" + Integer.toHexString(o & (~flipped)));
        }
        return String.join(" | ", list);
    }

};

