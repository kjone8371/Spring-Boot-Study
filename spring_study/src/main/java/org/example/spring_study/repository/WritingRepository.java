package org.example.spring_study.repository;

import org.example.spring_study.entity.WritingEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WritingRepository extends JpaRepository<WritingEntity, Integer> {
}
