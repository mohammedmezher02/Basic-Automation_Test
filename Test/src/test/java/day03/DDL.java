package day03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DDL {
    ChromeDriver driver;

    @BeforeMethod
    public void setup() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html");
        driver.manage().window().maximize();
    }

    @Test
    public void TestCase1() {
        WebElement hh = driver.findElement(By.id("ide"));
        Select multi = new Select(hh);

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
