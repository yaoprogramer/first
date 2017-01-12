package com.it18zhang.collection.demo;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
//所有的Key存放在set中，是不能重复的，value是可以重复的。
//每一对Key-value称作entry(条目)
public class MapDemo {

	public static void main(String[] args) {
		Map<String,Dog> map = new HashMap<String,Dog>();
//		map.put(null, null);
		map.put("dog-1000-1981", new Dog("",12,""));
		map.put("dog-1000-1982", new Dog("",12,""));
		map.put("dog-1000-1983", new Dog("",12,""));
		map.put("dog-1000-1984", new Dog("",12,""));
		System.out.println(map.size());
		
		//获取条目，返回值是Set，Set的每一个元素是Entry
		Set<Entry<String, Dog>> entries = map.entrySet();
		//循环Map的所有entry
		for(Entry<String, Dog> entry:entries){
			
			System.out.println(entry.getKey()+"养了"+entry.getValue());;
			
			
		}
		System.out.println("*****************************************");
		
		Dog d2 = map.remove("dog-1000-1984");
		System.out.println("删除了:"+d2);
		d2 = map.remove("dog-1000-1988");
		System.out.println("删除了"+d2);
		//获取键值集合
		Set<String> keySet = map.keySet();
		//循环遍历
		for(String str:keySet){
			Dog value = map.get(str);
			
			System.out.println(str+":"+value);
		}
		
		map.get("dog-1000-1983");
		
	
	}

}
