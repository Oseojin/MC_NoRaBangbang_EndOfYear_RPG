package org.osj.nRBRPG.MANAGER;

import org.bukkit.Bukkit;
import org.bukkit.Location;

public class SpawnLocationManager
{
    public static Location lobbySpawnLoc;
    public static Location wildSpawnLoc;

    public SpawnLocationManager()
    {
        lobbySpawnLoc = new Location(Bukkit.getWorld(WorldManager.lobbyWorld), 0.5, -58, -0.5);
        wildSpawnLoc = Bukkit.getWorld(WorldManager.wildWorlds.get(0)).getSpawnLocation();
    }
}
