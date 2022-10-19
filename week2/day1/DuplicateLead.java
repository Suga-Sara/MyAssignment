package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DuplicateLead {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver dr=new ChromeDriver();
		dr.get("http://leaftaps.com/opentaps/control/main");
		
		
		dr.findElement(By.id("username")).sendKeys("demosalesManager");
		dr.findElement(By.name("PASSWORD")).sendKeys("crmsfa");
		
		dr.findElement(By.className("decorativeSubmit")).click();
		dr.findElement(By.linkText("CRM/SFA")).click();
		
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
		
		
		//send the value for Local(First name) field 		
		dr.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Hananya");
		
		
		
		//send the value for Department  field 		
		dr.findElement(By.id("createLeadForm_departmentName")).sendKeys("Software");
		
		//send the value for Description  field 		
		dr.findElement(By.name("description")).sendKeys("welcome");
		
		//send the value for E mail id  field 		
		dr.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("ssk_rsn@hotmail.com");		
		
		//Click on Create button
		dr.findElement(By.className("smallSubmit")).click();
		
		//To get the Title of the page		
		String title2=dr.getTitle();
		System.out.println(title2);
		
	// To click Duplicate Lead
	dr.findElement(By.linkText("Duplicate Lead")).click();
		
		
		//To get the Duplicate Lead Title of the page		
		String title3=dr.getTitle();
		System.out.println(title3);
		
		// To clear the Company name field and enter new company name field
	    companyName = dr.findElement(By.id("createLeadForm_companyName"));
		companyName.clear();
		companyName.sendKeys("TCS");
		
		// To clear First name Field and enter new First name
	    firstName = dr.findElement(By.id("createLeadForm_firstName"));
	    firstName.clear();
		firstName.sendKeys("Rushanth");
		
		
		//To click create lead button after changing the neww compny name and First name Fiels
		dr.findElement(By.className("smallSubmit")).click();
		
		
		String title4=dr.getTitle();
		System.out.println(title4);	
				

	}

}
