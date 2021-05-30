package om.vm.training.java.Streams;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class StreamDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//List<Integer> l=Arrays.asList(2,3,5,7,8,9,15,2);//same as ArrayList
		ArrayList<Integer> l=new ArrayList<Integer>();
		l.add(1);
		l.add(2);
		l.add(8);
		l.add(4);
		l.forEach(a->System.out.println(a));//for printing all elements in l
		
		
		l.forEach(System.out::print);
		long count=l.stream().count();
		System.out.println("no of elements in stream is : "+count);
	
	l.stream().filter(s->s>2).forEach(s->System.out.println(s));//stream
	
	System.out.println("===map===");
	l.stream().map(s->s+100).forEach(s->System.out.println(s));
	
	}

}
