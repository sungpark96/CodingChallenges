package com.codingChallenge.ProductOfArrayExceptSelf;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductOfArrayExceptSelfTest {

    @Test
    void positiveTest() {
        assertArrayEquals(new int[]{24, 12, 8, 6}, ProductOfArrayExceptSelf.productExceptSelf(new int[]{1, 2, 3, 4}));
    }

    @Test
    void negativeTest() {
        assertNotEquals(new int[]{-1, -1, 0, -3, 3}, ProductOfArrayExceptSelf.productExceptSelf(new int[]{0, 0, 0, 0, 0}));
    }

}