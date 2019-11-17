package com.sda.school.model;

import javax.persistence.*;

@Entity
public class Teacher extends EntityBase {

    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "person_id")
    private Person person;
}
