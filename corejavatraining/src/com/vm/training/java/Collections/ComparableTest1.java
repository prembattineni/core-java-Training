package com.vm.training.java.Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Movie1 implements Comparable<Movie1> {

	private double rating;
	private String name;
	private int year;
	
	
	public int compareTo(Movie1 m)
	{
		return this.year - m.year;
	}
	
	
	public Movie1(String nm,double rt,int yr)
	{
		this.name=nm;
		this.rating=rt;
		this.year=yr;
	}
	
	public double getRating() {return rating;}
	public String getName() {return name;}
	public int getYear() {return year;}
	
}


//Driver Class
class RatingCompare implements Comparator<Movie1>{
	public int compare(Movie1 m1, Movie1 m2)
	{
		if(m1.getRating() < m2.getRating()) return -1;
		if(m1.getRating() > m2.getRating()) return 1;
		else return 0;
	}
}


class NameCompare implements Comparator<Movie1>
{

	@Override
	public int compare(Movie1 m1, Movie1 m2) {
		// TODO Auto-generated method stub
		return m1.getName().compareTo(m2.getName());
	}
	
}
public class ComparableTest1 {

	public static void main(String[] args) {
		ArrayList<Movie1> list= new ArrayList<Movie1>();
		list.add(new Movie1("Force Awakens",8.3,2015));
		list.add(new Movie1("Star wars",8.7,1977));
		list.add(new Movie1("Empire Strikes Back",8.8,1980));
		list.add(new Movie1("Return of the jedi",8.4,1983));
		
		System.out.println("sorted by rating");
		RatingCompare ratingCompare = new RatingCompare();
		Collections.sort(list,ratingCompare);
		for(Movie1 movie: list )
		{
			System.out.println(movie.getName() + " "+ movie.getRating() + " " + movie.getYear() );
		}
		
		System.out.println("\nSorted by name");
		NameCompare nameCompare = new NameCompare();
		Collections.sort(list,nameCompare);
		for(Movie1 movie: list) {
			System.out.println(movie.getYear() + " "+ movie.getRating() + " " + movie.getName() );
		}
}
}
