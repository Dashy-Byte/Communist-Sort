import java.util.Arrays;
import java.util.Scanner;

public class Communist_Sort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] myNumbers = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            myNumbers[i] = sc.nextInt();}
        System.out.println("Original array: " + Arrays.toString(myNumbers));
        sc.close();

        if (myNumbers.length == 0) {
            return;}
        
        int sum = 0;
        for (int i = 0; i < myNumbers.length; i++) {
            sum += myNumbers[i];}

        int average = sum / myNumbers.length;

        for (int i = 0; i < myNumbers.length; i++) {
            myNumbers[i] = average;}
        System.out.println("Communism sorted: " + Arrays.toString(myNumbers));
    }
}
