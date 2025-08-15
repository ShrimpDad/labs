package mavenTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import lab11_1.Security;

class securityTests {
	
	Security security;
	
	@BeforeEach
    void setup() {
        security = new Security();
    }
	
	@Test
	public void testLoginValidPasswordEmptyUserId() {
		String userId = "    ", password = "Freddy99";
		boolean actual = security.login(userId, password);
		boolean expected = false;
		assertEquals(expected, actual);
		// assertFalse(actual); // can also use this assert
	}
	
	@Test
	public void testLoginValidPasswordNullUserId() {
		String userId = "", password = "Freddy99";
		boolean actual = security.login(userId, password);
		boolean expected = false;
		assertEquals(expected, actual);
	}

	@Test
	public void testLoginValidIDEmptyPassword() {
		String userId = "1", password = "     ";
		boolean actual = security.login(userId, password);
		boolean expected = false;
		assertEquals(expected, actual);
	}

	@Test
	public void testLoginValidIDNullPassword() {
		String userId = "1", password = "";
		boolean actual = security.login(userId, password);
		boolean expected = false;
		assertEquals(expected, actual);
	}

	@Test
	public void testLoginValidIDPasswordTooShort() {
		String userId = "1", password = "1234567";
		boolean actual = security.login(userId, password);
		boolean expected = false;
		assertEquals(expected, actual);
	}

	@Test
	public void testLoginValidIDPasswordMissingUpperCase() {
		String userId = "1", password = "123456789";
		boolean actual = security.login(userId, password);
		boolean expected = false;
		assertEquals(expected, actual);
	}

	@Test
	public void testLoginValidIDPasswordMissingNumeric() {
		String userId = "1", password = "ABCDEFGHIJK";
		boolean actual = security.login(userId, password);
		boolean expected = false;
		assertEquals(expected, actual);
	}

	@Test
	public void testLoginValidIDPasswordValid() {
		String userId = "1", password = "ABCDEFGHIJa1";
		boolean actual = security.login(userId, password);
		boolean expected = true;
		assertEquals(expected, actual);
	}

}