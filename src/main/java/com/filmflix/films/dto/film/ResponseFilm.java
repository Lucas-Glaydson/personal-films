package com.filmflix.films.dto.film;

import java.time.LocalTime;
import java.util.UUID;

public record ResponseFilm(UUID id, String title, String description, LocalTime time) {
}
