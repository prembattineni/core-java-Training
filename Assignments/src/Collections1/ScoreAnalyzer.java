package Collections1;

import java.util.Collections;
import java.util.LinkedList;

public class ScoreAnalyzer {

	private LinkedList<Integer> runsData;
	private LinkedList<Integer> temp;
	
	public ScoreAnalyzer(LinkedList runsData) {
		super();
		this.runsData = runsData;
	}
	
	void addRunsToList(int runs)
	{
		runsData.add(runs);
	}
	double calcRunRate(){
		double sum=0;
		for(int i=0;i<runsData.size();i++)
		{
			sum=sum+runsData.get(i);
		}
		return sum/50;
	}
	
	
	
	int lowestRunsScored()
	{
		temp=runsData;
		Collections.sort(temp);
		
		return temp.get(0);
	
	}
}
