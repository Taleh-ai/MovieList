package com.example.movielist.controller;

import com.example.movielist.entity.MovieEntity;
import com.example.movielist.service.MovieService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MovieController {
    private final MovieService movieService;

    public MovieController(MovieService movieService) {
        this.movieService = movieService;
    }

    @GetMapping("/mymovies")
    public List<MovieEntity> getAll(){
        return    movieService.getMovies();
    }
    @GetMapping("/getById{id}")
    public MovieEntity getBy(@PathVariable("id") Long id) throws Exception {
        return   movieService.getMovie(id);
    }
    @PostMapping("/add")
    public MovieEntity add(@RequestBody MovieEntity todoListEntity){
        return   movieService.addMovie(todoListEntity);
    }

    @PatchMapping("updateStatus{id}")
    public void updateStatus(@PathVariable("id")Long id,@RequestBody Boolean taskstatus) throws Exception {
        movieService.updateStatus(id,taskstatus);
    }
    @DeleteMapping("/delete{id}")
    public void delete(@PathVariable Long id) throws Exception {
        movieService.deleteMovie(id);
    }
}
