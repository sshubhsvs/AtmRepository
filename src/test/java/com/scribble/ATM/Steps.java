package com.scribble.ATM;

import static org.junit.Assert.assertEquals;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Steps {

	Withdraw withdraw;
	private String result ;		
		
		@Given("The Atm To Perform Withdraw")
		public void the_Atm_To_Perform_Withdraw() {
		    withdraw = new Withdraw();
		    
		}
		
		@When("The Input Is {string}")
		public void the_Input_Is(String string) {
		    result = withdraw.check(string);
		}
		
		@Then("The Output For Success Is {string}.")
		public void the_Output_For_Success_Is(String expectedResult) {
		    assertEquals(expectedResult, result);
		}
		
		@Given("The Atm To Decline Withdraw")
		public void the_Atm_To_Decline_Withdraw() {
		    withdraw = new Withdraw();


		}
		
		@When("The Input Is Not {string}")
		public void the_Input_Is_Not(String string) {
		    result = withdraw.check(string);

		}
		
		@Then("The Output For Failure Is {string}.")
		public void the_Output_For_Failure_Is(String expectedResult) {
		    assertEquals(expectedResult, result);

		}
		
		
			
			

}
