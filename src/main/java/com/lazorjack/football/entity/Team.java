package com.lazorjack.football.entity;

import javax.persistence.*;
import java.util.Set;

/**
 * Created by jacklazorchak on 10/30/16.
 */

@Entity
public class Team {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private Location location;

    private HeadCoach headCoach;

    @ManyToOne
    private Division division;

    @OneToMany(mappedBy="team", targetEntity = Player.class)
    private Set<Player> playerSet;

    public Team(String name, Location location, HeadCoach headCoach, Division division) {
        this.name = name;
        this.location = location;
        this.headCoach = headCoach;
        this.division = division;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public HeadCoach getHeadCoach() {
        return headCoach;
    }

    public void setHeadCoach(HeadCoach headCoach) {
        this.headCoach = headCoach;
    }

    public Division getDivision() {
        return division;
    }

    public void setDivision(Division division) {
        this.division = division;
    }

    public Set<Player> getPlayerSet() {
        return playerSet;
    }

    public void setPlayerSet(Set<Player> playerSet) {
        this.playerSet = playerSet;
    }
}