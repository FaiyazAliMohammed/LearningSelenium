package Project.PraticeTestCase.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class selenium01 {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.wwe.com/");
        System.out.println(driver.getTitle());
        driver.quit();



    }
}
