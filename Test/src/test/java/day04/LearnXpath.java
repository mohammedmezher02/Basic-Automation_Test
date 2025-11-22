package day04;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnXpath {
	ChromeDriver driver= new ChromeDriver();
@BeforeMethod
	public void Testcase() {
	WebDriverManager.chromedriver().setup();		
	driver.get("https://katalon-demo-cura.herokuapp.com/");
	driver.manage().window().maximize();
	}
	@Test
	
	public void Test1() {
		
		//driver.findElement(By.xpath("//a[@id=\"btn-make-appointment\"]")).click();// att xpath
		//driver.findElement(By.xpath("//a[text()='Make Appointment']")).click(); //textbase xpath  
		//driver.findElement(By.xpath("//a[contains(@id,\"btn-make-appointment\")]")).click();//att xpath 
		//driver.findElement(By.xpath("//a[contains(text(),'Make Appointment')]")).click();text xpath 
		
		driver.findElement(By.xpath("//a[starts-with(@id,\"btn-make\")]")).click();
	}
	
	@AfterMethod
public void Exit() {
		
		driver.quit();
	}

	
	
	
	

		
		
	}


