package Caesars.Cipher;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;



class CaesarCipherTest {

	public CaesarsCipher cc = new CaesarsCipher();
	
	// Testing a random string with a random offset 
	@Test
	void testRandomCipheredmessageWithOffset() {
		int offset = Main.sr.nextInt(100);
		RandomString rs = new RandomString(Main.sr.nextInt(20));
		String randomMessage = rs.nextString();
		String encryptedMessage = cc.cipher(randomMessage, offset);
		
		assertEquals(cc.getEncryptedMessage(), encryptedMessage);
	}
	
	@Test
	void testCipheredMessageWith() {
		assertEquals( "? Zedwj adem m^e je ^Wd]ekj m_j^ jeZWoq", cc.cipher("I don't know who to hangout with today!", 80));
	}
	
	@Test
	void testEmptyString() {
		assertEquals("", cc.cipher("", 12));
	}
	


}
