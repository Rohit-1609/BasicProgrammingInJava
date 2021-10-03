package com.core.java.patterns;

import java.util.Scanner;

public class Pattern9 {

	public static void main(String[] args)
	{
		System.out.println("mms");
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number of row:");
		int n = scan.nextInt();
		
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(j+" ");
				
			}
			System.out.println(" ");
		}
		scan.close();
		System.out.println("mme");

	

	}

}
