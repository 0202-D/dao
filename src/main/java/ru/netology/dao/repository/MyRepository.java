package ru.netology.dao.repository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class MyRepository {
    @PersistenceContext
    private EntityManager entityManager;

    public List<String> getProductName(String name) {
        return entityManager.createQuery("SELECT O.productName FROM Order O JOIN Customer C ON C.Id= O.customerId where C.name= :name")
                .setParameter("name", name).getResultList();

    }
}
