package kr.hs.dgsw.simple.controller;

import kr.hs.dgsw.simple.domain.Person;
import kr.hs.dgsw.simple.service.PersonService;
import org.slf4j.LoggerFactory;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;

@RestController
public class PersonController {

    private final PersonService personService;

    public PersonController(PersonService personService) {
        this.personService = personService;
    }


    /*
    @PostMapping(value = "/person")
    public Person addPerson(@RequestParam(value = "name") String name,
                          @RequestParam(value = "email") String email) {

        LoggerFactory.getLogger(getClass()).info("/person POST 호출됨  {} {}  ", name, email);

        Person person = new Person();
        person.setEmail(email);
        person.setName(name);

        return person;
    }
     */


    @PostMapping(value = "/person")
    public Person addPerson(@ModelAttribute Person person) {

        LoggerFactory.getLogger(getClass()).info("/person POST 호출됨  {} {}  ",
                person.getName(), person.getEmail());

        return person;
    }

    @PostMapping(value = "/person-body")
    public Person addPersonBody(@RequestBody Person person) {

        LoggerFactory.getLogger(getClass()).info("/person POST 호출됨  {} {}  ",
                person.getName(), person.getEmail());

        return personService.addPerson(person);
    }

    @GetMapping(value = "/person/{idx}")
    public Person readPerson(@PathVariable(value = "idx") int idx) {
        LoggerFactory.getLogger(getClass()).info("/person GET 호출됨  {}  ",
                idx);

        return personService.readPerson(idx);
    }

    @PutMapping(value = "/person/{idx}")
    public Person updatePerson(@PathVariable(value = "idx") int idx,
                               @RequestBody Person person) {

        person.setIdx(idx);
        personService.updatePerson(person);

        return null;
    }


}
