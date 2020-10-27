package Caesars.Cipher;

public class Main {

	public static void main(String[] args) {
		
		CaesarsCipher cc = new CaesarsCipher(); // instantiate object
		String message = "Hello I finally made this ciphering project";
		int offset = 12;
		
                // stores ciphered message into a string
		String cryptedMessage = cc.cipher(message, offset);
		
		System.out.println("Message: " + message);
		System.out.println("Offset: " + offset);
		System.out.println("Crypted Message: " + cryptedMessage);	

	} // end of main

} // end of class
