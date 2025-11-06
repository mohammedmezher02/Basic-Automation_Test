package Day06;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyBoard {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    ChromeDriver driver =new ChromeDriver();
    driver.get("https://jqueryui.com/selectable/");
    driver.manage().window().maximize();
    driver.switchTo().frame(0);
    WebElement element1 = driver.findElement(By.xpath("//li[text()=\"Item 1\"]"));//ctrl+v+f 
    WebElement element2 = driver.findElement(By.xpath("//li[text()=\"Item 2\"]"));
    WebElement element3= driver.findElement(By.xpath("//li[text()=\"Item 3\"]"));
    Actions builder =new Actions(driver);
    builder.keyDown(Keys.CONTROL)
    .click(element1)
    .click(element2)
    .click(element3)
    .perform();
    
	}

}
