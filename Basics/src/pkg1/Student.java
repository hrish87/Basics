package pkg1;

public class Student 
{
	int a=12;
	public void deepak()
	{
		
		System.out.println("Welcome to all of you");
		
	}
    public static void main(String[] args) 
    {
    	System.out.println("I am boss");
    	Student obj=new Student();
    	obj.deepak();
    	System.out.println(obj.a);
    	obj.a=123;
    	System.out.println(obj.a);
		
	}
}
