package com.list_task;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Array_Task {
	
	private void Array_Day2_Task () {
		
		Set <Integer> h = new HashSet <Integer> ();
		h.add(15);
		h.add(null);
		h.add(60);
		h.add(40);
		h.add(40);
		
	System.out.println(h);
	int size =h.size();
	System.out.println("Length ="+size);
	boolean k = h.contains(15);
	System.out.println("Contains ="+k);
     h.clear();
     Set<Integer> h1 = new HashSet <Integer> ();
     h1.add(null);
     h1.add(100);
     h1.add(500);
     h1.add(600);
     h1.add(400);
     
     System.out.println(h1);
     boolean remove = h1.remove(600);
     System.out.println("remove "+remove);
     
	}
public static void main(String[]args) {
	Array_Task l = new Array_Task();
	l.Array_Day2_Task();
}
}
