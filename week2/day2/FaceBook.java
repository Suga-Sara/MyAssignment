package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FaceBook {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver dr=new ChromeDriver();		
		dr.get("https://en-gb.facebook.com/");
		dr.manage().window().maximize();
		dr.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		dr.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();
		
		WebElement firstName = dr.findElement(By.xpath("//input[@name='firstname']"));
		firstName.sendKeys("Suganthi");
		
		WebElement lastName = dr.findElement(By.xpath("//input[@name='lastname']"));
		lastName.sendKeys("Saravana");
		
		
		WebElement phoneNo = dr.findElement(By.xpath("(//input[@data-type='text'])[3]"));	
		phoneNo.sendKeys("9167086381");		
		
		WebElement passWord = dr.findElement(By.xpath("//input[@id='password_step_input']"));
		passWord.sendKeys("sksrkhs4");		
		
			
		WebElement day=dr.findElement(By.xpath("//select[@title='Day']"));
		Select ob1=new Select(day);
		ob1.selectByIndex(30);
			
		
		WebElement month=dr.findElement(By.xpath("//select[@title='Month']"));
		Select ob2=new Select(month);
		ob2.selectByValue("3");
		
			
		WebElement year=dr.findElement(By.xpath("//select[@title='Year']"));		
		Select ob3=new Select(year);
		ob3.selectByVisibleText("1987");
		
		
		dr.findElement(By.xpath("//input[@name='sex']")).click();
	
		
		dr.findElement(By.xpath("//button[@name='websubmit']")).click();
	
		
		String title2=dr.getCurrentUrl();
		System.out.println(title2);		
		
		
		
	}

}
