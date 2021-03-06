package com.codingChallenge.TrappingWater;

public class TrappingWater {

    public static int trap(int[] height) {
        if (height.length == 0) return 0;
        int[] maxLeft = new int[height.length];
        int[] maxRight = new int[height.length];
        int result = 0;

        maxLeft[0] = height[0];
        maxRight[height.length - 1] = height[height.length - 1];

        for (int i = 1; i < height.length; i++) {
            maxLeft[i] = Math.max(maxLeft[i - 1], height[i]);
        }

        for (int i = height.length - 2; i >= 0; i--) {
            maxRight[i] = Math.max(maxRight[i + 1], height[i]);
        }

        for (int i = 0; i < height.length; i++) {
            result += Math.min(maxLeft[i], maxRight[i]) - height[i];
        }

        return result;
    }

    public static int trapII(int[] height) {
        if (height.length == 0) return 0;

        int trappedWater = 0;
        int len = height.length;
        int[] maxLeft = new int[len];
        int[] maxRight = new int[len];
        maxLeft[0] = height[0];
        maxRight[len - 1] = height[len - 1];

        for (int i = 1; i < len; i++) {
            maxLeft[i] = Math.max(maxLeft[i - 1], height[i]);
        }

        for (int i = len - 2; i >= 0; i--) {
            maxRight[i] = Math.max(maxRight[i + 1], height[i]);
        }

        for (int i = 0; i < len; i++) {
            trappedWater += Math.min(maxLeft[i], maxRight[i]) - height[i];
        }

        return trappedWater;
    }

    public static void main(String[] args) {

    }
}
