package pkg1;
//((((10+2)+2)-2)*2)/2)
public class Arithmetic2 
{
	
public int sum(int a, int b) 
{
	int c= a+b;
	System.out.println("sum result is " +c);
	return c;
}

public int sub(int a, int b) 
{
	int c= a-b;
	System.out.println("sub result is " +c);
	return c;
}
public int mul(int a, int b) 
{
	int c= a*b;
	System.out.println("mul result is " +c);
	return c;
}
public int div(int a, int b) 
{
	int c= a/b;
	System.out.println("div result is " +c);
	return c;
}

public static void main(String[] args) 
{
	Arithmetic2 obj= new Arithmetic2();
	int sumresult = obj.sum(10, 2);
	int sumresult1 =obj.sum(sumresult, 2);
	int subresult= obj.sub(sumresult1, 2);
	int mulresult = obj.mul(subresult, 2);
    int divresult= obj.div(mulresult, 2);
    System.out.println("Final result is " + divresult);
}


}
