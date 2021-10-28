package ru.rassafel.peoplerest.service;

import ru.rassafel.peoplerest.model.persistence.Person;

import java.util.List;

/**
 * @author rassafel
 */
public interface PersonService {
    List<Person> getPersons();

    Person findPersonById(Long id);

    List<Person> findPersonsByLastName(String lastName);

    Person createPerson(Person person);

    Person updatePerson(Long id, Person person);

    Person removePersonById(Long id);
}
