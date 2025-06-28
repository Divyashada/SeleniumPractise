import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class coffee {

    public static void main(String[] args) {

        // Set the path to chromedriver executable
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\IdeaProjects\\SeleniumPractise\\chromedriver-win64\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("http://ironspider.ca/forms/dropdowns.htm");
        WebElement w = driver.findElement(By.name("Tea"));
        Select s=new Select(w);
        List<WebElement> o = s.getOptions();
        for (WebElement x:o) {
            System.out.println(x.getAttribute("value"));
}}}
