import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Ex6 {
    public static void main(String[] args) {
        System.setProperty("webdriver.edge.driver","C:\\Users\\User\\IdeaProjects\\SeleniumPractise\\geckodriver-v0.36.0-win-aarch64.zip");
        WebDriver driver = new FirefoxDriver();

        driver.get("https://www.facebook.com/");

        boolean logo= driver.findElement(By.xpath("//*[@id='email']")).isEnabled();

        if(logo== true){
            System.out.println("text is enabled to print");}

            else{
                System.out.println("text is not enabled to print");
        }
    }
}
