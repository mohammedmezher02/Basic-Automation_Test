package day02;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class basic1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver= new ChromeDriver();
		//open url 
		
	//	driver.navigate().to("https://katalon-demo-cura.herokuapp.com/");
		
         //run url in chrome
		
		// driver.navigate().back();
		
		//open url method tool 
		
		driver.get("https://katalon-demo-cura.herokuapp.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("btn-make-appointment")).click();
		driver.findElement(By.name("username")).sendKeys("John Doe");
		driver.findElement(By.id("txt-password")).sendKeys("ThisIsNotAPassword");
		driver.findElement(By.id("btn-login")).click();
		//wait 
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//driver.findElement(By.linkText("info@katalon.com")).click();
		//partail linke text used when numbers whith textlink 
		
		//driver.findElement(By.partialLinkText("info@")).click();
		
		String text = driver.findElement(By.tagName("h2")).getText();
		System.out.println(text);
	
	
		driver.close();
		
		
		
		
		
		
		
		
	}

}
