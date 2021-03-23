package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import pages.HomePage;

public class BaseTests {

    private WebDriver driver;
    //WebDriver driver = new RemoteWebDriver("http://localhost:9515", DesiredCapabilities.chrome());
    protected HomePage homePage;

    @BeforeClass
    public void setUp(){
        System.setProperty("WebDriver.chrome.driver", "resources/chromedriver");
        driver = new ChromeDriver();
        driver.get("https://demo.midtrans.com//");

        homePage = new HomePage(driver);

        System.out.println(driver.getTitle());
    }

    @AfterClass
    public void tearDown(){
        driver.quit();
    }

    public static void main(String []args){
        BaseTests test = new BaseTests();
        test.setUp();
    }
}
