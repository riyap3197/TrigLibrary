package trig.main;

public class TrigLib {
    
    /**
     * Converts an angle measured in radians to an approximately
     * equivalent angle measured in degrees.  The conversion from
     * radians to degrees is generally inexact;
     *
     * @param   rad   an angle, in radians
     * @return  the measurement of the angle {@code rad}
     *          in degrees.
     */
    public static double toDegrees(double rad) throws CustomException 
    { 
        if ( rad == Double.POSITIVE_INFINITY || rad == Double.NEGATIVE_INFINITY )
            throw new CustomException();
        double deg = rad * 180 / Math.PI;
        return deg; 
    }
    
    /**
     * Converts an angle measured in degrees to an approximately
     * equivalent angle measured in radians.  The conversion from
     * degrees to radians is generally inexact.
     *
     * @param   deg   an angle, in degrees
     * @return  the measurement of the angle {@code deg}
     *          in radians.
     */
    public static double toRadians(double deg) throws CustomException 
    { 
        if ( deg == Double.POSITIVE_INFINITY || deg == Double.NEGATIVE_INFINITY )
            throw new CustomException();
        double rad = deg * Math.PI / 180;
        return rad; 
    }
    
    /**
     * Returns the trigonometric sine of an angle.  Special cases:
     * If the argument is negative or positive infinity, then it
     * will throw a custom exception.
     * If the argument is zero, then the result is a zero with the
     * same sign as the argument.
     *
     * @param   x   an angle, in radians.
     * @return  the sine of the argument.
     */
    public static double sine(double x) throws CustomException {
        if ( x == Double.POSITIVE_INFINITY || x == Double.NEGATIVE_INFINITY )
            throw new CustomException(); 
        double term = 1.0;      // ith term = x^i / i!
        double sum  = 0.0;      // sum of first i terms in taylor series

        for (int i = 1; term != 0.0; i++) {
            term *= (x / i);
            if (i % 4 == 1) sum += term;
            if (i % 4 == 3) sum -= term;
        }
        return sum;
    }
    
    /**
     * Returns the trigonometric cosine of an angle. Special cases:
     * If the argument is negative or positive infinity, then it
     * will throw a custom exception.
     *
     * @param   x   an angle, in radians.
     * @return  the cosine of the argument.
     */
    public static double cosine(double x) throws CustomException {
        if ( x == Double.POSITIVE_INFINITY || x == Double.NEGATIVE_INFINITY )
            throw new CustomException();
        double term = 1.0;      // ith term = x^i / i!
        double sum  = 1.0;      // sum of first i terms in taylor series
        int cnt = 1;
        for (int i = 1; term != 0.0; i++) {
            term *= (x / i);
            if( i % 2 == 0) {
                if (cnt % 2 == 0) {
                    sum += term;
                }else {
                    sum -= term;
                }
                cnt++;
            }
        }
        return sum;
    }
    
    /**
     * Returns the trigonometric tangent of an angle.  Special cases:
     * If the argument is negative or positive infinity, then it
     * will throw a custom exception.
     * If the argument is zero, then the result is a zero with the
     * same sign as the argument.
     *
     * @param   x   an angle, in radians.
     * @return  the tangent of the argument.
     */
    public static double tan(double x) throws CustomException {
        if ( x == Double.POSITIVE_INFINITY || x == Double.NEGATIVE_INFINITY )
            throw new CustomException();
        double sum  = sine(x) / cosine(x);
        return sum;
    }
    
}
