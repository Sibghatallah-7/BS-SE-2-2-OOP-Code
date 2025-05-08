import java.util.Scanner;

class Division {
    private int num1;
    private int num2;

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public int getNum1() {
        return num1;
    }

    public int getNum2() {
        return num2;
    }

    public double divide() {
        return (double) num1 / num2;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Division d = new Division();

        int n1 = 10;
        int n2 = 9;

        while (n2 >= 0) {
            d.setNum1(n1);
            d.setNum2(n2);

            try {
                double result = d.divide();
                System.out.println(n1 + " / " + n2 + " = " + result);
            }
            catch (ArithmeticException e) {
                System.out.println("Cannot divide " + n1 + " by " + n2);
            }
            n1--;
            n2--;
        }
    }
}
