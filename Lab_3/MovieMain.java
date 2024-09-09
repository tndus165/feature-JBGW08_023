package com.nhnacademy.Lab_3;

import java.util.List;

public class MovieMain {
    public static void main(String[] args) {
        MovieParser movieParser = new BasicMovieParser();

        try {
            List<Movie> movieList = movieParser.parse();
            for(Movie movie : movieList) {
                System.out.println(movie);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
