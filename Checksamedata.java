package com.exam;

public class Checksamedata {
	public static void main(String[] args)
	{
		String s1 = "Swaroop";
		String s2 = "Priyanka Mohan";
		String s3 = "Swaroop";
		boolean equ1 = s1.equals(s2);
		boolean equ2 = s1.equals(s3);
		System.out.println("'" + s1 + "' equals '" +s2 + "' ? " + equ1);
		System.out.println("'" + s1 + "' equals '" +s3 + "' ? " + equ2);
	}
}
