package p1;

public class B extends A{

	int i =20;
	
	int m1()
	{
		return 200;
	}
	public static void main(String[] args) {
		
		A a1 = new A();
		A a2 = new B();
		//B a3 = new A(); - Exception
		System.out.println(a2.i);
		System.out.println(a2.m1());
		//Later made the i as private and m1 as static and asked for output

	}

}
