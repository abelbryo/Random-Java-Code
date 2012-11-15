import java.util.Map; 
import java.util.TreeSet; 

public class GetEnv {
    /**
     * let's test generics
     * @param args the command line arguments
     */

    public static void main(String[] args){
        Map<String,String> env = System.getenv(); 

        for(String k: new TreeSet<String>(env.keySet())){
            System.out.printf("%s = %s \n", k, env.get(k));
        }
    
    }

}
