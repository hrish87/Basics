package pkg1;

public class Constructor 

{
public Constructor() 
{
	this (1,3,2,5);
	System.out.println("This is default constructor");
}

public Constructor(int a) 
{ 
	this();
	System.out.println("This is one parametrized constructor");
}
public Constructor(int a, int b) 
{
	this(2);
	System.out.println("This is two parametrized constructor");
}

public Constructor(int a, int b, int c) 
{ 
    this(2,3);
	System.out.println("This is three parametrized constructor");
}

public Constructor(int a, int b, int c, int d) 
{ 
	
	System.out.println("This is four parametrized constructor");
}
  public static void main(String[] args) 
{
	
    Constructor obj = new Constructor (2,4,7);


}

}

