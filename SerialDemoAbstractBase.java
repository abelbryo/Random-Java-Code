import java.util.*;
import java.io.*;
public abstract class SerialDemoAbstractBase {

    public void save() throws IOException{
        List l = new ArrayList();
        l.add(new Date());
        l.add(new MyData("Ian Darwin", "sercret java book"));
        l.add(new MyData("Aby Brant Charles","broccoli"));
        write(l);
    }

    public abstract void write(Object theGraph) throws IOException; 
    public abstract void dump() throws IOException, ClassNotFoundException;

}
