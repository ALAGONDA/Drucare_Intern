package com.drc.pack.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.drc.pack.entity.Movie;

@RestController
public class MovieInfoController {

	@GetMapping("/movie/{movieId}")
	public Movie getMovieInfo(@PathVariable int movieId) {

		return new Movie(movieId, "Bahubali");
	}

}
