package com.new_challenge_network.SpringProva.service;

import com.new_challenge_network.SpringProva.model.Movie;
import com.new_challenge_network.SpringProva.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;


@Service
public class MovieService {

    @Autowired
    private MovieRepository movieRepository;

    public List<Movie> findAll(){

        return movieRepository.findAll();
    }

    public Movie  findById(Long id){
        return movieRepository.findById(id).orElse(null);
    }

    public Movie save(Movie movie){
        return movieRepository.save(movie);
    }

    public void deleteById(Long id){
         movieRepository.deleteById(id);
    }


}

