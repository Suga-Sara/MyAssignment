package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DeleteLead {

	public static void main(String[] args) throws InterruptedException {
		/* Delete Lead:
		1	Launch the browser
		2	Enter the username
		3	Enter the password
		4	Click Login
		5	Click crm/sfa link
		6	Click Leads link
		7	Click Find leads
		8	Click on Phone
		9	Enter phone number
		10	Click find leads button
		11	Capture lead ID of First Resulting lead
		12	Click First Resulting lead
		13	Click Delete
		14	Click Find leads
		15	Enter captured lead ID
		16	Click find leads button
		17	Verify message "No records to display" in the Lead List. This message confirms the successful deletion
		18	Close the browser (Do not log out)*/
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver dr=new ChromeDriver();		
		dr.get("http://leaftaps.com/opentaps/control/main");
		dr.manage().window().maximize();
		dr.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		
		WebElement userName=dr.findElement(By.xpath("//input[@id='username']"));
		userName.sendKeys("demosalesManager");
		
		WebElement passWord=dr.findElement(By.xpath("//input[@type='password']"));
		passWord.sendKeys("crmsfa");
		
		dr.findElement(By.xpath("//input[@type='submit']")).click();		
		
		
		dr.findElement(By.xpath("//div[@id='label']/a")).click();
		
		dr.findElement(By.xpath("//a[text()='Leads']")).click();
		
		//To call create lead 
				dr.findElement(By.linkText("Create Lead")).click();		
				
				//send the value for company Name field		
				WebElement companyName = dr.findElement(By.id("createLeadForm_companyName"));
				companyName.sendKeys("Accenture");
				
				//send the value for First name field 	
				WebElement firstName = dr.findElement(By.id("createLeadForm_firstName"));
				firstName.sendKeys("Suganthi");
				
				//send the value for Last name field 
				WebElement last = dr.findElement(By.id("createLeadForm_lastName"));
				last.sendKeys("Saravana");		
				
				
				//send phoneNo
				WebElement phoneNo = dr.findElement(By.xpath("(//input[@name='primaryPhoneNumber'])[4]"));
				phoneNo.sendKeys("9164258525");	
				
				
				//Click on Create button
				dr.findElement(By.className("smallSubmit")).click();
				
				System.out.println("created");
				
				
				
		
		dr.findElement(By.xpath("//a[text()='Find Leads']")).click();
		
		dr.findElement(By.xpath("//span[text()='Phone']")).click();
		
		WebElement phoneNumber=dr.findElement(By.xpath("//input[@name='phoneNumber']"));
		phoneNumber.sendKeys("9164258525");
		Thread.sleep(3000);
		dr.findElement(By.xpath("//button[text()='Find Leads']")).click();
		
		//To click First Resulting lead
		Thread.sleep(2000);
		dr.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/child::a[@class='linktext'])[1]")).click();
		
		dr.findElement(By.xpath("//a[text()='Delete']")).click();
		dr.findElement(By.xpath("//a[text()='Find Leads']")).click();
		
		WebElement leadId = dr.findElement(By.xpath("//input[@name='id']"));
		leadId.sendKeys("12224");	
		
		dr.findElement(By.xpath("//button[text()='Find Leads']")).click();
		dr.close();
		
		
		
		
			
		

	}

}
