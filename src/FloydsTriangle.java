import java.util.Scanner;

public class FloydsTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i,j,num,count=1;
        System.out.println("Enter the number of rows.");
        num = scanner.nextInt();
        for (i = 1; i <= num; i++) {
            for (j = 1; j <= i; j++) {
                System.out.print(count+" ");
                count++;
            }
            System.out.println();
        }
    }
}
