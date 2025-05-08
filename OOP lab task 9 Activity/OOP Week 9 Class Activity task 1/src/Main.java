abstract class Parent
{
    abstract int sum(int a, int b); // Abstract method to be implemented by a subclass
}
abstract class Child extends Parent // Intermediate abstract class extending 'parent'
{

}
class Child1 extends Child // Concrete class that extends 'child' and implements the abstract method
{
    int sum (int a, int b)  // Implementing the abstract method 'sum'
    {
        return a+b;
    }
    public static void main(String args[]){
        Child1 c = new Child1(); // Creating an object of child1 class
        System.out.println("Sum is: "+c.sum(10, 20)); // Calling the implemented 'sum' method and printing the result
    }
}