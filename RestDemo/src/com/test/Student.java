package com.test;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Student {
	private String name;
	private int age;
	private String subject;
	public Student() {
		
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
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", subject=" + subject + ", getName()=" + getName()
				+ ", getAge()=" + getAge() + ", getSubject()=" + getSubject() + "]";
	}

}
