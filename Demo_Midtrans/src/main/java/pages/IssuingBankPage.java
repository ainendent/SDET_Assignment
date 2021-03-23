package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class IssuingBankPage {

    private final WebDriver driver;
    private final By passField = By.id("PaRes");
    private final By okButton = By.name("ok");

    public IssuingBankPage(WebDriver driver){
        this.driver = driver;
    }

    public void setPassword(){
        driver.findElement(passField).sendKeys("112233");
    }

    public ValidationPage clickOKButton(){
        driver.findElement(okButton).click();
        return new ValidationPage(driver);
    }

}
