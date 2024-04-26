package org.example.spring_study.service.impl;

import lombok.RequiredArgsConstructor;
import org.example.spring_study.domain.Song;
import org.example.spring_study.entity.SongEntity;
import org.example.spring_study.repository.SongRepository;
import org.example.spring_study.service.SongService;
import org.springframework.stereotype.Service;

import java.util.Optional;


@Service
@RequiredArgsConstructor
public class SongServiceImpl implements SongService {
    private SongRepository songRepository;


    @Override
    public Song addSong(Song song) {
        SongEntity entity = new SongEntity();
        entity.setSinger(song.getSinger());
        entity.setYear(song.getYear());
        entity.setTitle(song.getTitle());

        songRepository.save(entity);

        return song;
    }

    @Override
    public Song readSong(int idx) {
        Optional<SongEntity> optional = songRepository.findById(idx);
        SongEntity entity = optional.orElse(null);

        if(entity == null) {
            return null;
        }
        Song song = new Song();

        song.setSongIdx(entity.getSongIdx());
        song.setSinger(entity.getSinger());
        song.setYear(entity.getYear());
        song.setSinger(entity.getSinger());

        return song;
    }

    @Override
    public Song updateSong(Song song) {
        return null;
    }

    @Override
    public void deleteSong(int idx) {
        Optional<SongEntity> optional = songRepository.findById(idx);
        optional.ifPresent(songEntity -> songRepository.delete(songEntity));

    }
}
