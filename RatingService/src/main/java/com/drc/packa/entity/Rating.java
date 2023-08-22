package com.drc.packa.entity;


public class Rating {
	private int movieid; 
	private int rating;
	
	
	public Rating() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Rating(int movieid, int rating) {
		super();
		this.movieid = movieid;
		this.rating = rating;
	}
	public int getMovieid() {
		return movieid;
	}
	public void setMovieid(int movieid) {
		this.movieid = movieid;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}

	@Override
	public String toString() {
		return "Rating [movieid=" + movieid + ", rating=" + rating + "]";
	}
	
	
	
	
	
	
}