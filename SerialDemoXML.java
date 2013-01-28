import java.beans.XMLDecoder; 
import java.beans.XMLEncoder; 
import java.io.*;

public class SerialDemoXML extends SerialDemoAbstractBase {

    public static final String FILENAME = "serial.xml";


    public static void main(String [] args) throws IOException {
        new SerialDemoXML().save(); 
        new SerialDemoXML().dump(); 
    }

    public void write(Object theGraph) throws IOException {
        XMLEncoder os = new XMLEncoder( 
                new BufferedOutputStream(
                    new FileOutputStream(FILENAME)));
        os.writeObject(theGraph); 
        os.close();
    }

    public void dump() throws IOException{
        XMLDecoder inp = new XMLDecoder(
                new BufferedInputStream(
                    new FileInputStream(FILENAME)));
        System.out.println(inp.readObject());
        inp.close();
    }
}
