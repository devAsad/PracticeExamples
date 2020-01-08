public class Test1 {
    public static void main(String[] args) {
        int[] a = new int[10];
        System.out.println("a is belong to the class which is "+ a.getClass());
        for (int i = 0; i < a.length; i++) {
            System.out.println("a["+i+"] "+a[i]);
        }
        int nrc = 3;
        // some code determines the number of rows & columns = nrc
        double[][] m = new double[nrc][nrc];
        for (int d = 0; d < nrc; d++)
            m[d][d] = 1.0;

        // some code determines the number of rows & columns = nrc

        for (int d = 0; d < nrc; d++)
           System.out.println(m[d][d]);
    }
}
