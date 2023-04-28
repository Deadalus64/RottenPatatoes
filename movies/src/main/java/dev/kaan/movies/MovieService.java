package dev.kaan.movies;


import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MovieService {
    @Autowired //we want the framework to instantiate for us
    private MovieRepository movieRepository;

    public List<Movie> allMovies(){
        return movieRepository.findAll();
    }

    public Optional<Movie> singleMovie(String imdbId){ // we use optional because the searched id might not exist
        return movieRepository.findMovieByImdbId(imdbId);

    }

}
