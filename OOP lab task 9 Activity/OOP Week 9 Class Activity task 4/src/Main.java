abstract class Shape
{
    public static double pi=3.14;
    protected float height;
    protected float width;
    abstract float area();
}
class Square extends Shape // Subclass Square implementing area() method
{
    Square(float h, float w) // Constructor to initialize dimensions
    {
        height = h;
        width = w;
    }
    float area() // Abstract method to calculate area
    {
        return height * width;
    }
}
class Rectangle extends Shape
{
    Rectangle(float h, float w) // calculate rectangle
    {
        height = h;
        width = w;
    }
    float area()
    {
        return height * width;
    }
}
class Circle extends Shape
{
    float radius;

    Circle(float r) // Constructor for Circle, only uses radius
    {
        radius = r;
    }

    float area()
    {
        return (float) (Shape.pi * radius * radius);
    }
}
class AbstractMethodDemo { // Main class to demonstrate the use of abstract class and methods
    public static void main(String args[]) {
        Square sObj = new Square (5,5);  // Creating object of Square and calculating area
        Rectangle rObj = new Rectangle(5,7);  // Creating object of Rectangle and calculating area
        Circle cObj = new Circle(2);   // Creating object of Circle and calculating area
        System.out.println("Area of square : " + sObj.area());
        System.out.println("Area of rectangle: " + rObj.area());
        System.out.println("Area of circle: " + cObj.area());
    }
}