package com.core.java.patterns;

import java.util.Scanner;

public class Pattern_diamond2 {

	public static void main(String[] args)
	{
		System.out.println("mms");
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number of rows:");
		int n= scan.nextInt();
		
		for(int i=1;i<=n;i++)
		{
			for(int j=i;j<n;j++)
			{
				System.out.print(" ");
			}
			for(int k=1;k<i;k++)
			{
				System.out.print("* ");
			}
			System.out.println(" ");
		}
		for(int i=n-1;i>=1;i--)
		{
			for(int j=i;j<n;j++)
			{
				System.out.print(" ");
			}
			for(int k=1;k<i;k++)
			{
				System.out.print("* ");
			}
			System.out.println(" ");
		}
		scan.close();
		System.out.println("mme");

	}

}
