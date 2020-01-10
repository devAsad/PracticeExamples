import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {

        //Check Palindrome with recursion.
        Scanner scanner = new Scanner(System.in);
        String string;
        System.out.println("Enter the string to check Palindrome or Not");
        string = scanner.nextLine();
        if (isPal(string)) {
            System.out.println("Entered string " + string + " is Palindrome");
        } else {
            System.out.println("Entered string " + string + " is not Palindrome");
        }

        //Check Palindrome using loop.
        String str, rev = "";
        System.out.println("enter the String to check Palindrome");
        str = scanner.nextLine();
        int length = str.length();
        for (int i = length - 1; i >= 0; i--) {
            rev = rev + str.charAt(i);
        }
        if (str.equals(rev)) {
            System.out.println("Entered string " + str + " is Palindrome");
        } else {
            System.out.println("Entered string " + str + " is not Palindrome");
        }
    }

    private static boolean isPal(String s) {
        if (s.length() == 0 || s.length() == 1) {
            return true;
        }
        if (s.charAt(0) == s.charAt(s.length() - 1)) {
            return isPal(s.substring(1, s.length() - 1));
        }
        return false;
    }
}
