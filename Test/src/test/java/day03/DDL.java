package day03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DDL {
	ChromeDriver driver=new ChromeDriver();
	
	@BeforeMethod
	public void Test(){
		WebDriverManager.chromedriver().setup();
		driver.get("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html");
		driver.manage().window().maximize();
		
	}
  @org.testng.annotations.Test
public void TestCase1(){
	WebElement hh = driver.findElement(By.id("ide"));
	
	Select multi=new Select(hh);
	//by index ,by visible text 
	multi.selectByValue("ij");
	multi.selectByValue("vs");
	multi.selectByValue("nb");
	
	multi.deselectByValue("nb");
	}
 @AfterMethod	
 
 public void Exit() {
	 
	 driver.quit();
 }
	}


