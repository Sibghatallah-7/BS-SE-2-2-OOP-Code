interface Draw {
    void draw();
}

interface Shape extends Draw {
    String shapetype();
    double calculatearea();
}

class Rectangle implements Shape {
    double length, width;

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public String shapetype() {
        return "Rectangle";
    }

    public double calculatearea() {
        return length * width;
    }

    public void draw() {
        System.out.println("----- Drawing a Rectangle: -----");
    }
}

class Circle implements Shape {
    double radius;
    double PI = 3.1416;

    Circle(double radius) {
        this.radius = radius;
    }

    public String shapetype() {
        return "Circle";
    }

    public double calculatearea() {
        return PI * radius * radius;
    }

    public void draw() {
        System.out.println("\n----- Drawing a Circle: -----");
    }
}

class Square implements Shape {
    double length, width;

    Square(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public String shapetype() {
        return "Square";
    }

    public double calculatearea() {
        return length * width;
    }

    public void draw() {
        System.out.println("\n----- Drawing a Square: -----");
    }
}

public class Main {
    public static void main(String[] args) {
        Shape rectangle = new Rectangle(12, 9);
        rectangle.draw();
        System.out.println("Shape: " + rectangle.shapetype());
        System.out.println("Area: " + rectangle.calculatearea());

        Shape circle = new Circle(5);
        circle.draw();
        System.out.println("Shape: " + circle.shapetype());
        System.out.println("Area: " + circle.calculatearea());

        Shape square = new Square(7, 7);
        square.draw();
        System.out.println("Shape: " + square.shapetype());
        System.out.println("Area: " + square.calculatearea());
    }
}
