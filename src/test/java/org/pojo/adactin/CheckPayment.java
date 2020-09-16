package org.pojo.adactin;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.utilclass.adactin.AdactinCucumber;

public class CheckPayment extends AdactinCucumber{
	
	public CheckPayment() {
	PageFactory.initElements(d, this);
	
}
@FindBy(id="radiobutton_0")
private WebElement radibuton;
@FindBy(id="continue")
private WebElement contiu;
@FindBy(id="cancel")
private WebElement cansl;

public WebElement getRadibuton() {
	return radibuton;
}
public WebElement getContiu() {
	return contiu;
}
public WebElement getCansl() {
	return cansl;
}

public void rdbuton() {
	logButton(getRadibuton());
	
}
public void contu() {
	logButton(getContiu());
}
public void casl() {
	logButton(getCansl());
}


}



