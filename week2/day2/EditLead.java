package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditLead {

	public static void main(String[] args) throws InterruptedException {
		
		
		/* * 1	Launch the browser
		* 2	Enter the username
		* 3	Enter the password
		* 4	Click Login
		* 5	Click crm/sfa link
		* 6	Click Leads link
		* 7	Click Find leads
		* 8	Enter first name
		* 9	Click Find leads button
		* 10 Click on first resulting lead
		* 11 Verify title of the page
		* 12 Click Edit
		* 13 Change the company name
		* 14 Click Update
		* 15 Confirm the changed name appears
		* 16 Close the browser (Do not log out)*/
		
		
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
		
		dr.findElement(By.xpath("//a[text()='Find Leads']")).click();
		
		WebElement firstName=dr.findElement(By.xpath("(//input[@name='firstName'])[3]"));
		firstName.sendKeys("Suganthi");
		
		dr.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(3000);
		
		WebElement clickId=dr.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/child::a[@class='linktext'])[1]"));
		clickId.click();
		String gettitle=dr.getTitle();
		System.out.println("The title of the page is====="+gettitle);
		
		
		dr.findElement(By.xpath("//a[@class='subMenuButton'][3]")).click();
		
		String gettitle1=dr.getTitle();
		System.out.println("The title of the page is====="+gettitle1);
		
	
		
		dr.findElement(By.xpath("//input[@id='updateLeadForm_companyName']")).clear();
		
		WebElement newName=dr.findElement(By.xpath("//input[@id='updateLeadForm_companyName']"));
		newName.sendKeys("Mizbha Publish");
		
		
	    dr.findElement(By.xpath("//input[@value='Update']")).click(); 
		dr.close();
		
	}

}
