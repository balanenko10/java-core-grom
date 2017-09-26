package lesson4;

public class Exercise3 {
    public static void main(String[] args) {
        System.out.println(compareSums(5, 10, 15, 20));
    }

    public static long sum(int from, int to) {
        long s = 0;
        for (long i = from; i <= to; i++) {
            s += i;
        }
        return s;
    }

    public static boolean compareSums(int a, int b, int c, int d) {
        long s1;
        long s2;
        s1 = sum(a, b);
        s2 = sum(c, d);
        if (s1 > s2) {
            return true;
        } else {
            return false;
        }
    }
}