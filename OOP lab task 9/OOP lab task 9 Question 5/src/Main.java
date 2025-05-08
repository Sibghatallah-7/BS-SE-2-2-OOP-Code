import java.util.Scanner;

class Division {
    private int num1;
    private int num2;

    public Division(int a, int b) {
        this.num1 = a;
        this.num2 = b;
    }

    public int divide()
    {
        return num1 / num2;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the First number Num1 (Use a Number less than 10 for easy, quick and simplified code running): ");
        int num1 = input.nextInt();

        System.out.print("Enter the Second number Num2 (Use a Number less than 10 for easy, quick and simplified code running): ");
        int num2 = input.nextInt();

        while (num2 >= 0) {
            Division div = new Division(num1, num2);
            System.out.println("Dividing " + num1 + " by " + num2);

            try {
                double result = div.divide();
                System.out.println("The Result after division is : " + result);
                System.out.println("________________________");
            }

            catch (ArithmeticException e) {
                System.out.println("Error..! Sorry Cannot Divide by Zero. ");
            }

            num2--;
        }
    }
}
