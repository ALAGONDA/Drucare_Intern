package com.drc.pac.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.drc.pac.entity.CatlogItem;
import com.drc.pac.entity.Movie;
import com.drc.pac.entity.Rating;

@RestController
public class MovieCatlogController {
	
	@Autowired
	RestTemplate restTemplate; 

	@GetMapping("/catalogue/{userId}")
	public List<CatlogItem> getCatalogue(@PathVariable String userId) {
		List<Rating> ratings = Arrays.asList(new Rating(23, 3), new Rating(26, 4));
		//List<CatlogItem> catalogueList = new ArrayList<>();

//		catalogueList.add(new CatlogItem("Bro", "Family entertainer", 3));
//
//		catalogueList.add(new CatlogItem("Bahubali the conclusion", "Action entertainer", 3));
		
		//1 -> get all rated movie id's
//		List<Rating> ratings = Arrays.asList(new Rating("222",4),
//				new Rating("41",5));
		//Rating ur = restTemplate.getForObject("http://rating-service/users/"+userId, Rating.class);
		
		//Movie movie = restTemplate.getForObject("https://localhost:8081/movie/10",Movie.class);
		//return catalogueList;
		return ratings.stream()
		.map(rating->{
			Movie movie = restTemplate.getForObject("http://movie-info-service/movie/"+rating.getMovieid(),Movie.class);
			return new CatlogItem(movie.getMovieName(),"saving",rating.getRating());})
		.collect(Collectors.toList());
	}
}
