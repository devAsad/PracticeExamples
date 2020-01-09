import java.util.Scanner;

public class AddBinaryNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long b1,b2;
        int i = 0, carry = 0;
        int[] sum = new int[10];
        System.out.println("Enter the two Binary numbers for Additions");
        System.out.print("Enter the First binary numbers : ");
        b1 = scanner.nextLong();
        System.out.print("Enter the Second binary numbers : ");
        b2 = scanner.nextLong();
        scanner.close();
        while (b1 != 0 || b2 != 0) {
            sum[i++] = (int) ((b1 % 10 + b2 % 10 + carry) % 2);
            carry = (int) ((b1 % 10 + b2 % 10 + carry) / 2);
            b1 = b1 / 10;
            b2 = b2 / 10;
        }
        if (carry != 0) {
            sum[i++] = carry;
        }
        --i;
        System.out.print("Output : ");
        while (i >= 0) {
            System.out.print(sum[i--]);
        }
        System.out.println();
    }
}
/*
* Output:
Enter the two Binary numbers for Additions
Enter the First binary numbers : 11100
Enter the Second binary numbers : 10101
Output : 110001
* */