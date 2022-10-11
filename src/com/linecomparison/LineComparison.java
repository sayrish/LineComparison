package com.linecomparison;

import java.util.*;

public class LineComparison {

	 void lengthCalculate() {
	        try (Scanner sc = new Scanner(System.in)) {
				System.out.println("Enter x1 co-ordinate : ");
				int x1 = sc.nextInt();
				System.out.println("Enter x2 co-ordinate : ");
				int x2 = sc.nextInt();
				System.out.println("Enter y1 co-ordinate : ");
				int y1 = sc.nextInt();
				System.out.println("Enter y2 co-ordinate : ");
				int y2 = sc.nextInt();

				Double lenOfLineFirst = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
				System.out.println("Length of first line is " + lenOfLineFirst);
				
				System.out.println("Calculate length of second line");
				System.out.print("Enter x3 co-ordinate: ");
				int x3 = sc.nextInt();
				System.out.print("Enter x4 co-ordinate: ");
				int x4 = sc.nextInt();
				System.out.print("Enter y3 co-ordinate: ");
				int y3 = sc.nextInt();
				System.out.print("Enter y4 co-ordinate: ");
				int y4 = sc.nextInt();

				Double lenOfLineSecond = Math.sqrt(Math.pow((x4 - x3), 2) + Math.pow((y4 - y3), 2));
				System.out.println("Length of second line is " + lenOfLineSecond);

				if (lenOfLineFirst.equals(lenOfLineSecond))
				    System.out.println("Lines are equal");
				else
				    System.out.println("Lines are not equal");
			}
	    }

	
	
	public static void main(String[] args) {
		System.out.println("Welcome to Line Comparison Program using OOPS Concept");
		LineComparison lc = new LineComparison();
		lc.lengthCalculate();
	}
}
