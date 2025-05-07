import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner days = new Scanner(System.in);

        System.out.print("Enter a number between 1 and 7: ");
        int Number = days.nextInt();

        switch (Number) {
            case 1:
                System.out.println("Monday. It is a WeekDay.");
                break;
            case 2:
                System.out.println("Tuesday. It is a WeekDay.");
                break;
            case 3:
                System.out.println("Wednesday. It is a WeekDay.");
                break;
            case 4:
                System.out.println("Thursday. It is a WeekDay.");
                break;
            case 5:
                System.out.println("Friday. It is a WeekDay.");
                break;
            case 6:
                System.out.println("Saturday. It is a WeekEnd.");
                break;
            case 7:
                System.out.println("Sunday. It is a WeekEnd.");
                break;
            default:
                System.out.println("Error .. Invalid Input !!");
                break;
        }
    }
}
