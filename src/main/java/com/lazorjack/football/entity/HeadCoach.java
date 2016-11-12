package com.lazorjack.football.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by jacklazorchak on 11/8/16.
 */

@Entity
public class HeadCoach extends Person {

    @Id
    @GeneratedValue
    private Long id;

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
}
