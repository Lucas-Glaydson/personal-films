package com.filmflix.films.repository;

import com.filmflix.films.model.Films;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface FilmsRepository extends CrudRepository<Films, UUID> {
}
