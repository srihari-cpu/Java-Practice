public class App {
    public static void main(String[] args) {
        int a = 25;
        System.out.println(mySqrt(a));

    }

    public static int mySqrt(int x) {

        return (int) Math.floor(Math.sqrt(x));
    }
}
