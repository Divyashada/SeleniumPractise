import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class loginRegister {

    public static void main(String[] args) throws InterruptedException {

        // Set the path to chromedriver executable
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\IdeaProjects\\SeleniumPractise\\chromedriver-win64\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://qa-practice.netlify.app/register");

        driver.manage().window().maximize();

        WebElement a = driver.findElement(By.id("firstName"));

        WebElement c = driver.findElement(By.id("lastName"));
        c.sendKeys("shada");

        WebElement D = driver.findElement(By.id("phone"));
        D.sendKeys("12345678");



//        WebElement b = driver.findElement(By.partialLinkText("Forgot "));
//        b.click();
      a.sendKeys("Divyaa");
      a.clear();
        a.sendKeys("Divya");

//        Thread.sleep(3000);


//        Thread.sleep(3000);

//        driver.close();
    }
}
