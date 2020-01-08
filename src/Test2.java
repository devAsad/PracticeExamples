import java.util.ArrayList;

public class Test2 {
    public static void main(String[] args) {

        //Fibonacci Series using ArrayList.
        ArrayList<Integer> fibo = new ArrayList<Integer>();
        fibo.add(0);
        fibo.add(1);
        for (int i = 2; i <= 20; i++) {
            fibo.add(fibo.get(i-1)+fibo.get(i-2));
        }
        for (int i = 0; i < fibo.size(); i++) {
            System.out.println("Fibonacci " + i + " = " + fibo.get(i));
        }
    }
}
