package org.example.spring_study.repository;

import org.example.spring_study.entity.ReplyEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReplyRepository extends JpaRepository<ReplyEntity, Integer> {
}
