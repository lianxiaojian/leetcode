package com.brian.leetcode;

public class RotateArray {

    public void m1(int[] nums, int k) {
        int[] b = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            int j = (i + k) % nums.length;
            b[j] = nums[i];
        }
        nums = b;
        for (int num : b) {
            System.out.print(num + ",");
        }
    }

    public static void main(String[] args) {
        RotateArray ra = new RotateArray();
        int[] a = new int[]{1, 2, 3, 4, 5, 6, 7};
        ra.m1(a, 3);
        for (int num : a) {
            System.out.print(num + ",");
        }

    }
}
