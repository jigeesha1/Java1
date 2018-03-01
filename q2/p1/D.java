package p1;

public class D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int a = 1/0;
		float b = 2.0f/0.0f ;
		double c = 3.0/0.0 ;
		//System.out.println(a);
		System.out.println(b); //only a will give exception.. b and c is valid
		System.out.println(c);

	}

}
