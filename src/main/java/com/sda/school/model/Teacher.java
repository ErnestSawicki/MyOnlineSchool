package com.sda.school.model;

import javax.persistence.*;

@Entity(name = "Teacher")
@Table(name = "teacher")
public class Teacher extends EntityBase {

    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "person_id")
    private Person person;

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public void giveGrade() {
        //todo
    }
}
