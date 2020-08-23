package trig.test;

import static org.junit.Assert.assertFalse;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import trig.main.*;

class TrigLibTest {

	@Test
	void sinTestWithDegreeInput() throws CustomException {
		double input = 90;
		double actual = 1.0000000000000002;
		double result = TrigLib.sine(input);
		assertNotEquals(result, actual, "Output is not as expected as input is not converted to radians");
	}
	
	@Test
	void sinTestWithRadiansInput() throws CustomException {
		double input = 1.5707963267948966;
		double actual = 1.0000000000000002;
		double result = TrigLib.sine(input);
		assertEquals(result, actual, "Output is as expected as input is in radians");
	}
	
	@Test
	void sinTestWithConvertingToRadians() throws CustomException {
		double input = 90;
		double actual = 1.0000000000000002;
		double result1 = TrigLib.toRadians(input);
		double result = TrigLib.sine(result1);
		assertEquals(result, actual, "Output is as expected as input is converted to radians");
	}
	
	@Test
	void cosTest() {
		fail("Not yet implemented");
	}
	
	@Test
	void tanTest() {
		fail("Not yet implemented");
	}
	
	@Test
	void toDegreeTest() {
		fail("Not yet implemented");
	}
	
	@Test
	void toRadiansTest() {
		fail("Not yet implemented");
	}

}
