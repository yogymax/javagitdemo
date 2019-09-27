package com;

public class Employee {

	private int id;
	private String name;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		if(id>0)
		this.id = id;
		else
			System.out.println("Invalid data");
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	
	
	

}
