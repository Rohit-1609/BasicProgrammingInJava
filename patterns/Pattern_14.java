package com.core.java.patterns;

import java.util.Scanner;

public class Pattern_14 {

	public static void main(String[] args) 
	{
		System.out.println("mms");
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the no of rows: ");
		int n = scan.nextInt();
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if (((i + j<=n+1 ) && (i >= j)) || ((i + j >= n+1) && (i <= j))) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}

			System.out.println();
		}
		scan.close();
		System.out.println("mme");
	}

}
