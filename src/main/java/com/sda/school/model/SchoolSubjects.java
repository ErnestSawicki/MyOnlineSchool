package com.sda.school.model;


import javax.persistence.*;

@Entity(name = "SchoolSubjects")
@Table(name = "school_subjects")
public class SchoolSubjects extends EntityBase {

    @Column(name = "subjects_name")
    @Enumerated(EnumType.STRING)
    private Subjects subject;

    public SchoolSubjects(){}

    public SchoolSubjects(Subjects subject){
        this.subject=subject;
    }


    public Subjects getSubject() {
        return subject;
    }



    public void setSubject(Subjects subject) {
        this.subject = subject;
    }
}
