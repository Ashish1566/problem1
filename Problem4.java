package co.ashish;

import java.util.Scanner;

public class Problem4 {
	public static void main(String[] ar)
	{
		System.out.println("Enter the Size of ArrayList: -");
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		System.out.println("Enter the element of array -seprate with ',' ");
		String str= sc.next();
		String[] arr=str.split(",");
		int number[]=new int[size];
		for(int i=0; i<size;i++){
		       number[i]=Integer.parseInt(arr[i]);
		  }
		for(int i=1;i<=9;i++)
		{ 
			int count=0;
			for(int j=0;j<size;j++)
			{
				if(number[j]%i==0)
					count++;
			}
			System.out.print(i +";"+ count+",");
		}
		
	}

}
