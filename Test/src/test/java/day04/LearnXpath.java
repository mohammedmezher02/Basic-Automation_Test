package day04;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnXpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://katalon-demo-cura.herokuapp.com/");
		driver.manage().window().maximize();
		
		//driver.findElement(By.xpath("//a[@id=\"btn-make-appointment\"]")).click();// att xpath
		//driver.findElement(By.xpath("//a[text()='Make Appointment']")).click(); //textbase xpath  
		//driver.findElement(By.xpath("//a[contains(@id,\"btn-make-appointment\")]")).click();//att xpath 
		//driver.findElement(By.xpath("//a[contains(text(),'Make Appointment')]")).click();text xpath 
		
		driver.findElement(By.xpath("//a[starts-with(@id,\"btn-make\")]")).click();
		
		
	}

}
