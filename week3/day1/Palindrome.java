package week3.day1;

import java.util.Arrays;

public class Palindrome {

	public static void main(String[] args) {
		/*
		 * Pseudo Code
		
		 * a) Declare A String value as"madam"
		 
		 * b) Declare another String rev value as ""
		 * c) Iterate over the String in reverse order
		 * d) Add the char into rev
		 * e) Compare the original String with the reversed String, if it is same then print palinDrome 
		 
		 * Hint: Use .equals or .equalsIgnoreCase when you compare a String 
		 */
		
		String string1="Madam";
		
		String revString="";
		
		char[] chatArray=string1.toCharArray();
		
		String s=Arrays.toString(chatArray);
	 
		for(int i=chatArray.length-1;i>=0;i--)
			{
			revString=revString+chatArray[i];
			
			}
		if(string1.equalsIgnoreCase(revString))
		{
			System.out.println("The String is Palindrome");
			
			}
		else
		{
			System.out.println("The String is not Palindrome");
		}
			
			
			}

}

