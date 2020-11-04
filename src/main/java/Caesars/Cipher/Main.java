package Caesars.Cipher;

import java.util.Scanner;
import java.security.SecureRandom;

public class Main {
	
	public static final Scanner input = new Scanner(System.in);
	public static final SecureRandom sr = new SecureRandom();
	public static final CaesarsCipher cc = new CaesarsCipher(); // instantiate object
	public static void main(String[] args) {
		
		System.out.println("Enter the message that you want to encrypt: ");
		String message = input.nextLine();
		int offset = sr.nextInt(100);
		
                // stores ciphered message into a string
		String cryptedMessage = cc.cipher(message, offset);
		
		System.out.println("Message: " + message);
		System.out.println("Offset: " + offset);
		System.out.println("Crypted Message: " + cryptedMessage);	
		
		input.close();
	} // end of main
	

} // end of class
