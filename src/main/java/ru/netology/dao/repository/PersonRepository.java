package ru.netology.dao.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.netology.dao.model.Person;

import java.util.List;
import java.util.Optional;

@Repository
public interface PersonRepository extends JpaRepository<Person,Integer> {
   List<Person>findByCityOfLiving(String city);
   List<Person>findByAgeIsLessThanOrderByAgeAsc(int age);
   List<Optional<Person>>findByNameAndSurName(String name, String surname);
}
