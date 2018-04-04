package com.brian.leetcode;

import java.util.SortedSet;
import java.util.TreeSet;

public class RemoveDuplicates {

    public int m1(int[] nums) {

        int length = nums.length;
        if (length == 1) {
            return length;
        }
//
//        if (length == 2) {
//            if (nums[0] == nums[1]) {
//                return 1;
//            } else {
//                return 2;
//            }
//        }

        int i = 0;
        int j = 1;

        while (i < length && j < length) {
            if (nums[i] == nums[j]) {
                j++;
            } else {
                i++;
                nums[i] = nums[j];
                j++;
            }
        }

        return i + 1;
    }

    public int m2(int[] nums) {
        SortedSet<Integer> set = new TreeSet<>();
        if (nums == null || nums.length == 0) {
            return 0;
        }

        for (int num : nums) {
            set.add(num);
        }


        return set.size();
    }

    public static void main(String[] args) {
        int[] data1 = new int[]{1, 1, 2, 3, 4, 4, 5, 5, 6, 6, 6};
        int[] data2 = new int[]{1};
        int[] data3 = new int[]{1, 1, 1, 1};
        int[] data4 = new int[]{1, 2};
        RemoveDuplicates rd = new RemoveDuplicates();
        System.out.println("data1: " + rd.m1(data1));
        System.out.println("data1: " + rd.m1(data2));
        System.out.println("data1: " + rd.m1(data3));
        System.out.println("data1: " + rd.m1(data4));

        System.out.println("data1: " + rd.m2(data1));
        System.out.println("data1: " + rd.m2(data2));
        System.out.println("data1: " + rd.m2(data3));
        System.out.println("data1: " + rd.m2(data4));

    }

}
