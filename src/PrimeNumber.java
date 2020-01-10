import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num, i;
        System.out.println("Enter a number to find the Prime Number");
        num = scanner.nextInt();
        if (num == 0 || num == 1) {
            System.out.println("Enter number " + num +" is not a prime number");
        }
        else {
            for (i = 2; i < num / 2; i++) {
                if (num % i == 0) {
                    System.out.println("Enter number " + num + " is not a prime number");
                    break;
                } else {
                    System.out.println("Enter number " + num + " is a prime number");
                    break;
                }
            }
        }
    }

}
