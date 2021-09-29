package com.excelsolutions;

public class RangeSearch {
    public static void main(String[] args) {
        Integer[] nums = {20,30,40,50,60,70,80,90,100};
        Integer value = 50;
        System.out.println(searchrange(nums, 2, 6, value));
    }

    private static boolean searchrange(Integer[] nums, Integer first, Integer second, Integer value) {

        for (int i = first; i < second; i++) {
            if(nums[i].equals(value)) return true;
        }
        return  false;

    }
}
