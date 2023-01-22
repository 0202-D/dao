package ru.netology.dao.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Entity
@Table(name = "customers", schema = "netology")
@Data
@RequiredArgsConstructor
public class Customer {

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

}
