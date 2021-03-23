package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SelectPaymentPage {
    private final WebDriver driver;
    private final By creditCardButton = By.name("Credit/Debit Card");
    public SelectPaymentPage(WebDriver driver){
        this.driver = driver;
    }

    public CreditCardPage clickCreditCardButton(){
        driver.findElement(creditCardButton).click();
        return new CreditCardPage(driver);
    }

}