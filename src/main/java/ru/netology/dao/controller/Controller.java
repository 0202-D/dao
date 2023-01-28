package ru.netology.dao.controller;

import org.springframework.web.bind.annotation.*;
import ru.netology.dao.model.Person;
import ru.netology.dao.service.PersonService;

import java.util.List;
import java.util.Optional;

@RestController
public class Controller {

    private final PersonService service;


    public Controller(PersonService service) {
        this.service = service;
    }

    @GetMapping("/")
    public String hello() {
        return "Hello";
    }

    @GetMapping("/persons")
    public List<Person> getAllPerson() {
        return service.findAll();
    }

    @GetMapping("/persons/{id}")
    public Person getById(@PathVariable int id) {
        return service.findById(id);
    }

    @PostMapping("/persons")
    public Person save(@RequestBody Person person) {
        return service.save(person);
    }

    @PutMapping("/persons/{id}")
    public Person update(@RequestBody Person person, @PathVariable int id) {
        return service.update(person, id);

    }

    @DeleteMapping("/persons/{id}")
    public String delete(@PathVariable int id) {
        service.delete(id);
        return "Пользователь " + id + " удален";
    }

    @GetMapping("/persons/city/{city}")
    public List<Person> findPersonByCity(@PathVariable String city) {
        return service.findPersonByCity(city);
    }

    @GetMapping("/persons/age/{age}")
    public List<Person> findByAgeIsLessThanOrderByAsc(@PathVariable int age) {
        return service.findByAgeIsLessThanOrderByAsc(age);
    }

    @GetMapping("/persons/namesurname/{name}/{surname}")
    public List<Optional<Person>> getPersonsByNameAndSurname(@PathVariable String name, @PathVariable String surname) {
        return service.findByNameAndSurName(name, surname);
    }
}

