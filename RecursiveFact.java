public class RecursiveFact{
    public static void main(String [] args){
        factorial(5);
    }

    public static int factorial(int n){
        int val = 1;
        if ( n == 0 )
            return 1;
        val = n * factorial(n -1);
        System.out.println(val);
        return val;
    }
}
