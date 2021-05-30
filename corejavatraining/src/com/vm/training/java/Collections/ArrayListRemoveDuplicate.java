package com.vm.training.java.Collections;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListRemoveDuplicate {

	public static void main(String[] args) {
		
		ArrayList<String> javabatch=new ArrayList<String>();
		ArrayList<String> sqlbatch=new ArrayList<String>();
		javabatch.add("ravi");
		javabatch.add("john");
		javabatch.add("anil");
		javabatch.add("kumar");
		
		sqlbatch.add("sourab");
		sqlbatch.add("ankita");
		sqlbatch.add("john");
		sqlbatch.add("kumar");
		sqlbatch.add("manoj");
		
		javabatch.removeAll(sqlbatch);//remove duplicates in javabatch which are in sqlbatch
		
		javabatch.addAll(sqlbatch);//add sqlbatch objects to javabatch
		
		Collections.sort(javabatch);
		System.out.println(javabatch);
	}
}
