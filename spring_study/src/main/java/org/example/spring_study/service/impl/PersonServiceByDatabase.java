package org.example.spring_study.service.impl;

import lombok.RequiredArgsConstructor;
import org.example.spring_study.domain.Person;
import org.example.spring_study.entity.PersonEntity;
import org.example.spring_study.repository.PersonRepository;
import org.example.spring_study.service.PersonService;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.Optional;


@Service
@RequiredArgsConstructor
@Primary //우선순위 //PersonServiceByDatabase부터 해준다.
         // 기존에 있던 personserviceimpl를 하지 않고 PersonServiceByDatabase부터 해준다.
         //그래서 PersonServiceImpl와 같은 빈이여도 Primary를 사용하면 PersonServiceByDatabase를 우선순위로 해준다.

public class PersonServiceByDatabase implements PersonService {

    private final PersonRepository personRepository;

    @Override
    public Person addPerson(Person person) {
        PersonEntity entity = new PersonEntity();
        entity.setName(person.getName());
        entity.setEmail(person.getEmail());
        entity.setAge(person.getAge());
        entity.setFilePath(person.getFilePath());

        personRepository.save(entity);

        return person;
    }

    @Override
    public Person readPerson(int idx) {
        Optional<PersonEntity> optional = personRepository.findById(idx); //Optional은 기능이 실행되었을때 null이 올 수 있는 값을 감싸는 Wrapper클래스로 NullPointException(에러)이 발생하지 않게 해준다.
                                                                          //Optional 클래스는 해당값이 null일 경우 예외처리를 통해 원하는 방식으로 변경하여 출력할 수 있다.
        PersonEntity entity = optional.orElse(null); // 값이 있으면 넣어 주고 없으면 null을 넣으라는 것임 //orElseThrow();는 값이 없으면 예외 처리해주는 것
        if(entity == null) {
            return null;
        }
        Person person = new Person();

        person.setIdx(entity.getIdx());
        person.setName(entity.getName());
        person.setEmail(entity.getEmail());
        person.setAge(entity.getAge());
        person.setFilePath(entity.getFilePath());

        return person;
    }

    @Override
    public Person updatePerson(Person person) {
        return null;
    }
}
