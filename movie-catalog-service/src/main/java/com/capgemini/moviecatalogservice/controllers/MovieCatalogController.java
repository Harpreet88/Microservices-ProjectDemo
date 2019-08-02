package com.capgemini.moviecatalogservice.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.capgemini.moviecatalogservice.model.CatalogItem;
import com.capgemini.moviecatalogservice.model.Movie;
import com.capgemini.moviecatalogservice.model.MovieCatalogFinal;
import com.capgemini.moviecatalogservice.model.Rating;
import com.capgemini.moviecatalogservice.model.UserRating;

@RestController
@RequestMapping("/catalog")
public class MovieCatalogController {
	
	@Autowired
	private RestTemplate restTemplate;
	
	@GetMapping
	public MovieCatalogFinal getMovieCatalog(@PathVariable String userId) {
		
		
		//call ratings service and get ratings
		UserRating ratings=restTemplate.getForObject("http://localhost:8066/ratings/" + userId, UserRating.class);
		List<Rating>movieRatings=ratings.getRatings();
		List<CatalogItem>catalogItems=new ArrayList<CatalogItem>();
		//call movie service
		for(Rating movieRating:movieRatings) {
			Movie movie=restTemplate.getForObject("http://localhost:8066/movies/" +movieRating.getMovieId(),Movie.class);
			catalogItems.add(new CatalogItem(movie,movieRating.getRating()));
		}
		
		////return catalog to client
		MovieCatalogFinal movieCatalogFinal=new MovieCatalogFinal(catalogItems);
		return movieCatalogFinal;
	}

}
