// Superclass
// Superclass contains the common properties and behaviors
public class Shape {

    // Data field - To keep track of the number of vertex of a shape
    private int vertexCount;

    // Constructor to create a shape with a specific number of vertex
    public Shape(int vertexCount) {
        this.vertexCount = vertexCount;
    }

    // Method to get the area of the shape
    public float getArea() {
        return 0;
    }

    // toString method to display the vertex count.
    public String toString() {
        return "vertexCount: " + vertexCount;
    }

}
