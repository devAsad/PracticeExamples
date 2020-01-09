import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean isLeap;
        int year;
        System.out.println("Enter the Year to find the leap year or not");
        year = scanner.nextInt();
        scanner.close();
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    isLeap = true;
                }else{
                    isLeap = false;
                }
            }
            else {
                isLeap = true;
            }
        }
            else{
            isLeap = false;
        }
        if (isLeap == true) {
            System.out.println("Year " + year + " is a Leap year");
        } else {
            System.out.println("Year " + year + " is not a Leap year");
        }
    }
}
