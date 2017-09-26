package lesson5;

public class Exercise43x {
    public static void main(String[] args) {
        int[] array = {11, 12, 10, 5, 4, 44, 100, 44, 11, 10, 11};
        System.out.println(uniqueCount(array));
    }
    public static int uniqueCount(int[] array) {
        int count1 = 0;
        int count2 = 0;
        int result = 0;
        for (int i = 0; i < array.length; i++) {
            count1++;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] == array[i]) {
                    count2++;
                    break;
                }
            }
        }
        return result = count1 - count2;
    }
}

