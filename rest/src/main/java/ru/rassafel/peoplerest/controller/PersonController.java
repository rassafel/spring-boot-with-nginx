package ru.rassafel.peoplerest.controller;

import org.springframework.web.bind.annotation.*;
import ru.rassafel.peoplerest.model.dto.PersonDto;

import java.util.List;

/**
 * @author rassafel
 */
@RequestMapping(PersonController.MAPPING)
public interface PersonController {
    String MAPPING = "api/persons";

    @GetMapping
    List<PersonDto> getPersons();

    @GetMapping("/{id}")
    PersonDto findPersonById(Long id);

    @GetMapping("/search")
    List<PersonDto> findPersonsByLastName(String lastName);

    @PostMapping
    PersonDto createPerson(PersonDto person);

    @PutMapping("/{id}")
    PersonDto updatePerson(Long id, PersonDto person);

    @DeleteMapping("/{id}")
    PersonDto removePersonById(Long id);
}
