import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class display {
    public static void main(String[] args) throws InterruptedException{
        System.setProperty("webdriver.edge.driver","C:\\Users\\User\\IdeaProjects\\SeleniumPractise\\geckodriver-v0.36.0-win-aarch64.zip");
        WebDriver driver = new FirefoxDriver();

        driver.get("https://www.facebook.com/");
        boolean logo = driver.findElement(By.xpath("//*[@id='hplogo']"))
                .isDisplayed();

        ExpectedConditions ExpectedConditions = null;
        ExpectedConditions.elementToBeClickable(By.xpath("//button[contains(text(), 'Allow all cookies')]"));

//        WebElement x1 = driver.findElement(By.partialLinkText("Allow all cookies"));

        driver.manage().getCookies().forEach(System.out::println);


        if (logo == true) {
            System.out.println("logo is available");
        } else {
            System.out.println("logo is not available");
        }
    }}
