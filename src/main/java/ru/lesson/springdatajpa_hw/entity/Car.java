package ru.lesson.springdatajpa_hw.entity;

import jakarta.persistence.*;

@Entity
@Table(name="cars")
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String model;
    private String stateNumber;

    @ManyToOne
    private Student student;




    public Car(String model, String stateNumber) {
        this.model = model;
        stateNumber = stateNumber;
    }

    public Car() {
    }


    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getstateNumber() {
        return stateNumber;
    }

    public void setstateNumber(String stateNumber) {
        stateNumber = stateNumber;
    }



    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", model='" + model + '\'' +
                ", StateNumber='" + stateNumber + '\'' +
                '}';
    }
}
