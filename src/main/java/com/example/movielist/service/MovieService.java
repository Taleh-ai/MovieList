package com.example.movielist.service;

import com.example.movielist.entity.MovieEntity;
import com.example.movielist.repository.MovieRepository;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class MovieService {
    private final MovieRepository movieRepository;

    public MovieService(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    public MovieEntity addMovie(MovieEntity movieEntity){
      return   movieRepository.save(movieEntity);
    }
    public void deleteMovie(Long id){
      MovieEntity movie= movieRepository.findById(id).orElseThrow(() -> new RuntimeException("Todo item not found"));
        movieRepository.delete(movie);
    }
    public void updateStatus(Long id,Boolean status){
        MovieEntity movie= movieRepository.findById(id).orElseThrow(() -> new RuntimeException("Todo item not found"));
        movie.setWatchStatus(status);
        movieRepository.save(movie);
    }
    public List<MovieEntity> getMovies() {
        return movieRepository.findAll();
    }
    public MovieEntity getMovie(Long id ) throws Exception {
        return movieRepository.findById(id).orElseThrow(Exception::new);
    }
}
