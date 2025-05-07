import java.util.Scanner;

public class Main
{
    public static void main(String args[]) {
        Scanner a = new Scanner(System.in);
        System.out.print("Please enter a string: ");

        String input = a.nextLine();

        int length = input.length();
        System.out.println("The length of the String is: " + length);
    }
}