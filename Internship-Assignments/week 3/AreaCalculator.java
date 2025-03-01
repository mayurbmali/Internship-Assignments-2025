//Program Statement: Write a program to calculate the area of a circle and rectangle using classes.

class Rectangle {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double calculateArea() {
        return length * width;
    }
}

class Circle {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}

public class AreaCalculator {
    public static void main(String[] args) {
        Rectangle rect = new Rectangle(5, 10);
        System.out.println("Area of Rectangle: " + rect.calculateArea());

        Circle circle = new Circle(7);
        System.out.println("Area of Circle: " + circle.calculateArea());
    }
}

// Output
// Area of Rectangle: 50.0
// Area of Circle: 153.93804002589985
