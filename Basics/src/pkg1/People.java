package pkg1;

public class People 
{

int a;
int b=10;

public void ritanshu() 

{
	System.out.println("Welcome to all of you");
}
public void ritanshu1() 
{
	System.out.println("this is java class");
}
public static void main(String[] args) 
{
	People p = new People();
	p.ritanshu();
	p.ritanshu1();
	p.a=10;
	System.out.println(p.a);
	p.b=20;
	System.out.println(p.b);
}
}


