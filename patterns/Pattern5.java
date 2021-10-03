package com.core.java.patterns;

import java.util.Scanner;

public class Pattern5 {

	public static void main(String[] args)
	{
	  System.out.println("mms");
	  Scanner scan = new Scanner(System.in);
	  System.out.println("Enter the number of row:");
	  int n =scan.nextInt();
	  int t=1;
	  for(int i=0;i<n;i++)
	  {
		  for(int j=0;j<i;j++)
		  {
			  System.out.print( t+" ");
			  t=t+1;
		  }
		  System.out.println(" ");
	  }
	  scan.close();
	  System.out.println("mme");

	}

}
