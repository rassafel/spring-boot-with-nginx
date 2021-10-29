package ru.rassafel.personrest.service;

import java.util.List;

import ru.rassafel.personrest.model.persistence.Person;

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
