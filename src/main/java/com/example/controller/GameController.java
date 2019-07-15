package com.example.controller;

import com.example.model.Game;
import com.example.service.GameRecordingService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
public class GameController {

    private final GameRecordingService service;

    @Autowired
    public GameController(GameRecordingService service) {
        this.service = service;
    }

    @RequestMapping(path = "/getLastGame/{userId}")
    public Game getLastGameResult(@PathVariable String userId) {
        log.info("Getting Game Data for " + userId);
        return service.getLastGame(userId);
    }

    @PostMapping(path = "/saveGame")
    public void saveGameResult(@RequestBody Game game) {
        log.info("Posting Game data for " + game.toString());
        service.saveGame(game);
    }

    @PostMapping(path = "/add")
    public Game addData() {
        log.info("Adding data");
        Game game = new Game("user");
        return service.saveGame(game);
    }

}
