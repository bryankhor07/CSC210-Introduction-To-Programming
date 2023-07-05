/*
 *  Assignment: Chapter 11 Lab
 *  Description: The purpose of this program is to learn more about object-oriented programming
 *  Name: Bryan Khor
 *  ID: 922228564
 *  Class: CSC 211-08
 *  Semester: Fall 2021
 */

public class InheritanceLab {

    public static void main(String[] args) {

        // Create an object using the shape class
        Shape shape = new Shape(0);
        System.out.println(shape.getArea());
        System.out.println(shape);

        // Create an object using the rectangle class
        Rectangle rectangle = new Rectangle(3, 4);
        System.out.println(rectangle.getArea());
        System.out.println(rectangle);

        // Create an object using the triangle class
        Triangle triangle = new Triangle(4, 7);
        System.out.println(triangle.getArea());
        System.out.println(triangle);

        System.out.println();
        System.out.println();

        // Create an array called shapeArray with size 10
        Shape[] shapeArray = new Shape[10];

        // Create a for loop to store the values of the Rectangle and Triangle object
        for (int x = 0; x < 10; x++) {
            if (x % 2 == 0) {
                shapeArray[x] = new Rectangle(x, x);
            } else {
                shapeArray[x] = new Triangle(x, x);
            }
        }

        // Create a for loop to display the vertexCount and area of the Rectangle and Triangle object
        for (int x = 0; x < 10; x++) {
            System.out.println(shapeArray[x]);
            System.out.println(shapeArray[x].getArea());
        }
    }
}
