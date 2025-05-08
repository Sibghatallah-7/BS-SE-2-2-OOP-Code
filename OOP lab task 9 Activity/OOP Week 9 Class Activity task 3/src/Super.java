public abstract class Super // First abstract class with two abstract methods
{
    abstract void getName(String name); // Abstract method to get name
    abstract void getSex(String sex); // Abstract method to get sex
}
abstract class AbstClass extends Super // Second abstract class extending the first and adding one more method
{
    abstract void getCountry(String country); // Abstract method to get country
}
class SubClass extends AbstClass // Concrete class that implements all abstract methods
{
    String name, sex, city, country;
    void getName(String name) // getter and setter
    {
        this.name = name;
    }
    void getSex(String sex) // getter and setter
    {
        this.sex = sex;
    }
    void getCountry(String country) // getter and setter
    {
        this.country = country;
    }
    void display() {
        System.out.println("Name: " + name);
        System.out.println("Sex: " + sex);
        System.out.println("Country: " + country);
    }
}
class MainClass {
    public static void main(String args[]) {
        SubClass obj = new SubClass(); // Creating object of concrete class
        obj.getName("Adil"); // Calling the function
        obj.getSex("Male"); // Calling the function
        obj.getCountry("PAK"); // Calling the function
        obj.display();
    }
}