package org.example.spring_study.service;

import org.example.spring_study.domain.Song;

public interface SongService {
    public Song addSong(Song song);
    public Song readSong(int idx);
    public Song updateSong(Song song);
    public void deleteSong(int idx);
}
