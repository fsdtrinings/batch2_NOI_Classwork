package com.abc.p1;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "BollywoodMovies")
public class Movie {
	
	@Id // primary key
	@Column(name = "mcode")
	private int mid;
	@Column(name = "FilmName", nullable = false, unique = true)
	private String movieName;
	
	private String language;
	
	
	
	public Movie() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Movie(int mid, String movieName, String language) {
		super();
		this.mid = mid;
		this.movieName = movieName;
		this.language = language;
	}
	public int getMid() {
		return mid;
	}
	public void setMid(int mid) {
		this.mid = mid;
	}
	public String getMovieName() {
		return movieName;
	}
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	@Override
	public String toString() {
		return "Movie [mid=" + mid + ", movieName=" + movieName + ", language=" + language + "]";
	}
	
	

}
