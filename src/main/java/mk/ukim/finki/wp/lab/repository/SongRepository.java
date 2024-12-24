package mk.ukim.finki.wp.lab.repository;

import mk.ukim.finki.wp.lab.model.Artist;
import mk.ukim.finki.wp.lab.model.Song;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class SongRepository {
    private final List<Song> songs;

    public SongRepository() {
        this.songs = new ArrayList<>();
        songs.add(new Song("1", "Song 1", "Rock", 1991, new ArrayList<>()));
        songs.add(new Song("2", "Song 2", "Pop", 1995, new ArrayList<>()));
        songs.add(new Song("3", "Song 3", "Jazz", 2000, new ArrayList<>()));
    }

    public List<Song> findAll() {
        return songs;
    }

    public Song findByTrackId(String trackId) {
        return songs.stream().filter(s -> s.getTrackId().equals(trackId)).findFirst().orElse(null);
    }

    public Artist addArtistToSong(Artist artist, Song song) {
        song.getPerformers().add(artist);
        return artist;
    }
}
