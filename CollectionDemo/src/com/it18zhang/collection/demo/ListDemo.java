package com.it18zhang.collection.demo;

import java.util.ArrayList;
import java.util.List;

public class ListDemo {
	public static void main(String[] args) {
		List<Student> list = new ArrayList<Student>();
		Student s = new Student("tom",10);
		list.add(s);
		list.add(s);
		list.add(s);
		
		//��ȡ��һ��Ԫ�ز��޸�
		list.get(0).setName("jerry");
		
		System.out.println(list.get(2).getName());
	}
}
