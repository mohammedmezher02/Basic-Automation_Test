package day04;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TackScreen {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://katalon-demo-cura.herokuapp.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("btn-make-appointment")).click();
		//Take screen 
		//Take Screenshot
		File src = driver.getScreenshotAs(OutputType.FILE);//this is after the CTRL +2 
		File des = new File(".\\Screenshot\\1.png");
		
		//we added to the path "\\ image" to create a new file inside the project
		//between the brackets instead of copying the path full we typed "." which points at the current project
		FileUtils.copyFile(src, des);//there was an error but we hovered the mouse over it then pressed throw declaration 
		//after running the code refresh the whole project so that the image folder will appear 
		

	}

}
