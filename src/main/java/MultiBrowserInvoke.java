import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Scanner;

public class MultiBrowserInvoke {

    public static void main(String[] args) throws InterruptedException {


        Scanner sc = new Scanner(System.in);

        System.out.println("Enter brower Name:");
        String browser = sc.nextLine();

        WebDriver driver = null;

        if(browser.equals("Firefox"))
        {
            //System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");

            System.setProperty("webdriver.edge.driver","C:\\Users\\User\\IdeaProjects\\SeleniumPractise\\geckodriver-v0.36.0-win-aarch64.zip");


            driver = new FirefoxDriver();

            driver.get("https://www.myntra.com/");

            Thread.sleep(3000);

            driver.manage().window().maximize();

            Thread.sleep(3000);

            driver.close();
        }
        else
        if(browser.equals("Chrome"))
        {
            System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\IdeaProjects\\SeleniumPractise\\chromedriver-win64\\chromedriver.exe");


            driver = new ChromeDriver();

           // driver.get("https://www.Amazon.com/");
            Thread.sleep(5000);

            driver.close();
        }

        else{

            System.out.println("Enter correct browser name ");
        }


    }
}
