import java.io.*;
public class Weapon implements Serializable{
    
    private String name;

    public Weapon(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void shoot(){
        System.out.println(this + " shooting -> -> -> " );
    }

    public String toString(){
        return name;
    }
}
