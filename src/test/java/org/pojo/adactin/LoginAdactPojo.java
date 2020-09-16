package org.pojo.adactin;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.server.handler.AddCookie;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import org.utilclass.adactin.AdactinCucumber;

//import com.stepdefinition.AdactinLoginStep;

public class LoginAdactPojo extends AdactinCucumber {
	
	public LoginAdactPojo() {
		PageFactory.initElements(d, this);
	}
	
	@FindAll({
		@FindBy(id="username"),
		@FindBy(xpath="//input[@type='text']")
	})
		private List<WebElement> email;
		
	@ FindBys({
		@FindBy(id="password"),
		@FindBy(xpath="//input[@type='password']")
	})
	private List<WebElement> pass;
	
	@FindBys({
	   @FindBy(xpath="//input[@name='login']"),
	   @FindBy(xpath="//input[@id='login']")
	})
	private List< WebElement> logn;
	
	public List<WebElement> getEmail() {
		return email;
	}
	public List<WebElement> getPass() {
		return pass;
	}
	public List<WebElement>getLogn() {
		return logn;
	}
	
	public void login(String username,String password) {
		sendkey(getEmail().get(0),username);
		sendkey(getPass().get(0),password);
	
		logButton(getLogn().get(0));
	}
	
	
		
	}
	
	


