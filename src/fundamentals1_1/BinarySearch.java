package com.fundamentals1_1;

public class BinarySearch {

    public static int rank(int key, int[] array) {
        return rank(key, array, 0, array.length - 1, 0);
    }

    private static int rank(int key, int[] array, int lo, int hi, int depth) {
        // Print the current lo and hi values, indented by the depth of the recursion
        printTrace(lo, hi, depth);

        if (lo > hi) {
            return -1; // Key not found
        }

        int mid = lo + (hi - lo) / 2;

        if (key < array[mid]) {
            return rank(key, array, lo, mid - 1, depth + 1);
        } else if (key > array[mid]) {
            return rank(key, array, mid + 1, hi, depth + 1);
        } else {
            return mid;
        }
    }

    private static void printTrace(int lo, int hi, int depth) {
        // Print spaces to indent based on the recursion depth
        for (int i = 0; i < depth; i++) {
            System.out.print("  ");
        }
        System.out.println("lo = " + lo + ", hi = " + hi);
    }

    public static void main(String[] args) {
        int[] array = {1, 3, 5, 7, 9, 11, 13, 15, 17, 19};
        int key = 7;
        int result = rank(key, array);

        if (result != -1) {
            System.out.println("Key found at index: " + result);
        } else {
            System.out.println("Key not found");
        }
    }
}
