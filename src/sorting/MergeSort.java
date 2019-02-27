package sorting;

import java.util.Random;

public class MergeSort {

    public static Integer[] mergeSort(Integer[] array, Integer[] scratch, int start, int end) {
        if(start == end) return array;

        int midPoint = start - (start - end) / 2;

        mergeSort(array, scratch, start, midPoint);
        mergeSort(array, scratch, midPoint + 1, end);

        int leftIndex = start;
        int rightIndex = midPoint + 1;
        int scratchIndex = leftIndex;
        while(leftIndex <= midPoint && rightIndex <= end) {
            if(array[leftIndex].compareTo(array[rightIndex]) <= 0) {
                scratch[scratchIndex++] = array[leftIndex++];
            } else {
                scratch[scratchIndex++] = array[rightIndex++];
            }
        }

        for(int i = leftIndex; i <= midPoint; i++) {
            scratch[scratchIndex++] = array[i];
        }

        for(int i = rightIndex; i <= end; i++) {
            scratch[scratchIndex++] = array[i];
        }

        for(int i = start; i <= end; i++) {
            array[i] = scratch[i];
        }

        return array;
    }


    public static void main(String[] args) {
        Integer[] array = new Integer[10000];
        Random rand = new Random(96);
        for(int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(100);
        }

        array = mergeSort(array,new Integer[10000], 0, array.length-1);

        for(Integer i : array) {
            System.out.print(i + " ");
        }
        System.out.println();

    }

}
