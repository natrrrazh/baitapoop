public class Circle {
    // Private attributes
    private double radius = 1.0;
    private String color = "red";

    // Default constructor
    public Circle() {
    }

    // Constructor with radius parameter
    public Circle(double radius) {
        this.radius = radius;
    }

    // Constructor with radius and color parameters
    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    // Getter for radius
    public double getRadius() {
        return radius;
    }

    // Setter for radius
    public void setRadius(double radius) {
        this.radius = radius;
    }

    // Getter for color
    public String getColor() {
        return color;
    }

    // Setter for color
    public void setColor(String color) {
        this.color = color;
    }

    // Method to calculate area
    public double getArea() {
        return Math.PI * radius * radius;
    }
    // toString method
    @Override
    public String toString() {
        return "Circle[radius=" + radius + ", color=" + color + "]";
    }

    // Main method for testing
    public static void main(String[] args) {
        // Test default constructor
        Circle circle1 = new Circle();
        System.out.println(circle1.toString());

        


    }
}