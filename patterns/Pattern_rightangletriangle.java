package com.core.java.patterns;

import java.util.Scanner;

public class Pattern_rightangletriangle {

	public static void main(String[] args) 
	{
		System.out.println("mms");
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number of row:");
		int n= scan.nextInt();
		
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{   
				if(j==1||i==n||j==i)
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
