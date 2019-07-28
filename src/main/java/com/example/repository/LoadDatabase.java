package com.example.repository;

import com.example.model.Game;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Slf4j
@Profile("local")
@Component
class LoadDatabase implements CommandLineRunner {

    private GameRepository repository;

    @Autowired
    public LoadDatabase(GameRepository repository) {
        this.repository = repository;
    }

    @Override
    public void run(String... strings) throws Exception {
        log.info("Loading data base");

        final String testId = "test1";

        this.repository.findByUserName(testId).ifPresent(
                game -> {
                    log.info("Id existed, removing");
                    repository.delete(game);
                }
        );
        this.repository.save(new Game(testId, 1, 1, 1));
        log.info("Database loaded -----------");
    }
}
