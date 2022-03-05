package com.validation;



import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.*;

public class Test
{
	public static boolean isValid(String email)
	{
		String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\."+
							"[a-zA-Z0-9_+&*-]+)*@" +
							"(?:[a-zA-Z0-9-]+\\.)+[a-z" +
							"A-Z]{2,7}$";
							
		Pattern pat = Pattern.compile(emailRegex);
		if (email == null)
			return false;
		return pat.matcher(email).matches();
	}

	public static void main(String[] args)
	{
		ArrayList<String> address = new ArrayList<>();
			
		address.add("raushanraj83.rr@gmail.com");
		address.add("writing.raj.org");
		address.add("raj33@gmail.com");
		address.add("gitashrivastava.in");
		address.add("ramswaroop@gmail.com");
		for(String i : address){
			if (isValid(i))
				System.out.println(i + " - Yes valid");
			else
				System.out.println(i + " - No its not valid email id");
		}
	}
}

