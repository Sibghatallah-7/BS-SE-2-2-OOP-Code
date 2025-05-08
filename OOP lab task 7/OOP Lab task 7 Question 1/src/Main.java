class Computer {
    String companyname;
    double price;

    void show() {
        System.out.println("Company Name: " + companyname);
        System.out.println("Price: " + price);
    }
}

class Desktop extends Computer {
    String color;
    String screenSize;
    String processortype;

    public Desktop(String dell, int i, String black, String s, String intelI5) {
        super();
    }

    void show() {
        System.out.println("-----Desktop Details: -----");
        System.out.println("Company Name: " + companyname);
        System.out.println("Price: " + price);
        System.out.println("Color: " + color);
        System.out.println("Screen: " + screenSize);
        System.out.println("Processor Type: " + processortype);
        System.out.println();
    }
}

class Laptop extends Computer {
    String color;
    String size;
    double weight;
    String processor;

    public Laptop(String hp, int i, String silver, String s, double v, String intelI7) {
        super();
    }

    void show() {
        System.out.println("-----laptop Details: -----");
        System.out.println("Company Name: " + companyname);
        System.out.println("Price: " + price);
        System.out.println("Color: " + color);
        System.out.println("Size: " + size);
        System.out.println("Weight: " + weight + " kg");
        System.out.println("Processor: " + processor);
        System.out.println();
    }
}

public class Main {
    public static void main(String[] args) {
        Computer c1 = new Desktop("Dell", 850, "Black", "24-inch", "Intel i5");
        Computer c2 = new Laptop("HP", 1200, "Silver", "15.6-inch", 2.2, "Intel i7");

        c1.show();
        c2.show();
    }
}
