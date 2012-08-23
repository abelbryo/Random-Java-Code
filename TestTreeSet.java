import java.util.*;

public class TestTreeSet {
    private static Comparator<TVObject> toc = new TVObject();
    private static TreeSet<TVObject> t = new TreeSet<TVObject>(toc);
    public static void main(String[] args){
        TVObject [] tv = {
            new TVObject("Tosh", 24),
            new TVObject("IBM", 25),
            new TVObject("Nok", 30),
            new TVObject("Goog", 44),
            new TVObject("LG", 29),
            new TVObject("Sam", 14),
            new TVObject("Son", 15),
            new TVObject("Phil", 19),
            new TVObject("Nec", 11)
        };
        
        for(TVObject i : tv){
            t.add(i);
            //System.out.println(i);
        }

        System.out.println(t);
        System.out.println("=============");
        for (TVObject i: t)
            System.out.println(i);
        System.out.println("=============");

        Iterator<TVObject> iter ;
        //for(TVObject i : t){
            iter = t.iterator(); 
            while(iter.hasNext()){
                if(iter.next().equals(tv[1])){
                    try{
                        System.out.println(tv[1] + " -- " + iter.next());
                    }catch(NoSuchElementException  e){
                        System.out.println("No Such Element Exception tossed here");
                    }
                    break;
                }
            }
        //}


        Iterator<TVObject> di = t.descendingIterator();
        while(di.hasNext()){
            if(di.next().equals(tv[3])){
                try{
                    System.out.println(tv[3]+ " -- "+ di.next());
                }catch(NoSuchElementException e){}
            }
        }
    }//end main


}



class TVObject implements Comparator<TVObject>{
    private String name;
    private int size;

    public TVObject(){}

    public TVObject(String name, int size){
        this.name = name; 
        this.size = size;
    }

    public String getName(){
        return this.name;
    }

    public int compare(TVObject one, TVObject two){
        if(one.size > two.size)
            return 1; 
        if(one.size < two.size)
            return -1;
        return 0;
    }


    public String toString(){
        return this.name + " " + this.size + "”";
    }
}
