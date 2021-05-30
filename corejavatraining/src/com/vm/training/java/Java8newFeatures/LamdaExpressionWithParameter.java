package com.vm.training.java.Java8newFeatures;


@FunctionalInterface
interface calculate{
	
	
	void addition(int a,int b);
}

interface Calculate2{
	//method has return type
	int mutiply(int a,int b);
}

interface Large{
	int findLargest(int a,int b);
}

public class LamdaExpressionWithParameter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	calculate c=(a,b)->
	{
	System.out.println(a+b);
	};
	c.addition(2, 4);
	
	
	Calculate2 c2=(a,b)->a*b;
    System.out.println("mutiply :"+c2.mutiply(2,4) );
    
    Large large =(a,b)->
    {
    	if(a>b)
    		return a;
    	else
    		return b;
    };
    System.out.println("largest number is "+large.findLargest(3, 6));

}
}