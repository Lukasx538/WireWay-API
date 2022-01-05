package de.lukas.api.main;

import de.lukas.api.methoden.ClickableMessageAPI;
import de.lukas.api.methoden.MessageAPI;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

    private static Main instance;
    private MessageAPI messageAPI;
    private ClickableMessageAPI clickableMessageAPI;

    @Override
    public void onEnable() {
        instance = this;
        WireWayAPI.setMessageAPI(messageAPI);
        WireWayAPI.setClickableMessageAPI(clickableMessageAPI);
    }

    public static Main getInstance() {
        return instance;
    }

}
