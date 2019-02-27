package sorting;

import java.util.Random;

public class QuickSort {
    public static  Integer[] quickSort(Integer[] array, int start, int end) {

        if(start >= end) return array;

        Integer divider = array[start];

        int lo = start;
        int hi = end;
        while(lo < hi) {
            while(divider.compareTo(array[hi]) < 0) {
                hi--;
                if(hi <= lo) break;
            }
            if(hi <= lo) {
                array[lo] = divider;
                break;
            }
            array[lo] = array[hi];

            while(divider.compareTo(array[lo]) >= 0) {
                lo++;
                if(lo >= hi) break;
            }

            if(lo >= hi) {
                lo = hi;
                array[hi] = divider;
                break;
            }

            array[hi] = array[lo];
        }

        quickSort(array, start, lo-1);
        quickSort(array, lo+1, end);
        return array;
    }

    public static void main(String[] args) {
        Integer[] array = new Integer[100];
        Random rand = new Random(96);
        for(int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(100);
        }
        for(Integer i : array) {
            System.out.print(i + " ");
        }
        System.out.println();
        array = quickSort(array, 0, array.length-1);
        for(Integer i : array) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
