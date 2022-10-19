package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MyFirstSelenium {

	public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	ChromeDriver dr=new ChromeDriver();
	dr.get("http://leaftaps.com/opentaps/control/main");
	
	//dr.findElement(By.xpath("username")).sendKeys("demosalesManager");
	
	
	
	//dr.findElement(By.xpath("(//input[@class='inputLogin'])[2]")).sendKeys("crmsa");
	dr.findElement(By.id("username")).sendKeys("demosalesManager");
	dr.findElement(By.name("PASSWORD")).sendKeys("crmsfa");
	
	
	dr.findElement(By.className("decorativeSubmit")).click();
	dr.findElement(By.linkText("CRM/SFA"));
	
	
   String title=dr.getTitle();
	System.out.println(title);
	}

}




