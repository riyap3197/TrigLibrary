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
	void sinTestWithPositiveInfinity() throws CustomException {
		double input = Double.POSITIVE_INFINITY;
		assertThrows(CustomException.class, () -> {TrigLib.sine(input);}, "Throws Exception");
	}
	
	@Test
	void sinTestWithNegativeInfinity() throws CustomException {
		double input = Double.NEGATIVE_INFINITY;
		assertThrows(CustomException.class, () -> {TrigLib.sine(input);}, "Throws Exception");
	}
	
	@Test
	void cosTestWithDegreeInput() throws CustomException {
		double input = 60;
		double actual = 0.5000000000000001;
		double result = TrigLib.cosine(input);
		assertNotEquals(result, actual, "Output is not as expected as input is not converted to radians");
	}
	
	@Test
	void cosTestWithRadiansInput() throws CustomException {
		double input = 1.0471975511965976;
		double actual = 0.5000000000000001;
		double result = TrigLib.cosine(input);
		assertEquals(result, actual, "Output is as expected as input is in radians");
	}
	
	@Test
	void cosTestWithConvertingToRadians() throws CustomException {
		double input = 60;
		double actual = 0.5000000000000001;
		double result1 = TrigLib.toRadians(input);
		double result = TrigLib.cosine(result1);
		assertEquals(result, actual, "Output is as expected as input is converted to radians");
	}
	
	@Test
	void cosTestWithPositiveInfinity() throws CustomException {
		double input = Double.POSITIVE_INFINITY;
		assertThrows(CustomException.class, () -> {TrigLib.cosine(input);}, "Throws Exception");
	}
	
	@Test
	void cosTestWithNegativeInfinity() throws CustomException {
		double input = Double.NEGATIVE_INFINITY;
		assertThrows(CustomException.class, () -> {TrigLib.cosine(input);}, "Throws Exception");
	}
	
	@Test
	void tanTestWithDegreeInput() throws CustomException {
		double input = 30;
		double actual = 0.5773502691896257;
		double result = TrigLib.tan(input);
		assertNotEquals(result, actual, "Output is not as expected as input is not converted to radians");
	}
	
	@Test
	void tanTestWithRadiansInput() throws CustomException {
		double input = 0.5235987755982988;
		double actual = 0.5773502691896257;
		double result = TrigLib.tan(input);
		assertEquals(result, actual, "Output is as expected as input is in radians");
	}
	
	@Test
	void tanTestWithConvertingToRadians() throws CustomException {
		double input = 30;
		double actual = 0.5773502691896257;
		double result1 = TrigLib.toRadians(input);
		double result = TrigLib.tan(result1);
		assertEquals(result, actual, "Output is as expected as input is converted to radians");
	}
	
	@Test
	void tanTestWithPositiveInfinity() throws CustomException {
		double input = Double.POSITIVE_INFINITY;
		assertThrows(CustomException.class, () -> {TrigLib.tan(input);}, "Throws Exception");
	}
	
	@Test
	void tanTestWithNegativeInfinity() throws CustomException {
		double input = Double.NEGATIVE_INFINITY;
		assertThrows(CustomException.class, () -> {TrigLib.tan(input);}, "Throws Exception");
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
