package com.stepdefinition;

import java.net.MalformedURLException;

import org.pojo.adactin.CheckPayment;
import org.pojo.adactin.HotelDetailspojo;
import org.pojo.adactin.LoginAdactPojo;
import org.pojo.adactin.OrderNoPojo;
import org.pojo.adactin.SelectHotelAdact;
import org.utilclass.adactin.AdactinCucumber;

import com.manager.PageObjectManager;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginAdactin  extends AdactinCucumber{
	
	
	LoginAdactPojo la;
	HotelDetailspojo hdp;
	SelectHotelAdact sha;
	CheckPayment  cp;
	OrderNoPojo on;
	PageObjectManager  manager;
	
	@Given("user is on the Adactinpage")
	public void user_is_on_the_Adactinpage() throws MalformedURLException {
		
		//d=getclouddriver();
	
		browserlaunch();
		getUrl(" http://www.adactin.com/HotelApp/");
		maxwindow();
		time();
		
	}
	@When("user is should be enter the {string} and {string}")
	public void user_is_should_be_enter_the_and(String username, String password) {
	manager=PageObjectManager.getInstance();
	la=manager.getLoginAdactinPojo();
	la.login(username, password);
	
		
}
	     @When("user is should enter the details{string},{string},{string} and {string}")
    public void user_is_should_enter_the_details_and(String location, String hname, String roomtype, String norooms) throws InterruptedException {
    	
    	manager=PageObjectManager.getInstance();
    	hdp=manager.getHotelDetailspojo();
    	hdp.details(location, hname, roomtype, norooms);
    }
	
    @When("user Enter the dates {string} and {string},{string} and {string}")
	public void user_Enter_the_dates_and_and(String in, String out, String adult, String child) {
    	manager=PageObjectManager.getInstance();
    	hdp=manager.getHotelDetailspojo();
      hdp.datedetails(in, out, adult, child);
     
    	
   }
	@Then("user click the search button")
	public void user_click_the_search_button() {
		manager=PageObjectManager.getInstance();
    	hdp=manager.getHotelDetailspojo();
		 hdp.srch();
		
		
   }
	@When("user in selectHotel page click the select option and continue option")
	public void user_in_selectHotel_page_click_the_select_option_and_continue_option() {
		manager= PageObjectManager.getInstance();
		cp=manager.getCheckPayment();
		cp.rdbuton();
		cp.contu();
		
	}
@When("user should enter the personal details{string},{string},{string},{string},{string},{string},{string} and {string}")
public void user_should_enter_the_personal_details_and(String fname, String lname, String add, String ccno, String cctype, String xmon, String xyr, String cvv){
   manager= PageObjectManager.getInstance();
   sha=manager.getSelectHotelAdact();
   sha.firtname(fname, lname, add, ccno, cctype, xmon, xyr, cvv);
}

	@Then("user click the Book  now option")
	public void user_click_the_Book_now_option() {
		 manager= PageObjectManager.getInstance();
		   sha=manager.getSelectHotelAdact();
	sha.bookhotel();	
		
	}
	@Then("user know the booking oder no")
	public void user_know_the_booking_oder_no() {
	 manager=   PageObjectManager.getInstance();
	 on=manager.getOrderNoPojo();
	 String s=on.getBookno().getAttribute("value");
		System.out.println(s);
	 //on.bokno();

}
}