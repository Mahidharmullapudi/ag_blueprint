package com.blueprint.web.dao;

import com.blueprint.models.Player;
import java.util.List;

/**
 *
 * @author agamull
 */
public interface PlayerDao {
    
    public List<Player> getAllPlayers();

    public Player getPlayerByName(String playerName);

    public Player savePlayer(Player player);

    public int deletePlayer(int id);
    
    public int deletePlayer(String playerName);

    public Player updatePlayer(int id, Player player);
    
}
