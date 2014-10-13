package Main;

import org.junit.Test;

import junit.framework.TestCase;

public class JUnitTest extends TestCase{

	@Test
	public void testFutureValue() {
		
		Calc test = new Calc();
		
		assertEquals("Future Amount is : $5304.5",5304.5,test.FutureValue(5000, 2, 3));
		
		assertEquals("Future Amount is : $106.12",106.12,test.FutureValue(100, 3, 2));

		
	}
}