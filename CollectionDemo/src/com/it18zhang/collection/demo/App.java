package com.it18zhang.collection.demo;

import java.util.ArrayList;
import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class App {

	public static void main(String[] args) {

		List list = new ArrayList();
		list.add("1243");
		list.add(100);
		list.add(new Integer(200));
		list.add(new Long(2));

//		System.out.println(list.size());
		
		//遍历集合
		for(int i=0;i<list.size();i++){
			
			Object obj = (Object)list.get(i);
			
			System.out.println(obj);
		}
		System.out.println("-----------------------------");
		//迭代器
		Iterator it = list.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
		System.out.println("-----------------------------");
		Iterator it0=list.iterator();
		for(;it0.hasNext();){
			System.out.println(it0.next());
		}
		System.out.println("-----------22222222222------------");
		for(;it0.hasNext();){
			System.out.println(it.next());
		}
		System.out.println("---------33333333333333333----------");
		for(int i=0;i<list.size();i++){
			Object obj = list.get(i);
			if(obj instanceof String){
				System.out.println("hello"+(String)obj);
			}else if(obj instanceof Integer){
				System.out.println(100+(Integer)obj);	
			}
		}
		
		
		
		System.out.println("********************************************************");
		//使用泛型
		List<Student> lst = new ArrayList<Student>();
		lst.add(new Student("Jack",22));
		lst.add(new Student("Shawn",23));
		lst.add(new Student("Lois",22));
		
		System.out.println("************遍历泛型集合***************");
		//遍历泛型集合
		for(int i=0;i<lst.size();i++){
			System.out.println(lst.get(i).getName());
		}
		
		System.out.println("**************增强for循环**************");
		for(Student stmp:lst){
			System.out.println(stmp.getName());
		}
		
		
		System.out.println("---------LinkedList--------------");
		Deque<String> dq = new LinkedList<String>();
		dq.add("tom");
		dq.add("tomas");
		dq.add("tomasLee");
		dq.add("tomson");
		System.out.println("kkkkkk");
		Iterator< String> itt = dq.iterator();
		while(itt.hasNext()){
			System.out.println(itt.next());
		}
		
		String lastEle = dq.getLast();
		System.out.println(dq.contains(new String("tomas")));
		
		
		
		/*
		 * 创建ArrayList集合，存放100个Student对象，名字从tom0-tom99,age从0-99
		 * 给出对象s=new Student("tom9",9);
		 * 判读s在list中是否存在?
		 * */
		
		List<Student> list100 = new ArrayList<Student>();
		for (int i = 0; i < 100; i++) {
			list100.add(new Student("tom"+i,i));
		}
		System.out.println(list100.contains(new Student("tom9",9)));//输出为false，需要重写equals方法

	}

}
