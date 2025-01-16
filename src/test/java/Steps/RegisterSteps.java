package Steps;

import Pages.LoginPage;
import Pages.RegisterPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class RegisterSteps {
    Hooks hooks = new Hooks();
    @BeforeTest
public void before() {

    hooks.openBrowser();
}
    RegisterPage registerPage = new RegisterPage();
  @Given("homepage directed user click on Signup Login")
    public void SignUp_login_button() throws InterruptedException {

        registerPage.SignUp_Login_Button().click();
    }
  @When("user enter Name and Email Adress")
  public void register() throws InterruptedException {
      Thread.sleep(2000);
      registerPage.name().sendKeys("youhannaaaaa");
      Thread.sleep(2000);
      registerPage.email().sendKeys("yooooooyoyoyo@gmail.com");
      Thread.sleep(2000);
      registerPage.signup().click();
  }
  @And("user fill his info")
  public void info () throws InterruptedException {
      Thread.sleep(2000);
      registerPage.Title().click();
      Thread.sleep(2000);
      registerPage.Name().sendKeys("Youhanaaaaa");
      Thread.sleep(2000);
      registerPage.password().sendKeys("02589633");
      Thread.sleep(2000);
      registerPage.FirstName().sendKeys("Youhannaa");
      Thread.sleep(2000);
      registerPage.LastName().sendKeys("Kozmanoo");
      Thread.sleep(2000);
      registerPage.Adress().sendKeys("1800 sidibishr alex");
      Thread.sleep(2000);
      Select select = new Select(registerPage.Country());
      select.selectByVisibleText("Canada");
      Thread.sleep(2000);
      registerPage.state().sendKeys("Alex");
      Thread.sleep(2000);
      registerPage.city().sendKeys("sidibishr");
      Thread.sleep(2000);
      registerPage.ZipCode().sendKeys("123456");
      Thread.sleep(2000);
      registerPage.MobileNum().sendKeys("0123456789");
  }
  @Then("user click on create account")
  public void CreateAcc_Button () throws InterruptedException {
      Thread.sleep(2000);
      registerPage.Create_Acc().click();
  }



    public void Test_Case1() throws InterruptedException {
        RegisterPage registerPage = new RegisterPage();
        Thread.sleep(2000);
        registerPage.SignUp_Login_Button().click();
        Thread.sleep(2000);
        registerPage.name().sendKeys("youhanna");
        Thread.sleep(2000);
        registerPage.email().sendKeys("yooyoyoyo@gmail.com");
        Thread.sleep(2000);
        registerPage.signup().click();
        //Enter all valid data
        Thread.sleep(2000);
        registerPage.Title().click();
        Thread.sleep(2000);
        registerPage.Name().sendKeys("Youhanaaaaa");
        Thread.sleep(2000);
        registerPage.password().sendKeys("02589633");
        Thread.sleep(2000);
        registerPage.FirstName().sendKeys("Youhannaa");
        Thread.sleep(2000);
        registerPage.LastName().sendKeys("Kozmanoo");
        Thread.sleep(2000);
        registerPage.Adress().sendKeys("1800 sidibishr alex");
        Thread.sleep(2000);
        Select select = new Select(registerPage.Country());
        select.selectByVisibleText("Canada");
        Thread.sleep(2000);
        registerPage.state().sendKeys("Alex");
        Thread.sleep(2000);
        registerPage.city().sendKeys("sidibishr");
        Thread.sleep(2000);
        registerPage.ZipCode().sendKeys("123456");
        Thread.sleep(2000);
        registerPage.MobileNum().sendKeys("0123456789");
        //Click on SignUp button
        Thread.sleep(2000);
        registerPage.Create_Acc().click();
    }

@Test
    public void Test_Case2() throws InterruptedException {
RegisterPage registerPage = new RegisterPage();
        LoginPage login = new LoginPage();
        Thread.sleep(2000);
        registerPage.SignUp_Login_Button().click();
    Thread.sleep(2000);
        login.Email().sendKeys("yooyoyoyo@gmail.com");
    Thread.sleep(2000);
        login.Password().sendKeys("02589633");
    Thread.sleep(2000);
        login.login_Button().click();
    Assert.assertEquals(login.SuccessMessage().getText(),"youhannaYouhanaaaaa");

    }


@AfterTest
public void after () throws InterruptedException {
    Thread.sleep(5000);
    hooks.quit();
}




    }






