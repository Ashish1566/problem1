package co.ashish;

import java.util.Scanner;

public class Problem3 {
	public static void main(String[] ar)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("input a: ");
		double a=sc.nextDouble();
		int inc=1;
		if(a%2==0)
		{
		for(int i=0;i<a-1;i++)
		{
			System.out.print(inc+" ,");
			inc+=2;
		}
		}
		else
		{
			for(int i=0;i<a;i++)
			{
				System.out.print(inc+" ,");
				inc+=2;
			}
		}
	}

}
