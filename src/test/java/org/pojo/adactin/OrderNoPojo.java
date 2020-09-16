package org.pojo.adactin;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.utilclass.adactin.AdactinCucumber;

public class OrderNoPojo  extends AdactinCucumber{
	public OrderNoPojo() {
		PageFactory.initElements(d,this);
	
	}
	@FindBy(id="order_no")
	private WebElement bookno;
	public WebElement getBookno() {
		return bookno;
	}
	public void setBookno(WebElement bookno) {
		this.bookno = bookno;
	}
	
	public void bokno() {
	getvalue(getBookno());
	}

}
