package com.test.filter;

import java.util.HashSet;


public class MainTest {

	
	public static void main(String[] args) {
		
		HashSet<String> hs=new HashSet<String>();
		
		hs.add("123");
		
		hs.add("1234");
		
		hs.add("123");
		hs.add("1223");
		
		hs.add("1234");
		
		for(String s:hs){
			
			System.out.println(s);
			
		}
	}
}
