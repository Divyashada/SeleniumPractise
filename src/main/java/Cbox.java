import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.List;

public class Cbox {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.edge.driver","C:\\Users\\User\\IdeaProjects\\SeleniumPractise\\geckodriver-v0.36.0-win-aarch64.zip");

        WebDriver driver = new FirefoxDriver();

        driver.manage().window().maximize();

        driver.get("http://demoqa.com/registration/");
        List<WebElement> w =
                driver.findElements(By.xpath("//input[@type='checkbox']"));
        for(WebElement x:w){
            if(x.getAttribute("value").equals("dance")||x.getAttribute("value").equals("cricket")){

            x.click();}}}}
