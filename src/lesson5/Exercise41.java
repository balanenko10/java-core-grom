package lesson5;

import java.util.Arrays;

public class Exercise41 {
    public static void main(String[] args) {
        int[] array = {10, 3, 7, 5, 9};

        System.out.println(Arrays.toString(sortAscending(array)));
        System.out.println(Arrays.toString(sortDescending(array)));

    }

    public static int [] sortAscending(int[] array) {
        for (int i=0; i<array.length;i++){
            int res=array[i];

            for (int b=i+1; b<array.length;b++){
                int resIndex=i;
                if (array[b]<res){
                    res=array[b];
                    resIndex=b;
                }
                if(resIndex != i){
                    array[resIndex]=array[i];
                    array[i]=res;
                }
            }
        }
        return array;
    }
    public static int [] sortDescending(int[] array){
        for (int i=0; i<array.length; i++){
            int res=array[i];

            for (int b=i+1; b<array.length; b++){
                int resIndex=i;
                if (array[b]>res){
                    res=array[b];
                    resIndex=b;
                }
                if (resIndex !=i){
                    array[resIndex]=array[i];
                    array[i]=res;
                }
            }
        }
        return array;

    }
}
