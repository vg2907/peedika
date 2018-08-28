package com.vg;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailRegex {
	
	public static void main(String[] args) {
		System.out.println(validateEmail("foo@bar.com"));
	}
	
	  public static boolean validateEmail(String input) {
		    String emailPattern = "^[a-zA-Z0-9_.]+@[a-z-.]+\\.(com|org|net)";
		    Pattern pattern = Pattern.compile(emailPattern);
		    
		    Matcher matcher = pattern.matcher(input);
		    return matcher.find();
	}


}
