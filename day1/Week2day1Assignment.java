package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Week2day1Assignment {

	public static void main(String[] args) {
		
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver dr=new ChromeDriver();
		dr.get("http://leaftaps.com/opentaps/control/main");
		
		
		dr.findElement(By.id("username")).sendKeys("demosalesManager");
		dr.findElement(By.name("PASSWORD")).sendKeys("crmsfa");
		
		dr.findElement(By.className("decorativeSubmit"));
		dr.findElement(By.linkText("CRM/SFA")).click();
		
		dr.findElement(By.linkText("Leads")).click();
		
		
		dr.findElement(By.className("selected")).click();
		
		dr.findElement(By.id("createLeadForm_companyName"));//.sendKeys("Accenture");
		dr.findElement(By.className("inputBox"));//.sendKeys("Suganthi");
		dr.findElement(By.name("lastName"));//.sendKeys("Saravana");
		dr.findElement(By.id("createLeadForm_firstNameLocal"));
		dr.findElement(By.className("text"));//
		dr.findElement(By.name("description"));
		dr.findElement(By.className("inputBox"));
		
		
		
		
	}

}
