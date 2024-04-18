package org.example.spring_study.entity;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
@Table(name = "song")
public class SongEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //DB가 알아서 부여해주는 값
    private int songIdx;
    private String title;
    private String singer;
    private int year;
}
