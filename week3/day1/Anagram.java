package week3.day1;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		/*
		 * Pseudo Code
		  
		 *Declare a String 
			String text1 = "stops";
		 *Declare another String
			String text2 = "potss"; 
		 * a) Check length of the strings are same then (Use A Condition)
		 * b) Convert both Strings in to characters
		 * c) Sort Both the arrays
		 * d) Check both the arrays has same value
		 * 
		 */
		String text1 = "stops";
		String text2 = "potss"; 
		
		if(text1.length()==text2.length())
		{
			System.out.println("the length is same");
		}
		else
		
		System.out.println("the length is not same");
		
		char[] ch1=text1.toCharArray();
		String chh1=Arrays.toString(ch1);
		
		char[] ch2=text2.toCharArray();
		String chh2=Arrays.toString(ch2);
		
		System.out.println("Sorted text1 Array::"+chh1);
		//char[] a1=Arrays.sort(chh1);
		
		System.out.println(chh2);
		
		
		
	}

}
