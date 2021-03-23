package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ValidationPage {
    private final WebDriver driver;
    private final By statusAlert = By.xpath("//*[@id=\"application\"]/div[3]/div/div/div/div/div/div[2]");

    public ValidationPage(WebDriver driver){
        this.driver = driver;
    }
    public String getAlertText(){
        return driver.findElement(statusAlert).getText();
    }
}
