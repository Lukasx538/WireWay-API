package de.lukas.api.main;

import org.bukkit.plugin.java.JavaPlugin;

public class WireWay extends JavaPlugin {

    private static WireWay instance;

    @Override
    public void onEnable() {
        instance = this;
    }

    @Override
    public void onDisable() {
    }

    public static WireWay getAPI() {
        return instance;
    }

}
