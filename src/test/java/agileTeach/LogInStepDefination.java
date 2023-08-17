package agileTeach;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LogInStepDefination {
	
	WebDriver driver;

	@Given("user land in AgileOne home page")
	public void user_land_in_agile_one_home_page() throws Throwable {
		String key = "webdriver.chrome.driver";
		String value = "C:\\Users\\srabo\\eclipse-workspaceWithRahul\\Agileteach\\drivers\\chromedriver.exe";	
	 
		System.setProperty(key, value);
		
		driver = new ChromeDriver();
		driver.get("https://agileteach.com/");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
	}
	
	@Then("user sgould click myportal")
	public void user_sgould_click_myportal() {
	    
		WebElement myPortal = driver.findElement(By.xpath("//*[@id=\"dropdownMenuButton\"]/a"));
		myPortal.click();
		
		
	}

	@Given("user should put email address")
	public void user_should_put_email_address() {
		
	WebElement email =	driver.findElement(By.name("email"));
	email.sendKeys("sraboni9287@gmail.com");

	}

	@Given("user should put password")
	public void user_should_put_password() {
	    
		WebElement passWord = driver.findElement(By.name("password"));
		passWord.sendKeys("Sani19921987");
	}

	@When("user click on logIn button")
	public void user_click_on_log_in_button() {
	    
		WebElement LoginButton = driver.findElement(By.className("login-btn"));
		LoginButton.click();
	}

	@Then("user can see alert option")
	public void user_can_see_alert_option() {
	   
		driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[1]/div/a")).click();
	}

	
	/////*[@id="login-form"]/div[1]/div/a
}
