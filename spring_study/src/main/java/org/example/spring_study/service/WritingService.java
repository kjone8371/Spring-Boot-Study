package org.example.spring_study.service;

import org.example.spring_study.domain.Reply;
import org.example.spring_study.domain.Writing;
import org.springframework.data.domain.Page;

public interface WritingService {
    public Page<Writing> list(int pageNumber, int count);

    public Reply addReply(Reply reply);

    public boolean delete(int writingIdx);
}
