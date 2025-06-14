import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.List;

import static java.lang.Thread.sleep;

public class checkbox {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.edge.driver","C:\\Users\\User\\IdeaProjects\\SeleniumPractise\\geckodriver-v0.36.0-win-aarch64.zip");

        WebDriver driver = new FirefoxDriver();

        driver.manage().window().maximize();
        driver.findElement(By.name("q")).sendKeys("selenium");
        sleep(2000);
// To get address of all the suggestions
        String xp = "//span[contains(text(),'selenium')]";
        List<WebElement> allSuggestions = driver.findElements(By.xpath(xp));
// To count number of suggetions
        int count = allSuggestions.size();
        System.out.println(count);
// To print all the suggestions
        for (int i = 0; i < count; i++) {
            WebElement suggestion = allSuggestions.get(i);
            String text = suggestion.getText();
            System.out.println(text);
        }
// To click on last suggestion
        allSuggestions.get(count - 1).click();

    }
}
