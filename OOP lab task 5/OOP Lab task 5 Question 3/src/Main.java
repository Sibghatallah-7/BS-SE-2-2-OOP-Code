import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int count = 0;
        int num = 2;

        while (count < 100)
        {
            if (Prime(num))
            {
                System.out.println(num);
                count++;
            }
            num++;
        }
    }

    public static boolean Prime(int n) {
        if (n <= 1)
        {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(n); i++)
        {
            if (n % i == 0)
            {
                return false;
            }
        }
        return true;
    }
}
