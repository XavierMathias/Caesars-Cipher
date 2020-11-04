package Caesars.Cipher;

public class CaesarsCipher {
	
	private static final char ASCII_START = '!';
	private static final char ASCII_END = 'z';
	private static final int ASCII_SIZE = 90;
	protected static String em = "";
	protected static String message = "";
	
	public String cipher(String message, int offset) {
		this.message = message;
		offset %= ASCII_SIZE;
		char[] character = message.toCharArray(); // converts String message into a char array
		offSetBy(character, offset);
		em = new String(character); 
		return em;// returns ciphered message
	} // end of cipher

    // Goes through each character of the messaged array to offset, ignores spaces
	private void offSetBy(char[] character, int offset) {
		for(int i = 0; i < character.length; ++i) {
			if(character[i] != ' ') {
				character[i] = offSetChar(character[i], offset, ASCII_START, ASCII_END);
			}
		}
		
	} // end of offSetBy
        
    // offsets each character, rotating it to the left or right
	private char offSetChar(char c, int offset, char charStart, char charEnd) {
		c += offset;
		if(c < charStart) {
				return (char) (c + ASCII_SIZE);
		}
		
		if(c > charEnd) {
				return (char) (c - ASCII_SIZE);
		}
		
		return c;
		
	} // end of offSetChar
	
	protected String getEncryptedMessage() {
		return em;
	} // end getEncryptedMessage
	
	protected String getMessage() {
		return message;
	} // end of getMessage

	
} // end of class
