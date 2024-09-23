package com.filmflix.films.controller;

import com.filmflix.films.dto.film.RequestFilm;
import com.filmflix.films.dto.film.ResponseFilm;
import com.filmflix.films.service.FilmsService;
import io.swagger.v3.oas.annotations.Parameter;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/films")
public class FilmController {
    private final FilmsService filmsService;

    public FilmController(FilmsService filmsService) {
        this.filmsService = filmsService;
    }

    @PostMapping
    public ResponseEntity<ResponseFilm> createFilm(@Parameter(description = "Informações do filme") @RequestBody RequestFilm requestFilm){
        return ResponseEntity.status(HttpStatus.CREATED).body(filmsService.createFilm(requestFilm));
    }

    @GetMapping
    public ResponseEntity<List<ResponseFilm>> getFilms(){
        return ResponseEntity.status(HttpStatus.OK).body(filmsService.getAllFilms());
    }
}
