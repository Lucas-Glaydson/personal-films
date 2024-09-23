package com.filmflix.films.dto.film;

import io.swagger.v3.oas.annotations.media.Schema;

import java.time.LocalTime;

public record ResponseFilm(
        String id,

        String title,

        String description,

        @Schema(type = "string", pattern = "HH:mm:ss", example = "06:54:02")
        LocalTime time) {
}
