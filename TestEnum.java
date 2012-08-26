 enum Ensemble {
    SOLO(1), DUET(2), TRIO(3), QUARTET(4), QUINTET(5);

    private final int numberOfMusicians;
    
    Ensemble (int size){
        numberOfMusicians = size;
    }

    public int numberOfMusicians(){
        return numberOfMusicians;
    }
}

public class TestEnum{
    public static void main(String [] args){
        int a = Ensemble.TRIO.numberOfMusicians();
        System.out.println(a);
    }


    
    

}
