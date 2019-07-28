package com.example.repository;

import com.example.model.Game;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface GameRepository extends CrudRepository<Game, String> {

    Optional<Game> findByUserName(String userName);
}
