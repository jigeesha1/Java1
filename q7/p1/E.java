package p1;

public class E {
	public static void main(String[] args)
	{
		String s1 = "abc";
		String s2 = new String("abc");
		
		//s2 = s1; any other way??
		System.out.println(s1==s2);//How to make this statement print true.. you can add a statement or 2 above, but dont modify any
		System.out.println(s1.equals(s2)); 
	}

}
