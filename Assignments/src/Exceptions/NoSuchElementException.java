package Exceptions;

import java.util.HashSet;
import java.util.Hashtable;
import java.util.Set;

public class NoSuchElementException {
public static void main(String[] args) {
	Set exampleleSet = new HashSet();  
    Hashtable exampleTable = new Hashtable();  //NoSuchElementException

    exampleleSet.iterator().next();   
}
}
