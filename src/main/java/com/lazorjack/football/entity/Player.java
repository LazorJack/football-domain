package com.lazorjack.football.entity;

import javax.persistence.*;

/**
 * Created by jacklazorchak on 10/30/16.
 */

@Entity
public class Player extends Person {

    @Id
    @GeneratedValue
    private Long id;

    @Enumerated(value = EnumType.STRING)
    private Position position;

    @ManyToOne
    private Team team;

    public Player(String firstName, String lastName, Position position, Team team) {
        super(firstName, lastName);
        this.position = position;
        this.team = team;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Team getTeam() {
        return team;
    }

    public void setTeam(Team team) {
        this.team = team;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }
}
