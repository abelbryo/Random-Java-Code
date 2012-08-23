public abstract class Shape {
    public abstract void draw(Canvas c);
}

class Circle extends Shape{
    private int x, y, radius;
    public void draw(Canvas c){
        // polymorphic method
    }
}

class Rectangle extends Shape {
    private int x,y, width, height;
    public void draw(Canvas c){ }

}

class Canvas {
    public void draw(Shape s){
        s.draw(this);
    }
}

class Tester{
    public static void main( String [] args){
        Shape s = new Circle();
        Canvas c = new Canvas();
        c.draw(s);
    }
}
