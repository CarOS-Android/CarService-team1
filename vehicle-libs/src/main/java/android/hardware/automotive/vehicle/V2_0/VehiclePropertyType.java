package android.hardware.automotive.vehicle.V2_0;


public final class VehiclePropertyType {
    public static final int STRING = 1048576 /* 0x00100000 */;
    public static final int BOOLEAN = 2097152 /* 0x00200000 */;
    public static final int INT32 = 4194304 /* 0x00400000 */;
    public static final int INT32_VEC = 4259840 /* 0x00410000 */;
    public static final int INT64 = 5242880 /* 0x00500000 */;
    public static final int INT64_VEC = 5308416 /* 0x00510000 */;
    public static final int FLOAT = 6291456 /* 0x00600000 */;
    public static final int FLOAT_VEC = 6356992 /* 0x00610000 */;
    public static final int BYTES = 7340032 /* 0x00700000 */;
    /**
     * Any combination of scalar or vector types. The exact format must be
     * provided in the description of the property.
     * 
     * For vendor MIXED type properties, configArray needs to be formatted in this
     * structure.
     * configArray[0], 1 indicates the property has a String value
     * configArray[1], 1 indicates the property has a Boolean value .
     * configArray[2], 1 indicates the property has an Integer value.
     * configArray[3], the number indicates the size of Integer[] in the property.
     * configArray[4], 1 indicates the property has a Long value.
     * configArray[5], the number indicates the size of Long[] in the property.
     * configArray[6], 1 indicates the property has a Float value.
     * configArray[7], the number indicates the size of Float[] in the property.
     * configArray[8], the number indicates the size of byte[] in the property.
     * For example:
     * {@code configArray = {1, 1, 1, 3, 0, 0, 0, 0, 0}} indicates the property has
     * a String value, a Boolean value, an Integer value and an array with 3 integers.
     */
    public static final int MIXED = 14680064 /* 0x00e00000 */;
    public static final int MASK = 16711680 /* 0x00ff0000 */;
    public static final String toString(int o) {
        if (o == STRING) {
            return "STRING";
        }
        if (o == BOOLEAN) {
            return "BOOLEAN";
        }
        if (o == INT32) {
            return "INT32";
        }
        if (o == INT32_VEC) {
            return "INT32_VEC";
        }
        if (o == INT64) {
            return "INT64";
        }
        if (o == INT64_VEC) {
            return "INT64_VEC";
        }
        if (o == FLOAT) {
            return "FLOAT";
        }
        if (o == FLOAT_VEC) {
            return "FLOAT_VEC";
        }
        if (o == BYTES) {
            return "BYTES";
        }
        if (o == MIXED) {
            return "MIXED";
        }
        if (o == MASK) {
            return "MASK";
        }
        return "0x" + Integer.toHexString(o);
    }

    public static final String dumpBitfield(int o) {
        java.util.ArrayList<String> list = new java.util.ArrayList<>();
        int flipped = 0;
        if ((o & STRING) == STRING) {
            list.add("STRING");
            flipped |= STRING;
        }
        if ((o & BOOLEAN) == BOOLEAN) {
            list.add("BOOLEAN");
            flipped |= BOOLEAN;
        }
        if ((o & INT32) == INT32) {
            list.add("INT32");
            flipped |= INT32;
        }
        if ((o & INT32_VEC) == INT32_VEC) {
            list.add("INT32_VEC");
            flipped |= INT32_VEC;
        }
        if ((o & INT64) == INT64) {
            list.add("INT64");
            flipped |= INT64;
        }
        if ((o & INT64_VEC) == INT64_VEC) {
            list.add("INT64_VEC");
            flipped |= INT64_VEC;
        }
        if ((o & FLOAT) == FLOAT) {
            list.add("FLOAT");
            flipped |= FLOAT;
        }
        if ((o & FLOAT_VEC) == FLOAT_VEC) {
            list.add("FLOAT_VEC");
            flipped |= FLOAT_VEC;
        }
        if ((o & BYTES) == BYTES) {
            list.add("BYTES");
            flipped |= BYTES;
        }
        if ((o & MIXED) == MIXED) {
            list.add("MIXED");
            flipped |= MIXED;
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

