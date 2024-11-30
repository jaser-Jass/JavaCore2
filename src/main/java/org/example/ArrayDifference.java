package org.example;

public class ArrayDifference {

    public static int findDifference(int[] arr) {

        if (arr.length == 0) {
            throw new IllegalArgumentException("Array should not be empty");
        }

        int min = arr[0];
        int max = arr[0];

        for (int num : arr) {
            if (num < min) {
                min = num;
            }
            if (num > max) {
                max = num;
            }
        }

        return max - min;
    }
}
