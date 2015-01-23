package chapter1.quest;

import java.io.IOException;

public class Quest4 {

	public static void main(String[] args) throws IOException { 
		byte b[]=new byte[80]; 
		for (int i=0;i<b.length;i++) 
			b[i]=(byte)System.in.read(); 
		
		System.out.print("Ok");    
	} 
}
