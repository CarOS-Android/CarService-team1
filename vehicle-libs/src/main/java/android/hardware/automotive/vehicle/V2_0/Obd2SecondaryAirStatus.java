package android.hardware.automotive.vehicle.V2_0;


public final class Obd2SecondaryAirStatus {
    public static final int UPSTREAM = 1;
    public static final int DOWNSTREAM_OF_CATALYCIC_CONVERTER = 2;
    public static final int FROM_OUTSIDE_OR_OFF = 4;
    public static final int PUMP_ON_FOR_DIAGNOSTICS = 8;
    public static final String toString(int o) {
        if (o == UPSTREAM) {
            return "UPSTREAM";
        }
        if (o == DOWNSTREAM_OF_CATALYCIC_CONVERTER) {
            return "DOWNSTREAM_OF_CATALYCIC_CONVERTER";
        }
        if (o == FROM_OUTSIDE_OR_OFF) {
            return "FROM_OUTSIDE_OR_OFF";
        }
        if (o == PUMP_ON_FOR_DIAGNOSTICS) {
            return "PUMP_ON_FOR_DIAGNOSTICS";
        }
        return "0x" + Integer.toHexString(o);
    }

    public static final String dumpBitfield(int o) {
        java.util.ArrayList<String> list = new java.util.ArrayList<>();
        int flipped = 0;
        if ((o & UPSTREAM) == UPSTREAM) {
            list.add("UPSTREAM");
            flipped |= UPSTREAM;
        }
        if ((o & DOWNSTREAM_OF_CATALYCIC_CONVERTER) == DOWNSTREAM_OF_CATALYCIC_CONVERTER) {
            list.add("DOWNSTREAM_OF_CATALYCIC_CONVERTER");
            flipped |= DOWNSTREAM_OF_CATALYCIC_CONVERTER;
        }
        if ((o & FROM_OUTSIDE_OR_OFF) == FROM_OUTSIDE_OR_OFF) {
            list.add("FROM_OUTSIDE_OR_OFF");
            flipped |= FROM_OUTSIDE_OR_OFF;
        }
        if ((o & PUMP_ON_FOR_DIAGNOSTICS) == PUMP_ON_FOR_DIAGNOSTICS) {
            list.add("PUMP_ON_FOR_DIAGNOSTICS");
            flipped |= PUMP_ON_FOR_DIAGNOSTICS;
        }
        if (o != flipped) {
            list.add("0x" + Integer.toHexString(o & (~flipped)));
        }
        return String.join(" | ", list);
    }

};

