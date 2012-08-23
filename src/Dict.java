public class Dict {
    public static final int LETTERS = 26,
           WORDS = LETTERS * LETTERS; 

    public int hashCode(){
        return 26 * (word.charAt(0) - 'a') + (word.charAt(1) - 'a');
    }

}

class Word{

}

class Definition{
    private String str;
    public Definition(String str){
        this.str = str;
    }

    @Override
    public String toString(){
        return str;
    }
}
