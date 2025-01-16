package Pages;

import Steps.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProductPage {
    public WebDriver driver = Hooks.driver;
    public WebElement Product_button(){return driver.findElement(By.xpath("//a[@href=\"/products\"]"));}

    public WebElement Search_text(){return driver.findElement(By.xpath("//input[@name=\"search\"]"));}

    public WebElement Search_button(){return driver.findElement(By.xpath("//button[@id=\"submit_search\"]"));}

    public WebElement AddToCart_button(){return driver.findElement(By.cssSelector("div.productinfo.text-center a.btn-default.add-to-cart i.fa-shopping-cart"));}

    public WebElement ViewCart_button(){return driver.findElement(By.xpath("//p//a[@href=\"/view_cart\"]"));}





}


