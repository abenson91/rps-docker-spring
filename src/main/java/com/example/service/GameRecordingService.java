package com.example.service;

import com.example.model.Game;
import com.example.repository.GameRepository;
import org.springframework.data.redis.repository.configuration.EnableRedisRepositories;
import org.springframework.stereotype.Service;

@Service
@EnableRedisRepositories(value = "com.example.repository")
public class GameRecordingService {

    private final GameRepository repository;

    public GameRecordingService(GameRepository repository) {
        this.repository = repository;
    }

    public Game saveGame(Game game) {
        return repository.save(game);
    }

    public Game getLastGame(String userId) {
        return repository.findById(userId).orElse(new Game(userId));

    }
}
