package day02;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Hw {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://katalon-demo-cura.herokuapp.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("btn-make-appointment")).click();
		driver.findElement(By.name("username")).sendKeys("John Doe");
		driver.findElement(By.id("txt-password")).sendKeys("ThisIsNotAPassword");
		driver.findElement(By.id("btn-login")).click();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.findElement(By.id("txt_visit_date")).sendKeys("02/09/2025");
		driver.findElement(By.id("btn-book-appointment")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

	    String text1 = driver.findElement(By.tagName("h2")).getText();
	    System.out.println(text1);
	    


	    
	}

}
