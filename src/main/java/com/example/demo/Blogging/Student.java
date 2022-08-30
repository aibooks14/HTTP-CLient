package com.example.demo.Blogging;

public class Student {

	private String name;
	private String job;
	private int tel;
	private String address;

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(String name, String job, int tel, String address) {
		super();
		this.name = name;
		this.job = job;
		this.tel = tel;
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public int getTel() {
		return tel;
	}

	public void setTel(int tel) {
		this.tel = tel;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", job=" + job + ", tel=" + tel + ", address=" + address + "]";
	}
	
	

}
