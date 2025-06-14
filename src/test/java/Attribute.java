import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Attribute {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\IdeaProjects\\SeleniumPractise\\chromedriver-win64\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("http:/www.adactin.com/HotelApp/index.php");

        driver.manage().window().maximize();

        driver.findElement(By.id("username")).sendKeys("Divya");
        driver.findElement(By.id("password")).sendKeys("Diya123");

        String s = driver.findElement(By.id("username")).getAttribute("value");

        String s1 = driver.findElement(By.id("password")).getAttribute("value");

        System.out.println(s);
        System.out.println(s1);




    }
}
