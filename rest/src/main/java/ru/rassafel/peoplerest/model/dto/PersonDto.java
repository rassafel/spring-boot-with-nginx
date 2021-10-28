package ru.rassafel.peoplerest.model.dto;

import lombok.*;

/**
 * @author rassafel
 */
@Data
@RequiredArgsConstructor
public class PersonDto {
    private Long id;

    private String firstName;

    private String lastName;

    private String email;
}
