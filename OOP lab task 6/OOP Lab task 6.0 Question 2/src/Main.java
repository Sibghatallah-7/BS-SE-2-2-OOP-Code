import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String str = "abrambabasc";
        System.out.println("Before removal the Original Word was abrambabasc. ");
        str = str.replaceAll("b", "").replaceAll("ac", "");
        System.out.println("After removing 'b' and 'ac', the new string is: " + str);
    }
}
