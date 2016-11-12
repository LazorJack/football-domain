package com.lazorjack.football.entity;

import javax.persistence.*;
import java.util.Set;

/**
 * Created by jacklazorchak on 11/1/16.
 */
@Entity
public class Division {

    @Id
    @GeneratedValue
    private Long id;

    @ManyToOne
    private Conference conference;

    private String name;

    @OneToMany(mappedBy="division", targetEntity = Team.class)
    private Set<Team> teamSet;

    public Division(Conference conference, String name) {
        this.conference = conference;
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Conference getConference() {
        return conference;
    }

    public void setConference(Conference conference) {
        this.conference = conference;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Team> getTeamSet() {
        return teamSet;
    }

    public void setTeamSet(Set<Team> teamSet) {
        this.teamSet = teamSet;
    }
}
