package com.debug.kill.server.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller

public class ItemController {

    private static final Logger logger = LoggerFactory.getLogger(ItemController.class);

    private static final String prefix = "item";

    @GetMapping({"/","/index",prefix + "/list",prefix + "index.html"})
    public String list(){

        return "list";
    }

}
