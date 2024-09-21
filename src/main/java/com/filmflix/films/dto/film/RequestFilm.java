package com.filmflix.films.dto.film;

import java.time.LocalTime;
public record RequestFilm(String title, String description, LocalTime time) {
}
