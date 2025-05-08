abstract class Base // Abstract class with multiple abstract methods
{
    abstract void get(int a, int b);  // Abstract method to receive input
    abstract void add(); // Abstract method to perform addition
    abstract void display();  // Abstract method to display result
}
class SubClass extends Base // Subclass that extends abstract class and implements all methods
{
    int x, y, z;
    void get(int a, int b)
    // Implementing method to receive values
    {
        x = a;
        y = b;
    }
    void add() // method to calculate the sum
    {
        z = x + y;
    }
    void display() // method to display the result
    {
        System.out.println("The Addition is: " + z);
    }
}
class MainClass {
    public static void main(String args[]) {
        SubClass obj = new SubClass();   // Creating an object of SubClass
        obj.get(10, 20); // Assigns The Values To x and y
        obj.add(); // addition
        obj.display();
    }
}