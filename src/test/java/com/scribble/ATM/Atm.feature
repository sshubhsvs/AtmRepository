Feature: A Simple Atm Application
	Scenario: Performing Withdraw
	Given The Atm To Perform Withdraw 
	When The Input Is "10000"
	Then The Output For Success Is "Success".

	Scenario: Performing Withdraw
	Given The Atm To Perform Withdraw
	When The Input Is "5000" 
	Then The Output For Success Is "Success".

	Scenario: Declining Withdraw
	Given The Atm To Decline Withdraw
	When The Input Is Not "4000"
	Then The Output For Failure Is "Failure".

	Scenario: Declining Withdraw
	Given The Atm To Decline Withdraw
	When The Input Is Not "1000"
	Then The Output For Failure Is "Failure".



