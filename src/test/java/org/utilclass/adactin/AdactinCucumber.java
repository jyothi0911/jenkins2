package org.utilclass.adactin;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.net.MalformedURLException;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;

public class AdactinCucumber {
	public static WebDriver d;
	public static Actions a;
	public static Robot r;
	 public static Select s;
	 public static Alert alrt; 
	public static JavascriptExecutor j;
	 public static final String AUTOMATE_USERNAME = "jyothigajula1";
	  public static final String AUTOMATE_ACCESS_KEY = "fw24M2ux3m3jY4yrzgLu";
	  public static final String URL = "https://" + AUTOMATE_USERNAME + ":" + AUTOMATE_ACCESS_KEY 
			  + "@hub-cloud.browserstack.com/wd/hub";
	
	public static WebDriver getclouddriver() throws MalformedURLException {
		if(d==null) {
		 DesiredCapabilities caps = new DesiredCapabilities();
		 caps.setCapability("os_version", "10");
		    caps.setCapability("resolution", "1920x1080");
		    caps.setCapability("browser", "Chrome");
		    caps.setCapability("browser_version", "latest");
		    caps.setCapability("os", "Windows");    
		     d = new RemoteWebDriver(new java.net.URL(URL), caps);
		}
		return d;
	}
	
	 public static WebDriver browserlaunch() {
		 
		 if(d==null) {
			 
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\bbhas\\eclipse-workspace\\CucumberClass\\drivers\\chromedriver.exe");
	     d=new ChromeDriver();
		
      }
		return d;
	 }
	 public void maxwindow() {
		 d.manage().window().maximize();
	 }
	 public void time() {
	 
		 d.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	 }
	 public  void getUrl(String url) {
		 d.get(url);
	 }
	 public  void titleurl() {
		String s=d.getTitle();
		System.out.println(s);
	 }
	 public  void currentUrl() {
		String s1= d.getCurrentUrl();
		System.out.println(s1);
	 }
	 public  String getValue(WebElement e){
		 j=(JavascriptExecutor)d;
		 Object o= j.executeScript("return arguments[0].getAttribute('value')",e);
		 String s=(String)o;
		  return s;
	 }
	 
	
	public void sendkey( WebElement e,String s3) {
            e.sendKeys(s3);
		 
	 }
	 public  void logButton(WebElement e) {
			e.click(); 
			 
		 }
	 public static  void end() {
		 d.quit();
	 }
	 
	 public String getvalue(WebElement ele) {
		return ele.getAttribute("value");
	 }
	 
	 public  void overAct(WebElement e) {
			a=new Actions(d);
			a.moveToElement(e).click().perform();
	 }
	 public void overAc(WebElement e) {
		
		 a=new Actions(d);
			a.moveToElement(e).perform(); 

	}
	 public void select(WebElement e ,String l) {
	Select  s=new Select(e);
	//List<WebElement> l=s.getOptions();
	 s.selectByValue(l);
	 }
	 public void selectText(WebElement e ,String v){
		 Select  s=new Select(e);
		 s.deselectByVisibleText(v);
		 
	 }
	 public static void keyDown( ) throws AWTException{
		 r=new Robot();
		//for(int i=0;i<3;i++) {
		   r.keyPress(KeyEvent.VK_DOWN);
		   r.keyRelease(KeyEvent.VK_DOWN);
		//}//
	 }
	 public static void keyEnter() throws AWTException {
	 r=new Robot();
		 r.keyPress(KeyEvent.VK_ENTER);
		 r.keyRelease(KeyEvent.VK_ENTER);
	 }
	 public static void windHandle() {
		 String s2=d.getWindowHandle();
		 Set<String> s3=d.getWindowHandles();
		 for (String s4 : s3) {
			 if(!s3.equals(s4)) {
				 d.switchTo().window(s4);
			 }
			 
		}
	 }
	
	 public static void sDown(WebElement e) {
		 //typecasting
		 JavascriptExecutor jk=(JavascriptExecutor)d;
		 jk.executeScript("arguments[0].ScrollIntoView(true)",e );
		}
	 public static void sup(String s,WebElement e) {
		 
		 JavascriptExecutor jk=(JavascriptExecutor)d;
		 jk.executeScript(s, e);
	}
	 
	 //Alert
public void	 ok() {
	d.switchTo().alert().accept();
	
}
public void alrtmesg() {
	String  al=d.switchTo().alert().getText();
	System.out.println(al);
}




}
