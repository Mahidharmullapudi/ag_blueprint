package com.blueprint.web.controllers;

import org.slf4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.slf4j.LoggerFactory;

@Controller
@RequestMapping("/")
public class IndexController {

    Logger logger = LoggerFactory.getLogger(IndexController.class);
    
    @RequestMapping(method = RequestMethod.GET)
    public String indexMethod() {
        
        logger.debug("Inside indexMethod of IndexController");        
        return "index";
    }

}
