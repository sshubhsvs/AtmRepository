package com.scribble.ATM;

public class Withdraw {

	public String check(String string) {
		if(string.equals("5000") || string.equals("10000"))
		return "Success";
		
		return "Failure";
	}

}
