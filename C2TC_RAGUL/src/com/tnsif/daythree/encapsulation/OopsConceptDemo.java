/**
 * 
 */
package com.tnsif.daythree.encapsulation;

/**
 * 
 */
public class OopsConceptDemo {
	private int SerialNum;
	private String Name;
	private int Age;
	
	public int getSerialNum() {
		return SerialNum;
	}
	public void setSerialNum(int SerialNum) {
		this.SerialNum=SerialNum;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getAge() {
		return Age;
	}
	public void setAge(int age) {
		Age = age;
	}
	public String toString() {
		return "OopsConceptDemo [Serial Number="
		+ SerialNum + ", Name=" + Name + ", age=" + Age
		+ "]";
		}

}
