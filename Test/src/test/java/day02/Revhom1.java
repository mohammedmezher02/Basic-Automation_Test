package day02;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Revhom1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver =new ChromeDriver();
		driver.get("https://katalon-demo-cura.herokuapp.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("btn-make-appointment"));
		driver.findElement(By.name("username")).sendKeys("John Doe");//send key to email and pass and inputs
		driver.findElement(By.id("txt-password")).sendKeys("ThisIsNotAPassword");
		driver.findElement(By.id("btn-login")).click();
		//wait 10s
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.id("txt_visit_date")).sendKeys("02/09/2025");
		driver.findElement(By.id("btn-book-appointment")).click();
		driver.findElement(By.tagName("h2")).getText();



	}

}
