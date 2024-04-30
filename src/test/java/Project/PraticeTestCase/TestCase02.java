package Project.PraticeTestCase;

import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestCase02 {

    @Test
    @Owner("Hasan Ali")
    @Description("This is simple test case 2")
    public void titlePage(){

        WebDriver driver = new ChromeDriver();
        driver.get("https://visascentral.com/");
        System.out.println(driver.getTitle());
        driver.quit();

    }
}
