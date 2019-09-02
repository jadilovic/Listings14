import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class LafoLoginTest {

	LafoLogin login;
	String emptyPassword;
	String emptyUsername;
	String username;
	String password;
	String greaterThan10Chars;
	
	@Before
	public void setUp() {
		login = new LafoLogin();
		emptyPassword = "";
		emptyUsername = "";
		username = "asd";
		password = "asd";
		greaterThan10Chars = "asdasdasdasd";
	}
	
	@Test
	public void shouldReturnFalseWhenUsernameIsNull() {
		boolean result = login.login(null, password);
		assertFalse(result);
	}
	
	@Test
	public void shouldReturnFalseWhenPasswordIsNull() {
		boolean result = login.login(username, null);
		assertFalse(result);
	}
	
	@Test
	public void shouldReturnFalseWhenUsernameIsAnEmptyString() {
		boolean result = login.login(emptyUsername, password);
		assertFalse(result);
	}
	
	@Test
	public void shouldReturnFalseWhenPasswordIsAnEmptyString() {
		boolean result = login.login(username, emptyPassword);
		assertFalse(result);
	}

	@Test
	public void shouldReturnTrueWhenUsernameIsLessThan10Chars() {
		boolean result = login.login(username, password);
		assertTrue(result);
	}
	@Test
	public void shouldReturnFalseWhenUsernameIsGreaterThan10Chars() {
		boolean result = login.login(greaterThan10Chars, greaterThan10Chars);
		assertFalse(result);
	}
}
