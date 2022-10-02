package week1.day1;

public class Chrome 
{
	public void getName(String s)
	{
		System.out.println(s);
	}
	public void printName()
	{
		String s = "Test";
		System.out.println("The given string name is:   "+ s);
		
	}
	

	public static void main(String[] args) 
	{
		
		Chrome c=new Chrome();
		c.getName("Leaf");
		c.printName();	

	}

}
