package stepdefination;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

public class dealsstepdefination {
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

//@Then("^user enters username and password$")
public void user_enters_username_and_password(DataTable credentials){
	List<List<String>> data=credentials.raw();
	
	driver.findElement(By.name("email")).sendKeys(data.get(0).get(0));
	driver.findElement(By.name("password")).sendKeys(data.get(0).get(1));
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
//@Then("^click on deals link$")
public void user_move_to_deals_link(){
	
	Actions action=new Actions(driver);
	action.moveToElement(driver.findElement(By.xpath("//*[@id='main-nav']/div[1]"))).build().perform();
	
	driver.findElement(By.xpath("//*[@id='main-nav']/div[5]/button/i")).click();
	
	
}
//@Then("^user enters new deals details$")
public void user_enters_firstname_and_lastname(DataTable credentials){
	List<List<String>> data=credentials.raw();
	driver.findElement(By.xpath("//*[@id='ui']/div/div[2]/div[2]/div/div[2]/form/div[1]/div[1]/div/div/input")).sendKeys(data.get(0).get(0));
driver.findElement(By.xpath("//*[@id='ui']/div/div[2]/div[2]/div/div[2]/form/div[7]/div[2]/div/div/input")).sendKeys(data.get(0).get(1));
	
}
//@Then("^close the browser$")
public void close_the_browser(){
	//driver.quit();
}


}
