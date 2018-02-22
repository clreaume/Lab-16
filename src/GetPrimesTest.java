import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * 
 */

/**
 * @author creaume
 *
 */
class GetPrimesTest {

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeEach
	void setUp() throws Exception {
	}

	@Test
	void testIsPrime1() {
		boolean condition = GetPrimes.isPrime(17);
		assertTrue(condition);
	}
	
	@Test
	void testIsPrime2(){
		boolean condition = GetPrimes.isPrime(64);
		assertFalse(condition);
	}
	
	@Test
	void testGetPrime1() {
		assertEquals(3, GetPrimes.getPrime(2), "ERROR");
	}
	
	@Test
	void testGetPrime2() {
		assertEquals(41, GetPrimes.getPrime(13), "ERROR" );
	}
	
}
