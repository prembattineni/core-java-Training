package com.vm.training.java.Collections;

import java.util.HashSet;

public class HashSetTest {
public static void main(String[] args) {
	HashSet<Object> hashset = new HashSet<Object>();//s
	hashset.add("e");
	hashset.add("a");
	hashset.add("a");
	hashset.add("b");
	hashset.add("d");
	hashset.add("c");
	for(Object a: hashset) {
	System.out.println(a);
	}
}
}
