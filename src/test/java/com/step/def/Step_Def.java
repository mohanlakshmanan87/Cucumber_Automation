package com.step.def;

import java.io.IOException;

import com.Automation.Baseclass.Base_Class;
import com.pagemanager.Page_object_Manager;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Step_Def  extends Base_Class{
	
	public static Page_object_Manager pom = new Page_object_Manager(driver);
	

   @Given("^user Launch The  Application$")
   public void user_Launch_The_Application() throws Throwable {
   
	 getUrl("http://automationpractice.com/index.php");
}


	

	@When("^user Click SignIn Button$")
	public void user_Click_SignIn_Button() throws Throwable {
		
		  clickonElement(pom.getLogin().getSign1());
	    
	}

	@When("^user Enter The Username in Username Textbox$")
	public void user_Enter_The_Username_in_Username_Textbox() throws Throwable {
		
		 String username = particularData("C:\\Users\\Admin\\eclipse-workspace\\Cucumber_Automation\\TestCase\\automation project test case.xlsx", 23, 5);
		 
		 inputvalueelement(pom.getLogin().getMailid1(), username);
	  
	}

	@When("^user Enter The Password in Password Textbox$")
	public void user_Enter_The_Password_in_Password_Textbox() throws Throwable {
		
		 String passwd = particularData("C:\\Users\\Admin\\eclipse-workspace\\Cucumber_Automation\\TestCase\\automation project test case.xlsx", 24, 5);
		
		inputvalueelement(pom.getLogin().getPassword1(), passwd);
		
	   
	}

	@Then("^user Click On The Login Button And It Navigate To The Dress Purchase Page$")
	public void user_Click_On_The_Login_Button_And_It_Navigate_To_The_Dress_Purchase_Page() throws Throwable {
		
		clickonElement(pom.getLogin().getlogin());
	    
	}

	@When("^user Click The Dress Icon$")
	public void user_Click_The_Dress_Icon() throws Throwable {
		
		clickonElement(pom.getD().getDress());
	
	}

	@When("^user Click The List Icon$")
	public void user_Click_The_List_Icon() throws Throwable {
		
		  clickonElement(pom.getD().getList());

	}

	@When("^user Click Printed Dress$")
	public void user_Click_Printed_Dress() throws Throwable {
		
		   clickonElement(pom.getD().getPdress());
	   
	}

	@When("^user Click Addto Cart1$")
	public void user_Click_Addto_Cart1() throws Throwable {
		
		clickonElement(pom.getD().getAddcart());

	}

	@When("^user Click Continue Shopping$")
	public void user_Click_Continue_Shopping() throws Throwable {
		
	    clickonElement(pom.getD().getConshopping());
	 
	}

	@Then("^User Click Signout$")
	public void user_Click_Signout() throws Throwable {
		
		 clickonElement(pom.getS1().getSignout1());
	   
	}

	@When("^user Click The Tshirts Icon$")
	public void user_Click_The_Tshirts_Icon() throws Throwable {
		
		 clickonElement(pom.getTs().getTshirts());
	  
	}
	
	@When("^user Click The List$")
	public void user_Click_The_List() throws Throwable {
		
		  clickonElement(pom.getD().getList());

	}
	

	@When("^user Click ShadedTshirt Dress$")
	public void user_Click_ShadedTshirt_Dress() throws Throwable {
		
		 clickonElement(pom.getTs().getFts());
		
		
	}
	
	@When("^user Click Addto Cart2$")
	public void user_Click_AddtoCart2() throws Throwable {
		
		clickonElement(pom.getTs().getAddtocart());

	}

	@When("^user Click Cont Shopping$")
	public void user_Click_Cont_Shopping() throws Throwable {
		
		clickonElement(pom.getTs().getConshop());
	 
	}

	@Then("^User Click Second Signout$")
	public void user_Click_Second_Signout() throws Throwable {
		
		clickonElement(pom.getS1().getSignout2());
	   
	}
	
	@When("^user Click The Women Icon$")
	public void user_Click_The_Women_Icon() throws Throwable {
		
		clickonElement(pom.getW().getWomen());
	 
	}
	
	@When("^user Click The List In Women$")
	public void user_Click_The_List_In_Women() throws Throwable {
		
		  clickonElement(pom.getD().getList());

	}

	@When("^user Click Fadedshorts Dress$")
	public void user_Click_Fadedshorts_Dress() throws Throwable {
		
		clickonElement(pom.getW().getFadedshorts());
		
		
	}
	
	
	
	@When("^user Click Addto Cart3$")
	public void user_Click_Addto_cart3() throws Throwable {
		
		 clickonElement(pom.getW().getAddtocart());

	}

	@When("^user Click Con Shop$")
	public void user_Click_Con_Shop() throws Throwable {
		
		clickonElement(pom.getW().getContinueshopping()); 
	 
	}

	@When("^user navigate Back$")
	public void user_navigate_Back() throws Throwable {
		
		 driver.navigate().back();
	
	}

	@When("^user Click Printed Summerdress Icon$")
	public void user_Click_Printed_Summerdress_Icon() throws Throwable {
		
		clickonElement(pom.getS().getSummerdress()); 
	   
	}

	@When("^user Enter The Quantity in Text Box$")
	public void user_Enter_The_Quantity_in_Text_Box() throws Throwable {
		
		pom.getS().getQuantity().clear();
		  
		  inputvalueelement(pom.getS().getQuantity(), particularData
			("C:\\Users\\Admin\\eclipse-workspace\\Cucumber_Automation\\TestCase\\automation project test case.xlsx", 30, 5));
	 
	}

	@When("^user Select The Size$")
	public void user_Select_The_Size() throws Throwable {
		
		dropdown("byvalue", pom.getS().getSize(), "3");
	  
	}

	@When("^user Select The Color$")
	public void user_Select_The_Color() throws Throwable {
		
		clickonElement(pom.getS().getColor());
	    
	}
	
	@When("^user Click Addto Cart4$")
	public void user_Click_Addto_Cart4() throws Throwable {
		
		clickonElement(pom.getS().getAddtoart());

	}

	@When("^user Click Cont Shop$")
	public void user_Click_Cont_Shop() throws Throwable {
		
		clickonElement(pom.getS().getContinueshopping());
	 
	}

	@When("^user Click View AllCart Icon$")
	public void user_Click_View_AllCart_Icon() throws Throwable {
		
		
		clickonElement(pom.getView().getViewmycart());
	    
	}

	@When("^user Click Proceed to Check$")
	public void user_Click_Proceed_to_Check() throws Throwable {
		
		clickonElement(pom.getP1().getPlcheck());
	  
	}

	@When("^user Again Click Proceed To Check$")
	public void user_Again_Click_Proceed_To_Check() throws Throwable {
		
		  clickonElement(pom.getP2().getP2check());

	}

	@When("^user Click Terms Of Service$")
	public void user_Click_Terms_Of_Service() throws Throwable {
		
		clickonElement(pom.getT().getTermsofservice());
	    
	}

	@When("^user Click proceed to check$")
	public void user_Click_proceed_to_check() throws Throwable {
		
		 clickonElement(pom.getP3().getP3check());
	  
	}

	@When("^user Click PayBank$")
	public void user_Click_PayBank() throws Throwable {
		
		  clickonElement(pom.getPay().getPaybank());
	    
	}

	@When("^user Click Confirm Order$")
	public void user_Click_Confirm_Order() throws Throwable {
		
		 clickonElement(pom.getC().getConfirmorder());	
	 
	}

	@When("^user Click Back To Order$")
	public void user_Click_Back_To_Order() throws Throwable {
		
		clickonElement(pom.getB().getBacktoorder());
	 
	}

	@Then("^user Click Third Signout$")
	public void user_Click_Third_Signout() throws Throwable {
		
		 clickonElement(pom.getS1().getSignout());
	   
	}
	
	
	@Before
	public static void before_Hooks(Scenario s) {
		
		  String name = s.getName();
		  
		  System.out.println("Scenario Name:"+ name);
		

	}

   @After
     public static void after_Hooks(Scenario s) throws IOException {
	   
	   if (s.isFailed()) {
		   
		   filehandler("C:\\Users\\Admin\\eclipse-workspace\\Cucumber_Automation\\Screenshot\\pic.png")  ;
		
		
	}
	   
	   String status = s.getStatus();
	   
	   System.out.println("Scenario Status:" + status);
	   

	}

}
