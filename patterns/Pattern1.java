package com.core.java.patterns;

import java.util.Scanner;

public class Pattern1 {

	public static void main(String[] args)
	{
		System.out.println("mms");
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number of rows :");
		int n =scan.nextInt();
		
	/*	for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("* ");
			}
			System.out.println(" ");
		}
	*/	
		
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				System.out.print("* ");
				if(i==j)
					break;
			}
			System.out.println(" ");
		}
		
		
       scan.close();
       System.out.println("mme");
	}
	
	

}
