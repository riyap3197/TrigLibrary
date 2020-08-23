package trig.main;

public class TrigLib {
    
    public static void main (String args[]) throws CustomException {
        double in1 = 368;
        System.out.println(cosine(toRadians(in1)));
        System.out.println(Math.cos(Math.toRadians(in1)));
    }
    
    public static double toDegrees(double x) throws CustomException 
    { 
        if ( x == Double.POSITIVE_INFINITY || x == Double.NEGATIVE_INFINITY )
            throw new CustomException();
        double sum = x * 180 / Math.PI;
        return sum; 
    }
    
    public static double toRadians(double x) throws CustomException 
    { 
        if ( x == Double.POSITIVE_INFINITY || x == Double.NEGATIVE_INFINITY || x==Double.NaN)
            throw new CustomException();
        double sum = x * Math.PI / 180;
        return sum; 
    }
    
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
    
    public static double tan(double x) throws CustomException {
        if ( x == Double.POSITIVE_INFINITY || x == Double.NEGATIVE_INFINITY )
            throw new CustomException();
        double sum  = sine(x) / cosine(x);
        return sum;
    }
    
}
//class CustomException extends Exception
//{
//  public CustomException()
//  {
//    System.out.println("Invalid input");
//  }
//}
    