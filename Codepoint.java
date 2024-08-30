package com.exam;

public class Codepoint {
	public static void main(String[] args)
	{
		String str = "Swaroop Priyanka";
		System.out.println("Given String : " + str);
		int c = str.codePointCount(1, 10);
		System.out.println("Codepoint count : " + c);
	}
}
