package ru.lesson.springdatajpa_hw.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "creditBooks")
public class CreditBook {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private int objectsRussian;
    private int objectsmathematicalanalysis;

    @OneToOne(mappedBy = "creditBook")
    private Student student;

    public CreditBook(int objectsRussian, int objectsmathematicalanalysis ) {

        this.objectsRussian = objectsRussian;
        this.objectsmathematicalanalysis = objectsmathematicalanalysis;

    }

    public CreditBook() {}

    public int getObjectsRussian() {
        return objectsRussian;
    }

    public void setObjectsRussian(int objectsRussian) {
        this.objectsRussian = objectsRussian;
    }

    public int getObjectsmathematicalanalysis() {
        return objectsmathematicalanalysis;
    }

    public void setObjectsmathematicalanalysis(int objectsmathematicalanalysis) {
        this.objectsmathematicalanalysis = objectsmathematicalanalysis;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }
}
