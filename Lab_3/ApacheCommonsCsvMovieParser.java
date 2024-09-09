package com.nhnacademy.Lab_3;

import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;

public class ApacheCommonsCsvMovieParser implements MovieParser {

    @Override
    public List<Movie> parse() throws IOException {

        CSVParser parser = CSVParser.parse(new InputStreamReader(this.getMovieFileAsStream()), CSVFormat.EXCEL);
        List<CSVRecord> csvRecordList = parser.getRecords();
        List<Movie> movieList = new ArrayList<>();
        for (int record_i = 1; record_i < csvRecordList.size(); record_i++) {
            CSVRecord csvRecord = csvRecordList.get(record_i);

            long movieId = Long.parseLong(csvRecord.get(0));
            String title = csvRecord.get(1);
            Set<String> genres = Arrays.stream(csvRecord.get(2).split("\\|")).collect(Collectors.toSet());
            movieList.add(new Movie(movieId, title, genres));
        }

        return movieList;
    }

}
