package com.core.java.patterns;

import java.util.Scanner;

public class Pattern_fishtail {

	public static void main(String[] args)
	{
      System.out.println("mms");
      Scanner scan = new Scanner(System.in);
      System.out.println("Enter the number of row:");
      int n =scan.nextInt();
      
     for(int i=1;i<=n;i++)
		{
    	  for(int j=1;j<=i;j++)
    	  {
    		  System.out.print("* ");
    	  }
    	  System.out.println(" ");
			
		}
		for(int i=n-1;i>=1;i--)
		{
			for(int j=i;j>=1;j--)
			{
				System.out.print("* ");
			}
			System.out.println(" ");
		}
      scan.close();
      System.out.println("mme");}

}
