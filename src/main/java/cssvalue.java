import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class cssvalue {

    public static void main(String[] args) throws InterruptedException {

        // Set the path to chromedriver executable
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\IdeaProjects\\SeleniumPractise\\chromedriver-win64\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://adactin.com/HotelApp");

        driver.manage().window().maximize();

        WebElement x = driver.findElement(By.xpath("//td[@class='build_title']"));

        String x1 = x.getCssValue("font size");
        System.out.println(x1);

        String x2 = x.getCssValue("colour");
        System.out.println(x2);


}}