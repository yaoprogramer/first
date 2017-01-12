package com.it18zhang.collection.demo;

public class Student {
	String name;
	int age;

	public Student(String name, int age) {
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
	public boolean equals(Object obj) {// 重写equals方法,注意程序的健壮性
		if (obj == null) {
			return false;
		}
		if (this == obj) {// 同一个对象
			return true;
		}
		boolean nameEqu = false;
		if (obj.getClass() == Student.class) {
			Student s = (Student) obj;
			if (this.name == null) {
				if (s.name == null) {
					nameEqu = true;
				} else {
					nameEqu = false;
				}
			} else {
				nameEqu = this.name.equals(s.name);
			}

			boolean ageEqu = (this.age == s.age);
			return nameEqu && ageEqu;
		}

		return false;
	}

}
