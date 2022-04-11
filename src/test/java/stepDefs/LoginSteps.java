package stepDefs;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {
	
	WebDriver driver = BaseClass.driver;
	
	@Given("I have opened the application in browser")
	public void i_have_opened_the_application_in_browser() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
	    
		driver.get("http://www.simplilearn.com/");
		Thread.sleep(10000);
	}

	@When("I click on the Login link")
	public void i_click_on_the_login_link() {
	    // Write code here that turns the phrase above into concrete actions
	    
		WebElement LoginLink = driver.findElement(By.linkText("Log in"));
		LoginLink.click();
	}

	@When("I enter username")
	public void i_enter_username() {
	    // Write code here that turns the phrase above into concrete actions
	    
		WebElement UserName = driver.findElement(By.name("user_login"));
		UserName.sendKeys("xyz@abc.com");
	}

	@When("I enter password")
	public void i_enter_password() {
	    // Write code here that turns the phrase above into concrete actions
	    
		WebElement Password = driver.findElement(By.id("password"));
		Password.sendKeys("Abc@12345");
	}

	@When("I click on the login button")
	public void i_click_on_the_login_button() {
	    // Write code here that turns the phrase above into concrete actions
	    
		WebElement LoginBtn = driver.findElement(By.name("btn_login"));
		LoginBtn.click();
	}

	@Then("I should be Landed on the Home Page")
	public void i_should_be_landed_on_the_home_page() {
	    // Write code here that turns the phrase above into concrete actions
	    
		System.out.println("Inside the home page");
	}

	@When("I enter username {string}")
	public void i_enter_username(String UserNameVal) {
	    // Write code here that turns the phrase above into concrete actions
	    
		WebElement UserName = driver.findElement(By.name("user_login"));
		UserName.sendKeys(UserNameVal);
	}

	@When("I enter password {string}")
	public void i_enter_password(String PasswordVal ) {
	    // Write code here that turns the phrase above into concrete actions
	    
		WebElement Password = driver.findElement(By.id("password"));
		Password.sendKeys(PasswordVal);
	}
	
	@Then("I should get the eroor message as {string}")
	public void i_should_get_the_eroor_message_as(String ExpMsg) {
	    // Write code here that turns the phrase above into concrete actions
	    
		WebElement ErrorMsg = driver.findElement(By.id("msg_box")); 
		String ActualMsg = ErrorMsg.getText();
		
		Assert.assertEquals(ExpMsg, ActualMsg);
		
		
	}

}
