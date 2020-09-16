package com.runner;

import org.junit.AfterClass;
//import org.junit.AfterClass;
import org.junit.runner.RunWith;
import org.utilclass.adactin.AdactinCucumber;

//import com.stepdefinition.Jvmreport;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\resources",glue= {"com.stepdefinition"},
           dryRun=false,monochrome=true,plugin= {"pretty","json:src\\test\\resources\\Reports\\cucu.json"})
public class TestRunnerClass {
	
	//@AfterClass
	public static void tc1() {
		//Jvmreport.generateJvmreport(System.getProperty("user.dir") + "\\src\\test\\resources\\Reports\\cucu.json");
	}
	
	
}

 
  