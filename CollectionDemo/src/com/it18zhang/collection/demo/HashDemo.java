package com.it18zhang.collection.demo;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashDemo {
	public static void main(String[] args) {
		//����Hash����
		Set<Person> set = new HashSet<Person>();
		
		//set���ϲ����ظ����Ԫ��
		System.out.println("------------1.��ͬ�����ַ-----------------");
		//set���ϲ����ظ����
		Person p = new Person("tom",10);
		set.add(p);
		set.add(p);
		set.add(p);
		
		System.out.println("------------2.��ͬ�������ַ��hashcode=1,equals=false-------");
		//��ӳɹ�
		set = new HashSet<Person>();
		Person p1 = new Person("tom",12);
		Person p2 = new Person("tom",12);
		set.add(p1);
		set.add(p2);
		System.out.println(set.size());
		System.out.println(p1==p2);
		System.out.println(p1.hashCode()==p2.hashCode());
		
		
		
		System.out.println("---------------------�ж�hashset�����Ƿ����ָ������-----------------------------");
		set = new HashSet<Person>();
		p1 = new Person("tom",12);
		p2 = new Person("tom",12);
		Person p3 = new Person("tomas",12);
		Person p4	= new Person("tom",13);
		set.add(p1);
		set.add(p2);
		set.add(p3);
		set.add(p4);
		
		System.out.println(set.contains(p2));
		
		
		//����set
		Iterator<Person> it = set.iterator();
		while(it.hasNext()){
			System.out.println(it.next().hashCode());
		}
		
		set.remove(new Person("tom",12));
	}
}
		