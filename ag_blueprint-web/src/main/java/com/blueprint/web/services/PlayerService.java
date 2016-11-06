package com.blueprint.web.services;

import com.blueprint.models.Player;
import java.util.List;

/**
 *
 * @author agamull
 */
public interface PlayerService {

    public List<Player> getAllPlayers();

    public Player getPlayerByName(String playerName);

    public Player savePlayer(Player player);

    public int deletePlayer(int id);
    
    public void deletePlayer(String playerName);

    public Player updatePlayer(int id, Player player);
}
