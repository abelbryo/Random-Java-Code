import java.util.*;
public class PhoneDirectory {
    private static Map<String, String> directory = new TreeMap<String, String>();
    public static void main(String [] args){
        directory.put("Abel","0449323823");
        directory.put("Samuel","5107894324");
        
        System.out.println("Number "+ directory.get("Abel"));

        Set <String> keys = directory.keySet();  // a key View of the map 
        
        Iterator<String> keyIter = keys.iterator();
        
        System.out.println("Key and Vals");
        
        while(keyIter.hasNext()){
            String key = keyIter.next();
            System.out.println(key + " => "+ directory.get(key));
        }
    }


}
