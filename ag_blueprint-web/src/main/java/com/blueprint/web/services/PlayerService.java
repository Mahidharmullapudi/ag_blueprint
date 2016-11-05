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

    public void savePlayer(Player player);

    public void deletePlayer(Player player);

    public void updatePlayer(Player player);
}
