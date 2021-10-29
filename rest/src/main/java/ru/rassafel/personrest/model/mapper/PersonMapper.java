package ru.rassafel.personrest.model.mapper;

import ma.glasnost.orika.MapperFactory;
import ma.glasnost.orika.impl.ConfigurableMapper;
import ru.rassafel.personrest.model.dto.PersonDto;
import ru.rassafel.personrest.model.persistence.Person;

import org.springframework.stereotype.Component;

/**
 * @author rassafel
 */
@Component
public class PersonMapper extends ConfigurableMapper {
    @Override
    protected void configure(MapperFactory factory) {
        factory.classMap(Person.class, PersonDto.class)
                // .field("id", "id")
                // .field("firstName", "firstName")
                // .field("lastName", "lastName")
                // .field("email", "email")
                .byDefault().register();
    }
}
