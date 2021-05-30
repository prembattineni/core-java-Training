package com.vm.training.java.strings;

public class StringObjectCreation {

	public static void main(String[] args) {
		String s1=new String("prem Kumar");
		String s2=new String("prem Kumar");
		String s3="Prem Kumar";
		String s4="prem Kumar";
       System.out.println(s1==s2);//false because two references are not same
       System.out.println(s1.equals(s2));//true because content is same
       System.out.println(s3==s4);
       System.out.println(s3.equals(s4));
       System.out.println(s1.toUpperCase());
       System.out.println(s2.toLowerCase());
       System.out.println(s2.compareTo(s4));
       System.out.println(s1.length());
       s1=s1.concat(" battineni");
       System.out.println(s1);
       System.out.println(s1.charAt(0));
       char ch[]={'s','t','r','i','n','g','s'};  
       String s5=new String(ch); //char array to string
       System.out.println(s5);
       System.out.println(s1.substring(4));//returns string from index 4
       System.out.println(s1.substring(0,4));
       String s6="my name is khan my name is java";  
       String replaceString=s6.replace("is","was");
       s1=s1.trim();//remove extra spaces 
       System.out.println(replaceString);
       StringBuilder sb=new StringBuilder("abc");//StringBuilder and StringBuffer are mutable
       sb.append("xyz");//StringBuffer is syncronized
       System.out.println(sb);
       StringBuffer sbu=new StringBuffer("abc");//stringBuffer is not synchronized
       sbu.append("xyz");
       System.out.println(sbu);
       char ch1[] = {'M','y',' ','J','a','v','a',' ','e','x','a','m','p','l','e'};
       /**
        * We can copy a char array to a string by using 
        * copyValueOf() method.
        */
       String chStr = String.copyValueOf(ch1);
       System.out.println(chStr);
       String subStr = String.copyValueOf(ch1,3,4);//3 is index and 4 is length
       System.out.println(subStr);
       
       String b = "jump ";
       String c = "No jump";
       /**
        *  We can do string concatination by two ways. 
        *  One is by using '+' operator, shown below. 
        */
       String d = b+c;
       System.out.println(d);
       /**
        *  Another way is by using concat() method, 
        *  which appends the specified string at the end.
        */
       d = b.concat(c);
       System.out.println(d);
       
       
       String text = "<B>I don't want this to be bold<\\B>";
       System.out.println(text);
       text = text.replaceAll("\\<.*?\\>", "");
       System.out.println(text);
       String tr="nemline?new>new";
       String tr1[]=tr.split("[? | >]");//string split more than 1 delimiter
      for(int i=0;i<tr1.length;i++)
      {
    	  System.out.println(tr1[i]);
      }
       
      String c1 = "We are comparing the content with a StringBuffer content";
      StringBuffer sb1 =
          new StringBuffer("We are comparing the content with a StringBuffer content");
      /**
       * We can use contentEquals() method to compare content with a StringBuffer.
       * It returns boolean value.
       */
      if(c1.contentEquals(sb1)){
          System.out.println("The content is equal");
      } else {
          System.out.println("The content is not equal");
      }
      StringBuffer asb =
          new StringBuffer("You cannot compare the content with a String content");
      if(c1.contentEquals(asb)){
          System.out.println("The content is equal");
      } else {
          System.out.println("The content is not equal");
      }
       
	}

}
