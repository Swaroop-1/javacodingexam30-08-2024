package com.exam;

public class Canonical {

	public static void main(String[] args)
	{
		String str1 = "Swaroop Developer";
		String str2 = new StringBuffer("Swaroop").append(" Developer").toString();
		String str3 = str2.intern();
 
		System.out.println("str1 == str2 ? " + (str1 == str2));
		System.out.println("str1 == str3 ? " + (str1 == str3));
	}
}
