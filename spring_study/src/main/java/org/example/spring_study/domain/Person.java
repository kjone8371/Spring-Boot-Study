package org.example.spring_study.domain;


import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


@ToString
@Setter
@Getter
public class Person {

    private int idx;

    private String name;

    private String email;

    private int age;

    private  String filePath;

}
