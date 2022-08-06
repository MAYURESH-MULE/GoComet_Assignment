package Steps;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CheckCartSteps {
	WebDriver driver=null;

	@Given("user is on login page")
	public void user_is_on_login_page() {
		driver.navigate().to("https://www.demoblaze.com/index.html");
		   
	}

	@When("user enters Cart tab on header")
	public void user_enters_Cart_tab_on_header() {
	   driver.navigate().to("https://www.demoblaze.com/cart.html");
	   
	}

	@Then("user is navigated to the Cart page")
	public void user_is_navigated_to_the_Cart_page() {
		   driver.navigate().to("https://www.demoblaze.com/cart.html");

		   driver.close();
		   driver.quit();
	}

}
