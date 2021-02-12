package stepdefination;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

public class dealsmapstepdefination {
	
WebDriver driver;
	
	@Given("^user is already on Login Page$")
	public void user_is_already_on_Login_Page(){
		 WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		 driver.get("https://ui.freecrm.com");


	}
	@When("^title of login page is Free CRM$")
	public void title_of_login_page_is_Free_CRM(){
		String title=driver.getTitle();
		System.out.println(title);
		Assert.assertEquals("Cogmento CRM", title);
		
	}

@Then("^user enters username and password$")
public void user_enters_username_and_password(DataTable credentials){
	for(Map<String,String>data:credentials.asMaps(String.class, String.class)){
	
	driver.findElement(By.name("email")).sendKeys(data.get("username"));
	driver.findElement(By.name("password")).sendKeys(data.get("password"));
    }
}
@Then("^user clicks on login button$")
public void user_clicks_on_login_button(){
	driver.findElement(By.xpath("//*[@id='ui']/div/div/form/div/div[3]")).click();
    
}
@Then("^user is on home page$")
public void user_is_on_home_page(){
	String title=driver.getTitle();
	System.out.println("home page title::"+title);
	Assert.assertEquals("Cogmento CRM", title);
	
    }

}
