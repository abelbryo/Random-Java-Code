import java.lang.reflect.*;

public class DumpMethods {
    public static void main(String [] args){
        try{
            Class cls = Class.forName(args[0]);
            Method [] m = cls.getDeclaredMethods();
            for(Method i : m ){
                System.out.println(i.toString());
            }
        }catch(Throwable e){
            System.err.println(e);
        }
    }
}
