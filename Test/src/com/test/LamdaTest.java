package com.test;

import java.util.ArrayList;
import java.util.List;

public class LamdaTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Person> list= new ArrayList<Person>();
		list.add(new Person("Ravi","Sharma",26));
		list.add(new Person("Sonu","Sharma",30));
		list.add(new Person("Pradeep","Taneja",28));
		list.add(new Person("Abhishek","Rawat",27));
		
		
		//sort list by last name
		//create a method that print all element in list
		//print all person whose fname starting with c
		System.out.println(list);
		
		
	}

}
