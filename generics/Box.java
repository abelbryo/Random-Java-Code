public class Box<T> {
    private T val; 

    public Box(T val){
        this.val = val;
    }

    public T getVal(){
        return val;
    }
}


class TestBox {
    public static void main(String[] args){
        Box<Integer> intBox = new Box<Integer>(9);
        System.out.println(intBox.getVal());

        Box rawBox; // Box of objects 
        Box<String> nameBox = new Box<String>("Abel"); // Box of Strings
        rawBox = nameBox; // Put strings in Object boxes -- OK!
        System.out.println(rawBox.getVal());
        
        rawBox = new Box("Any object");
        nameBox = rawBox; // put any object into a String box -- Unsafe Operation! Could fail at runtime.
        System.out.println(nameBox.getVal());



    }

}
