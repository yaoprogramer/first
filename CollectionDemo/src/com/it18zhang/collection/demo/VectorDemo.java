package com.it18zhang.collection.demo;

import java.util.Vector;

public class VectorDemo {
	public static void main(String[] args) {
		Vector<Student> vs = new Vector<>();
		Student s1 = new Student("jack1",11);
		vs.add(s1);
		vs.add(new Student("jack2",12));
		vs.add(0, new Student("jack3",13));
		vs.remove(0);
//		vs.add(10, new Student("jack4",14));//数组越界
		System.out.println();
	}
}
