package com.core.java.patterns;

import java.util.Scanner;

public class Pattern_cone2 {

	public static void main(String[] args)
	{
		System.out.println("mms");
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number of row:");
		int n= scan.nextInt();
		
		for(int i=n;i>=1;i--)
		{
			for(int k=i;k<n;k++)
			{
				System.out.print("  ");
			}
			for(int j= 1;j<i*2;j++)
			{
		     System.out.print("* ");
			}
			
			System.out.println(" ");
		}
		scan.close();
		System.out.println("mme");
		
	}

}
