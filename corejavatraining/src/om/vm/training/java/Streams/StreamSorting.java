package om.vm.training.java.Streams;

import java.util.List;
import java.util.stream.Collectors;
import java.util.ArrayList;
import java.util.Collections;

public class StreamSorting {

	List<Integer> sortList(ArrayList<Integer> list)
	{
		return list.stream().sorted().collect(Collectors.toList());//sorting
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> nums=new ArrayList<Integer>();
	
		
		nums.add(2);
		nums.add(3);
	    nums.add(5);
	    nums.add(8);
	    nums.add(1);
	    
	    nums.forEach(System.out::println);
	    
	    System.out.println("=======sort=====");
	   // nums.stream().sorted().forEach(System.out::println);//this sort only for single genric type
	
//ArrayList<String> nums1=new ArrayList<String>();
//	
//		
//		nums1.add("prem");
//		nums1.add("kumar");
//	    nums1.add("battineni");
//	    nums1.add("vamsi");
//	    nums1.add("kedari");
//	    
//	    nums1.stream().sorted().forEach(System.out::println);
//	    
	
	    StreamSorting s=new StreamSorting();
	    
	    System.out.println(s.sortList(nums));
	    
	    nums.stream().sorted(Collections.reverseOrder()).forEach(System.out::print);//reverse sorting
	}

}
