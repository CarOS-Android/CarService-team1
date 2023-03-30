package android.hardware.automotive.vehicle.V2_0;


public final class Obd2FuelType {
    public static final int NOT_AVAILABLE = 0;
    public static final int GASOLINE = 1;
    public static final int METHANOL = 2;
    public static final int ETHANOL = 3;
    public static final int DIESEL = 4;
    public static final int LPG = 5;
    public static final int CNG = 6;
    public static final int PROPANE = 7;
    public static final int ELECTRIC = 8;
    public static final int BIFUEL_RUNNING_GASOLINE = 9;
    public static final int BIFUEL_RUNNING_METHANOL = 10;
    public static final int BIFUEL_RUNNING_ETHANOL = 11;
    public static final int BIFUEL_RUNNING_LPG = 12;
    public static final int BIFUEL_RUNNING_CNG = 13;
    public static final int BIFUEL_RUNNING_PROPANE = 14;
    public static final int BIFUEL_RUNNING_ELECTRIC = 15;
    public static final int BIFUEL_RUNNING_ELECTRIC_AND_COMBUSTION = 16;
    public static final int HYBRID_GASOLINE = 17;
    public static final int HYBRID_ETHANOL = 18;
    public static final int HYBRID_DIESEL = 19;
    public static final int HYBRID_ELECTRIC = 20;
    public static final int HYBRID_RUNNING_ELECTRIC_AND_COMBUSTION = 21;
    public static final int HYBRID_REGENERATIVE = 22;
    public static final int BIFUEL_RUNNING_DIESEL = 23;
    public static final String toString(int o) {
        if (o == NOT_AVAILABLE) {
            return "NOT_AVAILABLE";
        }
        if (o == GASOLINE) {
            return "GASOLINE";
        }
        if (o == METHANOL) {
            return "METHANOL";
        }
        if (o == ETHANOL) {
            return "ETHANOL";
        }
        if (o == DIESEL) {
            return "DIESEL";
        }
        if (o == LPG) {
            return "LPG";
        }
        if (o == CNG) {
            return "CNG";
        }
        if (o == PROPANE) {
            return "PROPANE";
        }
        if (o == ELECTRIC) {
            return "ELECTRIC";
        }
        if (o == BIFUEL_RUNNING_GASOLINE) {
            return "BIFUEL_RUNNING_GASOLINE";
        }
        if (o == BIFUEL_RUNNING_METHANOL) {
            return "BIFUEL_RUNNING_METHANOL";
        }
        if (o == BIFUEL_RUNNING_ETHANOL) {
            return "BIFUEL_RUNNING_ETHANOL";
        }
        if (o == BIFUEL_RUNNING_LPG) {
            return "BIFUEL_RUNNING_LPG";
        }
        if (o == BIFUEL_RUNNING_CNG) {
            return "BIFUEL_RUNNING_CNG";
        }
        if (o == BIFUEL_RUNNING_PROPANE) {
            return "BIFUEL_RUNNING_PROPANE";
        }
        if (o == BIFUEL_RUNNING_ELECTRIC) {
            return "BIFUEL_RUNNING_ELECTRIC";
        }
        if (o == BIFUEL_RUNNING_ELECTRIC_AND_COMBUSTION) {
            return "BIFUEL_RUNNING_ELECTRIC_AND_COMBUSTION";
        }
        if (o == HYBRID_GASOLINE) {
            return "HYBRID_GASOLINE";
        }
        if (o == HYBRID_ETHANOL) {
            return "HYBRID_ETHANOL";
        }
        if (o == HYBRID_DIESEL) {
            return "HYBRID_DIESEL";
        }
        if (o == HYBRID_ELECTRIC) {
            return "HYBRID_ELECTRIC";
        }
        if (o == HYBRID_RUNNING_ELECTRIC_AND_COMBUSTION) {
            return "HYBRID_RUNNING_ELECTRIC_AND_COMBUSTION";
        }
        if (o == HYBRID_REGENERATIVE) {
            return "HYBRID_REGENERATIVE";
        }
        if (o == BIFUEL_RUNNING_DIESEL) {
            return "BIFUEL_RUNNING_DIESEL";
        }
        return "0x" + Integer.toHexString(o);
    }

    public static final String dumpBitfield(int o) {
        java.util.ArrayList<String> list = new java.util.ArrayList<>();
        int flipped = 0;
        list.add("NOT_AVAILABLE"); // NOT_AVAILABLE == 0
        if ((o & GASOLINE) == GASOLINE) {
            list.add("GASOLINE");
            flipped |= GASOLINE;
        }
        if ((o & METHANOL) == METHANOL) {
            list.add("METHANOL");
            flipped |= METHANOL;
        }
        if ((o & ETHANOL) == ETHANOL) {
            list.add("ETHANOL");
            flipped |= ETHANOL;
        }
        if ((o & DIESEL) == DIESEL) {
            list.add("DIESEL");
            flipped |= DIESEL;
        }
        if ((o & LPG) == LPG) {
            list.add("LPG");
            flipped |= LPG;
        }
        if ((o & CNG) == CNG) {
            list.add("CNG");
            flipped |= CNG;
        }
        if ((o & PROPANE) == PROPANE) {
            list.add("PROPANE");
            flipped |= PROPANE;
        }
        if ((o & ELECTRIC) == ELECTRIC) {
            list.add("ELECTRIC");
            flipped |= ELECTRIC;
        }
        if ((o & BIFUEL_RUNNING_GASOLINE) == BIFUEL_RUNNING_GASOLINE) {
            list.add("BIFUEL_RUNNING_GASOLINE");
            flipped |= BIFUEL_RUNNING_GASOLINE;
        }
        if ((o & BIFUEL_RUNNING_METHANOL) == BIFUEL_RUNNING_METHANOL) {
            list.add("BIFUEL_RUNNING_METHANOL");
            flipped |= BIFUEL_RUNNING_METHANOL;
        }
        if ((o & BIFUEL_RUNNING_ETHANOL) == BIFUEL_RUNNING_ETHANOL) {
            list.add("BIFUEL_RUNNING_ETHANOL");
            flipped |= BIFUEL_RUNNING_ETHANOL;
        }
        if ((o & BIFUEL_RUNNING_LPG) == BIFUEL_RUNNING_LPG) {
            list.add("BIFUEL_RUNNING_LPG");
            flipped |= BIFUEL_RUNNING_LPG;
        }
        if ((o & BIFUEL_RUNNING_CNG) == BIFUEL_RUNNING_CNG) {
            list.add("BIFUEL_RUNNING_CNG");
            flipped |= BIFUEL_RUNNING_CNG;
        }
        if ((o & BIFUEL_RUNNING_PROPANE) == BIFUEL_RUNNING_PROPANE) {
            list.add("BIFUEL_RUNNING_PROPANE");
            flipped |= BIFUEL_RUNNING_PROPANE;
        }
        if ((o & BIFUEL_RUNNING_ELECTRIC) == BIFUEL_RUNNING_ELECTRIC) {
            list.add("BIFUEL_RUNNING_ELECTRIC");
            flipped |= BIFUEL_RUNNING_ELECTRIC;
        }
        if ((o & BIFUEL_RUNNING_ELECTRIC_AND_COMBUSTION) == BIFUEL_RUNNING_ELECTRIC_AND_COMBUSTION) {
            list.add("BIFUEL_RUNNING_ELECTRIC_AND_COMBUSTION");
            flipped |= BIFUEL_RUNNING_ELECTRIC_AND_COMBUSTION;
        }
        if ((o & HYBRID_GASOLINE) == HYBRID_GASOLINE) {
            list.add("HYBRID_GASOLINE");
            flipped |= HYBRID_GASOLINE;
        }
        if ((o & HYBRID_ETHANOL) == HYBRID_ETHANOL) {
            list.add("HYBRID_ETHANOL");
            flipped |= HYBRID_ETHANOL;
        }
        if ((o & HYBRID_DIESEL) == HYBRID_DIESEL) {
            list.add("HYBRID_DIESEL");
            flipped |= HYBRID_DIESEL;
        }
        if ((o & HYBRID_ELECTRIC) == HYBRID_ELECTRIC) {
            list.add("HYBRID_ELECTRIC");
            flipped |= HYBRID_ELECTRIC;
        }
        if ((o & HYBRID_RUNNING_ELECTRIC_AND_COMBUSTION) == HYBRID_RUNNING_ELECTRIC_AND_COMBUSTION) {
            list.add("HYBRID_RUNNING_ELECTRIC_AND_COMBUSTION");
            flipped |= HYBRID_RUNNING_ELECTRIC_AND_COMBUSTION;
        }
        if ((o & HYBRID_REGENERATIVE) == HYBRID_REGENERATIVE) {
            list.add("HYBRID_REGENERATIVE");
            flipped |= HYBRID_REGENERATIVE;
        }
        if ((o & BIFUEL_RUNNING_DIESEL) == BIFUEL_RUNNING_DIESEL) {
            list.add("BIFUEL_RUNNING_DIESEL");
            flipped |= BIFUEL_RUNNING_DIESEL;
        }
        if (o != flipped) {
            list.add("0x" + Integer.toHexString(o & (~flipped)));
        }
        return String.join(" | ", list);
    }

};

