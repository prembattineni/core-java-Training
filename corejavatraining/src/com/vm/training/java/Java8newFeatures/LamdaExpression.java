package com.vm.training.java.Java8newFeatures;


@FunctionalInterface      //because only one abstract method
interface Test
{
	void display();
	
}




public class LamdaExpression {

	public static void main(String[] args) {
		
	Test t=	()->                        //Oject1
		{
			System.out.println("hello");
			System.out.println("java");
		};
		
          t.display();
          
          
          Test t1 = ()->                   //Object2
          
          {
        	  System.out.println("hello single line body");
          };
          t1.display();
          
    Test t3 = ()-> System.out.println("hiii");    //Object3
               t3.display();
         
        	  
          
         

	}

}
