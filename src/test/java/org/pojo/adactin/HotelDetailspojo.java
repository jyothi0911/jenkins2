package org.pojo.adactin;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.utilclass.adactin.AdactinCucumber;

public class HotelDetailspojo extends AdactinCucumber {
	
	public HotelDetailspojo() {
	PageFactory.initElements(d , this);
	
}
@FindBy(id="location")
private WebElement loc;
//@FindBy(xpath="//option[@value='London']")
//private WebElement hotloc;

@FindBy(id="hotels")
private WebElement  hotel;

@FindBy(id="room_type")
private WebElement room;

@FindBy(xpath="//select[@name='room_nos']")
private WebElement roomno;

@FindBy(id="datepick_in")
private WebElement chindate;

@FindBy(id="datepick_out")
private WebElement choutdate;

@FindBy(id="adult_room")
private WebElement Adultroom;

@FindBy(id="child_room")
private WebElement childrm;

@FindBy(id="Submit")
private WebElement search;

@FindBy(id="Reset")
private WebElement rset;

public WebElement getSearch() {
	return search;
}
public WebElement getRset() {
	return rset;
}
public WebElement getRoom() {
	return room;
}
public WebElement getRoomno() {
	return roomno;
}
public WebElement getChindate() {
	return chindate;
}
public WebElement getChoutdate() {
	return choutdate;
}
public WebElement getAdultroom() {
	return Adultroom;
}
public WebElement getChildrm() {
	return childrm;
}
public WebElement getHotel() {
	return hotel;
}
public WebElement getLoc() {
	return loc;
}

public void details(String location,String hname, String roomtype,String norooms) {
	select(getLoc(),location);
	select(getHotel(),hname);
	select(getRoom(),roomtype);
	select(getRoomno(),norooms);
}
public void datedetails(String in, String out, String adult,String child) {
sendkey(getChindate(),in);
sendkey(getChoutdate(),out);
select(getAdultroom(),adult);
select(getChildrm(),child);
}
public void srch() {
	logButton(getSearch());
}

public void reset() {
	logButton(getRset());
	
	
}
public void datadetails1(String location,String hname,String roomtype,String in,String out) {
	select(getLoc(),location);
	select(getHotel(),hname);
	select(getRoom(),roomtype);
	sendkey(getChindate(),in);
	sendkey(getChoutdate(),out);
}
public void room() {
	select(getRoomno(),"room");
}
public void chid() {
	select(getChildrm(),"child");
	
}

public void adlt() {
	select(getAdultroom(),"adult");
}
}


  