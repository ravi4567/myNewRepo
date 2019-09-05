package com.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LambdaTestSolutionJava7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Person> list= new ArrayList<Person>();
		list.add(new Person("Ravi","Sharma",26));
		list.add(new Person("Sonu","Sharma",30));
		list.add(new Person("Pradeep","Taneja",28));
		list.add(new Person("Abhishek","Rawat",27));
		
		Collections.sort(list, new Comparator<Person>() {

			@Override
			public int compare(Person o1, Person o2) {
				// TODO Auto-generated method stub
				return o1.getLastName().compareTo(o2.getLastName());
			}
		});
		
		System.out.println(list);
	}

}
