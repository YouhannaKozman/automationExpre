package Pages;


import Steps.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
   public WebDriver driver = Hooks.driver;
   public WebElement Email(){return driver.findElement(By.xpath("//input[@data-qa=\"login-email\"]"));}
    public WebElement Password(){return driver.findElement(By.xpath("//input[@data-qa=\"login-password\"]"));}
    public WebElement login_Button(){return driver.findElement(By.xpath("//button[@data-qa=\"login-button\"]"));}
    public WebElement SuccessMessage(){return driver.findElement(By.cssSelector("//*[text()='youhannaYouhanaaaaa']"));}

}
