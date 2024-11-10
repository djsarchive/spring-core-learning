package com.SpringCore;

public class Student {
	private int sID;
	private String sName;
	private String sAddress;
	public int getsID() {
		return sID;
	}
	public void setsID(int sID) {
		this.sID = sID;
	}
	public String getsName() {
		return sName;
	}
	public void setsName(String sName) {
		this.sName = sName;
	}
	public String getsAddress() {
		return sAddress;
	}
	public void setsAddress(String sAddress) {
		this.sAddress = sAddress;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(int sID, String sName, String sAddress) {
		super();
		this.sID = sID;
		this.sName = sName;
		this.sAddress = sAddress;
	}
	@Override
	public String toString() {
		return "Student [sID=" + sID + ", sName=" + sName + ", sAddress=" + sAddress + "]";
	}
	


}
