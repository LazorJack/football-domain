package com.lazorjack.football.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

/**
 * Created by jacklazorchak on 11/8/16.
 */

@Entity
public class HeadCoach extends Person {

    @Id
    @GeneratedValue
    private Long id;

    @OneToOne(mappedBy = "headCoach")
    private Team team;

    public HeadCoach(){
        super();
    }

    public HeadCoach(String firstName, String lastName) {
        super(firstName, lastName);
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
}
