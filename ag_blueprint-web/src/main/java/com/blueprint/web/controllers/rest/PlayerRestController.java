package com.blueprint.web.controllers.rest;

import com.blueprint.models.Player;
import com.blueprint.web.services.PlayerService;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PlayerRestController {

    private static final Logger logger = LoggerFactory.getLogger(PlayerRestController.class);

    @Autowired
    private PlayerService playerService;

    @GetMapping("/api/players")
    public List<Player> getPlayer() {
        logger.debug("Inside getPlayer method of PlayerRestController ");
        return playerService.getAllPlayers();
    }

    @GetMapping("/api/player/{playerName}")
    public ResponseEntity getPlayerByName(@PathVariable String playerName) throws Exception{
        logger.debug("Inside getPlayerByName method of PlayerRestController and playerName: {} ", playerName);
        Player player = playerService.getPlayerByName(playerName);
        if (player == null) {
            logger.info("No player found for the given playerName");
            throw new Exception("No player found for the given playerName");
            //return new ResponseEntity("No player found for the given playerName ", HttpStatus.NOT_FOUND);
        }
        logger.info("PLayer found with the given playerName ");
        return new ResponseEntity(player, HttpStatus.OK);
    }

    @PostMapping("/api/players")
    public ResponseEntity savePlayer(@RequestBody Player playerObj) {
        logger.debug("Inside savePlayer method of PlayerRestController");
        Player player = playerService.savePlayer(playerObj);
        return new ResponseEntity(player, HttpStatus.OK);
    }

    @DeleteMapping("/api/players/{id}")
    public ResponseEntity deletePlayer(@PathVariable int id) {
        logger.debug("Inside savePlayer method of PlayerRestController");
        if (0 == playerService.deletePlayer(id)) {
            return new ResponseEntity("Player not deleted for given Id", HttpStatus.NOT_FOUND);
        }

        return new ResponseEntity(id, HttpStatus.OK);
    }

    @PutMapping("/api/players/{id}")
    public ResponseEntity updatePlayer(@RequestBody Player playerObj, @PathVariable int id) {
        logger.debug("Inside savePlayer method of PlayerRestController");
        Player player = playerService.updatePlayer(id, playerObj);
        if (player == null) {
            return new ResponseEntity("No player updated for the given Id ", HttpStatus.OK);
        }
        return new ResponseEntity(player, HttpStatus.OK);
    }

}
