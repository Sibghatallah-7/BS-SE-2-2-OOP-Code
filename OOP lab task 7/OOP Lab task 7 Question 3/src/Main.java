class Calculator {

    int add(int a, int b) {
        return a + b;
    }

    double add(double a, double b) {
        return a + b;
    }
    int subtract(int a, int b) {
        return a - b;
    }

    double subtract(double a, double b) {
        return a - b;
    }

    int multiply(int a, int b) {
        return a * b;
    }

    double multiply(double a, double b) {
        return a * b;
    }

    int divide(int a, int b) {
        if (b != 0) {
            return a / b;
        }
        else {
            System.out.println("Error! Answer Does Not Exist Or is Infinity.");
            return 0;
        }
    }

    double divide(double a, double b) {
        if (b != 0.0) {
            return a / b;
        }
        else {
            System.out.println("Error! Answer Does Not Exist Or is Infinity.");
            return 0;
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Calculator cal = new Calculator();

        int a = 15, b = 3;
        System.out.println("Addition Using Int: " + cal.add(a, b));
        System.out.println("Subtraction Using Int: " + cal.subtract(a, b));
        System.out.println("Multiplication Using Int: " + cal.multiply(a, b));
        System.out.println("Division Using Int: " + cal.divide(a, b));
        System.out.println();

        double x = 23.6, y = 6.9;
        System.out.println("Addition Using Double: " + cal.add(x, y));
        System.out.println("Subtraction Using Double: " + cal.subtract(x, y));
        System.out.println("Multiplication Using Double: " + cal.multiply(x, y));
        System.out.println("Division Using Double: " + cal.divide(x, y));
    }
}
