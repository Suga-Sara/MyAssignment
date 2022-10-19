package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetXpath {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver dr=new ChromeDriver();
		dr.get("http://leaftaps.com/opentaps/control/main");
		
		
		dr.findElement(By.xpath("//input[@type='text']")).sendKeys("demosalesManager");
		dr.findElement(By.xpath("//input[@type='password']")).sendKeys("crmsfa");
		
		
		dr.findElement(By.xpath("//input[@type='submit']")).click();
		dr.findElement(By.xpath(""));
	
		
		
	   /*String title=dr.getTitle();
		System.out.println(title);*/

	}

}
