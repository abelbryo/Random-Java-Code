/**
 * A slow but simple demonstration for calculating
 * a square of a number.
 */
public class SQRT {
    private static final double EPSILON = 0.00000000000001;
    public static void main(String [] args){
        try{
            Double input = Double.parseDouble(args[0]);
            sqrt(input);
        }catch(Throwable e){
            System.out.println("Something went wrong. Check usage.");
            System.out.println("Usage: java SQRT [value]");
            System.err.println(e);
        }
    }

    /**
     * Helper method for displaying the result
     * and simplifying input to the methods.
     */
    public static void sqrt(double n){
        System.out.println("Iteratively, SQRT( "+n+" ) = " + iterative_sqrt(0, n, n));
        System.out.println("Recursively, SQRT( "+n+" ) = " + recursive_sqrt(0, n, n));
    }

    /**
     * Recursive SQRT method
     * @param lo with a starting value of 0
     * @param hi with a starting value of n,
     * @param val is the value of n, which is the number whose square root we calculate
     * @return m the result of SQRT(N) 
     */
    public static double recursive_sqrt(double lo, double hi, final double val){
        double m = (lo + hi) / 2.0;
        if(Math.abs(m * m - val) < EPSILON)
            return m;
        if ((m * m) > val)
            return recursive_sqrt (lo, m, val);
        else
            return recursive_sqrt (m, hi, val);
    }

    /**
     * Iterative SQRT method
     * @param lo with a starting value of 0
     * @param hi with a starting value of n,
     * @param val is the value of n, which is the number whose square root we calculate
     * @return m the result of SQRT(N) 
     */
    public static double iterative_sqrt(double lo, double hi, final double val){
        double m = (lo + hi) / 2;
        while(true){
            if(m * m > val){
                hi = m;
                m = (lo + hi) / 2.0;
            }else if(m * m < val){
                lo = m;
                m = (lo + hi) / 2.0;
            }

            if (Math.abs(m * m - val) <=  EPSILON)
                break;
            
        }
        return m;
    }

}
