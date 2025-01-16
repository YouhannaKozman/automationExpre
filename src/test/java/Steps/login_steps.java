package Steps;

import Pages.LoginPage;
import Pages.RegisterPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class login_steps {
    @Given("homepage appear user click on Signup Login")
    public void SignUp_login_button() throws InterruptedException {
        RegisterPage registerPage = new RegisterPage();
        registerPage.SignUp_Login_Button().click();
    }
    LoginPage login = new LoginPage();
    @When("user enter Email adress and password")
    public void data() throws InterruptedException {


        login.Email().sendKeys("yooyoyoyo@gmail.com");
        login.Password().sendKeys("02589633");
    }
    @And("user click on login button")
    public void login_button() throws InterruptedException {

        login.login_Button().click();

    }
    @Then("user name appear and user can login success")
    public void SuccessLogin(){
        SoftAssert softAssert= new SoftAssert();
        Assert.assertEquals(login.SuccessMessage().getText(),"youhannaYouhanaaaaa");
        softAssert.assertAll();
    }

    @When("user enter {string} adress and {string}")
    public void InvalidData(String email, String password) throws InterruptedException {

        login.Email().sendKeys(email);
        login.Password().sendKeys(password);
    }
}
