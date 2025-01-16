package Pages;

import Steps.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CheckOutPage {
    public WebDriver driver = Hooks.driver;
    public WebElement ProceedToCheckout(){return driver.findElement(By.xpath("//a[@class=\"btn btn-default check_out\"]"));}
    public WebElement PlaceOrder(){return driver.findElement(By.xpath("//a[@href=\"/payment\"]"));}
    public WebElement NameOnCard(){return driver.findElement(By.xpath("//input[@data-qa=\"name-on-card\"]"));}
    public WebElement CardNumber(){return driver.findElement(By.xpath("//input[@data-qa=\"card-number\"]"));}
    public WebElement CVC(){return driver.findElement(By.xpath("//input[@data-qa=\"cvc\"]"));}
    public WebElement ExpirationMonth(){return driver.findElement(By.xpath("//input[@data-qa=\"expiry-month\"]"));}
    public WebElement ExpirationYear(){return driver.findElement(By.xpath("//input[@data-qa=\"expiry-year\"]"));}
    public WebElement ConfirmOrder(){return driver.findElement(By.xpath("//button[@data-qa=\"pay-button\"]"));}
}
