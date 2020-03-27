package com.List;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import com.student.Student;

public class ListExample {
	
	public void AllOperations()
	{
		 Student stu = new Student(1, "Udhay", 2018, 80.59f);
		 Student stu1 = new Student(2, "Soorya", 2016, 90.56f);
		 Student stu2 = new Student(3, "Aravind", 2017, 85.75f);
		 Student stu3 = new Student(4, "Raj", 2016, 93.56f);
		 Student stu4 = new Student(5, "Rahul", 2018, 86.92f);
		 Student stu5 = new Student(4, "Raj", 2016, 93.56f);
		 
		 //ArrayList
		 
		 
		 List<Student> arrayList = new ArrayList<>();
		 arrayList.add(stu);
		 arrayList.add(stu1);
		 arrayList.add(stu2);
		 arrayList.add(stu3);
		 arrayList.add(stu4);
		 arrayList.add(stu5);
		 System.out.println("Array List Values:");
		 for (Student student : arrayList) {
			 
			 System.out.println("Number is : " + student.getsNo() + " Name is : " + student.getsName()
				+ " Year Paassout is :  " + student.getpYear() + " Percentage is :  " + student.getPercentage());

			
		}
		 
//LinkedList
		 
		 
		 List<Student> linkedList = new LinkedList<>();
		 linkedList.add(stu);
		 linkedList.add(stu1);
		 linkedList.add(stu2);
		 linkedList.add(stu3);
		 linkedList.add(stu4);
		 linkedList.add(stu5);
		 System.out.println("LinkedList Values:");
		 for (Student student : linkedList) {
			 
			 System.out.println("Number is : " + student.getsNo() + " Name is : " + student.getsName()
				+ " Year Paassout is :  " + student.getpYear() + " Percentage is :  " + student.getPercentage());

			
		}
		 
		 
				 
	
	}
	
	

}
