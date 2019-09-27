package encap.app.admission.process;

import java.util.Scanner;

public class College {

	
	
	public Student[] admission() {
		Scanner sc=new Scanner(System.in);
		Student[] students=null;
		
		System.out.println("How many Students U want add");
		int noOfStudents=sc.nextInt();
		students=new Student[noOfStudents];
		
		for(int i=0;i<noOfStudents;i++) {
			Student s=new Student();
			System.out.println("Enter Roll No");
			s.setRollNo(sc.nextInt());
			System.out.println("Enter Name");
			s.setName(sc.next());
			System.out.println("Enter Address");
			s.setAddress(sc.next());
			System.out.println("Enter Mobile number");
			s.setMobile(sc.next());
			students[i]=s;
		}
		return students;
	}

}
