package com.drc.packa.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import com.drc.packa.entity.Rating;


@RestController
public class RatingController {
	
	@GetMapping("/ratingsData/{movieId}")
	public Rating getRating(@PathVariable int movieId) {

		return new Rating(movieId,3);
	}

}
