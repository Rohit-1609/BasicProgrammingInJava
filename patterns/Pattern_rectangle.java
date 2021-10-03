package com.core.java.patterns;

import java.util.Scanner;

public class Pattern_rectangle {

	public static void main(String[] args) 
	{
		System.out.println("mms");
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number of rows : ");
		int n = scan.nextInt();
		
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
         	{  
				if(i==1||i==n||j==1||j==n)
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
				}
	   }
			System.out.println(" ");
	 }
		scan.close();
		System.out.println("mme");
  }

}
