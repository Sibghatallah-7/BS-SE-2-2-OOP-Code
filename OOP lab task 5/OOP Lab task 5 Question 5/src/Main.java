import java.util.Scanner;
public class Main
{
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int num1 = num.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = num.nextInt();

        System.out.print("Enter the third number: ");
        int num3 = num.nextInt();

        int largest;

        if (num1 >= num2 && num1 >= num3)
        {
            largest = num1;
        }
        else if (num2 >= num1 && num2 >= num3)
        {
            largest = num2;
        }
        else
        {
            largest = num3;
        }

        System.out.println("The largest number is: " + largest);

    }
}
