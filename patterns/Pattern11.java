package com.core.java.patterns;

import java.util.Scanner;

public class Pattern11 {

	public static void main(String[] args) 
	{
		System.out.println("mms");
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the no of rows:");
		int n=scan.nextInt();
		
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if((i+j)%2==0)
				{
					System.out.print("*_");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println(" ");
		}
		scan.close();
		System.out.println("mme");
	}

}
