package com.new_challenge_network.SpringProva.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Movie {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long movieId;


    private String title;
    private String director;
    private String genere;
    private String movieYear;
    private String imgUrl;

    public Movie() {
    }

    public Movie(String title, String director, String genere, String movieYear, String imgUrl) {
        this.title = title;
        this.director = director;
        this.genere = genere;
        this.movieYear = movieYear;
        this.imgUrl = imgUrl;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getGenere() {
        return genere;
    }

    public void setGenere(String genere) {
        this.genere = genere;
    }

    public String getMovieYear() {
        return movieYear;
    }

    public void setMovieYear(String year) {
        this.movieYear = year;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public Long getMovieId() {
        return movieId;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "title='" + title + '\'' +
                ", director='" + director + '\'' +
                ", genere='" + genere + '\'' +
                ", year='" + movieYear + '\'' +
                ", imgUrl='" + imgUrl + '\'' +
                '}';
    }
}

