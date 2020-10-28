package com.rootbyos.springboot.HeightChecker;

import java.util.Arrays;
import java.util.stream.IntStream;

public class HeightChecker {

    public static void main(String[] args) {

        int[] test = {5, 3, 3, 4, 5};
//        System.out.println( heightChecker( test ) );
        System.out.println( heightCheckerTwo( test ) );
    }

    public static int heightCheckerTwo(int[] heights) {

        int[] temp = heights.clone();
        Arrays.sort( heights );

        int counter = 0;
//        int dump = 0;
//        int j=0;
//        for (int num : heights) { // using for-each loop as practice
//            if (num != temp[j]) {
//                counter++;
//            }
//            j++;
//        }
        for (int i = 0; i < heights.length; i++) {
//            dump = temp[i] != heights[i] ? counter++ : dump++; //Not a practical use because we only care for the value of counter
            if (temp[i] != heights[i]) {
                counter++;
            }
        }

        return counter;

    }

//    public static int heightChecker(int[] heights) {
//        int[] copy = heights.clone();
//        int counter = 0;
//        Arrays.sort( heights );
//
//        for (int i = 0; i < heights.length; i++) {
//            if (copy[i] != heights[i]) {
//                counter++;
//            }
//
//        }
//        return counter;
//    }
//        for (int i = 0; i < heights.length; i++) {
//            copy[i] = heights[i];
//        }
    public static int heightChecker(int[] heights) {
        int[] copy = Arrays.stream( heights ).sorted().toArray();

        return (int) IntStream.range( 0, heights.length )
                .filter( i -> copy[i] != heights[i] )
                .count();
    }
}
