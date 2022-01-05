package de.lukas.api.main;

import de.lukas.api.methoden.ClickableMessageAPI;
import de.lukas.api.methoden.MessageAPI;

public class WireWayAPI {

    private static MessageAPI messageAPI;
    private static ClickableMessageAPI clickableMessageAPI;

    public static MessageAPI getMessageAPI() {return messageAPI;}
    public static ClickableMessageAPI getClickableMessageAPI() {return clickableMessageAPI;}

    public static void setMessageAPI(MessageAPI messageAPI) {WireWayAPI.messageAPI = messageAPI;}
    public static void setClickableMessageAPI(ClickableMessageAPI clickableMessageAPI) {WireWayAPI.clickableMessageAPI = clickableMessageAPI;}
}
