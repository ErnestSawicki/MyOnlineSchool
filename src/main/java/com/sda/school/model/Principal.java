package com.sda.school.model;

import javax.persistence.*;

@Entity
@Table
public class Principal extends EntityBase {

    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name="person_id")
    private Person person;


}
