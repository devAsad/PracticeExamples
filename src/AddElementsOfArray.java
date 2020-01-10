import java.util.Scanner;

public class AddElementsOfArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int arr[], i, size, total = 0;
        System.out.println("Enter the size of an Array");
        size = scanner.nextInt();
        arr = new int[size];
        for (i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }
        for (int num : arr) {
            total = total + num;
        }
        System.out.println("Total addition of the elements in the array is: " + total);
    }
}
