package stepdefinitions;


import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.junit.Cucumber;
import io.github.bonigarcia.wdm.WebDriverManager;

import java.util.concurrent.TimeUnit;

import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

@RunWith(Cucumber.class)
public class Stepdefinitions {

	WebDriver driver;
	@Given("^Open chrome and start application$")
	public void open_chrome_and_start_application() throws Throwable {
	    
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://FreeCRm.com");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
	}

	@When("^I enter valid \"([^\"]*)\" and valid \"([^\"]*)\"$")
	public void i_enter_valid_and_valid(String uname, String pass) throws Throwable {
		
	   driver.findElement(By.xpath("//*[@id='navbar-collapse']/ul/li[1]/a")).click();
	   driver.findElement(By.name("email")).sendKeys(uname);
	   driver.findElement(By.name("password")).sendKeys(pass);
	}

	@Then("^User should be able to login successfully$")
	public void user_should_be_able_to_login_successfully() throws Throwable {
	   driver.findElement(By.xpath("//*[@id='ui']/div/div/form/div/div[3]")).click();
	}



	   
}
