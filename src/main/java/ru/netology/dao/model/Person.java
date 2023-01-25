package ru.netology.dao.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name="persons",schema = "netology")
@Data
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int id;

    @Column(name="name")
    private String name;

    @Column(name="surname")
    private String surName;

    @Column(name="age")
    private int age;

    @Column(name="phone_number")
    private String phoneNumber;

    @Column(name="city_of_living")
    private String cityOfLiving;

}
