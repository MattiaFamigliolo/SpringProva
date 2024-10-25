package com.new_challenge_network.SpringProva.Controller;

import com.new_challenge_network.SpringProva.model.Movie;
import com.new_challenge_network.SpringProva.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@Controller
@RequestMapping("/api/v1/movies")

public class MovieController {

    @Autowired
    private MovieService movieService;

    @GetMapping
    public String showMovieList(Model model) {
        model.addAttribute("movies", movieService.findAll());
        return "movieList";

    }


    @GetMapping("/new")
    public String showCreateMovie(Model model) {
        System.out.println("sono nel form create");
        model.addAttribute("movie", new Movie());
        return "movieForm";
    }

    @PostMapping
    public String createMovie(@ModelAttribute Movie movie) {
        System.out.println("film id " + movie.getMovieId());
         movieService.save(movie);
        return "redirect:/api/v1/movies";
    }

    @GetMapping("/delete/{movieId}")
    public String deleteMovie(@PathVariable("movieId") Long movieId) {
        System.out.println("Hai cancellato il film "+ movieId);
        movieService.deleteById(movieId);
        return "redirect:/api/v1/movies";
    }

    @GetMapping("/edit/{movieId}")
    public String editMovie(@PathVariable("movieId") Long movieId, Model model) {
        System.out.println("Hai modificato l film con id " + movieId);
        Movie movie = movieService.findById(movieId);
        if(movie!= null){
            model.addAttribute("movie",movie);
            return "movieForm";
        }else{
            return "redirect:/api/v1/movies";
        }

    }
    /*@PostMapping ("/edit/{movieId}")
    public String updateMovie(@ModelAttribute Movie movie){
        movieService.save(movie);
        return "redirect:/api/v1/movies";
    }*/


        


















        /*@GetMapping("/prova")
        public String showList (Model model){

            Movie obj1 = new Movie("Le ali della liberta", "frank darabont", "drammatico", "1994", "url");
            Movie obj2 = new Movie("quo vado", "gennaro nunziante", "commedia", "2016", "url");
            Movie obj3 = new Movie("top gun", "tony scott", "azione", "1986", "url");

            ArrayList<Movie> movies = new ArrayList<>();
            movies.add(obj1);
            movies.add(obj2);
            movies.add(obj3);
            model.addAttribute("movies", movies);


            return "movieList";
        }*/

}
