package Assignments;

import java.util.Scanner;

public class Table 
{
public static void main(String[] args) 
{
	System.out.println("Please enter number");
	Scanner sc = new Scanner (System.in);
	int number = sc.nextInt();
	
	int T;
	for (int i=1;i<=10;i++)
	{
		T= number*i;
		System.out.println(number +" X " + i + "=" + T);
	}
}
}
