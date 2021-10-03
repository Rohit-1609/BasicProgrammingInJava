package com.core.java.patterns;

import java.util.Scanner;

public class Pattern13 {

	public static void main(String[] args) 
	{
		System.out.println("mms");
		Scanner scan =  new Scanner(System.in);
		System.out.println("Enter the number of rows:");
		int n= scan.nextInt();
		
		for(int i=1;i<=n;i++)
		{
			for(int k=i;k<n;k++)
			{
				System.out.print("  ");
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print(j+" ");
			}
			for(int j=i-1;j>=1;j--)
			{
				System.out.print(j+" ");
			}
			System.out.println(" ");
		}
		scan.close();
		System.out.println("mme");

	}

}
