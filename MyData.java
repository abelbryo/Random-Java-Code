import java.io.Serializable;
public class MyData implements Serializable {
    String userName; 
    String passwordCypher; 
    transient String passwordClear; 

    public MyData(){}

    public MyData(String name, String clear) {
        setUserName(name);
        setPassword(clear);
    }

    public String getUserName(){
        return userName;
    }

    public String getPasswordCypher(){
        return passwordCypher;
    }

    public void setUserName(String s){
        userName = s;
    }

    public void setPassword(String s){
        passwordClear = s; 
        passwordCypher = encrypt(passwordClear);
    }

    public String toString() {
        return "MyData[" + userName+ "]";
    }

    protected String encrypt(String s) {
        return "fjsklalkjSECRET+=djals";
    }

}
