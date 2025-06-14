import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FB {

    public static void main(String[] args) {
        System.setProperty("webdriver.edge.driver","C:\\Users\\User\\IdeaProjects\\SeleniumPractise\\geckodriver-v0.36.0-win-aarch64.zip");
        WebDriver driver = new FirefoxDriver();

        driver.get("https://www.facebook.com/");

        driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Vengat");

        driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Ram");

        driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("9876543210");

        driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("1234 56");

        driver.findElement(By.xpath("//label[contains(text(),'Male')]")).click();

        driver.findElement(By.xpath("//button[@type='submit']")).click();
    }}


