package Collections1;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.TreeMap;

public class ScoreCard {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		TreeMap<String,Integer> players=new TreeMap<String,Integer>();
		System.out.println("Enter Runs Scored");
		boolean b=true;
		while(b)
		{
			
			String name=sc.next();
			
			if(name.equals("0"))
			{
				
				b=false;
			}
			else {
				int runs=sc.nextInt();
				players.put(name,runs);
			}
		}
		
		System.out.println("Players who batted :");
		for (String key: players.keySet()) {
		    System.out.println(key );//+ "=" + players.get(key));
		}
		System.out.println("Scores by Players");
		
		for (String key: players.keySet()) {
		    System.out.println(key + ":" + players.get(key));
		}
		
		System.out.print("Name of Highest Scorer ");
		Entry<String, Integer> sum=players.firstEntry();
		int score=0;
		String name="";
		for (String key: players.keySet()) {
		    if(score< players.get(key))
		    		{
		    	  score=players.get(key);
		    	  name=key;
		    		}
		}
		System.out.println(name);
       System.out.print("Total Score : ");
		int sum1=0;
       for (String key: players.keySet()) {
		    sum1=sum1 + players.get(key);
		}
       System.out.println(sum1);
       System.out.println("Runs Scored by "+" " +players.firstEntry());
	}
}