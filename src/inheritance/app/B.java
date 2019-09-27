package inheritance.app;

public class B extends A {

	int j = 20;

	public void m1() {
		System.out.println("m1() of class B");
	}
	
	public void m2() {
		System.out.println("m2() of class B");
	}

	public static void main(String[] args) {

		//1]
		B b = new B();

		System.out.println(b.i);
		System.out.println(b.j);

		b.m1();
		b.m2();

		System.out.println("2}++++++++++++++++++++++");
		//2}
		A a=new A();
		System.out.println(a.i);
		a.m1();	
		//a.m2(); compile time error
		
		
		System.out.println("3} MIMP ++++++++++++++++++");
		A ab=new B();
		System.out.println(ab.i);
		ab.m1();
		//ab.m2();
		
		System.out.println("4}++++++++++");
		//B ba=(B)new A();  
		//compile time --resolve using typecasting
		//at the run time throws exception ClassCastException
	
		System.out.println("5} +++++++++++");
		a=b;  ///similar wtih 3 type of Object
		System.out.println("6}+++++++++");
		//b=a  //similar with 4 type of Object
		
		
		
	}

}
