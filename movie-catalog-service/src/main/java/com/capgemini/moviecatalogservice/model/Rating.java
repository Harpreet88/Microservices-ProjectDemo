package com.capgemini.moviecatalogservice.model;

public class Rating {
 private int rating;
 private int movieId;
public int getRating() {
	return rating;
}
public void setRating(int rating) {
	this.rating = rating;
}
public int getMovieId() {
	return movieId;
}
public void setMovieId(int movieId) {
	this.movieId = movieId;
}
public Rating(int rating, int movieId) {
	super();
	this.rating = rating;
	this.movieId = movieId;
}
public Rating() {
	super();
}
@Override
public String toString() {
	return "Rating [rating=" + rating + ", movieId=" + movieId + "]";
}
 
}
