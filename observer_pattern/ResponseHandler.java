import java.util.Observer;
import java.util.Observable;

public class ResponseHandler implements Observer {
    private String resp;
    public void update(Observable obj, Object arg){
        if(arg instanceof String){
            resp = (String) arg;
            System.out.println("\n Recieved Response: "+ resp);
        }
    }
}
