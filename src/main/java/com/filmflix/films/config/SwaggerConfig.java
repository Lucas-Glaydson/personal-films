package com.filmflix.films.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.OpenAPI;

@Configuration
public class SwaggerConfig {

    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("Films")
                        .version("1.0")
                        .description("This api is my personal project to learn more about Spring boot.")
                        .contact(new Contact()
                                .name("Lucas Glaydson")
                                .email("lucas.glaydson01@hotmail.com")));
    }
}

