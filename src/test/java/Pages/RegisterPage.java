package Pages;

import Steps.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RegisterPage {
    public WebDriver driver = Hooks.driver;








    public WebElement SignUp_Login_Button() {
        return driver.findElement(By.xpath("//a[@href=\"/login\"]"));
    }

    public WebElement name() {
        return driver.findElement(By.xpath("//input[@data-qa=\"signup-name\"]"));
    }

    public WebElement email() {
        return driver.findElement(By.xpath("//input[@data-qa=\"signup-email\"]"));
    }

    public WebElement signup() {
        return driver.findElement(By.xpath("//button[@data-qa=\"signup-button\"]"));
    }

    public WebElement Title() {
        return driver.findElement(By.xpath("//label[@for=\"id_gender1\"]"));


    }

    public WebElement Name() {
        return driver.findElement(By.xpath("//input[@id=\"name\"]"));
    }
    public WebElement password() {
        return driver.findElement(By.xpath("//input[@data-qa=\"password\"]"));
    }
    public WebElement FirstName() {
        return driver.findElement(By.xpath("//input[@data-qa=\"first_name\"]"));
    }
    public WebElement LastName() {
        return driver.findElement(By.xpath("//input[@data-qa=\"last_name\"]"));
    }
    public WebElement Adress() {
        return driver.findElement(By.xpath("//input[@data-qa=\"address\"]"));
    }
    public WebElement Country () {
        return driver.findElement(By.xpath("//select[@data-qa=\"country\"]"));
    }
    public WebElement state() {
        return driver.findElement(By.xpath("//input[@data-qa=\"state\"]"));
    }
    public WebElement city() {
        return driver.findElement(By.xpath("//input[@data-qa=\"city\"]"));
    }
    public WebElement ZipCode() {
        return driver.findElement(By.xpath("//input[@data-qa=\"zipcode\"]"));
    }
    public WebElement MobileNum() {
        return driver.findElement(By.xpath("//input[@data-qa=\"mobile_number\"]"));
    }
    public WebElement Create_Acc() {
        return driver.findElement(By.xpath("//button[@data-qa=\"create-account\"]"));
    }



}