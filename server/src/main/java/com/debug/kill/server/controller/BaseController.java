package com.debug.kill.server.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/base")
public class BaseController {
    private static final Logger loger = LoggerFactory.getLogger(BaseController.class);

    @GetMapping("/welcome")
    public String welcome(){
        return "welcome";
    }
}
