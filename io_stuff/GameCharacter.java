import java.io.*;
public class GameCharacter implements Serializable{
    private int power;
    private String type;
    private Weapon[] weapons;

    public GameCharacter(int p, String t, Weapon[] w ){
        power = p; 
        type = t;
        weapons = w;
    }

    public int getPower(){
        return power; 
    }

    public String getType(){
        return type;
    }

    public Weapon[] getWeapon(){
        return weapons;
    }
    
    public void useWeapon(){
        for(Weapon w: getWeapon())
            w.shoot();
    }

    public void increasePower(){
        power++;
    }
}
