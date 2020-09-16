package org.pojo.adactin;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class BookingPojo {
	WebDriver driver;
	@Given("user is on the Adactinpage")
	public void user_is_on_the_Adactinpage() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\bbhas\\eclipse-workspace\\CucumberClass\\drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get(" http://www.adactin.com/HotelApp/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	    
	}
	@When("user is should be enter the {string} and  {string}")
	public void user_is_should_be_enter_the_and(String user, String password) {
		 driver.findElement(By.id("username")).sendKeys(user);
			driver.findElement(By.id("password")).sendKeys(password);
		    
		}
    @When("user is click the login button")
	public void user_is_click_the_login_button(){
		driver.findElement(By.name("login")).click();
	   
	}
    @When("user is should enter the details{string},{string},{string} and {string}")
    public void user_is_should_enter_the_details_and(String location, String Hname, String roomtype, String norooms) {
       
    	 driver.findElement(By.name("location")).sendKeys(location);
		   driver.findElement(By.id("hotels")).sendKeys(Hname);
		   driver.findElement(By.id("room_type")).sendKeys(roomtype);
		   driver.findElement(By.id("room_nos")).sendKeys(norooms);
	  }
	
    @When("user Enter the dates {string} and {string},{string} and {string}")
	public void user_Enter_the_dates_and_and(String in, String out, String adult, String child) {
		driver.findElement(By.id("datepick_in")).sendKeys(in);   
		driver.findElement(By.id("datepick_out")).sendKeys(out);
		driver.findElement(By.id("adult_room")).sendKeys(adult);
		driver.findElement(By.id("child_room")).sendKeys(child);
	}
	@Then("user click the search button")
	public void user_click_the_search_button() {
		driver.findElement(By.id("Submit")).click();
	   
	}
	@When("user in selectHotel page click the select option and continue option")
	public void user_in_selectHotel_page_click_the_select_option_and_continue_option() {
	    driver.findElement(By.id("radiobutton_0")).click();
	    driver.findElement(By.id("continue")).click();
	}
@When("user should enter the personal details{string},{string},{string},{string},{string},{string},{string} and {string}")
public void user_should_enter_the_personal_details_and(String fname, String lname, String add, String ccno, String cctype, String xmon, String xyr, String cvv){
		driver.findElement(By.id("first_name")).sendKeys(fname);
		driver.findElement(By.id("last_name")).sendKeys(lname);
		driver.findElement(By.id("address")).sendKeys(add);
		driver.findElement(By.id("cc_num")).sendKeys(ccno);
		driver.findElement(By.id("cc_type")).sendKeys(cctype);
		driver.findElement(By.id("cc_exp_month")).sendKeys(xmon);
		driver.findElement(By.id("cc_exp_year")).sendKeys(xyr);
		driver.findElement(By.name("cc_cvv")).sendKeys(cvv);
	}

	@Then("user click the Book  now option")
	public void user_click_the_Book_now_option() {
	    driver.findElement(By.id("book_now")).click();
	}
	@Then("user  know the booking oder no")
	public void user_know_the_booking_oder_no() {
	   WebElement orderno= driver.findElement(By.id("order_no"));
	 String s=orderno.getAttribute("value");
	 System.out.println(s);
	 driver.quit();
	}


}






