/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.blueprint.web.controllers.rest;

import com.blueprint.models.Player;
import com.blueprint.web.services.PlayerService;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PlayerRestController {
    
    private Logger logger = LoggerFactory.getLogger(PlayerRestController.class);

    @Autowired
    private PlayerService playerService;
    
    @GetMapping("/api/player/all")
    public List<Player> getPlayer() {
        logger.debug("Inside getPlayer method of PlayerRestController ");
        return playerService.getAllPlayers();
    }
    
    @GetMapping("/api/player/{playerName}")
    public Player getPlayerByName(@PathVariable String playerName) {
        logger.debug("Inside getPlayerByName method of PlayerRestController and playerName: {} ", playerName);
        return playerService.getPlayerByName(playerName);
    }

}
