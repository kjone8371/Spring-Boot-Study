package org.example.spring_study.repository;

import org.example.spring_study.entity.SongEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface SongRepository extends JpaRepository<SongEntity, Integer> {

    public Optional<SongEntity> findByTitle(String title);



 }
