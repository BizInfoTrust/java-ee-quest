package chapter1.a;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Hello {

	public static void main(String[] args) {
		String userName = "";
		InputStreamReader in = new InputStreamReader(System.in);
		BufferedReader bis = new BufferedReader(in);
		
		try	{
			System.out.println("��� �����?");
			userName = bis.readLine();
			System.out.println("������, " + userName);
		} catch (IOException ioe)	{
			ioe.printStackTrace();
		}
		
	}

}
