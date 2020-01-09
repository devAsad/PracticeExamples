import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i,num,item,arr[];
        System.out.println("Enter the number of elements in an array");
        num = scanner.nextInt();
        System.out.println("Enter the " + num + " elements");
        arr = new int[num];
        for (i = 0; i < num; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.println("Now enter the item to search in an array");
        item = scanner.nextInt();
        for (i = 0; i < num; i++) {
            if (arr[i] == item) {
                System.out.println("Item " + item + " found at position " + (i + 1));
                break;
            }
        }
        if (i == num) {
            System.out.println("Item "+item + " doesn't exist in the array");
        }
    }
}
