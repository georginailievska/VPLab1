package mk.ukim.finki.wp.lab.repository;

import mk.ukim.finki.wp.lab.model.Artist;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class ArtistRepository {
    private final List<Artist> artists;

    public ArtistRepository() {
        this.artists = new ArrayList<>();
        artists.add(new Artist(1L, "Axl", "Rose", "Guns N' Roses frontman"));
        artists.add(new Artist(2L, "Jon", "Bon Jovi", "Bon Jovi lead singer"));
        artists.add(new Artist(3L, "David", "Bowie", "Legendary musician"));
    }

    public List<Artist> findAll() {
        return artists;
    }

    public Optional<Artist> findById(Long id) {
        return artists.stream().filter(a -> a.getId().equals(id)).findFirst();
    }
}
