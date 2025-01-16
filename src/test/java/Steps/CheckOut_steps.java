package Steps;

import Pages.CheckOutPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CheckOut_steps {
    CheckOutPage checkout = new CheckOutPage();
   @Given("user can click on proceed to checkout")
    public void proceedButton(){
       checkout.ProceedToCheckout().click();
   }
   @When("user can place order")
   public void placeorderButton() {
       checkout.PlaceOrder().click();
   }
   @And("user fill his card info")
    public void FillData() {
        checkout.NameOnCard().sendKeys("youhanna kozman");
        checkout.CardNumber().sendKeys("4569722848548");
        checkout.CVC().sendKeys("888");
        checkout.ExpirationMonth().sendKeys("08");
       checkout.ExpirationYear().sendKeys("2028");
    }
    @Then("user can click confirm order")
    public void Confirmorder(){
       checkout.ConfirmOrder().click();
    }


}
