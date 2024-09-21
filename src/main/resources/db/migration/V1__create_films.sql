CREATE TABLE IF NOT EXISTS films (
    id VARCHAR(32) NOT NULL,
    title VARCHAR(50) NOT NULL,
    description TEXT NOT NULL,
    time TIME NOT NULL,
    CONSTRAINT film_pkey PRIMARY KEY (id)
);
