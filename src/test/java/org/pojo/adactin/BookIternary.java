package org.pojo.adactin;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import org.utilclass.adactin.AdactinCucumber;

public class BookIternary  extends AdactinCucumber{
	
	 public BookIternary() {
		 PageFactory.initElements(d, this);
		 
	 }
	   @FindBy(xpath="//a[text()='Booked Itinerary']")
	   private WebElement iternery;
		 
	   @FindBy(id="btn_id_363947")
	   private WebElement id1;
		 
	   @FindBy(id="btn_id_363946")
	   private WebElement id2;
		 
	   @FindBy(xpath="//input[@value='367823']")
	   private WebElement idcheck;
		
		 public WebElement getIternery() {
			return iternery;
		}
		public WebElement getIdcheck() {
				return idcheck;
		}
        public WebElement getId1() {
			return id1;
		}
        public WebElement getId2() {
			return id2;
		}
// Methods 
		 public void bookitern() {
			logButton(getIternery());
		}
		public void idcli() {
			logButton(getIdcheck());
		}
		public void id() {
			logButton(getId1());
		}
		public void id2() {
			logButton(getId2());
		}
		
		
		
		
		


}
