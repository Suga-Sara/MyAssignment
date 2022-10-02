package week1.day1;

public class Mobile 
{

	   public void makeCall()
	   {
		   String mobileModel="Apple 14";
		   float mobileWeight= 1.2f;
		   System.out.println("Mobile model="+mobileModel);
		   System.out.println("Mobile Weight="+mobileWeight);
	   }
	   public void sendMsg()
	   {
		   boolean isFullCharged=true;
		   int mobileCost=7000;
		   System.out.println("If it's fully charged return TRUE=" +isFullCharged);
		   System.out.println("Mobile Cost="+mobileCost);
		   
	   }
	   
       public static void main(String[] args) 
		{
    	   Mobile m=new Mobile();
    	   System.out.println("THIS IS MY MOBILE");
    	   m.makeCall();
    	   m.sendMsg();
    	    
		}

	}


