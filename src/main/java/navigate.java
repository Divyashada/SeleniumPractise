import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class navigate {
    public static void main(String[] args) throws InterruptedException{
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\IdeaProjects\\SeleniumPractise\\chromedriver-win64\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        Thread.sleep(2000);

        driver.manage().deleteAllCookies();

      driver.get("https://www.google.com/");

      driver.navigate().to("https://www.facebook.com/");

        Thread.sleep(5000);



        driver.navigate().back();

        Thread.sleep(5000);

        driver.navigate().forward();

        Thread.sleep(5000);

        driver.navigate().refresh();


        driver.manage().window().maximize();
}}
