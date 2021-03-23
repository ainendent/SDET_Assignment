package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CreditCardPage {
    private final WebDriver driver;
    private final By CardNumberField = By.xpath("//*[@id=\"application\"]/div[3]/div/div/div/form/div[2]/div[1]/input");
    private final By ExpiryDateField = By.xpath("//*[@id=\"application\"]/div[3]/div/div/div/form/div[2]/div[2]/input");
    private final By CVVField = By.xpath("//*[@id=\"application\"]/div[3]/div/div/div/form/div[2]/div[3]/input");
    private final By payNowButton = By.xpath("//*[@id=\"application\"]/div[1]/a");

    public CreditCardPage(WebDriver driver){
        this.driver = driver;
    }

    public void setCardNumber(){
        driver.findElement(CardNumberField).sendKeys("4811 1111 1111 1114");
    }

    public void setExpiryDate(){
        driver.findElement(ExpiryDateField).sendKeys("222");
    }

    public void setCVV(){
        driver.findElement(CVVField).sendKeys("123");
    }

    public IssuingBankPage clickPayNowButton(){
        driver.findElement(payNowButton).click();
        return new IssuingBankPage(driver);
    }
}
