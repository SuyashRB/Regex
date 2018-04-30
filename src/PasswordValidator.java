/*
 *  In this class we will create a Regex pattern to validate passwords
 *  
 *  Password must contain the following:
 *  
 *  1) At least 1 lower case letter
 *  2) At least 1 upper case letter
 *  3) At least 1 digit
 *  4) At least 1 special character
 *  5) At least 8 characters long in total
 *  6) No whitespaces allowed
 */

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PasswordValidator {

	public static void main(String[] args) {
		
		System.out.println("---------------------------------------------------------------------------------------------------");
		
		System.out.println("Passing through valid password into the validator method and printing them out if they pass the test");
		
		System.out.println("---------------------------------------------------------------------------------------------------");
		
		System.out.println(PasswordValidator.passwordValidator("Password123!"));
		System.out.println(PasswordValidator.passwordValidator("P@55w0rd123"));
		System.out.println(PasswordValidator.passwordValidator("P*ssw*rd55"));
		System.out.println(PasswordValidator.passwordValidator("$pecialPW2018"));
		System.out.println(PasswordValidator.passwordValidator("1@We34%t&f^G"));
		
		System.out.println("---------------------------------------------------------------------------------------------------");
		
		System.out.println("Passing through invalid password into the validator method and printing them out N/A as they fail the test");
		
		System.out.println("---------------------------------------------------------------------------------------------------");
		
		System.out.println(PasswordValidator.passwordValidator("Word1!")); 			//Not 8 characters long
		System.out.println(PasswordValidator.passwordValidator("PASSword123"));		//No special character included
		System.out.println(PasswordValidator.passwordValidator("password!123"));	//No uppercase letter
		System.out.println(PasswordValidator.passwordValidator("Password!!!"));		//No digit
		System.out.println(PasswordValidator.passwordValidator("123456789"));		//Only digits
		
	}
	
	public static String passwordValidator(String password) {

		Pattern pattern = Pattern.compile("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#$%^&*()_+\\-=\\[\\]{};’:”\\|,.<>\\/?])(?=\\S+$).{8,}$");
		Matcher matcher = pattern.matcher(password);

		if (matcher.matches()) {
			return password;
		}
		return "N/A";

	}

}
