package com.capgemini.moviecatalogservice.model;

public class CatalogItem {
private Movie movie;
private int rating;
public CatalogItem(Movie movie, int rating) {
	super();
	this.movie = movie;
	this.rating = rating;
}
public CatalogItem() {
	super();
}
public Movie getMovie() {
	return movie;
}
public void setMovie(Movie movie) {
	this.movie = movie;
}
public int getRating() {
	return rating;
}
public void setRating(int rating) {
	this.rating = rating;
}
@Override
public String toString() {
	return "CatalogItem [movie=" + movie + ", rating=" + rating + "]";
}

}
