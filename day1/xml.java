package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class xml {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver dr=new ChromeDriver();		
		dr.get("http://leaftaps.com/opentaps/control/main");
		dr.manage().window().maximize();
		
		dr.findElement(By.id("username")).sendKeys("demosalesManager");
		dr.findElement(By.name("PASSWORD")).sendKeys("crmsfa");
		dr.findElement(By.className("decorativeSubmit")).click();
		
		
		
		dr.findElement(By.linkText("CRM/SFA")).click();
		
		
		dr.findElement(By.linkText("Leads")).click();
		
		dr.findElement(By.linkText("Create Lead")).click();
		
		dr.findElement(By.id("createLeadForm_companyName")).sendKeys("ACCENTURE");
		dr.findElement(By.id("createLeadForm_firstName")).sendKeys("AAAA");
		dr.findElement(By.id("createLeadForm_lastName")).sendKeys("BBBB");
		
		//*[@id="ext-gen854"]
	}

}


