package org.example.spring_study.service;


import org.example.spring_study.domain.Person;

public interface PersonService {
    public Person addPerson(Person person);

    public Person readPerson(int idx);

    public Person updatePerson(Person person);

    public void deletePerson(int idx);


}
