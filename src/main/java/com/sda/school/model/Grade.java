package com.sda.school.model;

import javax.persistence.*;

@Table(name = "grade")
@Entity(name = "Grade")
public class Grade extends EntityBase{

    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL )
    @JoinColumn(name = "subject_id", nullable = false)
    private SchoolSubjects subject;


    @Column(name = "value")
    private Integer value;

    @ManyToOne(optional = false)
    @JoinColumn(name = "student_id", nullable = false)
    private Student student;

    public Grade(){
        //For ORM
    }

    public Grade(Integer value, Student student, SchoolSubjects subject) {
        this.value = value;
        this.student = student;
        this.subject=subject;
    }



    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }
}
