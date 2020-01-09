import java.util.Random;
import java.util.Scanner;

public class GenerateRandomNumbers {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the limit fo the Random numbers");
        int limit = scanner.nextInt();
        System.out.println("Enter how many values you want");
        int values = scanner.nextInt();
        for (int i = 0; i < values; i++) {
            System.out.println(random.nextInt(limit));
        }
    }
}
/*
* Output:-
Enter the limit fo the Random numbers
100
Enter how many values you want
5
6
4
72
55
6
*/