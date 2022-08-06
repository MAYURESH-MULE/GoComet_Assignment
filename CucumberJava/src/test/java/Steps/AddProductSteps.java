package Steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class AddProductSteps {
	
	WebDriver driver=null;


	@Then("user is navigated to the home page")
	public void user_is_navigated_to_the_home_page() {
		driver.navigate().to("https://www.demoblaze.com/index.html");
		driver.findElement(By.className("col-lg-4"));
	}

	@And("user clicks on desired product")
	public void user_clicks_on_desired_product() {
		driver.findElement(By.className("col-lg-4 col-md-6 mb-4")).click();

	}

	@And("user clicks on add option and adds product to cart")
	public void user_clicks_on_add_option_and_adds_product_to_cart() {
	   
		driver.findElement(By.className("btn btn-success btn-lg")).click();
		driver.close();
		driver.quit();
	}
}
