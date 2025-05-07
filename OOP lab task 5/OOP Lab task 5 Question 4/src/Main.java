import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        double[] numbers = new double[10];
        double sum = 0.0, average;

        Scanner num = new Scanner(System.in);
        System.out.print("Enter 10 numbers: ");
        for (int i = 0; i < 10; i++)
        {
            numbers[i] = num.nextDouble();
            sum += numbers[i];
        }

        average = sum / 10;
        System.out.println("The average of the 10 numbers is: " + average);
    }
}
