import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int fact = 1, num, i;
        System.out.println("Enter the number for Factorial");
        num = scanner.nextInt();
        for (i = 1; i <= num; i++) {
            fact = fact * i;
        }
        System.out.println("Factorial of " + num + " is: " + fact);

        //Using Recursion.
        int Fact = 1;
        System.out.println("Enter the number for factorial");
        int n = scanner.nextInt();
        Fact = findFactorial(n);
        System.out.println("Factorial of " + n + " is: " + Fact);

        //Using while loop.
        int fac = 1, j = 1, N;
        System.out.println("Enter the number to find factorial");
        N = scanner.nextInt();
        while (j <= N) {
            fac = fac * j;
            j++;
        }
        System.out.println("Factorial of " + N + " is: " + fac);
    }

    private static int findFactorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return (n * findFactorial(n - 1));
        }
    }

}
