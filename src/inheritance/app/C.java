package inheritance.app;

public class C extends  B{

	int k=30;
	
	public void m3() {
		System.out.println("m3() of class C");
	}
	
	public static void main(String[] args) {
		
		C c=new C();
		System.out.println(c.i+"\t"+c.j+"\t"+c.k);
		
		c.m1();
		c.m2();
		c.m3();
		
		
		
		
		
		
	}
	

}
