package com.crystalarena;

import org.bukkit.Bukkit;
import org.bukkit.World;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.entity.EntityType;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityExplodeEvent;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.List;

public class CrystalArena extends JavaPlugin implements Listener {

    private List<String> enabledWorlds;

    @Override
    public void onEnable() {
        saveDefaultConfig();
        FileConfiguration config = getConfig();
        enabledWorlds = config.getStringList("enabled-worlds");

        Bukkit.getPluginManager().registerEvents(this, this);
        getLogger().info("CrystalArena enabled! Worlds: " + enabledWorlds);
    }

    @EventHandler
    public void onExplosion(EntityExplodeEvent event) {
        World world = event.getLocation().getWorld();
        if (world != null && enabledWorlds.contains(world.getName())) {
            if (event.getEntity() != null && event.getEntity().getType() == EntityType.ENDER_CRYSTAL) {
                event.blockList().clear(); // Prevents block damage, keeps player damage
            }
        }
    }
}
