import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, ...");
        System.out.print("Enter the new Word which you want to add at ... : ");
        Scanner b = new Scanner(System.in);
        String input = b.nextLine();
        StringBuffer a = new StringBuffer(input);
        System.out.println("Hello, " + a);
    }
}
