import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.InputStreamReader;


public class TestStringTokenizer {
    public static void main(String [] args){

        System.out.println("Please enter input string");
        System.out.println("Type 'EXIT' to quit.");

        try{
            // first initialize a Bufferedreader and then
            // deal with the remaining peace of code
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in)) ;

            String line;
            StringTokenizer tokenizer;
            while((line = reader.readLine()) != null){
                System.out.println("Inputed " + line);
                tokenizer = new StringTokenizer(line);
                while (tokenizer.hasMoreTokens())
                    System.out.println("-----> "+ tokenizer.nextToken());

                if(line.equals("EXIT"))
                    break;
            }
        } catch (Throwable e){
            System.err.println(e);
        }
    } 
}
