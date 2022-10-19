package week3.day1;

public class Count {

	public static void main(String[] args) {
		String str="Testleaf";
		char val='e';
		int count=0;
		char[] charArg =str.toCharArray();
		
		for(int i=0;i<=str.length();i++)
		{
			if(str.charAt(i)==val)
			{
				count++;
				System.out.println("The character "+val+"is presented in "+count);
			}
			
		}
		

	}

}
