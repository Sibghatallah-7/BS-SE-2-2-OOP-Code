import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);

        System.out.print("Enter Number 1: ");
        int a = num.nextInt();

        System.out.print("Enter Number 2: ");
        int b = num.nextInt();

        int sum = a + b;
        System.out.println("Sum is: " + sum);

        int avg = sum / 2;
        System.out.println("Average is: " + avg);
    }
}
