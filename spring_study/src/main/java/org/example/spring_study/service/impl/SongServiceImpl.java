package org.example.spring_study.service.impl;

import lombok.RequiredArgsConstructor;
import org.example.spring_study.repository.SongRepository;
import org.example.spring_study.service.SongService;
import org.springframework.stereotype.Service;


@Service
@RequiredArgsConstructor
public class SongServiceImpl implements SongService {
    private SongRepository songRepository;



}
