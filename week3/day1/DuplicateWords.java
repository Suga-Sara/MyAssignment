package week3.day1;

import java.util.Arrays;

public class DuplicateWords {

	public static void main(String[] args) {
		/*
		 * Pseudo code 
		 
		 * a) Use the declared String text as input
			String text = "We learn java basics as part of java sessions in java week1";		
		 * b) Initialize an integer variable as count	  
		 * c) Split the String into array and iterate over it 
		 * d) Initialize another loop to check whether the word is there in the array
		 * e) if it is available then increase and count by 1. 
		 * f) if the count > 1 then replace the word as "" 
		 
		 * g) Displaying the String without duplicate words	
		 */
		String text="We learn java basics as part of java sessions in java week1";
		int count=0;
		int i;
        
	    String parts[]=text.split(" ");
	    
	        for(i=0;i<=parts.length-1;i++)
	  	    {
	    	  for(int j=i+1;j<=parts.length-1;j++)
	    	  {
	    		
	    	    	if(parts[i].equals(parts[j]))
	    	      	{
	    	        count=count+1;
	    	        parts[i]=parts[i].replace(parts[i],"");
	    	        }	    	    	    	    		       	
	          }
	    	       	    		
	    	}
	        for(int k=0;k<parts.length;k++)
			System.out.println(parts[k]);
	    
		
		

	}

}
