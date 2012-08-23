import java.io.*;

public class GameSaverTest implements Serializable{
    public static void main(String [] args){
        String[] weaponNames = {"bow", "sword", "dust",
                    "bare hands", "big ax",
                    "spells", "invisibility"};
        Weapon[] w = new Weapon[weaponNames.length];
        for(int i= 0; i < w.length; i++ ){
            w[i] = new Weapon(weaponNames[i]);
        }

        GameCharacter one = new GameCharacter(50, "elf", new Weapon[] {w[0],w[1], w[2]});
        GameCharacter two = new GameCharacter(200, "Troll", new Weapon[] {w[3], w[4]});
        GameCharacter three = new GameCharacter(120, "Magician", new Weapon[] {w[5], w[6]});

        try{
            ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("Game.ser"));
            os.writeObject(one);
            os.writeObject(two);
            os.writeObject(three);
            os.close();

        }catch(IOException e){
            e.printStackTrace();
        }

        one = null;
        two = null; 
        three = null;


        try{
            ObjectInputStream in = new ObjectInputStream(new FileInputStream("Game.ser"));
            GameCharacter oneR = (GameCharacter) in.readObject();
            GameCharacter twoR = (GameCharacter) in.readObject();
            GameCharacter threeR = (GameCharacter) in.readObject();

            in.close();
            
            System.out.println("one : " + oneR.getType());
            System.out.println("two : " + twoR.getType());
            System.out.println("three : " + threeR.getType());

        }catch(IOException e){
            e.printStackTrace();

        }catch(ClassNotFoundException e){
            e.printStackTrace();
        }

    }
    
}
