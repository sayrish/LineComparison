package com.linecomparison;

import java.util.*;

public class LineComparison {
	static double lenOfLineFirst, lenOfLineSecond, lenOfLine;
	static int x1, x2, y1, y2, value;

	void coordinates() {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter x1 co-ordinate : ");
			int x1 = sc.nextInt();
			System.out.println("Enter x2 co-ordinate : ");
			int x2 = sc.nextInt();
			System.out.println("Enter y1 co-ordinate : ");
			int y1 = sc.nextInt();
			System.out.println("Enter y2 co-ordinate : ");
			int y2 = sc.nextInt();

			lenOfLine = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
		}

	}

	void getLength() {
		coordinates();
		lenOfLineFirst = lenOfLine;
		System.out.println("Enter Values Again for Second Line: ");
		coordinates();
		lenOfLineSecond = lenOfLine;
		System.out.println("Length of Line1: " + lenOfLineFirst);
		System.out.println("Length of Line2: " + lenOfLineSecond);
	}
	
	void compareLines()
	{
		//value = lenOfLineFirst.compareTo(lenOfLineSecond);
		if(lenOfLineFirst == lenOfLineSecond)
			System.out.println("both lines are Equal.");
		else if(lenOfLineFirst > lenOfLineSecond)
			System.out.println("Line1 is greater than Line2.");
		else
			System.out.println("Line1 is smaller than Line2.");
	}
	
}
