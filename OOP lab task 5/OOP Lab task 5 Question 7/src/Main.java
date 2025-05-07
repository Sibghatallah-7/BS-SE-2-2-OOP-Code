import java.util.Scanner;

public class Main {
    public static void main(String arg[]){
        int arr[];
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number of elements of the array: ");
        Scanner a = new Scanner(System.in);
        int n = a.nextInt();
        arr = new int[n];
        for(int i=0; i<n; i++)
        {
            System.out.print("Enter the " + (i+1) + " element of the array: ");
            arr[i] = sc.nextInt();
        }
        System.out.println("The elements of the array are: ");
        for(int i=0; i<5; i++)
        {
            System.out.print("Element of the array is : " + arr[i] + " and ");
            System.out.println("index of array is : " +  i);

        }
        int average = 0;
        for (int num : arr)
        {
            average += num;
        }
        System.out.println("The Average of the array is: " + average);


    }
}
