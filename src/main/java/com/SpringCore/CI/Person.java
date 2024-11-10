package com.SpringCore.CI;

public class Person {
	
	private int pid;
	private String pname;
	private Address add;
	
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Person(int pid, String pname, Address add) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.add = add;
	}
	@Override
	public String toString() {
		return "Person [pid=" + pid + ", pname=" + pname + ", add=" + add + "]";
	}
	
	
	
	
	

}
