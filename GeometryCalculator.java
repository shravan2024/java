package constructs;

public class GeometryCalculator {
    public double calculateArea(double sideLength) {
        // Method implementation for calculating area of a square
    }

    public double calculateArea(double length, double width) {
        // Method implementation for calculating area of a rectangle
    }

    public double calculateArea(double radius) {
        // Method implementation for calculating area of a circle
  
    	GeometryCalculator calculator = new GeometryCalculator();
    	double squareArea = calculator.calculateArea(5.0); // Calls the first method
    	double rectangleArea = calculator.calculateArea(4.0, 6.0); // Calls the second method
    	double circleArea = calculator.calculateArea(3.0); // Calls the third method
}
}
