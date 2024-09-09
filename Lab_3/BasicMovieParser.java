package com.nhnacademy.Lab_3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class BasicMovieParser implements MovieParser {

    @Override
    public List<Movie> parse() throws IOException {
        InputStream movieFileAsStream = getMovieFileAsStream();
        InputStreamReader inputStreamReader = new InputStreamReader(movieFileAsStream);
        BufferedReader br = new BufferedReader(inputStreamReader);
        List<Movie> movieList = new ArrayList<>();
        String line = br.readLine();

        while ((line = br.readLine()) != null) {
            String[] token = line.split(",");
            if (token.length != 3) {
                continue;
            }
            String[] genres = token[2].split("\\|");
            Set<String> genreSet = new HashSet<>(Arrays.asList(genres));

            Movie movie = new Movie(Long.parseLong(token[0]), token[1], genreSet);
            movieList.add(movie);
        }

        return movieList;
    }

}