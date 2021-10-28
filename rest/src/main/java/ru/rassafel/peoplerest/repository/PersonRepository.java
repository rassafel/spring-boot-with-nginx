package ru.rassafel.peoplerest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.rassafel.peoplerest.model.persistence.Person;

import java.util.List;

/**
 * @author rassafel
 */
public interface PersonRepository extends JpaRepository<Person, Long> {
    List<Person> findByLastNameIsStartingWithIgnoreCase(String lastName);
}
