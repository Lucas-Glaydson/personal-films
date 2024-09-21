CREATE TABLE IF NOT EXISTS actor (
    id VARCHAR(32) NOT NULL,
    film_id VARCHAR(32) NOT NULL,
    first_name VARCHAR(40) NOT NULL,
    last_name VARCHAR(40) NOT NULL,
    birthday DATE NOT NULL,
    CONSTRAINT actor_pkey PRIMARY KEY (id),
    FOREIGN KEY (film_id) REFERENCES films(id) ON DELETE CASCADE
);