import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);

        System.out.print("Enter Number: ");
        int num = number.nextInt();

        int cube = num * num * num;
        System.out.println("Cube is: " + cube);
    }
}
