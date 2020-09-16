package org.pojo.adactin;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.utilclass.adactin.AdactinCucumber;

public class SelectHotelAdact extends AdactinCucumber {
	public SelectHotelAdact() {
	PageFactory.initElements(d, this);
}
@FindBy(id="first_name")
private WebElement fname;
@FindBy(id="last_name")
private WebElement lname;

@FindBy(id="address")
private WebElement addrs;


public WebElement getLname() {
	return lname;
}
public WebElement getAddrs() {
	return addrs;
}
public WebElement getCardno() {
	return cardno;
}
public WebElement getCardtype() {
	return cardtype;
}
public WebElement getExmont() {
	return exmont;
}
public WebElement getExyer() {
	return exyer;
}
public WebElement getCvv() {
	return cvv;
}
public WebElement getBook() {
	return book;
}
@FindBy(id="cc_num")
private WebElement cardno;

@FindBy(id="cc_type")
private WebElement cardtype;

@FindBy(id="cc_exp_month")
private WebElement exmont;

@FindBy(id="cc_exp_year")
private WebElement exyer;

@FindBy(id="cc_cvv")
private WebElement cvv;

@FindBy(id="book_now")
private WebElement book;

@FindBy (id="cancel")
private WebElement cacle;


public WebElement getCacle() {
return cacle;
}
public WebElement getFname() {
	return fname;
}
  public void firtname(String fname,String lname,String add,String ccno,String cctype,String xmon,String xyr,String cvv) {
	  sendkey(getFname(),fname);
	  sendkey(getLname(),lname);
	  sendkey(getAddrs(),add);
	  sendkey(getCardno(),ccno);
	 sendkey(getCardtype(),cctype);
	  sendkey(getExmont(),xmon);
	  sendkey(getExyer(),xyr);
	  sendkey(getCvv(),cvv);
 }
  
  
 public void bookhotel(){
	 logButton(getBook());
}
 public void canl() {
	 logButton(getCacle());
 }
}
