package school;

import school.model.Grade;
import school.model.Person;
import school.model.Student;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SchoolApplication {
    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("com.sda.school_project");
        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();

        Person p = new Person();
        p.setFirstName("Jan");
        p.setLastName("Kowalski");

        Student s = new Student();
        s.setPerson(p);
/*        List<Grade> grades = new ArrayList<Grade>();
        grades.add(new Grade(5,s));
        grades.add(new Grade(3,s));*/

        s.setGrades(Arrays.asList(new Grade(5,s), new Grade(3,s)));


//        em.persist(s);
        em.getTransaction().commit();


        List<Student> people = em.createQuery("SELECT s FROM Student s WHERE s.person.firstName = :parametr")
                .setParameter("parametr", "Jan")
                .getResultList();

        System.out.println(people);




    }
}
