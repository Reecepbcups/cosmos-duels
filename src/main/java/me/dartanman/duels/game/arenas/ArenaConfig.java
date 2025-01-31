package me.dartanman.duels.game.arenas;

import org.bukkit.Location;

import java.util.HashMap;
import java.util.UUID;

/**
 * ArenaConfig -- The idea is to create all the information an Arena needs, then create it.
 * This is better that what I used to do because if you created only half an Arena, problems could occur.
 * This shouldn't happen now.
 *
 * @author Austin Dart (Dartanman)
 */
public class ArenaConfig
{

    public static final HashMap<UUID, ArenaConfig> creationMap = new HashMap<>();

    private final int id;
    private final String name;

    private Location spawnOne;
    private Location spawnTwo;
    private Location lobby;
    private int countdownSeconds;
    private long uTokenBetAmount;

    public ArenaConfig(int id, String name)
    {
        this.id = id;
        this.name = name;
        this.countdownSeconds = 15;
        this.uTokenBetAmount = 1_000_000;
    }

    public boolean isFinished()
    {
        return spawnOne != null && spawnTwo != null && lobby != null;
    }

    public int getId()
    {
        return id;
    }

    public String getName()
    {
        return name;
    }

    public Location getSpawnOne()
    {
        return spawnOne;
    }

    public void setSpawnOne(Location spawnOne)
    {
        this.spawnOne = spawnOne;
    }

    public Location getSpawnTwo()
    {
        return spawnTwo;
    }

    public void setSpawnTwo(Location spawnTwo)
    {
        this.spawnTwo = spawnTwo;
    }

    public Location getLobby()
    {
        return lobby;
    }

    public void setLobby(Location lobby)
    {
        this.lobby = lobby;
    }

    public int getCountdownSeconds()
    {
        return countdownSeconds;
    }

    public void setCountdownSeconds(int countdownSeconds)
    {
        this.countdownSeconds = countdownSeconds;
    }

    public long getuTokenBetAmount() {
        return uTokenBetAmount;
    }
    public void setuTokenBetAmount(long uTokenBetAmount) {
        this.uTokenBetAmount = uTokenBetAmount;
    }
}
