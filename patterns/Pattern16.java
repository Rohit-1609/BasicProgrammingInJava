package com.core.java.patterns;

import java.util.Scanner;

public class Pattern16 {

	public static void main(String[] args) 
	{
		System.out.println("mms");
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number of rows:");
		int n= scan.nextInt();
		int s=0;
		int i,j;
		for( i=1;i<=n;i++)
		{
			for(int k=i;k<n;k++)
			{
				System.out.print("  ");
			}
			s=i;
			for( j=1;j<=2*i-1;j++)	
				{
				 System.out.print(s+" ");
				 if(j<i)
				    {
				    	s--;
				    }
				    else
				    {
				    	s++;
				    }
				}
			System.out.println(" ");
			   
		}
		scan.close();
		System.out.println("mme");

	}

}
