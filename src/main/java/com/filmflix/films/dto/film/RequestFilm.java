package com.filmflix.films.dto.film;

import java.sql.Time;

public record RequestFilm(String title, String description, Time time) {
}
