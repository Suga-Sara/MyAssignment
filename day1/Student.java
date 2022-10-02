package week1.day1;

public class Student
{
	//String sname;
	//int rno;
	//String clgname;
	//int mrkscord;
	
	public void example(String a,int b,String c,int d)
	{
		//System.out.println("Student Name:"+sname);
		//System.out.println("Student Rollno:"+rno);
		//System.out.println("college name:"+clgname);
		//System.out.println("Mark scored:"+mrkscord);		
		
		System.out.println("Student Name:"+a);
		System.out.println("Student Rollno:"+b);
		System.out.println("college name:"+c);
		System.out.println("Mark scored:"+d);			
		
	}
	

	public static void main(String[] args)
	{
		Student ob=new Student();
		ob.example("Suga",1100,"Poondi",80);	

	}

}
