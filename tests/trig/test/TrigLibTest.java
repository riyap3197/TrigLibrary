package trig.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import trig.main.*;

class TrigLibTest {

	/**
	 * Tests sine functionality with degree input
	 * without converting to radians.
	 * Result is not as expected.
	 * 
	 * @throws CustomException
	 */
	@Test
	void sinTestWithDegreeInput() throws CustomException {
		double input = 90;
		double actual = 1.0000000000000002;
		double result = TrigLib.sine(input);
		assertNotEquals(result, actual, "Output is not as expected as input is not converted to radians");
	}
	
	/**
	 * Tests sine functionality with radian input.
	 * 
	 * @throws CustomException
	 */
	@Test
	void sinTestWithRadiansInput() throws CustomException {
		double input = 1.5707963267948966;
		double actual = 1.0000000000000002;
		double result = TrigLib.sine(input);
		assertEquals(result, actual, "Output is as expected as input is in radians");
	}
	
	/**
	 * Tests sine functionality with degree input
	 * by converting it to radians.
	 * 
	 * @throws CustomException
	 */
	@Test
	void sinTestWithConvertingToRadians() throws CustomException {
		double input = 90;
		double actual = 1.0000000000000002;
		double result1 = TrigLib.toRadians(input);
		double result = TrigLib.sine(result1);
		assertEquals(result, actual, "Output is as expected as input is converted to radians");
	}
	
	/**
	 * Tests sine functionality for positive infinity
	 * to check for exception.
	 * 
	 * @throws CustomException
	 */
	@Test
	void sinTestWithPositiveInfinity() throws CustomException {
		double input = Double.POSITIVE_INFINITY;
		assertThrows(CustomException.class, () -> {TrigLib.sine(input);}, "Throws Exception");
	}
	
	/**
	 * Tests sine functionality for negative infinity
	 * to check for exception.
	 * 
	 * @throws CustomException
	 */
	@Test
	void sinTestWithNegativeInfinity() throws CustomException {
		double input = Double.NEGATIVE_INFINITY;
		assertThrows(CustomException.class, () -> {TrigLib.sine(input);}, "Throws Exception");
	}
	
	/**
	 * Tests cosine functionality with degree input
	 * without converting to radians.
	 * Result is not as expected.
	 * 
	 * @throws CustomException
	 */
	@Test
	void cosTestWithDegreeInput() throws CustomException {
		double input = 60;
		double actual = 0.5000000000000001;
		double result = TrigLib.cosine(input);
		assertNotEquals(result, actual, "Output is not as expected as input is not converted to radians");
	}
	
	/**
	 * Tests cosine functionality with radian input.
	 * 
	 * @throws CustomException
	 */
	@Test
	void cosTestWithRadiansInput() throws CustomException {
		double input = 1.0471975511965976;
		double actual = 0.5000000000000001;
		double result = TrigLib.cosine(input);
		assertEquals(result, actual, "Output is as expected as input is in radians");
	}
	
	/**
	 * Tests cosine functionality with degree input
	 * by converting it to radians.
	 * 
	 * @throws CustomException
	 */
	@Test
	void cosTestWithConvertingToRadians() throws CustomException {
		double input = 60;
		double actual = 0.5000000000000001;
		double result1 = TrigLib.toRadians(input);
		double result = TrigLib.cosine(result1);
		assertEquals(result, actual, "Output is as expected as input is converted to radians");
	}
	
	/**
	 * Tests cosine functionality for positive infinity
	 * to check for exception.
	 * 
	 * @throws CustomException
	 */
	@Test
	void cosTestWithPositiveInfinity() throws CustomException {
		double input = Double.POSITIVE_INFINITY;
		assertThrows(CustomException.class, () -> {TrigLib.cosine(input);}, "Throws Exception");
	}
	
	/**
	 * Tests cosine functionality for negative infinity
	 * to check for exception.
	 * 
	 * @throws CustomException
	 */
	@Test
	void cosTestWithNegativeInfinity() throws CustomException {
		double input = Double.NEGATIVE_INFINITY;
		assertThrows(CustomException.class, () -> {TrigLib.cosine(input);}, "Throws Exception");
	}
	
	/**
	 * Tests tan functionality with degree input
	 * without converting to radians.
	 * Result is not as expected.
	 * 
	 * @throws CustomException
	 */
	@Test
	void tanTestWithDegreeInput() throws CustomException {
		double input = 30;
		double actual = 0.5773502691896257;
		double result = TrigLib.tan(input);
		assertNotEquals(result, actual, "Output is not as expected as input is not converted to radians");
	}
	
	/**
	 * Tests tan functionality with radian input.
	 * 
	 * @throws CustomException
	 */
	@Test
	void tanTestWithRadiansInput() throws CustomException {
		double input = 0.5235987755982988;
		double actual = 0.5773502691896257;
		double result = TrigLib.tan(input);
		assertEquals(result, actual, "Output is as expected as input is in radians");
	}
	
	/**
	 * Tests tan functionality with degree input
	 * by converting it to radians.
	 * 
	 * @throws CustomException
	 */
	@Test
	void tanTestWithConvertingToRadians() throws CustomException {
		double input = 30;
		double actual = 0.5773502691896257;
		double result1 = TrigLib.toRadians(input);
		double result = TrigLib.tan(result1);
		assertEquals(result, actual, "Output is as expected as input is converted to radians");
	}
	
	/**
	 * Tests tan functionality for positive infinity
	 * to check for exception.
	 * 
	 * @throws CustomException
	 */
	@Test
	void tanTestWithPositiveInfinity() throws CustomException {
		double input = Double.POSITIVE_INFINITY;
		assertThrows(CustomException.class, () -> {TrigLib.tan(input);}, "Throws Exception");
	}
	
	/**
	 * Tests tan functionality for negative infinity
	 * to check for exception.
	 * 
	 * @throws CustomException
	 */
	@Test
	void tanTestWithNegativeInfinity() throws CustomException {
		double input = Double.NEGATIVE_INFINITY;
		assertThrows(CustomException.class, () -> {TrigLib.tan(input);}, "Throws Exception");
	}
	
	/**
	 * Tests conversion to degree from radians 
	 * functionality.
	 * 
	 * @throws CustomException
	 */
	@Test
	void toDegreesConversionTestWithRadianInput() throws CustomException {
		double input = 3.141592653589793;
		double actual = 180.0;
		double result = TrigLib.toDegrees(input);
		assertEquals(result, actual, "Radian input converted into degree");
	}
	
	/**
	 * Tests conversion to degree from radians functionality
	 * for positive infinity to check for exception.
	 * 
	 * @throws CustomException
	 */
	@Test
	void toDegreesConversionTestWithPositiveInfinity() throws CustomException {
		double input = Double.POSITIVE_INFINITY;
		assertThrows(CustomException.class, () -> {TrigLib.toDegrees(input);}, "Throws Exception");
	}
	
	/**
	 * Tests conversion to degree from radians functionality
	 * for negative infinity to check for exception.
	 * 
	 * @throws CustomException
	 */
	@Test
	void toDegreesConversionTestWithNegativeInfinity() throws CustomException {
		double input = Double.NEGATIVE_INFINITY;
		assertThrows(CustomException.class, () -> {TrigLib.toDegrees(input);}, "Throws Exception");
	}
	
	/**
	 * Tests conversion to radians from degree 
	 * functionality.
	 * 
	 * @throws CustomException
	 */
	@Test
	void toRadiansConversionTestWithDegreeInput() throws CustomException {
		double input = 180;
		double actual = 3.141592653589793;
		double result = TrigLib.sine(input);
		assertNotEquals(result, actual, "Output is not as expected as input is not converted to radians");
	}
	
	/**
	 * Tests conversion to radians from degree functionality
	 * for positive infinity to check for exception.
	 * 
	 * @throws CustomException
	 */
	@Test
	void toRadiansConversionTestWithPositiveInfinity() throws CustomException {
		double input = Double.POSITIVE_INFINITY;
		assertThrows(CustomException.class, () -> {TrigLib.sine(input);}, "Throws Exception");
	}
	
	/**
	 * Tests conversion to radians from degree functionality
	 * for negative infinity to check for exception.
	 * 
	 * @throws CustomException
	 */
	@Test
	void toRadiansConversionTestWithNegativeInfinity() throws CustomException {
		double input = Double.NEGATIVE_INFINITY;
		assertThrows(CustomException.class, () -> {TrigLib.sine(input);}, "Throws Exception");
	}

}
