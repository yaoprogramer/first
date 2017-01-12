package com.it18zhang.collection.demo;

import java.util.Comparator;
import java.util.TreeSet;

import javax.swing.text.html.HTMLDocument.Iterator;
/*
 * comparatorλ��java.util����,�ͻ�����������treeset���Զ���ͻ�������
 * 
 * comparableλ��java.lang���¡���Ȼ������һ�������ԱȽ���Ҫʵ�ֵĽӿڣ�����customer��ʵ���˸ýӿڣ�
 * ���ڲ���дcompareto������
 * 
 * */


public class TreesetDemo {
	public static void main(String[] args) {
		/*
		 * �Զ���Ƚ�����ʵ�ֵ��Ƕ���ıȽϴ�С��
		 * ���������жϴ�С���
		 * 
		 * */
		
		Comparator<Person> comp = new Comparator<Person>(){
			
			public int compare(Person o1,Person o2){//o1�Ǽ�����ӵ�Ԫ�أ�o2��set�ڲ���Ԫ��
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
