package encap.app.admission.process;

public class University {

	public static void main(String[] args) {
		
		College c=new College();
		Student[] students=c.admission();
	
		for (int i = 0; i < students.length; i++) {
			Student student=students[i];
			System.out.println(student.getRollNo()+"\t"+student.getName()+"\t"+student.getAddress()+"\t"+student.getMobile());
		}
		
		
		
		
	}

}
