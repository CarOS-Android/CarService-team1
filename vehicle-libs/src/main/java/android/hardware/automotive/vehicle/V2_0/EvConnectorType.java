package android.hardware.automotive.vehicle.V2_0;


public final class EvConnectorType {
    /**
     * Default type if the vehicle does not know or report the EV connector
     * type.
     */
    public static final int UNKNOWN = 0;
    public static final int IEC_TYPE_1_AC = 1;
    public static final int IEC_TYPE_2_AC = 2;
    public static final int IEC_TYPE_3_AC = 3;
    public static final int IEC_TYPE_4_DC = 4;
    public static final int IEC_TYPE_1_CCS_DC = 5;
    public static final int IEC_TYPE_2_CCS_DC = 6;
    public static final int TESLA_ROADSTER = 7;
    public static final int TESLA_HPWC = 8;
    public static final int TESLA_SUPERCHARGER = 9;
    public static final int GBT_AC = 10;
    public static final int GBT_DC = 11;
    /**
     * Connector type to use when no other types apply. Before using this
     * value, work with Google to see if the EvConnectorType enum can be
     * extended with an appropriate value.
     */
    public static final int OTHER = 101;
    public static final String toString(int o) {
        if (o == UNKNOWN) {
            return "UNKNOWN";
        }
        if (o == IEC_TYPE_1_AC) {
            return "IEC_TYPE_1_AC";
        }
        if (o == IEC_TYPE_2_AC) {
            return "IEC_TYPE_2_AC";
        }
        if (o == IEC_TYPE_3_AC) {
            return "IEC_TYPE_3_AC";
        }
        if (o == IEC_TYPE_4_DC) {
            return "IEC_TYPE_4_DC";
        }
        if (o == IEC_TYPE_1_CCS_DC) {
            return "IEC_TYPE_1_CCS_DC";
        }
        if (o == IEC_TYPE_2_CCS_DC) {
            return "IEC_TYPE_2_CCS_DC";
        }
        if (o == TESLA_ROADSTER) {
            return "TESLA_ROADSTER";
        }
        if (o == TESLA_HPWC) {
            return "TESLA_HPWC";
        }
        if (o == TESLA_SUPERCHARGER) {
            return "TESLA_SUPERCHARGER";
        }
        if (o == GBT_AC) {
            return "GBT_AC";
        }
        if (o == GBT_DC) {
            return "GBT_DC";
        }
        if (o == OTHER) {
            return "OTHER";
        }
        return "0x" + Integer.toHexString(o);
    }

    public static final String dumpBitfield(int o) {
        java.util.ArrayList<String> list = new java.util.ArrayList<>();
        int flipped = 0;
        list.add("UNKNOWN"); // UNKNOWN == 0
        if ((o & IEC_TYPE_1_AC) == IEC_TYPE_1_AC) {
            list.add("IEC_TYPE_1_AC");
            flipped |= IEC_TYPE_1_AC;
        }
        if ((o & IEC_TYPE_2_AC) == IEC_TYPE_2_AC) {
            list.add("IEC_TYPE_2_AC");
            flipped |= IEC_TYPE_2_AC;
        }
        if ((o & IEC_TYPE_3_AC) == IEC_TYPE_3_AC) {
            list.add("IEC_TYPE_3_AC");
            flipped |= IEC_TYPE_3_AC;
        }
        if ((o & IEC_TYPE_4_DC) == IEC_TYPE_4_DC) {
            list.add("IEC_TYPE_4_DC");
            flipped |= IEC_TYPE_4_DC;
        }
        if ((o & IEC_TYPE_1_CCS_DC) == IEC_TYPE_1_CCS_DC) {
            list.add("IEC_TYPE_1_CCS_DC");
            flipped |= IEC_TYPE_1_CCS_DC;
        }
        if ((o & IEC_TYPE_2_CCS_DC) == IEC_TYPE_2_CCS_DC) {
            list.add("IEC_TYPE_2_CCS_DC");
            flipped |= IEC_TYPE_2_CCS_DC;
        }
        if ((o & TESLA_ROADSTER) == TESLA_ROADSTER) {
            list.add("TESLA_ROADSTER");
            flipped |= TESLA_ROADSTER;
        }
        if ((o & TESLA_HPWC) == TESLA_HPWC) {
            list.add("TESLA_HPWC");
            flipped |= TESLA_HPWC;
        }
        if ((o & TESLA_SUPERCHARGER) == TESLA_SUPERCHARGER) {
            list.add("TESLA_SUPERCHARGER");
            flipped |= TESLA_SUPERCHARGER;
        }
        if ((o & GBT_AC) == GBT_AC) {
            list.add("GBT_AC");
            flipped |= GBT_AC;
        }
        if ((o & GBT_DC) == GBT_DC) {
            list.add("GBT_DC");
            flipped |= GBT_DC;
        }
        if ((o & OTHER) == OTHER) {
            list.add("OTHER");
            flipped |= OTHER;
        }
        if (o != flipped) {
            list.add("0x" + Integer.toHexString(o & (~flipped)));
        }
        return String.join(" | ", list);
    }

};

