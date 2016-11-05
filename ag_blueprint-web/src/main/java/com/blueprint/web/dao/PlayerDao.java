/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

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

    public void savePlayer(Player player);

    public void deletePlayer(Player player);

    public void updatePlayer(Player player);
    
}
