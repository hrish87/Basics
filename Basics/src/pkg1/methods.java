package pkg1;

public class methods 
{
 public void Method ()
 {
	this.Method3(1, 2, 4); 
	System.out.println("Default parameterized method");
 }
 public void Method1 (int a)
 {
	this.Method4(1, 2, 3, 4);
	 System.out.println("One parameterized method");
 }
 public void Method2 (int a, int b)
 {
	 this.Method1(1);	
	 System.out.println("Two parameterized method");
 }
 public void Method3 (int a, int b, int c)
 {
	 System.out.println("Three parameterized method");
 }
 public void Method4 (int a, int b, int c, int d)
 {
	 this.Method();
	 System.out.println("Four parameterized method");
 }
 
 public static void main(String[] args) 
 {
	methods obj = new methods();
	obj.Method2(1,2);
}
}
