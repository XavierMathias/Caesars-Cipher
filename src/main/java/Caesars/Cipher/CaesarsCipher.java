package Caesars.Cipher;

public class CaesarsCipher {
	
	private static final char LETTER_A = 'a';
	private static final char LETTER_Z = 'z';
	private static final int ALPHABET_SIZE = 26;
	
	public String cipher(String message, int offset) {
		offset %= ALPHABET_SIZE;
		char[] character = message.toCharArray(); // converts String message into a char array
		offSetBy(character, offset); 
		return new String(character); // returns ciphered message
	} // end of cipher

    // Goes through each character of the messaged array to offset, ignores spaces
	private void offSetBy(char[] character, int offset) {
		for(int i = 0; i < character.length; ++i) {
			if(character[i] != ' ') {
				character[i] = offSetChar(character[i], offset, LETTER_A, LETTER_Z);
			}
		}
		
	} // end of offSetBy
        
    // offsets each character, rotating it to the left or right
	private char offSetChar(char c, int offset, char letterA, char letterZ) {
		c += offset;
		if(c < letterA) {
				return (char) (c + ALPHABET_SIZE);
		}
		
		if(c > letterZ) {
				return (char) (c - ALPHABET_SIZE);
		}
		
		return c;
		
	} // end of offSetChar
} // end of class
