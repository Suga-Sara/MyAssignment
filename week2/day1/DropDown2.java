package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDown2 {

	public static void main(String[] args) throws InterruptedException {
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
		
		WebElement source=dr.findElement(By.id("createLeadForm_dataSourceId"));
		Select ob1=new Select(source);
		ob1.selectByIndex(4);
		
		WebElement compaign=dr.findElement(By.id("createLeadForm_marketingCampaignId"));
		Select ob2=new Select(compaign);
		ob2.selectByValue("CATRQ_CARNDRIVER");
		
		WebElement industry=dr.findElement(By.id("createLeadForm_industryEnumId"));
		Select ob3=new Select(industry);
		ob3.selectByVisibleText("Distribution");
		Thread.sleep(3000);
		ob3.selectByValue("IND_FINANCE");
		Thread.sleep(3000);
		ob3.selectByIndex(7);
		
		WebElement owner=dr.findElement(By.id("createLeadForm_ownershipEnumId"));
		Select ob4=new Select(owner);
		ob4.selectByIndex(6);
		
		
		WebElement currency=dr.findElement(By.id("createLeadForm_currencyUomId"));
		Select ob5=new Select(currency);
		ob5.selectByValue("EUR");
		
		WebElement country=dr.findElement(By.id("createLeadForm_generalCountryGeoId"));
		Select ob6=new Select(country);
		ob6.selectByVisibleText("British Indian Ocean Territory");
		dr.close();
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
