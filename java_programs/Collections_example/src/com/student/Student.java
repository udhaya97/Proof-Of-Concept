package com.student;

public class Student {
	
	private int sNo;
	private String sName;
	private int pYear;
	private float percentage;
	public int getsNo() {
		return sNo;
	}
	public void setsNo(int sNo) {
		this.sNo = sNo;
	}
	public String getsName() {
		return sName;
	}
	public void setsName(String sName) {
		this.sName = sName;
	}
	public int getpYear() {
		return pYear;
	}
	public void setpYear(int pYear) {
		this.pYear = pYear;
	}
	public float getPercentage() {
		return percentage;
	}
	public void setPercentage(float percentage) {
		this.percentage = percentage;
	}
	public Student(int sNo, String sName, int pYear, float percentage) {
		super();
		this.sNo = sNo;
		this.sName = sName;
		this.pYear = pYear;
		this.percentage = percentage;
	}
	public Student() {
		super();
	}
	

}
