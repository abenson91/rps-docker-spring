package com.example.repository;

import com.example.model.Game;
import lombok.extern.slf4j.Slf4j;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@Slf4j
class LoadDatabase {

    @Bean
    CommandLineRunner initDatabase(GameRepository repository) {
        return args -> {
            log.info("Preloading " + repository.save(new Game("user")));
        };
    }
}
