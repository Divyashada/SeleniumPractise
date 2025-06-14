import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;


public class login {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.edge.driver","C:\\Users\\User\\IdeaProjects\\SeleniumPractise\\geckodriver-v0.36.0-win-aarch64.zip");
        WebDriver driver = new ChromeDriver();

        driver.get("https://adactin.com/HotelApp/index.php");

        driver.findElement(By.id("username")).sendKeys("Divya");
        driver.findElement(By.id("password")).sendKeys("holiday");
        driver.findElement(By.id("login")).click();

    }
}
