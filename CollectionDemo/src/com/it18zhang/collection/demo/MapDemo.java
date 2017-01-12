package com.it18zhang.collection.demo;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
//���е�Key�����set�У��ǲ����ظ��ģ�value�ǿ����ظ��ġ�
//ÿһ��Key-value����entry(��Ŀ)
public class MapDemo {

	public static void main(String[] args) {
		Map<String,Dog> map = new HashMap<String,Dog>();
//		map.put(null, null);
		map.put("dog-1000-1981", new Dog("",12,""));
		map.put("dog-1000-1982", new Dog("",12,""));
		map.put("dog-1000-1983", new Dog("",12,""));
		map.put("dog-1000-1984", new Dog("",12,""));
		System.out.println(map.size());
		
		//��ȡ��Ŀ������ֵ��Set��Set��ÿһ��Ԫ����Entry
		Set<Entry<String, Dog>> entries = map.entrySet();
		//ѭ��Map������entry
		for(Entry<String, Dog> entry:entries){
			
			System.out.println(entry.getKey()+"����"+entry.getValue());;
			
			
		}
		System.out.println("*****************************************");
		
		Dog d2 = map.remove("dog-1000-1984");
		System.out.println("ɾ����:"+d2);
		d2 = map.remove("dog-1000-1988");
		System.out.println("ɾ����"+d2);
		//��ȡ��ֵ����
		Set<String> keySet = map.keySet();
		//ѭ������
		for(String str:keySet){
			Dog value = map.get(str);
			
			System.out.println(str+":"+value);
		}
		
		map.get("dog-1000-1983");
		
	
	}

}
