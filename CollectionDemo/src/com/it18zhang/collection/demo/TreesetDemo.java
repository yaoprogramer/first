package com.it18zhang.collection.demo;

import java.util.Comparator;
import java.util.TreeSet;

import javax.swing.text.html.HTMLDocument.Iterator;
/*
 * comparator位于java.util包下,客户化排序，用于treeset的自定义客户化排序
 * 
 * comparable位于java.lang包下。自然排序。是一个对象自比教需要实现的接口，比如customer类实现了该接口，
 * 类内部重写compareto方法。
 * 
 * */


public class TreesetDemo {
	public static void main(String[] args) {
		/*
		 * 自定义比较器，实现的是对象的比较大小，
		 * 按照年龄判断大小情况
		 * 
		 * */
		
		Comparator<Person> comp = new Comparator<Person>(){
			
			public int compare(Person o1,Person o2){//o1是即将添加的元素，o2是set内部的元素
				System.out.println(o1+":"+o2);
				if(o1==null){
					if(o2==null)
						return 0;
					else
						return -1;
				}else{
					if(o2==null)
						return 1;
					else
						return o1.getAge()-o2.getAge();
				}
			}
		};
		
	
		TreeSet<Person> ts = new TreeSet<Person>(comp);
		
		ts.add(null);
		
		ts.add(new Person("p1",10));
		ts.add(new Person("p2",10));
		ts.add(new Person("p3",20));
		ts.add(new Person("p4",40));
		ts.add(new Person("p5",11));
		System.out.println(ts.size());
		
		for(java.util.Iterator<Person> it = ts.iterator();it.hasNext();){
			Person p = it.next();
			System.out.println(p==null?"Nobody":p.getName());
		}
	}
}
