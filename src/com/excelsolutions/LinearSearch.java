package com.excelsolutions;

public class LinearSearch {
    public static void main(String[] args) {
        Integer[] arr = {22,33,44,55,14,99};
      int ans = linearSearch2(arr, 33);
        System.out.println(ans);

}

    private static int linearSearch(Integer[] arr, int target) {
        if (arr == null) return -1;
        for (int i = 0; i < arr.length - 1; i++) {
            if(arr[i]==target) {
                System.out.println("Found on index "+i);
                return i;
            }
        }
        return -1;
    }

    private static int linearSearch2(Integer[] arr, int target) {
        if (arr == null) return -1;
        for (int element : arr) {
            if(element==target) {
                return element;
            }
        }
        return -1;

    }
    }
