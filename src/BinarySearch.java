import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i, num, arr[], item, first, middle, last;
        System.out.println("Enter the number of elements in an array");
        num = scanner.nextInt();
        arr = new int[num];
        System.out.println("Enter the values in an array");
        for (i = 0; i < num; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.println("Enter the item to be searched in an array");
        item = scanner.nextInt();
        first=0;
        last = num - 1;
        middle = (first + last) / 2;
        while (first <= last) {
            if (arr[middle] < item) {
                first = middle + 1;
            } else if (arr[middle] == item) {
                System.out.println("Item " + item + " found at location " + (middle + 1));
                break;
            } else {
                last = middle - 1;
            }
            middle = (first + last) / 2;
        }
        if (first > last) {
            System.out.println("Item " + item + " doesn't present in the array");
        }
    }
}
