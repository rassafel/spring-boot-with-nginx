package ru.rassafel.peoplerest.model.persistence;

import lombok.*;

import javax.persistence.*;

/**
 * @author rassafel
 */
@Entity
@Table(name = "person")
@Getter
@Setter
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@ToString()
@RequiredArgsConstructor
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    @EqualsAndHashCode.Include
    private Long id;

    @Column(name = "first_name", length = 63)
    private String firstName;

    @Column(name = "last_name", length = 63)
    private String lastName;

    @Column(name = "email", length = 63)
    private String email;
}
