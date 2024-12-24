package ru.lesson.springdatajpa_hw.entity;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "students")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(unique = true)
    private String name;

    @OneToMany(cascade = {CascadeType.PERSIST, CascadeType.REMOVE})
    @JoinTable(
            name = "student_cars",
            joinColumns = @JoinColumn(name = "student_id"),
            inverseJoinColumns = @JoinColumn(name = "car_id"))
    private List<Car> cars = new ArrayList<>();

    @OneToOne(cascade = {CascadeType.PERSIST, CascadeType.REMOVE})
    private CreditBook creditBook;

    private LocalDate birthDate;


    @OneToMany(cascade = {CascadeType.PERSIST, CascadeType.REMOVE})
    @JoinColumn(name = "student_id")
    private List<Iphone> iphone = new ArrayList<>();

    @ManyToMany(mappedBy = "students")
    private List<Teacher> teachers = new ArrayList<>();



    public List<Iphone> getIphone() {
        return iphone;
    }


    public Student() {
    }




    public Student(String name, LocalDate birthDate, CreditBook creditBook) {

        this.name = name;
        this.birthDate = birthDate;
        this.creditBook = creditBook;
    }

    public Student(String name, List<Car> cars) {
        this.name = name;
        this.cars = cars;
    }

    public Student(String name) {
        this.name = name;
    }

    public Student(String name, LocalDate birthDate) {
        this.name = name;
        this.birthDate = birthDate;

    }

    public CreditBook getCreditBook() {
        return creditBook;
    }

    public List<Car> getCars() {
        return cars;
    }

    public void setCars(List<Car> cars) {
        this.cars = cars;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
