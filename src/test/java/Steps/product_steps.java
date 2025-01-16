package Steps;

import Pages.ProductPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class product_steps {

    ProductPage productPage = new ProductPage();
    @Given("user click on products buttons")
    public void product_button(){
        productPage.Product_button().click();
    }
    @When("user search on item and click search button")
    public void search_button(){
        productPage.Search_text().sendKeys("Men Tshirt");
        productPage.Search_button().click();
    }
    @And("user add the item to cart")
    public void AddToCartButton(){
        productPage.AddToCart_button().click();
    }
@Then("user click on view cart button")
    public void ViewCart_button(){
        productPage.ViewCart_button().click();
}







}
