package ru.rassafel.peoplerest.model.mapper;

import ma.glasnost.orika.MapperFactory;
import ma.glasnost.orika.impl.ConfigurableMapper;
import org.springframework.stereotype.Component;
import ru.rassafel.peoplerest.model.dto.PersonDto;
import ru.rassafel.peoplerest.model.persistence.Person;

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
