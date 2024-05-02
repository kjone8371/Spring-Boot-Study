package org.example.spring_study.domain;

import lombok.*;
import org.example.spring_study.entity.WritingEntity;

import java.util.List;
import java.util.Date;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Writing {
    private int writingIdx;

    private String title;

    private String content;

    private String writer;

    private String fileName;

    private Date writeTime;

    private List<Reply> replies;


    public static Writing toDomain(WritingEntity entity) {
        Writing writing = Writing.builder()
                .writingIdx(entity.getWritingIdx())
                .title(entity.getTitle())
                .content(entity.getContent())
                .writer(entity.getWriter())
                .fileName(entity.getFileName())
                .writeTime(entity.getWriteTime())
                .build();

        List<Reply> list = entity.getReplies().stream().map(Reply::toDomain).toList();
        writing.setReplies(list);

        return writing;
    }
}
