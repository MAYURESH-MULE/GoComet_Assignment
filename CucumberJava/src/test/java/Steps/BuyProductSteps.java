package Steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BuyProductSteps {
	WebDriver driver=null;

	@When("user clicks product")
	public void user_clicks_product() {
		driver.findElement(By.className("col-lg-4 col-md-6 mb-4")).click();
	}

	@And("user clicks on add that product")
	public void user_clicks_on_add_that_product() {
		driver.findElement(By.className("col-sm-12 col-md-6 col-lg-6")).click();	
	}
	
	@Then("product is directed to Cart")
	public void product_is_directed_to_Cart() {
	   System.out.println("Product Added into Cart");
		
	}

	@And("user can use Cart tab")
	public void user_can_use_Cart_tab() {
		  driver.navigate().to("https://www.demoblaze.com/cart.html");
	}

	@And("user can Place Order")
	public void user_can_Place_Order() {
		driver.findElement(By.className("success")).isDisplayed();
		driver.findElement(By.className("btn btn-success")).click();
	}

	@And("Fill the Orders and Place Order")
	public void fill_the_Orders_and_Place_Order() {
		driver.findElement(By.className("orderModal")).isDisplayed();
		driver.findElement(By.className("form-control-label")).click();
		driver.findElement(By.id("name")).sendKeys("Mayuresh");
		driver.findElement(By.id("country")).sendKeys("India");
		driver.findElement(By.id("city")).sendKeys("Mumbai");
		driver.findElement(By.id("card")).sendKeys("13425364");
		driver.findElement(By.id("month")).sendKeys("08");
		driver.findElement(By.id("year")).sendKeys("2026");
		driver.findElement(By.className("btn btn-primary")).click();
		
System.out.println("Order Placed!!!");

		driver.close();
		driver.quit();
	}

}
