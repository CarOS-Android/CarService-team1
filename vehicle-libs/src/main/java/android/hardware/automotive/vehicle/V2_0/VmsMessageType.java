package android.hardware.automotive.vehicle.V2_0;


public final class VmsMessageType {
    /**
     * A request from the subscribers to the VMS service to subscribe to a layer.
     * 
     * This message type uses enum VmsMessageWithLayerIntegerValuesIndex.
     */
    public static final int SUBSCRIBE = 1;
    /**
     * A request from the subscribers to the VMS service to subscribe to a layer from a specific publisher.
     * 
     * This message type uses enum VmsMessageWithLayerAndPublisherIdIntegerValuesIndex.
     */
    public static final int SUBSCRIBE_TO_PUBLISHER = 2;
    /**
     * A request from the subscribers to the VMS service to unsubscribes from a layer.
     * 
     * This message type uses enum VmsMessageWithLayerIntegerValuesIndex.
     */
    public static final int UNSUBSCRIBE = 3;
    /**
     * A request from the subscribers to the VMS service to unsubscribes from a layer from a specific publisher.
     * 
     * This message type uses enum VmsMessageWithLayerAndPublisherIdIntegerValuesIndex.
     */
    public static final int UNSUBSCRIBE_TO_PUBLISHER = 4;
    /**
     * Information from the publishers to the VMS service about the layers which the client can publish.
     * 
     * This message type uses enum VmsOfferingMessageIntegerValuesIndex.
     */
    public static final int OFFERING = 5;
    /**
     * A request from the subscribers to the VMS service to get the available layers.
     * 
     * This message type uses enum VmsBaseMessageIntegerValuesIndex.
     */
    public static final int AVAILABILITY_REQUEST = 6;
    /**
     * A request from the publishers to the VMS service to get the layers with subscribers.
     * 
     * This message type uses enum VmsBaseMessageIntegerValuesIndex.
     */
    public static final int SUBSCRIPTIONS_REQUEST = 7;
    /**
     * A response from the VMS service to the subscribers to a VmsMessageType.AVAILABILITY_REQUEST
     * 
     * This message type uses enum VmsAvailabilityStateIntegerValuesIndex.
     */
    public static final int AVAILABILITY_RESPONSE = 8;
    /**
     * A notification from the VMS service to the subscribers on a change in the available layers.
     * 
     * This message type uses enum VmsAvailabilityStateIntegerValuesIndex.
     */
    public static final int AVAILABILITY_CHANGE = 9;
    /**
     * A response from the VMS service to the publishers to a VmsMessageType.SUBSCRIPTIONS_REQUEST
     * 
     * This message type uses enum VmsSubscriptionsStateIntegerValuesIndex.
     */
    public static final int SUBSCRIPTIONS_RESPONSE = 10;
    /**
     * A notification from the VMS service to the publishers on a change in the layers with subscribers.
     * 
     * This message type uses enum VmsSubscriptionsStateIntegerValuesIndex.
     */
    public static final int SUBSCRIPTIONS_CHANGE = 11;
    /**
     * A message from the VMS service to the subscribers or from the publishers to the VMS service
     * with a serialized VMS data packet as defined in the VMS protocol.
     * 
     * This message type uses enum VmsMessageWithLayerAndPublisherIdIntegerValuesIndex.
     */
    public static final int DATA = 12;
    /**
     * A request from the publishers to the VMS service to get a Publisher ID for a serialized VMS
     * provider description packet as defined in the VMS protocol.
     * 
     * This message type uses enum VmsBaseMessageIntegerValuesIndex.
     */
    public static final int PUBLISHER_ID_REQUEST = 13;
    /**
     * A response from the VMS service to the publisher that contains a provider description packet
     * and the publisher ID assigned to it.
     * 
     * This message type uses enum VmsPublisherInformationIntegerValuesIndex.
     */
    public static final int PUBLISHER_ID_RESPONSE = 14;
    /**
     * A request from the subscribers to the VMS service to get information for a Publisher ID.
     * 
     * This message type uses enum VmsPublisherInformationIntegerValuesIndex.
     */
    public static final int PUBLISHER_INFORMATION_REQUEST = 15;
    /**
     * A response from the VMS service to the subscribers that contains a provider description packet
     * and the publisher ID assigned to it.
     * 
     * This message type uses enum VmsPublisherInformationIntegerValuesIndex.
     */
    public static final int PUBLISHER_INFORMATION_RESPONSE = 16;
    /**
     * A notification indicating that the sender has been reset.
     * 
     * The receiving party must reset its internal state and respond to the
     * sender with a START_SESSION message as acknowledgement.
     * 
     * This message type uses enum VmsStartSessionMessageIntegerValuesIndex.
     */
    public static final int START_SESSION = 17;
    public static final int LAST_VMS_MESSAGE_TYPE = 17 /* START_SESSION */;
    public static final String toString(int o) {
        if (o == SUBSCRIBE) {
            return "SUBSCRIBE";
        }
        if (o == SUBSCRIBE_TO_PUBLISHER) {
            return "SUBSCRIBE_TO_PUBLISHER";
        }
        if (o == UNSUBSCRIBE) {
            return "UNSUBSCRIBE";
        }
        if (o == UNSUBSCRIBE_TO_PUBLISHER) {
            return "UNSUBSCRIBE_TO_PUBLISHER";
        }
        if (o == OFFERING) {
            return "OFFERING";
        }
        if (o == AVAILABILITY_REQUEST) {
            return "AVAILABILITY_REQUEST";
        }
        if (o == SUBSCRIPTIONS_REQUEST) {
            return "SUBSCRIPTIONS_REQUEST";
        }
        if (o == AVAILABILITY_RESPONSE) {
            return "AVAILABILITY_RESPONSE";
        }
        if (o == AVAILABILITY_CHANGE) {
            return "AVAILABILITY_CHANGE";
        }
        if (o == SUBSCRIPTIONS_RESPONSE) {
            return "SUBSCRIPTIONS_RESPONSE";
        }
        if (o == SUBSCRIPTIONS_CHANGE) {
            return "SUBSCRIPTIONS_CHANGE";
        }
        if (o == DATA) {
            return "DATA";
        }
        if (o == PUBLISHER_ID_REQUEST) {
            return "PUBLISHER_ID_REQUEST";
        }
        if (o == PUBLISHER_ID_RESPONSE) {
            return "PUBLISHER_ID_RESPONSE";
        }
        if (o == PUBLISHER_INFORMATION_REQUEST) {
            return "PUBLISHER_INFORMATION_REQUEST";
        }
        if (o == PUBLISHER_INFORMATION_RESPONSE) {
            return "PUBLISHER_INFORMATION_RESPONSE";
        }
        if (o == START_SESSION) {
            return "START_SESSION";
        }
        if (o == LAST_VMS_MESSAGE_TYPE) {
            return "LAST_VMS_MESSAGE_TYPE";
        }
        return "0x" + Integer.toHexString(o);
    }

    public static final String dumpBitfield(int o) {
        java.util.ArrayList<String> list = new java.util.ArrayList<>();
        int flipped = 0;
        if ((o & SUBSCRIBE) == SUBSCRIBE) {
            list.add("SUBSCRIBE");
            flipped |= SUBSCRIBE;
        }
        if ((o & SUBSCRIBE_TO_PUBLISHER) == SUBSCRIBE_TO_PUBLISHER) {
            list.add("SUBSCRIBE_TO_PUBLISHER");
            flipped |= SUBSCRIBE_TO_PUBLISHER;
        }
        if ((o & UNSUBSCRIBE) == UNSUBSCRIBE) {
            list.add("UNSUBSCRIBE");
            flipped |= UNSUBSCRIBE;
        }
        if ((o & UNSUBSCRIBE_TO_PUBLISHER) == UNSUBSCRIBE_TO_PUBLISHER) {
            list.add("UNSUBSCRIBE_TO_PUBLISHER");
            flipped |= UNSUBSCRIBE_TO_PUBLISHER;
        }
        if ((o & OFFERING) == OFFERING) {
            list.add("OFFERING");
            flipped |= OFFERING;
        }
        if ((o & AVAILABILITY_REQUEST) == AVAILABILITY_REQUEST) {
            list.add("AVAILABILITY_REQUEST");
            flipped |= AVAILABILITY_REQUEST;
        }
        if ((o & SUBSCRIPTIONS_REQUEST) == SUBSCRIPTIONS_REQUEST) {
            list.add("SUBSCRIPTIONS_REQUEST");
            flipped |= SUBSCRIPTIONS_REQUEST;
        }
        if ((o & AVAILABILITY_RESPONSE) == AVAILABILITY_RESPONSE) {
            list.add("AVAILABILITY_RESPONSE");
            flipped |= AVAILABILITY_RESPONSE;
        }
        if ((o & AVAILABILITY_CHANGE) == AVAILABILITY_CHANGE) {
            list.add("AVAILABILITY_CHANGE");
            flipped |= AVAILABILITY_CHANGE;
        }
        if ((o & SUBSCRIPTIONS_RESPONSE) == SUBSCRIPTIONS_RESPONSE) {
            list.add("SUBSCRIPTIONS_RESPONSE");
            flipped |= SUBSCRIPTIONS_RESPONSE;
        }
        if ((o & SUBSCRIPTIONS_CHANGE) == SUBSCRIPTIONS_CHANGE) {
            list.add("SUBSCRIPTIONS_CHANGE");
            flipped |= SUBSCRIPTIONS_CHANGE;
        }
        if ((o & DATA) == DATA) {
            list.add("DATA");
            flipped |= DATA;
        }
        if ((o & PUBLISHER_ID_REQUEST) == PUBLISHER_ID_REQUEST) {
            list.add("PUBLISHER_ID_REQUEST");
            flipped |= PUBLISHER_ID_REQUEST;
        }
        if ((o & PUBLISHER_ID_RESPONSE) == PUBLISHER_ID_RESPONSE) {
            list.add("PUBLISHER_ID_RESPONSE");
            flipped |= PUBLISHER_ID_RESPONSE;
        }
        if ((o & PUBLISHER_INFORMATION_REQUEST) == PUBLISHER_INFORMATION_REQUEST) {
            list.add("PUBLISHER_INFORMATION_REQUEST");
            flipped |= PUBLISHER_INFORMATION_REQUEST;
        }
        if ((o & PUBLISHER_INFORMATION_RESPONSE) == PUBLISHER_INFORMATION_RESPONSE) {
            list.add("PUBLISHER_INFORMATION_RESPONSE");
            flipped |= PUBLISHER_INFORMATION_RESPONSE;
        }
        if ((o & START_SESSION) == START_SESSION) {
            list.add("START_SESSION");
            flipped |= START_SESSION;
        }
        if ((o & LAST_VMS_MESSAGE_TYPE) == LAST_VMS_MESSAGE_TYPE) {
            list.add("LAST_VMS_MESSAGE_TYPE");
            flipped |= LAST_VMS_MESSAGE_TYPE;
        }
        if (o != flipped) {
            list.add("0x" + Integer.toHexString(o & (~flipped)));
        }
        return String.join(" | ", list);
    }

};

