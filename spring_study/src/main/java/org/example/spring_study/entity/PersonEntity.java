package org.example.spring_study.entity;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "person")
public class PersonEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //DB가 알아서 부여해주는 값
    private int idx; //INT(11) PK NIN AI

    private String name; //NIN

    private String email; // NIN

    private int age; // SMALLINT(6) NIN

    @Column(name = "file_path") //이름이 다를 때 DB에 있는 이름과 다를 때 지정해 준다.
    private  String filePath; //VARCHAR(100)
}
