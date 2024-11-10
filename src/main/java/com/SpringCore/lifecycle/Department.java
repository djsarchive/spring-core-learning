package com.SpringCore.lifecycle;

public class Department {
	
	private String dname;

	
	public String getDname() {
		return dname;
	}

	public void setDname(String dname) {
		this.dname = dname;
	}
	

	public Department() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Department(String dname) {
		super();
		this.dname = dname;
	}

	@Override
	public String toString() {
		return "Department [dname=" + dname + "]";
	}

	public void init()
	{
		System.out.println("initialize department value");
	}
	
	public void destroy()
	{
		System.out.println("destroy dept value");
	}
	

}
