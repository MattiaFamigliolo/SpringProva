package com.new_challenge_network.SpringProva.repository;

import com.new_challenge_network.SpringProva.model.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieRepository extends JpaRepository<Movie, Long> {}
