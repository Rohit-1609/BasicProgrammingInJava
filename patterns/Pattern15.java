package com.core.java.patterns;

import java.util.Scanner;

public class Pattern15 {

	public static void main(String[] args)
	{
		System.out.println("mms");
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number of rows:");
		int n = scan.nextInt();
		int space = (n * 2) + 1;
		int c = 1;
		for (int i = 1; c <= n; i++) {
			if (i % 2 != 0) {
				for (int j = 1; j < i; j++) {
					System.out.println("*");
				}
				for (int s = space; s >= 1; s--) {
					if (c == n && s == 1)
						break;

					System.out.println(" ");
				}
				for (int k = 1; k <= i; k++) {
					if (c == n && k == n + 1)
						break;

					System.out.println("*");
				}
				System.out.println("");
				space -= n;
				++c;
			}
		}
		scan.close();
		System.out.println("mme");
	}

}
