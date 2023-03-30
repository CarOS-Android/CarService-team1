package android.hardware.automotive.vehicle.V2_0;


public final class VmsStartSessionMessageIntegerValuesIndex {
    public static final int MESSAGE_TYPE = 0;
    public static final int SERVICE_ID = 1;
    public static final int CLIENT_ID = 2;
    public static final String toString(int o) {
        if (o == MESSAGE_TYPE) {
            return "MESSAGE_TYPE";
        }
        if (o == SERVICE_ID) {
            return "SERVICE_ID";
        }
        if (o == CLIENT_ID) {
            return "CLIENT_ID";
        }
        return "0x" + Integer.toHexString(o);
    }

    public static final String dumpBitfield(int o) {
        java.util.ArrayList<String> list = new java.util.ArrayList<>();
        int flipped = 0;
        list.add("MESSAGE_TYPE"); // MESSAGE_TYPE == 0
        if ((o & SERVICE_ID) == SERVICE_ID) {
            list.add("SERVICE_ID");
            flipped |= SERVICE_ID;
        }
        if ((o & CLIENT_ID) == CLIENT_ID) {
            list.add("CLIENT_ID");
            flipped |= CLIENT_ID;
        }
        if (o != flipped) {
            list.add("0x" + Integer.toHexString(o & (~flipped)));
        }
        return String.join(" | ", list);
    }

};

