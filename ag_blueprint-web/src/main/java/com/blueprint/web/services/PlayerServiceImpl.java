
package com.blueprint.web.services;

import com.blueprint.models.Player;
import com.blueprint.web.dao.PlayerDao;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PlayerServiceImpl implements PlayerService {
    
    private Logger logger = LoggerFactory.getLogger(PlayerServiceImpl.class);
    
    @Autowired
    private PlayerDao playerDao;

    @Override
    public List<Player> getAllPlayers() {
        logger.debug("Inside getAllPlayers method of PlayerServiceImpl");
        return playerDao.getAllPlayers();
    }

    @Override
    public Player getPlayerByName(String playerName) {
        logger.debug("Inside getPlayerByName method of PlayerServiceImpl {}: ", playerName);
        return playerDao.getPlayerByName(playerName);
    }

    @Override
    public void savePlayer(Player player) {
        
    }

    @Override
    public void deletePlayer(Player player) {
        
    }

    @Override
    public void updatePlayer(Player player) {
        
    }
    
}