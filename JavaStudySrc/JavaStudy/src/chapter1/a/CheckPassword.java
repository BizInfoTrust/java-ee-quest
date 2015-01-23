package chapter1.a;

import java.io.Console;

public class CheckPassword {

	private static final String passwd = "йцуке";

	public static void main(String[] args) {
		String passwIn = "";
		Console con = System.console();
		if (con==null)	{
			System.out.println("console is null!");
			//				return;
		}

		char[] passw = con.readPassword("Password: ");
		passwIn = String.valueOf(passw);
		System.out.println( (passwIn.equals(passwd))?"совпадает":"не совпадает" );
	}

}
