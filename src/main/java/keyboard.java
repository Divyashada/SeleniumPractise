import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class keyboard {

    public static void main(String[] args) throws InterruptedException{

        System.setProperty("webdriver.edge.driver","C:\\Users\\User\\IdeaProjects\\SeleniumPractise\\geckodriver-v0.36.0-win-aarch64.zip");

        WebDriver driver = new FirefoxDriver();

        driver.get("https://adactin.com/HotelApp/index.php");

        driver.manage().window().maximize();

        WebElement x = driver.findElement(By.id("username"));

        x.sendKeys("Divya");

        WebElement x1 = driver.findElement(By.id("password"));

        x1.sendKeys("sdfgh");





    }
}
