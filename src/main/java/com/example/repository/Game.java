package com.example.repository;

import lombok.Data;
import org.springframework.data.redis.core.RedisHash;

import java.io.Serializable;

@Data
@RedisHash("Game")
public class Game implements Serializable {

    public enum RESULT {
        WIN,
        LOSE,
        DRAW
    }



}
