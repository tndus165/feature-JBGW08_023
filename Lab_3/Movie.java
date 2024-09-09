package com.nhnacademy.Lab_3;

import java.util.Set;

public class Movie {
    private final long movieId;
    private final String title;
    private final Set<String> genres;

    public Movie(long movieId, String title, Set<String> genres) {
        this.movieId = movieId;
        this.title = title;
        this.genres = genres;
    }

    @Override
    public String toString() {
        return this.movieId + " " + this.title + " " + this.genres;
    }
}