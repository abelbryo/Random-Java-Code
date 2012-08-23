public class Bicycle{

    private int gear;

    private Bicycle(int gear){
        this.gear = gear;
    }
    
    public static Bicycle create( int gear ){
        return new Bicycle(gear);
    }

    public void sayHi(){
        System.out.println("Hello World");
    }

}
