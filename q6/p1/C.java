package p1;

public class C {
static
{
	System.out.println("Hi");
}

{
	System.out.println("Hello");
}
static
{
	System.out.println("Hi2");
}

{
	System.out.println("Hello2");
}

C()
{
	System.out.println("C1");
}
C(int i)
{
	System.out.println("C2");
}

public static void main(String[] args)
{
	C a = new C();
	C b = new C(2);
}
}
