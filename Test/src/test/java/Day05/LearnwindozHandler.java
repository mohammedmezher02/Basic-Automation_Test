package Day05;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnwindozHandler {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.w3schools.com/js/js_popup.asp");
		driver.manage().window().maximize();
         driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
         String title = driver.getTitle();
         System.out.println(title);
         driver.findElement(By.linkText("Try it Yourself »")).click();
         String currentUrl = driver.getCurrentUrl();
         System.out.println(currentUrl);
         
         //getWindowHandle()>>>>> return referenc number for activ active window
//         String windowHandle = driver.getWindowHandle();
//         System.out.println(windowHandle);
         
         
         
         //getWindowHandles()
         
         Set<String> windowHandles = driver.getWindowHandles();
         List<String>allwin =new ArrayList<String>(windowHandles);
         driver.switchTo().window(allwin.get(1));
         String title2 = driver.getTitle();
         System.out.println(title2);
         
	}

}
