package com.tnsif.oops.encapsulation;

public class oopsconcept_encap {
	private int serialNum;
	private String name;
	private int age; //private means only can be accessed in the class
	 
	 
	
    public int getSerialNum() {
		return serialNum;
	}
	public void setSerialNum(int serialNum) {
		this.serialNum = serialNum;
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
	public String toString() {
		return "oopsconceptdemo [Serial Number=" + serialNum +"," + "name=" +name+", age=" + age +"]";
	}
	
}
