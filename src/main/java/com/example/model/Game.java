package com.example.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.RedisHash;
import org.springframework.data.redis.core.index.Indexed;

import java.io.Serializable;

@Getter
@Setter
@RedisHash("Game")
@NoArgsConstructor
@AllArgsConstructor
public class Game implements Serializable {

    public Game(String userName, Integer wins, Integer losses, Integer draws) {
        this.userName = userName;
        this.wins = wins;
        this.losses = losses;
        this.draws = draws;
    }

    @Id private String id;
    @Indexed private String userName;
    private Integer wins;
    private Integer losses;
    private Integer draws;

}
