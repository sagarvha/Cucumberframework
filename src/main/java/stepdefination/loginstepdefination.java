package stepdefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

public class loginstepdefination {
	WebDriver driver;
	//@Given("^user is already on Login Page$")
	public void user_is_already_on_Login_Page(){
		 WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		 driver.get("https://ui.freecrm.com");

	}
	//@When("^title of login page is Free CRM$")
	public void title_of_login_page_is_Free_CRM(){
		String title=driver.getTitle();
		System.out.println(title);
		Assert.assertEquals("Cogmento CRM", title);
		
	}

//@Then("^user enters \"(.*)\" and \"(.*)\"$")
public void user_enters_username_and_password(String username, String password){
	driver.findElement(By.name("email")).sendKeys(username);
	driver.findElement(By.name("password")).sendKeys(password);
    }
//@Then("^user clicks on login button$")
public void user_clicks_on_login_button(){
	driver.findElement(By.xpath("//*[@id='ui']/div/div/form/div/div[3]")).click();
    
}

//@Then("^user is on home page$")
public void user_is_on_home_page(){
	String title=driver.getTitle();
	System.out.println("home page title::"+title);
	Assert.assertEquals("Cogmento CRM", title);
	
    }

//@Then("^user move to new contact$")
public void user_move_to_new_contact(){
	Actions action=new Actions(driver);
	action.moveToElement(driver.findElement(By.xpath("//*[@id='main-nav']/div[3]/a/i"))).build().perform();
	
	driver.findElement(By.xpath("//*[@id='main-nav']/a[3]")).click();
}
//@Then("^user on contact details \"(.*)\" and \"(.*)\"$")
 public void user_enters_firstname_and_lastname(String firstname,String lastname){
	
} 

//@Then("^close the browser$")
public void close_the_browser(){
	//driver.quit();
}



}
