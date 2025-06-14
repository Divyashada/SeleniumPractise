import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class radio {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.edge.driver","C:\\Users\\User\\IdeaProjects\\SeleniumPractise\\geckodriver-v0.36.0-win-aarch64.zip");
    WebDriver driver = new FirefoxDriver();

        driver.get("https://www.facebook.com/");
        for (int i = 1; i <= 2; i++) {
            Thread.sleep(3000);
            String s = driver.findElement(By.xpath("//*[@id='u_0_k']/span[" + i + "]/label"))
                    .getText();
            System.out.println(s);
        }}}
