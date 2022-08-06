package Steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class ViewListSteps {
	WebDriver driver=null;
	@Given("browser is open")
	public void browser_is_open() {
		System.out.println("Inside Step- browser is open");
		   
		   String projectPath=System.getProperty("user.dir");
		   System.out.println("Project Path is: "+projectPath);
		
		   System.setProperty("webdriver.chrome.driver", projectPath+"https://www.demoblaze.com/index.html");
		   
		   driver=new ChromeDriver();
		
	}
	
	@Then("user is navigated to the homepage")
	public void user_is_navigated_to_the_homepage() {
		driver.navigate().to("https://www.demoblaze.com/index.html");
		
		driver.findElement(By.className("col-lg-4"));
	
		driver.close();
		driver.quit();

	}

}
