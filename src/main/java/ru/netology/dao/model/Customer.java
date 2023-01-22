package ru.netology.dao.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.util.List;

@Entity
@Table(name = "customers", schema = "netology")
@Data
@RequiredArgsConstructor
public class Customer {
    @OneToMany(mappedBy = "")

    private List<Order>orderList;
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

    @OneToMany(cascade = CascadeType.ALL,mappedBy = "customers")
    private List<Order> orders;
}
