package ru.rassafel.peoplerest.controller.impl;

import lombok.RequiredArgsConstructor;
import ma.glasnost.orika.MapperFacade;
import ru.rassafel.peoplerest.controller.PersonController;
import ru.rassafel.peoplerest.model.dto.PersonDto;
import ru.rassafel.peoplerest.model.persistence.Person;
import ru.rassafel.peoplerest.service.PersonService;

import java.util.List;

import org.springframework.web.bind.annotation.RestController;

/**
 * @author rassafel
 */
@RestController
@RequiredArgsConstructor
public class PersonControllerImpl implements PersonController {
    private final PersonService service;

    private final MapperFacade mapper;

    @Override
    public List<PersonDto> getPersons() {
        List<Person> persons = service.getPersons();
        return mapper.mapAsList(persons, PersonDto.class);
    }

    @Override
    public PersonDto findPersonById(Long id) {
        Person person = service.findPersonById(id);
        return mapper.map(person, PersonDto.class);
    }

    @Override
    public List<PersonDto> findPersonsByLastName(String lastName) {
        List<Person> persons = service.findPersonsByLastName(lastName);
        return mapper.mapAsList(persons, PersonDto.class);
    }

    @Override
    public PersonDto createPerson(PersonDto personDto) {
        Person person = mapper.map(personDto, Person.class);
        person = service.createPerson(person);
        return mapper.map(person, PersonDto.class);
    }

    @Override
    public PersonDto updatePerson(Long id, PersonDto personDto) {
        Person person = mapper.map(personDto, Person.class);
        person = service.updatePerson(id, person);
        return mapper.map(person, PersonDto.class);
    }

    @Override
    public PersonDto removePersonById(Long id) {
        Person person = service.removePersonById(id);
        return mapper.map(person, PersonDto.class);
    }
}
