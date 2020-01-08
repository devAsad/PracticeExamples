public class Test {
    public static void main(String[] args) {

        MathUtils mu = new MathUtils();
        System.out.println(mu.add(2, 5));
        System.out.println(mu.mul(4, 8));
        System.out.println(mu.div(4, 8));
        System.out.println(mu.div(10, 0));
        System.out.println(mu.add(19, 9));
        System.out.println(mu.div(3, 9));
        System.out.println(mu.sub(9, 7));
    }
    public static class MathUtils{
        public MathUtils(){

        }

        public float add(float x, float y) {
            return x + y;
        }

        public float mul(float x, float y) {
            return x * y;
        }

        public float div(float x, float y) {
            float z = 0;
            try {
                z = x / y;
                return z;
            } catch (Exception ex) {
                System.out.println("Message is : " + ex);
            }
            return z;
        }

        public float sub(float x, float y) {
            return x - y;
        }
    }
}
