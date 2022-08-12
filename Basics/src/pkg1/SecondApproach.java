package pkg1;

public class SecondApproach 
{
    int a; int b; int c; int d; int e;
	public void m1(int a1, int a2, int a3, int a4, int a5)
	{
		a=a1;b=a2;c=a3;d=a4;e=a5;
	}
	
	public static void main(String[] args) 
	{
		SecondApproach obj1= new SecondApproach();
		obj1.m1(3, 6, 4, 67, 7);
		System.out.println(obj1.a);
		System.out.println(obj1.b);
		System.out.println(obj1.c);
		System.out.println(obj1.d);
		System.out.println(obj1.e);
		
	}
	
}
