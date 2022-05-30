package com.nit.test;

import java.util.PriorityQueue;

public class Test {

	public static void main(String[] args) {
		
		PriorityQueue q=new PriorityQueue(); 
		 q.offer("A"); 
		q.offer("Z"); 
	     q.offer("C"); 
		 q.offer("D"); 
		 q.offer("F"); 
		 q.offer("A"); 
		 System.out.println(q.contains("F")); 
	
	}

}
