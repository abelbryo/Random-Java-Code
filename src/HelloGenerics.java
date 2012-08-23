import java.util.*;
public class HelloGenerics {
    public static void main( String [] args){
        List<String> strs = new ArrayList<String>();
        // List<Object> objs = strs; 

        strs.add("Abel");
        strs.add("Rahel");
        strs.add("Samuel");

        String str = (String)strs.iterator().next();
        System.out.println(str);
        printCollection(strs);

    }

    // Generic method
    static <T> void printCollection(Collection<T> c){
        for(T o:c)
            System.out.println(o);
    }


}
