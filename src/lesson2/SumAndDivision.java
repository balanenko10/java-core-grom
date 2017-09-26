package lesson2;

/**
 * Created by ДАША on 25.04.2017.
 */
public class SumAndDivision {
    public static void main(String[] args) {
        int a = 1;
        int b = (a + 1000)*(1000 - a + 1)/2;

        int c1 = b / 1234;
        int c2 = b % 1234;

        boolean res = c1 < c2;
        System.out.println(res);
    }
}
