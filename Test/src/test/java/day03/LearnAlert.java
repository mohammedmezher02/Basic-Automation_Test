package day03;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnAlert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Alerts.html");
        driver.manage().window().maximize();
        //driver.findElement(By.id("OKTab")).click();
       // simple alert
//       String text = driver.switchTo().alert().getText();
//       System.out.println(text);
//       driver.switchTo().alert().accept();
        
        //confirmation alert  
//        driver.findElement(By.linkText("Alert with OK & Cancel")).click();
//        driver.findElement(By.id("CancelTab")).click();
//        driver.switchTo().alert().dismiss();
        
//        promot alert 
//        driver.findElement(By.partialLinkText("Alert with Textbox")).click();
//        driver.findElement(By.id("Textbox")).click();
//        driver.switchTo().alert().sendKeys("mohammed");
//        driver.switchTo().alert().accept();
        
	}

}
