package com;

public class Encapsulation {
	//ctrl+shift+? comment
	//ctrl+shift+\ uncomment
	
	public static void main(String[] args) {
		Employee e=new Employee();
		Employee e1=new Employee();
		
		e.setId(10);
		e.setName("abc");
		
		e1.setId(30);
		e1.setName("pqr");
		
		
		System.out.println(e.getId()+"\t"+e.getName());
		System.out.println(e1.getId()+"\t"+e1.getName());
		
		
		
		
	}
}
