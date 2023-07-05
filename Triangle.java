// Subclass
// Triangle class inherits all accessible data fields and methods from the Shape class
public class Triangle extends Shape {

    private int base;
    private int height;

    public Triangle(int base, int height) {
        super(3);
        this.base = base;
        this.height = height;
    }

    public float getArea() {
        return (base * height) / 2;
    }

}
