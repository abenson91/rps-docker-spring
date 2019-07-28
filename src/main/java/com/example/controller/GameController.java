package com.example.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Slf4j
@Controller
public class GameController {

    /*@RequestMapping(path = "/")
    public String login() {
        log.info("redirecting to login");
        return "login";
    }*/

    @RequestMapping(path = "/rps.html")
    public String rps() {
        log.info("redirecting to game");
        return "rps";
    }
}
