package password_validation;

import java.util.Scanner;

public class PasswordValidation {

	public static void main(String[] args) {

		PasswordValidation checkPassword = new PasswordValidation();
		checkPassword.passwordValidation();
	}

	private void passwordValidation() {
// 		Password Validation Mini Project
		System.out.println("Password Validation Mini Project");

//		Local Variable Initializing
		int lowerCase = 0;
		int upperCase = 0;
		int specialChar = 0;
		int numbers = 0;
		boolean valid = false;

//		Store old password using string array
		String[] oldPassword = { "Arun4587@", "arunKumar12$", "ARUNs7458#$" };

//		Get Input from user
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your password : ");
		String passValue = sc.nextLine();
		

//		Check passValue at least 8 character
		if (passValue.length() >= 8)
			valid = true;
		else {
			System.out.println("Please enter your password atleast 8 character");
			System.out.print("Enter your password : ");
		passValue = sc.nextLine();
		sc.close();
		}

//		Check some conditions - At least One - UpperCase, LowerCase, Number and Special Character
		for (int i = 0; i < passValue.length(); i++) {
//			Check the Capital Letter present in passValue
			if (passValue.charAt(i) >= 'A' && passValue.charAt(i) <= 'Z') {
				upperCase++;
			}
//			Check the Small Letter present in passValue
			else if (passValue.charAt(i) >= 'a' && passValue.charAt(i) <= 'z') {
				lowerCase++;
			}
//			Check the Numbers present in passValue
			else if (passValue.charAt(i) >= '0' && passValue.charAt(i) <= '9') {
				numbers++;
			}
//			Check the Special Character present in passValue using ASCII Values
			else if ((passValue.charAt(i) >= 33 && passValue.charAt(i) <= 47)
					|| (passValue.charAt(i) >= 58 && passValue.charAt(i) <= 64)
					|| (passValue.charAt(i) >= 94 && passValue.charAt(i) <= 96)
					|| (passValue.charAt(i) >= 123 && passValue.charAt(i) <= 126)) {
				specialChar++;
			}
			
		}

//		Check Last 3 password in current password
		for (int i = 0; i < oldPassword.length; i++) {
//			The given password to check already stored password using equals method
			if (passValue.equals(oldPassword[i])) {
				valid = true;
				System.out.println("This Password already use. Can you try different password.");
				break;
			}
		}
		
//		All conditions are satisfied. 
		if(upperCase!=0 && lowerCase!=0 && numbers!=0 && specialChar!=0)
		{
		System.out.println("Password Successfully Created.");	
		}
		else {
//		Incase passValue don't follow the above condition. This message will display to user.
		if (upperCase == 0)
			System.out.println("Enter atleast One Capital Letter.");
		if (lowerCase == 0)
			System.out.println("Enter atleast One Small Letter.");
		if (numbers == 0)
			System.out.println("Enter atleast One Number.");
		if (specialChar == 0)
			System.out.println("Enter atleast One Special Character.");
		}
		

	}
	

}
