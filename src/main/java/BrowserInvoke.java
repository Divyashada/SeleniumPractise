import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class BrowserInvoke {

    public static void main(String[] args) throws InterruptedException {

        // Set the path to chromedriver executable
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\IdeaProjects\\SeleniumPractise\\chromedriver-win64\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.myntra.com/");



        driver.manage().window().maximize();

        Thread.sleep(3000);

       driver.close();

       //driver.quit();




    }
}

