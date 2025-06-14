import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Browser {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.edge.driver","C:\\Users\\User\\IdeaProjects\\SeleniumPractise\\geckodriver-v0.36.0-win-aarch64.zip");

        WebDriver driver = new FirefoxDriver();

        driver.get("https://www.Amazon.com/");
       String title =  driver.getTitle();
        System.out.println(title);
        Thread.sleep(5000);

        driver.manage().window().maximize();

        driver.close();



    }}
