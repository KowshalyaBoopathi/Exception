package com.collections;

import java.util.*;

public class ArrayListImplementation{
	
	public static void main(String[] args) {
		List<Student> studentlist = new ArrayList<>();
		studentlist.add(new Student(110304,"Zelena","Maths"));
		studentlist.add(new Student(102321,"Sam","Science"));
		studentlist.add(new Student(148213,"Money","Geography"));
		studentlist.add(new Student(110203,"Honey","Arts"));
		
		System.out.println(studentlist);
		
		Comparator<Student> student = new Comparator<Student>()
				{
					@Override
					public int compare(Student o1, Student o2) {
						if(o1.getRollNumber() > o2.getRollNumber())
							return 1;
						else
							return -1;
					}
				};
	
		Collections.sort(studentlist,student);
		
		for(Student l:studentlist)
		{
			System.out.println(l);
		}
		
	}
}
