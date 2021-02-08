package test.com.auto.tests.features;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {

    private WebDriver driver;

    @Before
    public void initialize(){
        WebDriverManager.chromedriver().setup();
        this.driver = new ChromeDriver();
    }

    @After
    public void tearDown(){
        this.driver.quit();
    }

    @Test
    public void test() throws Exception {
        this.driver.navigate().to("http://www.slf4j.org");
        System.out.println("yay");
        Thread.sleep(3000);
    }

}
