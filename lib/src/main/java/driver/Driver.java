package driver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;


public class Driver {
    Logger logger = LoggerFactory.getLogger(this.getClass());
    WebDriver Driver;

    @BeforeTest
    public void setUpDriver(){
        WebDriverManager.chromiumdriver().setup();
        Driver = new ChromeDriver();
        logger.info("I");
    }

    @AfterTest
    public void quitDriver(){
        Driver.quit();
    }

    public void goToPage(String url){
        logger.info("");
        Driver.navigate().to(url);
    }

}
