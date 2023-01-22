package ru.netology.dao.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.time.Instant;

@Entity
@Table(name="orders",schema = "netology")
@Data
@RequiredArgsConstructor
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int id;

    @Column(name="date")
    private Instant date;

    @ManyToOne(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    @JoinColumn (name="customer_id")
    private Customer customerId;

    @Column(name = "product_name")
    private String productName;

    @Column(name = "amount")
    private int amount;


}
