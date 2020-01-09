import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Using While() loop.
        int num = 0, revNum = 0;
        System.out.println("Enter the number to Reverse using while loop");
        num = scanner.nextInt();
        while (num != 0) {
            revNum = revNum * 10;
            revNum = revNum + (num % 10);
            num = num / 10;
        }
        System.out.println("Reverse number is: " + revNum);

        //using for() loop.
        int n = 0, rev = 0;
        System.out.println("Enter the number to reverse using for loop");
        n = scanner.nextInt();
        for (; n != 0; ) {
            rev = rev * 10;
            rev = rev + (n % 10);
            n = n / 10;
        }
        System.out.println("Reverse number is: " + rev);

        //using Recursion.
        int number = 0;
        System.out.println("Enter the number to reverse using recursion");
        number = scanner.nextInt();
        System.out.print("Reverse of the input number is: ");
        reverseMethod(number);
    }

    private static void reverseMethod(int number) {
        if (number < 10) {
            System.out.println(number);
        } else {
            System.out.print(number % 10);
            reverseMethod(number / 10); //Recursion applied.
        }
    }
}
