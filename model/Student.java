package school.model;

import javax.persistence.*;
import java.util.List;

@Entity(name = "Student")
@Table(name = "student")
public class Student extends EntityBase {

    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "user_id")
    private Person person;

    @OneToMany(mappedBy = "student", cascade = CascadeType.ALL)
    private List<Grade> grades;

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public void setGrades(List<Grade> grades) {
        this.grades = grades;
    }
}
