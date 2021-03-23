package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

    private final WebDriver driver;
    private final By BuyNowButton = By.name("BUY NOW");

    public HomePage(WebDriver driver){
        this.driver = driver;
    }

    public ShoppingCartPage clickBuyNow(){
        driver.findElement(BuyNowButton).click();
        return new ShoppingCartPage(driver);
    }
}
