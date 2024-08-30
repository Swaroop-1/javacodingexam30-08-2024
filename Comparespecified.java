package com.exam;

public class Comparespecified {

	public static void main(String[] args)
	{
		String str1 = "Software enginner";
		String str2 = "Computer Education";
		CharSequence cs = "Swaroop";
		System.out.println("Comparing '"+str1+"'"+" and '"+cs+"' : " + str1.contentEquals(cs));
		System.out.println("Comparing '"+str2+"'"+" and '"+cs+"' :"+ str2.contentEquals(cs));
	}
}