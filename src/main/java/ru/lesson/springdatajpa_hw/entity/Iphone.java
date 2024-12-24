package ru.lesson.springdatajpa_hw.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "iphones")
public class Iphone {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String brand;
    private String model;


    public Iphone(String brand,String model) {
        this.brand = brand;
        this.model = model;

    }
    public Iphone() {}


    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }


    @Override
    public String toString() {
        return "Iphone{" +
                "model='" + model + '\'' +
                ", brand='" + brand + '\'' +
                ", id=" + id +
                '}';
    }
}
