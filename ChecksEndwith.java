package com.exam;

public class ChecksEndwith {

	public static void main(String[] args)
	{
		String str1 = "Leg Exercises";
		String str2 = "Leg Exercise";
 
		String e = "se";
		boolean ends1 = str1.endsWith(e);
		boolean ends2 = str2.endsWith(e);
		System.out.println("'" + str1 + "' ends with " +"'" + e + "' ? " + ends1);
		System.out.println("'" + str2 + "' ends with " + "'" + e + "' ? " + ends2);
	}
}
