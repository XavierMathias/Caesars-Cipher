package Caesars.Cipher;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CaesarCipherTest {

	private CaesarsCipher cc = new CaesarsCipher();

	@Test
	void testCipheredmessageWithOffsetOf12() {
		assertEquals("nqxxa o ruzmxxk ympq ftue oubtqduzs bdavqof", cc.cipher("Hello I finally made this ciphering project", 12));
	}
	
	@Test
	void testEmptyString() {
		assertEquals("", cc.cipher("", 12));
	}
	

}
