import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class select {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\IdeaProjects\\SeleniumPractise\\chromedriver-win64\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.findElement(By.xpath("//*[@id='u_0_g']")).click();
        boolean logo= driver.findElement(By.xpath("//*[@id='u_0_g']")).isSelected();

        if (logo == true) {
            System.out.println("button is selected");
        } else {
            System.out.println("not selected");
        }
    }

}
