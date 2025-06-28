import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.List;

public class autosugg {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.edge.driver","C:\\Users\\User\\IdeaProjects\\SeleniumPractise\\geckodriver-v0.36.0-win-aarch64.zip");

        WebDriver driver = new FirefoxDriver();

        driver.get("https://www.google.com/");
        driver.manage().window().maximize();
        driver.findElement(By.name("q")).sendKeys("selenium");
        Thread.sleep(2000);

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
}}
