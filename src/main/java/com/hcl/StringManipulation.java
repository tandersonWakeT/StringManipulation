package com.hcl;

import java.util.StringTokenizer;

public class StringManipulation {

	public static void main(String[] args) {

		// Turn both to full name separated by spaces
		String name1 = "Tristan:Samuel:Anderson";
		String name2 = "Tristan_Samuel_Anderson";

		// Turn to day: month: year:
		String date = "22/08/2022";

		// Trivial data string
		String accNum = "12554";
		String location = "Cary";

		// Breaks n1 into tokens and appends them to the String builder w/ a space
		StringTokenizer n1 = new StringTokenizer(name1, ":");
		StringBuilder n1Build = new StringBuilder();

		System.out.println("Removing ':'");
		while (n1.hasMoreTokens()) {
			n1Build.append(n1.nextToken());
			if (n1.hasMoreTokens()) {
				n1Build.append(" ");
			}
		}

		System.out.println("Old: " + name1);
		System.out.println("New: " + n1Build + "\n");

		// Breaks n2 into tokens and appends them to the String builder w/ a space
		StringTokenizer n2 = new StringTokenizer(name2, "_");
		StringBuilder n2Build = new StringBuilder();

		System.out.println("Removing '_' adding ':'");
		while (n2.hasMoreTokens()) {
			n2Build.append(n2.nextToken());
			if (n2.hasMoreTokens()) {
				n2Build.append(" ");
			}
		}
		n2Build.replace(7, 8, ":");
		n2Build.replace(14, 15, ":");

		System.out.println("Old: " + name2);
		System.out.println("New: " + n2Build + "\n");

		// Separates the date specifying the day, month, year
		StringTokenizer d1 = new StringTokenizer(date, "/");

		System.out.println("Breaking up the date");
		System.out.println("Original formate: " + date);
		System.out.println("Day: " + d1.nextToken());
		System.out.println("Month: " + d1.nextToken());
		System.out.println("Year: " + d1.nextToken() + "\n");

		// Trivial data appended to end of name
		System.out.println("Appending trivial data to name");
		n2Build.append(" " + accNum + " ");
		n2Build.append(location);
		System.out.println(n2Build);

	}
}
