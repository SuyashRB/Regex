/*
 *  In this class we are going to create a Regex pattern that validates phone numbers written in a acceptable format
 *  
 *  Valid Phone Number formats include:
 *  
 *  1234567890
 *  123-456-7890
 *  123.456.7890
 *  123 456 7890
 *  (123) 456 7890
 *  (123)-456-7890
 *  (123) 456-7890
 *  
 *  Invalid Phone Number Formats include:
 *  
 *  12345678
 *  123-123-123-1
 *  (123)(456)(7890)
 *  123(456)7890
 *  123..456..7890
 *  
 */

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhoneNumberValidator {

	public static void main(String[] args) {
		
		System.out.println("---------------------------------------------------------------------------------------------------");
		
		System.out.println("Passing through valid phone number formats into our method to return the numbers that pass the format test");
		
		System.out.println("---------------------------------------------------------------------------------------------------");
		
		System.out.println(PhoneNumberValidator.PhoneNumber("1234567890"));
		System.out.println(PhoneNumberValidator.PhoneNumber("123-456-7890"));
		System.out.println(PhoneNumberValidator.PhoneNumber("123.456.7890"));
		System.out.println(PhoneNumberValidator.PhoneNumber("123 456 7890"));
		System.out.println(PhoneNumberValidator.PhoneNumber("(123) 456 7890"));
		System.out.println(PhoneNumberValidator.PhoneNumber("(123)-456-7890"));
		System.out.println(PhoneNumberValidator.PhoneNumber("(123) 456-7890"));
		
		System.out.println("---------------------------------------------------------------------------------------------------");
		
		System.out.println("Passing through invalid phone number formats into our method to prove they fail the validation");
		
		System.out.println("---------------------------------------------------------------------------------------------------");
		
		System.out.println(PhoneNumberValidator.PhoneNumber("12345678"));
		System.out.println(PhoneNumberValidator.PhoneNumber("123-123-123-1"));
		System.out.println(PhoneNumberValidator.PhoneNumber("(123)(456)(7890)"));
		System.out.println(PhoneNumberValidator.PhoneNumber("123(456)7890"));
		System.out.println(PhoneNumberValidator.PhoneNumber("123..456..7890"));
	}
	
	public static String PhoneNumber(String phoneNumber) {

		Pattern pattern = Pattern.compile("^\\(?([0-9]{3})\\)?[-.\\s]?([0-9]{3})[-.\\s]?([0-9]{4})$");
		Matcher matcher = pattern.matcher(phoneNumber);

		if (matcher.matches()) {
			return phoneNumber;
		}
		return "N/A";
	}
}
