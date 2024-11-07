package com.test.hib.entity;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Movie {

	@Id
	private int mcode;
	private String movieName;
	private String language;
	public Movie() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Movie(int mcode, String movieName, String language) {
		super();
		this.mcode = mcode;
		this.movieName = movieName;
		this.language = language;
	}
	public int getMcode() {
		return mcode;
	}
	public void setMcode(int mcode) {
		this.mcode = mcode;
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
	public int hashCode() {
		return Objects.hash(language, mcode, movieName);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Movie other = (Movie) obj;
		return Objects.equals(language, other.language) && mcode == other.mcode
				&& Objects.equals(movieName, other.movieName);
	}
	@Override
	public String toString() {
		return "Movie [mcode=" + mcode + ", movieName=" + movieName + ", language=" + language + "]";
	}
	
	
}
