package com.capgemini.movieservice.model;

public class Movie {
	private int movieId;
	private String movieTitle;
	public Movie() {
		super();
	}
	public int getMovieId() {
		return movieId;
	}
	public Movie(int movieId, String movieTitle) {
		super();
		this.movieId = movieId;
		this.movieTitle = movieTitle;
	}
	public void setMovieId(int movieId) {
		this.movieId = movieId;
	}
	public String getMovieTitle() {
		return movieTitle;
	}
	public void setMovieTitle(String movieTitle) {
		this.movieTitle = movieTitle;
	}
	@Override
	public String toString() {
		return "Movie [movieId=" + movieId + ", movieTitle=" + movieTitle + "]";
	}
	

}
