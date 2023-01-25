package ru.netology.dao.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import ru.netology.dao.model.Person;

import java.util.List;
import java.util.Optional;

@Repository
public interface PersonRepository extends JpaRepository<Person,Integer> {
   @Query("select p from Person p where p.cityOfLiving = :city")
   List<Person>findByCity(@Param("city")String city);

   @Query("select p from Person p where p.age< :age order by p.age asc")
   List<Person>findByAgeIsLess(@Param("age")int age);

   @Query("select p from Person p where p.name= :name and p.surName= :surname")
   List<Optional<Person>>findByNameAndSurName(@Param("name")String name,@Param("surname") String surname);
}
