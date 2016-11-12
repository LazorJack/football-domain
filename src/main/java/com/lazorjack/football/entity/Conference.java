package com.lazorjack.football.entity;

import javax.persistence.*;
import java.util.Set;

/**
 * Created by jacklazorchak on 11/1/16.
 */

@Entity
public class Conference {

    @Id
    @GeneratedValue
    private Long id;

    private String name;

    private String abbreviation;

    @ManyToOne
    private League league;

    @OneToMany(mappedBy="conference", targetEntity = Division.class)
    private Set<Division> divisionSet;

    public Conference(){

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

    public League getLeague() {
        return league;
    }

    public void setLeague(League league) {
        this.league = league;
    }

    public String getAbbreviation() {
        return abbreviation;
    }

    public void setAbbreviation(String abbreviation) {
        this.abbreviation = abbreviation;
    }

    public Set<Division> getDivisionSet() {
        return divisionSet;
    }

    public void setDivisionSet(Set<Division> divisionSet) {
        this.divisionSet = divisionSet;
    }
}
