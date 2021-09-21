package co.ashish;

import java.util.Scanner;

public class Problem1 {
	public static void main(String[] ar)
	{
		//Program1 p=new Program1();
		System.out.println("Enter the operator[+,-,*,/] and value of a and b :--");
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		double a=sc.nextDouble();
		double b=sc.nextDouble();
		//String s=sc.nextLine();
		if(s.equals("+"))
		System.out.println(a+b);
	if(s.equals("-"))
		System.out.println(a-b);
	if(s.equals("-*"))
		System.out.println(a*b);
	if(s.equals("/"))
		System.out.println(a/b);
	else
	   System.out.println("enter the correct operation");
	
		
		 
		 /*
		char c=sc.nextchar();
		switch(c)
		{
		case '+':System.out.println(a+b);
		break;
		case '-':System.out.println(a-b);
		break;
		case '*':System.out.println(a*b);
		break;
		case '/':System.out.println(a/b);
		break;
		}
		*/
		//sc.close();
	}


}
