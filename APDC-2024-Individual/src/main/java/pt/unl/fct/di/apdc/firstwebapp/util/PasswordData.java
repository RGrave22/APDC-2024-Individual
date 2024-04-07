package pt.unl.fct.di.apdc.firstwebapp.util;

public class PasswordData {

	public String actualPassword;
	public String newPassword;
	public String newPasswordConfirmation;
	
	
	public PasswordData() {}
	
	public PasswordData(String actualPassword, String newPassword, String newPasswordConfirmation) {
		this.actualPassword = actualPassword;
		this.newPassword = newPassword;
		this.newPasswordConfirmation = newPasswordConfirmation;
	}
	


	public boolean validPassword() {
		
		/* Verifies if the password contains upper and lower cases, numbers, special caracters and at least 8 caracters
		 * 
		 */
		String passwordPattern = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=]).{8,}$";
		return newPassword.matches(passwordPattern);
	}


}
