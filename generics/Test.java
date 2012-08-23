import java.util.*;
public class Test{
    public static void main( String [] args){
        ArrayList<Integer> intList = new ArrayList<Integer>();
        // In Java 7, it is possible to write the above statement as follows
        // ArrayList<Integer> intList = new ArrayList< >();
        // using the diamond notation.
        for (int i = 0; i < 10; i++){
            intList.add(i);
        }
    }
}
