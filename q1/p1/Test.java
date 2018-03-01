package p1;

public class Test {

	int i;
	Test(int i)
	{
		this.i = i;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Test a = new Test(10);
		Test b = new Test(10);
		
		System.out.println(a==b);
		System.out.println(a.equals(b));
			
	}

}
