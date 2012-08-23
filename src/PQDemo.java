import java.util.*;

public class PQDemo {
    public static void main(String ... args){
        Comparator<TV> c = new TV();
        TreeSet<TV> t = new TreeSet<TV>(c);
        TreeSet<TV> t2 = new TreeSet<TV>(c);
        
        TV [] marks = {
            new TV("Nec", 14),
            new TV("Sams", 34),
            new TV("Phil", 22),
            new TV("Sony", 44),
            new TV("Pana", 54),
            new TV("Goog", 27),
            new TV("App", 38),
            new TV("LG", 18),
        };

        for(TV i : marks){
            t.add(i);
            t2.add(i);
        }
       
        System.out.println("======== SORTED ORDER ========");

        Iterator<TV> i;
        for(TV tv : t2){
           i = t.iterator();
            while(i.hasNext()){
                if(i.next().equals(tv)){
                    try{
                        System.out.println(tv+ " "+ i.next() );
                    }catch(Exception e){
                        System.out.println("No such element tossed");
                    }
                    
                    break;
                }
            }
        } // end for
        
        System.out.println("======== IN REVRESE ORDER ========");

        Iterator<TV> di;
        while(!t2.isEmpty()){
            TV tv = t2.last();
            t2.remove(tv);
           di = t.descendingIterator();
            while(di.hasNext()){
                if(di.next().equals(tv)){
                    try{
                        System.out.println(tv + " -- "+ di.next());
                    }catch(NoSuchElementException  e){
                        System.out.println("No such element tossed here too");
                    }
                    break;
                }
            }
        } // end while


    } // end main
}


/************************************************
 * The TV class that defines the TV object
 ************************************************/

class TV implements Comparator<TV>{
    
    private int size; 
    private String name;


    public TV(){}

    public TV (String name, int size){
        this.size = size;
        this.name = name;
    }

    public String toString(){
        return name+" "+size+"”";
    }

    public int compare(TV one, TV two){
        if(one.size > two.size)
            return 1;
        if(two.size > one.size)
            return -1;
        return 0; 
    }

}
