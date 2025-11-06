package Day06;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LearnDragDrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	ChromeDriver driver =new ChromeDriver();
	driver.get("https://jqueryui.com/droppable/");
	driver.manage().window().maximize();
	driver.switchTo().frame(0); //للدخول على الfarme
	WebElement draggable = driver.findElement(By.id("draggable"));
	
	WebElement droppable = driver.findElement(By.id("droppable"));
	
	Actions build =new Actions(driver);
	
	build.dragAndDrop(draggable, droppable).perform();

	}

}
