package ru.netology.dao.service;

import org.springframework.stereotype.Service;
import ru.netology.dao.model.Person;
import ru.netology.dao.repository.PersonRepository;

import java.util.List;
import java.util.Optional;

@Service
public class PersonService {
    private final PersonRepository repository;


    public PersonService(PersonRepository repository) {
        this.repository = repository;
    }

    public List<Person> findAll() {
        return repository.findAll();
    }

    public Person findById(int id) {
        return repository.findById(id).orElseThrow(() -> new RuntimeException("Такого пользователя не существует"));
    }

    public Person save(Person person) {
        return repository.save(person);
    }

    public Person update(Person person, int id) {
        Person personForUpdate = repository.findById(id).orElseThrow(() -> new RuntimeException("Такого пользователя не существует"));
        personForUpdate.setName(person.getName());
        personForUpdate.setAge(person.getAge());
        personForUpdate.setSurName(person.getSurName());
        personForUpdate.setCityOfLiving(person.getCityOfLiving());
        personForUpdate.setPhoneNumber(person.getPhoneNumber());
        return repository.save(personForUpdate);
    }

    public List<Person> findPersonByCity(String city) {
        return repository.findByCityOfLiving(city);
    }

    public void delete(int id) {
        Person person = repository.findById(id).orElseThrow(() -> new RuntimeException("Такого пользователя не существует"));
        repository.delete(person);
    }

    public List<Person> findByAgeIsLessThanOrderByAsc(int age) {
        return repository.findByAgeIsLessThanOrderByAgeAsc(age);
    }

    public List <Optional<Person> >findByNameAndSurName(String name, String surname) {
      return  repository.findByNameAndSurName(name,surname);
    }
}
