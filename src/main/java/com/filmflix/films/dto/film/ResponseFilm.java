package com.filmflix.films.dto.film;

import java.sql.Time;

public record ResponseFilm(String id, String title, String description, Time time) {
}
