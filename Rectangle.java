// Subclass
// Rectangle class inherits all accessible data fields and methods from the Shape class
public class Rectangle extends Shape {

    private int length;
    private int width;

    public Rectangle(int length, int width) {
        super(4);
        this.length = length;
        this.width = width;
    }

    public float getArea() {
        return length * width;
    }
}
