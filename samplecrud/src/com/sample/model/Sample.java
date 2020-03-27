package com.sample.model;
public class Sample {
	
	private int rNo;
	private String name;
	private int age;
	private float percentage;
	public int getrNo() {
		return rNo;
	}
	public void setrNo(int rNo) {
		this.rNo = rNo;
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
	public float getPercentage() {
		return percentage;
	}
	public void setPercentage(float percentage) {
		this.percentage = percentage;
	}
	public Sample(int rNo, String name, int age, float percentage) {
		super();
		this.rNo = rNo;
		this.name = name;
		this.age = age;
		this.percentage = percentage;
	}
	public Sample() {
		super();
	}
	

}
