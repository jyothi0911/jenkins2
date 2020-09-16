package com.manager;

import org.pojo.adactin.BookIternary;
import org.pojo.adactin.BookingPojo;
import org.pojo.adactin.CheckPayment;
import org.pojo.adactin.HotelDetailspojo;
import org.pojo.adactin.LoginAdactPojo;
import org.pojo.adactin.OrderNoPojo;
import org.pojo.adactin.SelectHotelAdact;

public class PageObjectManager  {
	private static PageObjectManager pageObjectManager;
	
	 private  LoginAdactPojo loginAdactinPojo;
	 private  SelectHotelAdact selectHotelAdact;
	 private  CheckPayment checkPayment;
	 private HotelDetailspojo hotelDetailspojo;
	 private OrderNoPojo orderNoPojo;
	 private BookIternary bookIternary;
	
	 public static PageObjectManager getInstance() {
		 if(pageObjectManager ==null) {
			 pageObjectManager =new PageObjectManager();
		 }
		return pageObjectManager;
	}
	 
	public LoginAdactPojo getLoginAdactinPojo() {
		if(loginAdactinPojo==null) {
			loginAdactinPojo=new LoginAdactPojo();	
		}
		System.out.println(loginAdactinPojo);
		
		return loginAdactinPojo;
	}
	public SelectHotelAdact getSelectHotelAdact() {
		
		return (selectHotelAdact== null)? selectHotelAdact=new SelectHotelAdact(): selectHotelAdact;
	}
	public CheckPayment getCheckPayment() {
		return (checkPayment==null)? checkPayment=new CheckPayment(): checkPayment;
	}
	public HotelDetailspojo getHotelDetailspojo() {
		return (hotelDetailspojo==null)?hotelDetailspojo=new HotelDetailspojo():hotelDetailspojo;
	}
	public OrderNoPojo getOrderNoPojo() {
		return (orderNoPojo==null)?orderNoPojo=new OrderNoPojo():orderNoPojo;
	}

	public BookIternary getBookIternary() {
		return (bookIternary==null)?bookIternary=new BookIternary():bookIternary;
	}
	

	 

}
