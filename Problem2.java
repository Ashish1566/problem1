package co.ashish;

import java.util.Scanner;

public class Problem2 {
	public static void main(String[] ar)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("input a: ");
		double a=sc.nextDouble();
		int inc=1;
		System.out.print("output :");
		for(int i=0;i<a;i++)
		{
			System.out.print(inc+" ,");
			inc+=2;
		}
	}

}
