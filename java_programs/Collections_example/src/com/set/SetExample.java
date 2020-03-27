package com.set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

import com.student.Student;

public class SetExample {

	//static objects
	static Student stu = new Student(1, "Udhay", 2018, 80.59f);
	static Student stu1 = new Student(2, "Soorya", 2016, 90.56f);
	static Student stu2 = new Student(3, "Aravind", 2017, 85.75f);
	static Student stu3 = new Student(4, "Raj", 2016, 93.56f);
	static Student stu4 = new Student(5, "Rahul", 2018, 86.92f);
	static Student stu5 = new Student(4, "Raj", 2016, 93.56f);
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SetExample hse = new SetExample();
		hashSet();
		treeSet();
        hse.linkedHashSet();
	}
	//static method can access only static variables/objects.
	public static void hashSet()
	{

		
		
		Set<Student> hashSet = new HashSet<>();
		hashSet.add(stu);
		hashSet.add(stu1);
		hashSet.add(stu2);
		hashSet.add(stu3);
		hashSet.add(stu4);
		hashSet.add(stu5);

		System.out.println("HashSet Values :" );
		for (Student student : hashSet) {

			System.out.println("Number is : " + student.getsNo() + " Name is : " + student.getsName()
					+ " Year Paassout is :  " + student.getpYear() + " Percentage is :  " + student.getPercentage());
	
		}
	}
	public static void treeSet()
	{

		
		
		TreeSet<Integer> treeSet = new TreeSet<>();
		treeSet.add(3);
		treeSet.add(9);
		treeSet.add(6);
		treeSet.add(7);
		treeSet.add(9);
		treeSet.add(1);
		System.out.println("old values: 3 9 6 7 9 1");

		System.out.println("TreeSet Values :" );
		for (Integer init : treeSet) {

			System.out.println(init);
	
		}
	}
	public  void linkedHashSet()
	{

		//Non static method can access static objects and non static objects.
		
		Set<Student> linkedHashSet = new LinkedHashSet<>();
		linkedHashSet.add(stu);
		linkedHashSet.add(stu1);
		linkedHashSet.add(stu2);
		linkedHashSet.add(stu3);
		linkedHashSet.add(stu4);
		linkedHashSet.add(stu5);

		System.out.println("Linked HashSet Values :" );
		for (Student student : linkedHashSet) {

			System.out.println("Number is : " + student.getsNo() + " Name is : " + student.getsName()
					+ " Year Paassout is :  " + student.getpYear() + " Percentage is :  " + student.getPercentage());
	
		}
	}
	
		
	}


