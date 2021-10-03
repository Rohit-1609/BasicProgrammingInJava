package com.core.java.patterns;

import java.util.Scanner;

public class Pattern18 {

	public static void main(String[] args) 
	{
		System.out.println("mms");
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number of rows:");
		int n= scan.nextInt();
		int i,j,k;
		for( i=1;i<=n;i++)
		{
			k=i;
			for( j=1;j<=i;j++)
			{
				System.out.print(k +" ");
				k=k+n-j;

			}
			System.out.println(" ");
		}
		scan.close();
		System.out.println("mme");

	}

}
