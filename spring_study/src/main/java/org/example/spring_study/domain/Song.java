package org.example.spring_study.domain;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Song {
    private int songIdx;
    private String title;
    private String singer;
    private int year;
}

/**
 * CREATE TABLE song (
 * song_idx     int             NOT NULL    AUTO_INCREMENT,
 * title        VARACHR(100)    NOT NULL,
 * singer       VARACHAR(100),
 * year         smaillint,
 * PRIMARY KEY (song_idx)
 */
