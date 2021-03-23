package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OrderSummaryPage {
    private final WebDriver driver;
    private final By shippingDetailsTab = By.name("shipping details");
    private final By Name = By.name("dinda");
    private final By continueButton = By.name("Continue");

    public OrderSummaryPage(WebDriver driver){
        this.driver = driver;
    }

    public void clickshippingDetails(){
        driver.findElement(shippingDetailsTab).click();
    }

    public String getNameText(){
        return driver.findElement(Name).getText();
    }

    public SelectPaymentPage clickContinueButton(){
        driver.findElement(continueButton).click();
        return new SelectPaymentPage(driver);
    }
}
