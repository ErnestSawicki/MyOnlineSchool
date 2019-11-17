package com.sda.school.model;


import javax.persistence.*;

@Entity(name = "SchoolSubjects")
@Table(name = "school_subjects")
public class SchoolSubjects extends EntityBase {

    @Column(name = "subjects_name")
    private String name;



}
