package inheritance;

abstract class Shape {
    // Abstract method to calculate area (to be implemented by subclasses)
    public abstract double calculateArea();

    // Concrete method to display information about the shape
    public void display() {
        System.out.println("Displaying shape");
    }
}
class Circle extends Shape {
    private double radius;

    // Constructor
    public Circle(double radius) {
        this.radius = radius;
    }

    // Method to calculate area of the circle
    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}
class Rectangle extends Shape {
    private double length;
    private double width;

    // Constructor
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // Method to calculate area of the rectangle
    @Override
    public double calculateArea() {
        return length * width;
    }
}
public class Main {
    public static void main(String[] args) {
        // Creating instances of Circle and Rectangle
        Circle circle = new Circle(5);
        Rectangle rectangle = new Rectangle(4, 6);

        // Displaying information about the shapes
        circle.display();
        System.out.println("Area of circle: " + circle.calculateArea());

        rectangle.display();
        System.out.println("Area of rectangle: " + rectangle.calculateArea());
    }
}
