package com.lazorjack.football.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.Set;

/**
 * Created by jacklazorchak on 11/5/16.
 */
@Entity
public class League {

    @Id
    @GeneratedValue
    private Long id;

    private String name;

    @OneToMany(mappedBy="league", targetEntity = Conference.class)
    private Set<Conference> conferenceSet;

    public League() {

    }

    public League(String name, Set<Conference> conferenceSet) {
        this.name = name;
        this.conferenceSet = conferenceSet;
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

    public Set<Conference> getConferenceSet() {
        return conferenceSet;
    }

    public void setConferenceSet(Set<Conference> conferenceSet) {
        this.conferenceSet = conferenceSet;
    }
}
