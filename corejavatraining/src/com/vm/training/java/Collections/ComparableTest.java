package com.vm.training.java.Collections;

import java.util.*;

class Movie implements Comparable<Movie> {

	private double rating;
	private String name;
	private int year;
	
	
	public int compareTo(Movie m)
	{
		return this.year - m.year;
	}
	
	
	public Movie(String nm,double rt,int yr)
	{
		this.name=nm;
		this.rating=rt;
		this.year=yr;
	}
	
	public double getRating() {return rating;}
	public String getName() {return name;}
	public int getYear() {return year;}
	
}
class ComparableTest{
	public static void main(String[] args) {
		ArrayList<Movie> list= new ArrayList<Movie>();
		list.add(new Movie("Force Awakens",8.3,2015));
		list.add(new Movie("Star wars",8.7,1977));
		list.add(new Movie("Empire Strikes Back",8.8,1980));
		list.add(new Movie("Return of the jedi",8.4,1983));
		
		Collections.sort(list);
		
		System.out.println("Movie after sorting : ");
		for(Movie movie : list)
		{
			System.out.println(movie.getName() + " "+ movie.getRating() + " " + movie.getYear() );
			
		}
		
	}
}
