package com.capgemini.movieratingservice.controllers;

import java.util.ArrayList;
import java.util.List;

import org.assertj.core.util.Arrays;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.movieratingservice.model.Rating;
import com.capgemini.movieratingservice.model.UserRating;

@RestController
@RequestMapping("/ratings")
public class MovieRatingController {
	
	
	
	@GetMapping("/{userId}")
	public UserRating getMoviesRatings(@PathVariable String userId) {
		List<Rating> ratings =new ArrayList<Rating>();
		if(userId.equals("harry")) {
			ratings.add(new Rating(101,4));
			ratings.add(new Rating(102,5));
		
		UserRating userRating=new UserRating("harry",ratings);
		return userRating;
		}
		return null;
	}

}
