package Steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Then;

public class ProductDetailsSteps {
	
	WebDriver driver=null;

	@Then("user clicks on desired products")
	public void user_clicks_on_desired_products() {
	  
	driver.findElement(By.className("col-lg-4 col-md-6 mb-4"));
	driver.close();
	driver.quit();


	}
}
