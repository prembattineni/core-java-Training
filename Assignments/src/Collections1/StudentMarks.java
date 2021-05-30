package Collections1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class StudentMarks {

	
	static void adding(ArrayList students,int marks)
	{
		students.add(marks);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner sc=new Scanner(System.in);
		ArrayList<Integer> students=new ArrayList<Integer>();
		ArrayList<Integer> temp;
	 System.out.print("Enter Marks : ");
	int s=sc.nextInt();
	 System.out.print("Enter Marks : ");
	for(int i=0;i<s;i++)
	{
	 
	  int marks=sc.nextInt();
		adding(students,marks);
	}
	temp=students;
	
	
	System.out.print("Highest Marks : ");
	int size=students.size();
	System.out.println(students.get(size-1));
	System.out.println();
	System.out.print("Average Marks  :");
	double sum=0;
	for(Integer d : students) {
	    sum += d;
	
	}
	System.out.println(sum/size+"\n");
	
	System.out.print("Marks : ");
	for(int i=0;i<students.size();i++)
	{
		System.out.print((i+1)+"-"+students.get(i)+" ");
	}
	System.out.println("\n");
	System.out.println("3rd Student marks : "+students.get(2));
	
	
	Collections.sort(temp);
	
	Iterator<Integer> iterator = temp.iterator();
	int i=1;
	System.out.println();
	while (iterator.hasNext()) {
        System.out.print(i+"-"+iterator.next() + " ");
        i++;
    }
	}

}
