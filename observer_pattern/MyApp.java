public class MyApp {
    public static void main(String [] args){
        final EventSource es = new EventSource();
        final ResponseHandler rh = new ResponseHandler();

        es.addObserver(rh);

        Thread th = new Thread(es);
        th.start();
    }
}
