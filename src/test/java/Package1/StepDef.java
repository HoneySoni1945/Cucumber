package Package1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class StepDef {
	WebDriver driver = new ChromeDriver();
	@Given("^I am able to access magento web page$")
	public void i_am_able_to_access_magento_web_page()  {
	    // Write code here that turns the phrase above into concrete actions
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://magento.com");
		driver.findElement(By.className("fa-user")).click();
	}

	@When("^I update the username as \"([^\"]*)\"$")
	public void i_update_the_username_as(String arg1)  {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.id("email")).sendKeys(arg1);
	}

	@When("^I Update then password as \"([^\"]*)\"$")
	public void i_Update_then_password_as(String arg1) {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.name("login[password]")).sendKeys(arg1);
	}

	@When("^I click on login button$")
	public void i_click_on_login_button() {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.className("button")).click();
	}

	@Then("^I should find the magento id as \"([^\"]*)\"$")
	public void i_should_find_the_magento_id_as(String arg1){
	    // Write code here that turns the phrase above into concrete actions
		Assert.assertEquals(arg1, driver.findElement(By.xpath("//div[@class='account-help']/span")).getText());
		driver.quit();
	}
	@Then("^I should see the error message as \"([^\"]*)\"$")
	public void i_should_see_the_error_message_as(String arg1)  {
	    // Write code here that turns the phrase above into concrete actions
		Assert.assertEquals(arg1,driver.findElement(By.className("error-msg")).getText());
		driver.quit();
	}

}
