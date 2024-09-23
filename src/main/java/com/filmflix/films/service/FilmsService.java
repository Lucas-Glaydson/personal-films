package com.filmflix.films.service;

import com.filmflix.films.dto.film.RequestFilm;
import com.filmflix.films.dto.film.ResponseFilm;
import com.filmflix.films.factory.FilmFactory;
import com.filmflix.films.repository.FilmsRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FilmsService {
    private final FilmsRepository filmsRepository;

    public FilmsService(FilmsRepository filmsRepository) {
        this.filmsRepository = filmsRepository;
    }

    public ResponseFilm createFilm(RequestFilm requestFilm){
        return FilmFactory.FilmToDtoResponse(filmsRepository.save(FilmFactory.requestDtoToFilmObject(requestFilm)));
    }

    public List<ResponseFilm> getAllFilms(){
        return FilmFactory.filmsListToResponseDtoList(filmsRepository.findAll());
    }
}
