import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.List;

public class links {

    public static void main(String[] args) {

        System.setProperty("webdriver.edge.driver","C:\\Users\\User\\IdeaProjects\\SeleniumPractise\\geckodriver-v0.36.0-win-aarch64.zip");

        WebDriver driver = new FirefoxDriver();

        driver.get("https://www.google.com/");

        driver.manage().window().maximize();

        List<WebElement> x = driver.findElements(By.tagName("a"));

        System.out.println(x.size());

        for (WebElement x1 : x){
            System.out.println(x1.getAttribute("href"));


        }

    }
}
