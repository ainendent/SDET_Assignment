package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ShoppingCartPage {

    private final WebDriver driver;
    private final By amountField = By.className("text-right");
    private final By nameField = By.xpath("//body/tr[1]/td[2]/input[1]");
    private final By emailField = By.xpath("//body/tr[2]/td[2]/input[1]");
    private final By phoneNoField = By.xpath("//body/tr[3]/td[2]/input[1]");
    private final By cityField = By.xpath("//body/tr[4]/td[2]/input[1]");
    private final By addressField = By.xpath("//body/tr[5]/td[2]");
    private final By postalcodeField = By.xpath("//body/tr[6]/td[2]/input[1]");
    private final By checkoutButton = By.xpath("//div[contains(text(),'CHECKOUT')]");

    public ShoppingCartPage(WebDriver driver){
        this.driver = driver;
    }

    //public void setUsername(String username){ driver.findElement(usernameField).sendKeys(username); }
    public void setAmount(){
        driver.findElement(amountField).sendKeys("20000");
    }

    public void setName(String name){
        driver.findElement(nameField).sendKeys(name);
    }

    public void setEmail(String email){
        driver.findElement(emailField).sendKeys(email);
    }

    public void setPhoneNo(){
        driver.findElement(phoneNoField).sendKeys("081211069457");
    }

    public void setCity(String city){
        driver.findElement(cityField).sendKeys(city);
    }

    public void setAddress(String address){
        driver.findElement(addressField).sendKeys(address);
    }

    public void setPostalCode(){
        driver.findElement(postalcodeField).sendKeys("13450");
    }

    public OrderSummaryPage clickCheckoutButton(){
        driver.findElement(checkoutButton).click();
        return new OrderSummaryPage(driver);
    }
}