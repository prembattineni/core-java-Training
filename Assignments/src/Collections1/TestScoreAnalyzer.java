package Collections1;

import java.util.LinkedList;
import java.util.Scanner;

public class TestScoreAnalyzer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  Scanner sc=new Scanner(System.in);
		LinkedList<Integer> li=new LinkedList<Integer>();
		ScoreAnalyzer scoreanalyzer=new ScoreAnalyzer(li);
	   
		boolean b=true;
		System.out.println("enter runs : ");
		while(b)
		{
			
			int runs=sc.nextInt();
			scoreanalyzer.addRunsToList(runs);
			if(runs==0)
			{
				li.remove(Integer.valueOf(runs));
				b=false;
			}
		}
		System.out.print("Runs Scored : ");
		for(int i=0;i<li.size();i++)
		{
			System.out.print((i+1)+"-"+li.get(i)+" ");
		}
		
		
		
		double runrate=scoreanalyzer.calcRunRate();
		System.out.println();
		System.out.println("Runrate : "+runrate);
		System.out.println("Lowest Runs : "+scoreanalyzer.lowestRunsScored());
		System.out.println("Count of player who batted: "+li.size());
	}

}
