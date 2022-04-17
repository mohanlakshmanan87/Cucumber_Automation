package com.automation.Runner;

import org.junit.AfterClass;

import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.Automation.Baseclass.Base_Class;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


    @RunWith(Cucumber.class)
	@CucumberOptions(
			
			
			features = "C:\\Users\\Admin\\eclipse-workspace\\Cucumber_Automation\\src\\test\\java\\com\\automation\\feature\\Automation.feature",
			
			glue = "com.step.def",
			
			plugin = {
					
					"html: Cucumber_Reports/Rep",
					"json: Cucumber_Reports/Report.json",
					"com.cucumber.listener.ExtentCucumberFormatter:Cucumber_Reports/Ext.html"
					
					
					
			}
	
	)
	

public class Test_Runner {
	
    	 public static WebDriver driver;
    	  
        @BeforeClass
        public static void set_up() {
      	
  		 driver = Base_Class.browser_configuration("chrome");

  	}
      	
        @AfterClass
        public static void tear_Down() {
      	  
  		 Base_Class.close();

  	}
  			
  			
  			
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
