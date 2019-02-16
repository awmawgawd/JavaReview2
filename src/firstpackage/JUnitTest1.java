package firstpackage;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class JUnitTest1 {
	
	String first = "elementary";
	String second = "secondary";
	
	
	
	
	@Test
	// @DisplayName will replace default test name
	@DisplayName("Test 1")
	void testEqual() {
		//fail("Not yet implemented");
		
		System.out.println("Test 1");
		// This will give an error because 'elementary' != 'secondary'
		assertEquals(first, second);
		
	}
	
	@Test
	void testFirstIsElementary() {
		System.out.println("Test 2");
		assertEquals(first, "elementary");
	}
	
	@Test
	void testSecondIsSecondary() {
		System.out.println("Test 3");
		assertEquals(second, "secondary");
	}

}
