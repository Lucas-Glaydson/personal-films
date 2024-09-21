package com.filmflix.films.controller;

import com.filmflix.films.dto.film.RequestFilm;
import com.filmflix.films.dto.film.ResponseFilm;
import com.filmflix.films.service.FilmsService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/films")
public class FilmController {
    private final FilmsService filmsService;

    public FilmController(FilmsService filmsService) {
        this.filmsService = filmsService;
    }


    @PostMapping
    public ResponseEntity<ResponseFilm> createFilm(@RequestBody RequestFilm requestFilm){
        return ResponseEntity.status(HttpStatus.CREATED).body(filmsService.createFilm(requestFilm));
    }
}
