package org.example.spring_study.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;
import java.util.List;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "writing")
public class WritingEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int writingIdx;

    private String title;

    private String content;

    private String writer;

    private String fileName;

    private Date writeTime;

    @OneToMany
    @JoinColumn(name = "writing_idx")
    private List<ReplyEntity> replies;
}