package Steps;

import org.openqa.selenium.By;

import base.BaseSteps;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GoogleSteps extends BaseSteps {

	@Before
	public void before() {

	}

	@After
	public void after() {

		stopDriver();
		
	}

	@Given("launch browser {string}")
	public void launch_browser(String browser) {
		startWebDriver(browser);

	}

	@When("user navigates to {string}")
	public void user_navigates_to(String url) {
		navigate(url);
	}

	@Then("user enters search item {string}")
	public void user_enters_search_item(String searchItem) {
		driver.findElement(By.name("q")).sendKeys(searchItem);
	}

	@Then("clicks on search button")
	public void clicks_on_search_button() {
		driver.findElement(By.name("btnK")).click();
	}

}
