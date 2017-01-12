package com.it18zhang.collection.demo;

public class Person {
	private String name;
	private int age;

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	@Override
	public int hashCode() {
		
		return name==null?age:name.hashCode()+age;
	}
	@Override
	public boolean equals(Object obj) {//
		if(obj == null){
			return false;
		}
		if(this == obj){
			return true;
		}
		if(obj.getClass()==Person.class){
			Person p = (Person)obj;
			if(this.name!=null){
				return name.equals(p.name)&&p.age==this.age;
			}else{
				if(p.name==null){
					return p.age == this.age;
				}else{
					return false;
				}
			}
		}
		return false;
	}
}
