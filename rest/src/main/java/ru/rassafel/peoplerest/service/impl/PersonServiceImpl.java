package ru.rassafel.peoplerest.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import ru.rassafel.peoplerest.model.persistence.Person;
import ru.rassafel.peoplerest.repository.PersonRepository;
import ru.rassafel.peoplerest.service.PersonService;

/**
 * @author rassafel
 */
@Service
@RequiredArgsConstructor
public class PersonServiceImpl implements PersonService {
    private final PersonRepository repository;

    @Override
    public List<Person> getPersons() {
        return repository.findAll();
    }

    @Override
    public Person findPersonById(Long id) {
        return repository.getById(id);
    }

    @Override
    public List<Person> findPersonsByLastName(String lastName) {
        return repository.findByLastNameIsStartingWithIgnoreCase(lastName);
    }

    @Override
    public Person createPerson(Person person) {
        return repository.save(person);
    }

    @Override
    public Person updatePerson(Long id, Person person) {
        person.setId(id);
        return repository.save(person);
    }

    @Override
    public Person removePersonById(Long id) {
        Person person = findPersonById(id);
        repository.deleteById(id);
        return person;
    }

}
