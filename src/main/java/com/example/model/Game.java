package com.example.model;

import lombok.Data;
import org.springframework.data.redis.core.RedisHash;

import java.io.Serializable;

@SuppressWarnings({"unused", "FieldCanBeLocal"}) //because of lombok
@Data
@RedisHash("Game")
public class Game implements Serializable {

    public enum Result {
        WIN,
        LOSE,
        DRAW,
        NA
    }

    public Game(String id) {
        this.id = id;
        this.result = Result.NA;
        this.wins = 0;
        this.losses = 0;
        this.draws = 0;
    }


    private String id;
    private Result result;
    private Integer wins;
    private Integer losses;
    private Integer draws;

}
