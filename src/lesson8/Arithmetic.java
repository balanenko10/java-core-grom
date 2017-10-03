package lesson8;

public class Arithmetic {

    public static boolean check(int[] array) {
        int max = array[0];
        int min = array[0];

        for (int elem1 : array) {
            if (elem1 > max) {
                max = elem1;
            }
        }
        for (int elem2 : array) {
            if (elem2 < min) {
                min = elem2;
            }
        }
        if (max + min > 100) {
            return true;
        } else {
            return false;
        }
    }
}



