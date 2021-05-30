package com.vm.training.java.Collections;

import java.util.ArrayList;

public class EmployeeMainArrayList {

	public static void main(String[] args) {
		Employee e=new Employee(123,"jkdc","cwldjc","cwkll");
		Employee e1=new Employee(103,"kdcj","cwljc","ccmdll");
		Employee e2=new Employee(123,"fhdc","wjdjc","cwjcwll");
		ArrayList<Employee> emp=new ArrayList<Employee>();
		emp.add(e);
		emp.add(e1);
		emp.add(e2);
		int y=123;
		
		for(int i=0;i<emp.size();i++)
		{
			if(y==emp.get(i).id)
			{
				System.out.println(emp.get(i).name);
			}
		}
		

	}

}
