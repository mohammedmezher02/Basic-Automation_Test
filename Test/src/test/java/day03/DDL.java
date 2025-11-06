package day03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DDL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	WebDriverManager.chromedriver().setup();
	ChromeDriver driver=new ChromeDriver();
//	driver.get("https://katalon-demo-cura.herokuapp.com/");
//	driver.manage().window().maximize();
//	driver.findElement(By.id("btn-make-appointment")).click();
//	driver.findElement(By.name("username")).sendKeys("John Doe");
//	driver.findElement(By.id("txt-password")).sendKeys("ThisIsNotAPassword");
//	driver.findElement(By.id("btn-login")).click();
//	
//	
//	WebElement hh = driver.findElement(By.id("combo_facility"));//ctrl 2
//	Select health =new Select(hh);
//	//health.selectByIndex(1);
//	//health.selectByVisibleText("Seoul CURA Healthcare Center");
//	health.selectByValue("Hongkong CURA Healthcare Center");
//	
//	
	driver.get("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html");
	driver.manage().window().maximize();
	
	WebElement hh = driver.findElement(By.id("ide"));
	
	Select multi=new Select(hh);
	//by index ,by visible text 
	multi.selectByValue("ij");
	multi.selectByValue("vs");
	multi.selectByValue("nb");
	
	multi.deselectByValue("nb");
	
	
	
	
	
	}

}
