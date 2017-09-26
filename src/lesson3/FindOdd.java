package lesson3;

/**
 * Created by ДАША on 27.04.2017.
 */
public class FindOdd {
    public static void main(String[] args) {
        int a = 1;
        int sum = 0;
        for (; a <= 1000; a = a + 2) {
            sum += a;
            System.out.println("Found");
        }
            if (sum * 5 > 5000) {
                System.out.println("Bigger");
            } else {
                System.out.println("Smaller or equal");
            }
        }
    }
