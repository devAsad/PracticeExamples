import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Using While() loop.
        int num, revNum = 0;
        System.out.println("Enter the number for Reverse");
        num = scanner.nextInt();
        while (num != 0) {
            revNum = revNum * 10;
            revNum = revNum + (num % 10);
            num = num / 10;
        }
        System.out.println("Reverse number is: " + revNum);
    }
}
