/*
 *  In this class we are going to create a Regex pattern that helps us validate various email formats we deem acceptable
 *  
 *  The Regex pattern can be used to validate the vast majority of acceptable emails
 *  
 *  However, it must be noted that the Regex pattern does not consider the following rules of email validation
 *  
 *  1) That . (a single dot) is allowed provided that it is not the first or last character unless quoted and provided that it also does not appear consecutively unless quoted
 *  2) space and "(),:;<>@[\] characters are allowed with restrictions (they are only allowed inside a quoted string, as described in the paragraph below, and in addition, a backslash or double-quote must be preceded by a backslash)
 *  3) For the Domain aspect --> a hyphen - is allowed, provided that it is not the first or last character.
 *  
 *  Valid Emails:
 *  
 *  johnsmith@hotmail.com
 *  johnsmith55@hotmail.com
 *  john_smith@hotmail.com
 *  john.smith.1995@gmail.com
 *  john-smith@outlook.com
 *  johnsmith@hotmail.co.uk
 *  john@yahoo.com.np
 *  johnsmith@gmail.net
 *  johnsmith@yahoo.org
 *  johnsmith@abc.edu
 *  john!smith@gmail.com
 *  
 *  Invalid Emails:
 *  
 *  rachel.hotmail.com
 *  rachel.hotmail
 *  rachel@hotmail@com
 *  rachel@gmail(net)
 *  @gmail.rachel.com
 *  rachel@hotmail!.com
 *  
 */

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailValidator {

	public static void main(String[] args) {
		
		System.out.println("---------------------------------------------------------------------------------------------------");
		
		System.out.println("Passing through valid emails into the validator method and printing them out as they pass the test");
		
		System.out.println("---------------------------------------------------------------------------------------------------");
		
		System.out.println(EmailValidator.emailValidator("johnsmith@hotmail.com"));
		System.out.println(EmailValidator.emailValidator("johnsmith55@hotmail.com"));
		System.out.println(EmailValidator.emailValidator("john_smith@hotmail.com"));
		System.out.println(EmailValidator.emailValidator("john.smith.1995@gmail.com"));
		System.out.println(EmailValidator.emailValidator("john-smith@outlook.com"));
		System.out.println(EmailValidator.emailValidator("johnsmith@hotmail.co.uk"));
		System.out.println(EmailValidator.emailValidator("john@yahoo.com.np"));
		System.out.println(EmailValidator.emailValidator("johnsmith@gmail.net"));
		System.out.println(EmailValidator.emailValidator("johnsmith@yahoo.org"));
		System.out.println(EmailValidator.emailValidator("johnsmith@abc.edu"));
		System.out.println(EmailValidator.emailValidator("john!smith@gmail.com"));
		
		System.out.println("---------------------------------------------------------------------------------------------------");
		
		System.out.println("Passing through invalid emails into the validator method and printing them out N/A as they fail the test");
		
		System.out.println("---------------------------------------------------------------------------------------------------");
		
		System.out.println(EmailValidator.emailValidator("rachel.hotmail.com"));
		System.out.println(EmailValidator.emailValidator("rachel.hotmail"));
		System.out.println(EmailValidator.emailValidator("rachel@hotmail@com"));
		System.out.println(EmailValidator.emailValidator("rachel@gmail(net)"));
		System.out.println(EmailValidator.emailValidator("@gmail.rachel.com"));
		System.out.println(EmailValidator.emailValidator("rachel@hotmail!.com"));
	}

	public static String emailValidator(String email) {

		Pattern pattern = Pattern.compile("^[A-Za-z0-9._%+-=|#!*^{}]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,4}(\\.[A-Za-z]{2,4})?$");
		Matcher matcher = pattern.matcher(email);

		if (matcher.matches()) {
			return email;
		}
		return "N/A";

	}
}
