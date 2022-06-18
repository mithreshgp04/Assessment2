package com.prodapt.Assessment2;

public class EmployeeData {
	
	String name;
	int age;
	String destination;
	public EmployeeData(String na, int a, String dest) {
		super();
		this.name = na;
		this.age = a;
		this.destination = dest;
	}
	public String getName() {
		return name;
	}
	public void setName(String na) {
		this.name = na;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int a) {
		this.age = a;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String dest) {
		this.destination = dest;
	}
	
	

	void Process_records() {
		
		System.out.println("The employee Details are as folows");
		System.out.println("Name :" +getName());
		System.out.println("Age : " +getAge());
		System.out.println("Destination " +getDestination());
		System.out.println("***********************");
		
		

}

		
	}
