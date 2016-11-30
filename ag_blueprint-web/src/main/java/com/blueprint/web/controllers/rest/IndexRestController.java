package com.blueprint.web.controllers.rest;

import com.blueprint.models.Message;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexRestController {

    @RequestMapping("/api/")
    public String welcome() {
        return " Welcome to rest controllers";
    }

    @RequestMapping("api/hello/{player}")
    public Message message(@PathVariable String player) { //REST endpoint        
        Message msg = new Message(player, "Hello " +player);
        return msg;
    }

}
