package com.filmflix.films.factory;

import com.filmflix.films.dto.film.RequestFilm;
import com.filmflix.films.dto.film.ResponseFilm;
import com.filmflix.films.model.Films;
import org.springframework.beans.BeanUtils;

import java.util.List;
import java.util.stream.Collectors;

public class FilmFactory {
    public static Films requestDtoToFilmObject(RequestFilm filmDto){
        Films film = new Films();
        BeanUtils.copyProperties(filmDto, film);

        return film;
    }

    public static ResponseFilm FilmToDtoResponse(Films filmDto){
        return new ResponseFilm(filmDto.getId(), filmDto.getTitle(), filmDto.getDescription(), filmDto.getTime());
    }

    public static List<ResponseFilm> filmsListToResponseDtoList(List<Films> filmsList){
        return filmsList.stream()
                .map(films -> new ResponseFilm(films.getId(), films.getTitle(), films.getDescription(), films.getTime()))
                .collect(Collectors.toList());
    }
}
