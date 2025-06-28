import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.Scanner;

public class Sample{

    public static void main(String[] args) throws InterruptedException{
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\IdeaProjects\\SeleniumPractise\\chromedriver-win64\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://www.greenstechnologys.com/");

        WebElement courses = driver.findElement(By.linkText("COURSES"));

        Actions a=new Actions(driver);

        a.moveToElement(courses).perform();

        Thread.sleep(2000);

        WebElement devOpTraining =
                driver.findElement(By.xpath("//span[text()='DevOps Training']"));

        a.click(devOpTraining).perform();

    }}
