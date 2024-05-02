package org.example.spring_study.service.impl;

import lombok.RequiredArgsConstructor;
import org.example.spring_study.domain.Reply;
import org.example.spring_study.domain.Writing;
import org.example.spring_study.entity.ReplyEntity;
import org.example.spring_study.entity.WritingEntity;
import org.example.spring_study.repository.ReplyRepository;
import org.example.spring_study.repository.WritingRepository;
import org.example.spring_study.service.WritingService;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

@Service
@RequiredArgsConstructor
public class WritingServiceImpl implements WritingService {

    private final WritingRepository writingRepository;
    private final ReplyRepository replyRepository;

    @Override
    public Page<Writing> list(int pageNumber, int count) {
        Sort sort = Sort.by(Sort.Direction.DESC, "writingIdx");
        Pageable pageable = PageRequest.of(pageNumber, 7, sort);

        Page<WritingEntity> page = writingRepository.findAll(pageable);

        return page.map(Writing::toDomain);
    }

    @Override
    public Reply addReply(Reply reply) {
        ReplyEntity entity = Reply.toEntity(reply);

        replyRepository.save(entity);
        reply.setReplyIdx(entity.getReplyIdx()); // 방법1

//        ReplyEntity saved =
//                replyRepository.findById(entity.getReplyIdx()).orElseThrow(()-> new RuntimeException("not found"));
//        return Reply.toDomain(saved); // 방법2
        return reply;
    }

    @Override
    public boolean delete(int writingIdx) {
        if (writingRepository.existsById(writingIdx)) {
            writingRepository.deleteById(writingIdx);
            return true;  // Return true if successfully deleted
        }
        return false;  // Return false if no entity found with the given ID
    }


}
