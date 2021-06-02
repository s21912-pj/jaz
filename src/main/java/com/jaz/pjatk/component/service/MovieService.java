package com.jaz.pjatk.component.service;

import com.jaz.pjatk.component.repository.MovieRepository;
import com.jaz.pjatk.model.Movie;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MovieService {

    private final MovieRepository movieRepository;
    public MovieService(MovieRepository movieRepository){
       this.movieRepository = movieRepository;
    }

    public List<Movie> findAll(){
        return movieRepository.findAll();
    }

    public Movie findById(Long id) throws RuntimeException{
        Optional<Movie> movieSearch = movieRepository.findById(id);
        if (movieSearch.isPresent()){
            return movieSearch.get();
        }
        else {
            throw new RuntimeException();
        }
    }

    public Movie addMovie (Movie movie) {
        return movieRepository.save(movie);
    }

    public Movie updateMovie (Movie movie, Long id) throws RuntimeException {
        Optional<Movie> movieAdd = movieRepository.findById(id);
        if (movieAdd.isPresent()){
            Movie putMovie = movie;
            putMovie.setId(id);
            return movieRepository.save(putMovie);
        }
        else {
            throw new RuntimeException();
        }
    }

    public void deleteMovie (Long id) {
        movieRepository.deleteById(id);
    }

    public void setAvailabilityOfMovieToTrue(Long id) {
        movieRepository.setAvailabilityOfMovieToTrue(id);
    }
}
